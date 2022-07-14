-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2018 a las 10:29:08
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nvo_control`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarAl` (`idCi` INT(11), `nombre` VARCHAR(30))  begin
select 
	pg.nivel,al.grado,al.ape_pat,al.ape_mat,al.nombre,pg.colegiatura,al.estado
from 
	alumnos as al 
    JOIN 
    ciclo_escolar as ce ON ce.id = idCi
		and al.id_ciclo_escolar = ce.id
    INNER JOIN
		pagos as pg
			ON al.id_pago = pg.id
WHERE concat(al.nombre," ",al.ape_pat," ",al.ape_mat) LIKE concat("%",nombre,"%") or concat(al.nombre," ",al.ape_pat) LIKE concat("%",nombre,"%");
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getAlumno` (IN `nombre` VARCHAR(40), IN `idCiclo` INT(11))  begin
 
 select 
	a.nombre,a.ape_pat,ape_mat,p.nivel,a.grado,a.tutor,a.telefono,p.colegiatura
 from 
	alumnos as a inner join pagos as p on p.id = a.id_pago and p.id_ciclo_escolar = a.id_ciclo_escolar
where 
	a.id_ciclo_escolar = idCiclo  and concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre or concat(a.nombre," ",a.ape_pat) = nombre 

GROUP BY nombre;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getCooperacion` (IN `idmes` INT(2), IN `idCi` INT(11))  begin
    SELECT 
    al.nombre,
    al.ape_pat,
    IF(al.ape_mat <> 'NULL', al.ape_mat, '') AS ape_mat,
    al.tutor,
    al.telefono
FROM
    alumnos AS al
        JOIN
    meses AS m
        JOIN
    pagos AS pg
        JOIN
    ciclo_escolar AS ce ON ce.id = idCi
        RIGHT JOIN
    inscripcion_cooperacion AS inscoo ON inscoo.id_mes = m.id
        AND al.id = inscoo.id_alumno
        AND al.id_pago = pg.id
        AND inscoo.cooperacion = '0.00'
WHERE
    m.id = idmes AND al.estado = 'Activo'
GROUP BY al.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getDetalles` (IN `nombre` VARCHAR(80), IN `ciclo` INT(11))  begin
select 
	a.tutor,a.telefono,insp_coo.inscripcion,insp_coo.cooperacion
from
	alumnos as a INNER JOIN ciclo_escolar as ci on a.id_ciclo_escolar = ci.id 
    and concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre
    or concat(a.nombre," ",a.ape_pat) = nombre and ci.id = ciclo
  	INNER JOIN inscripcion_cooperacion as insp_coo ON insp_coo.id_ciclo_escolar = ci.id and a.id = insp_coo.id_alumno;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getHistorialMes` (IN `ciclo` INT(11), IN `nombre` VARCHAR(80), IN `mes` VARCHAR(20))  BEGIN
SELECT 
	m.mes,cp.descuento,cp.colegiatura,cpgs.recargo,cpgs.recibido,sum(cpgs.transporte) as transporte,cpgs.fecha,sum((cpgs.recibido+cpgs.transporte)+cpgs.recargo) as total
from 
	alumnos as a
	JOIN meses as m 
    JOIN ciclo_escolar as ce on ce.id = ciclo and m.mes = mes
    RIGHT JOIN colegiatura_pagar as cp 
    	ON m.id = cp.id_mes and ce.id = cp.id_ciclo_escolar and a.id = cp.id_alumno
    LEFT JOIN colegiatura_pagos as cpgs
    	ON  a.id = cpgs.id_alumno and ce.id = cpgs.id_ciclo_escolar and m.id = cpgs.id_mes and cpgs.recibido <>"202020.00"
WHERE  concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre
		or concat(a.nombre," ",a.ape_pat) = nombre
group by cpgs.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getHistorialPagos` (IN `idCiclo` INT(11), IN `nombre` VARCHAR(90))  begin
SELECT 
	m.mes,cp.descuento,cp.colegiatura,cpgs.recargo,cpgs.recibido,sum(cpgs.transporte) as transporte,cpgs.fecha,sum((cpgs.recibido+cpgs.transporte)+cpgs.recargo) as total
from 
	alumnos as a
	JOIN meses as m 
    JOIN ciclo_escolar as ce on ce.id = idCiclo
    RIGHT JOIN colegiatura_pagar as cp 
    	ON m.id = cp.id_mes and ce.id = cp.id_ciclo_escolar and a.id = cp.id_alumno
    RIGHT JOIN colegiatura_pagos as cpgs
    	ON  a.id = cpgs.id_alumno and ce.id = cpgs.id_ciclo_escolar and m.id = cpgs.id_mes and  cpgs.recibido <>"202020.00"
WHERE concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre
		or concat(a.nombre," ",a.ape_pat) = nombre
group by cpgs.id;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getIdAlumno` (IN `nombre` VARCHAR(50), `usuario` VARCHAR(30), `mes` VARCHAR(20), `idCiclo` INT(11), `idGrado` INT(11))  begin
select
	a.id as idAlu,m.id as idMes,usu.id as idUsu
from 
	alumnos as a 
    inner join meses as m 
		on m.mes = mes and id_ciclo_escolar = idCiclo and a.grado = idGrado
    inner join usuarios as usu 
		on usu.usu = usuario 
    and concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre or 
    concat(a.nombre," ",a.ape_pat) = nombre 
    group by m.id;
	
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getInscripcion` (IN `idmes` INT(2), IN `idCi` INT(11))  begin
    SELECT 
    al.nombre,
    al.ape_pat,
    IF(al.ape_mat <> 'NULL', al.ape_mat, '') AS ape_mat,
    al.tutor,
    al.telefono,
    pg.inscripcion
FROM
    alumnos AS al
        JOIN
    meses AS m
        JOIN
    pagos AS pg
        JOIN
    ciclo_escolar AS ce ON ce.id = idCi
        RIGHT JOIN
    inscripcion_cooperacion AS inscoo ON inscoo.id_mes = m.id
        AND al.id = inscoo.id_alumno
        AND al.id_pago = pg.id
        AND inscoo.inscripcion = '0.00'
WHERE
    m.id = idmes AND al.estado = 'Activo'
GROUP BY al.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getPagoMes` (IN `idCiclo` INT(11), IN `mes` VARCHAR(30), IN `nombre` VARCHAR(80))  BEGIN
SELECT 
	DISTINCT m.mes,IF(cpgs.recibido <> "202020.00",cp.colegiatura-sum(cpgs.recibido),cpgs.recibido) as resta
from 
	meses as m 
    INNER JOIN ciclo_escolar as ce on ce.id = idCiclo and m.mes = mes
    INNER JOIN alumnos as a ON a.id_ciclo_escolar = ce.id and concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre 
		or concat(a.nombre," ",a.ape_pat) = nombre
    INNER JOIN colegiatura_pagar as cp 
    	ON cp.id_mes = m.id and ce.id = cp.id_ciclo_escolar and cp.id_alumno = a.id
    INNER JOIN colegiatura_pagos as cpgs
    	ON cpgs.id_alumno = a.id and cpgs.id_ciclo_escolar = ce.id and cpgs.id_mes = m.id and cpgs.id_mes = cp.id_mes 
		group by m.id
		order by m.mes ASC;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getPagosMeses` (IN `nombre` VARCHAR(80), IN `idCi` INT(11))  begin
SELECT 
	m.mes,if(cp.colegiatura<>"NULL",cp.colegiatura,pg.colegiatura) as colegiatura,IF(cpgs.fecha<>"NULL",cpgs.fecha,"")as fecha,if(cpgs.recibido<>0,sum(cpgs.recibido),0) as total,IF(sum(cpgs.transporte)>0,sum(cpgs.transporte),0) as transporte
FROM 
	alumnos as al
    JOIN meses as m
	JOIN ciclo_escolar as ce 
		ON ce.id = idCi
	LEFT JOIN colegiatura_pagar as cp
		ON cp.id_alumno = al.id and ce.id = cp.id_ciclo_escolar and m.id = cp.id_mes
	LEFT JOIN colegiatura_pagos as cpgs
		ON	al.id_ciclo_escolar = cpgs.id_ciclo_escolar and al.id = cpgs.id_alumno and m.id = cpgs.id_mes
	LEFT JOIN pagos as pg 
		ON pg.id = al.id_pago and ce.id = pg.id_ciclo_escolar
WHERE concat(al.nombre," ",al.ape_pat," ",al.ape_mat) = nombre or concat(al.nombre," ",al.ape_pat) = nombre
GROUP BY m.id
ORDER BY m.mes ASC;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getTutor` (IN `idCiclo` INT(11), `nombre` VARCHAR(80))  begin
select 
	a.tutor,a.telefono 
from 
	alumnos as a, ciclo_escolar as ci 
where
	a.id_ciclo_escolar = idCiclo and concat(a.nombre," ",a.ape_pat," ",a.ape_mat) = nombre or concat(a.nombre," ",a.ape_pat) = nombre 
    group by a.id;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteInscripcion` (IN `idCiclo` INT(11))  BEGIN
SELECT 
    m.mes,
    SUM(inscoo.inscripcion) AS inscripcion,
    SUM(inscoo.cooperacion) AS cooperacion,
    (SUM(inscoo.inscripcion) + SUM(inscoo.cooperacion)) AS total
FROM
    meses AS m
        INNER JOIN
    ciclo_escolar AS ce ON ce.id = idCiclo
        INNER JOIN
    alumnos AS al ON al.id_ciclo_escolar = ce.id
        INNER JOIN
    inscripcion_cooperacion AS inscoo ON inscoo.id_ciclo_escolar = ce.id
        AND inscoo.id_mes = m.id
        AND al.id = inscoo.id_alumno       
GROUP BY m.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `historialTiket` (IN `idCiclo` INT(11), IN `fec` VARCHAR(20))  begin
SELECT 
	concat(al.nombre," ",al.ape_pat," ",IF(al.ape_mat<>"NULL",al.ape_mat,"")) as nombre,pg.nivel, al.grado,al.tutor,mes.mes,cpgs.tipo_pago,if(cpgs.recibido<>"202020.00",cpgs.recibido,0) as colegiatura,
    cpgs.transporte,cpgs.recargo
FROM alumnos as al	
	JOIN meses as mes
	JOIN ciclo_escolar as ce
		 ON ce.id = idCiclo
	JOIN pagos as pg 
		ON  pg.id = al.id_pago
	LEFT JOIN colegiatura_pagos as cpgs ON 
    ce.id = cpgs.id_ciclo_escolar  and al.id = cpgs.id_alumno
    and cpgs.id_mes = mes.id
WHERE cpgs.fecha = fec AND cpgs.recibido <> "202020.00"
GROUP BY al.id,cpgs.id;
end$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteDeuda` (IN `idCiclo` INT(11), IN `idMes` INT(11))  BEGIN
	SELECT 
	al.ape_pat,IF(al.ape_mat<>"NULL",al.ape_mat,"") AS ape_mat,al.nombre,al.tutor,al.telefono,pg.nivel,al.grado,m.mes,IF(cpgs.recibido<>"NULL",(cp.colegiatura-SUM(cpgs.recibido)),pg.colegiatura) as adeuda
FROM 
	alumnos as al
    JOIN meses as m
    JOIN ciclo_escolar as ce 
		ON ce.id = idCiclo
    JOIN pagos AS pg
		ON pg.id = al.id_pago and ce.id = pg.id_ciclo_escolar
	LEFT JOIN colegiatura_pagar as cp
		ON al.id = cp.id_alumno and m.id = cp.id_mes and ce.id = cp.id_ciclo_escolar
	LEFT JOIN colegiatura_pagos as cpgs
		ON al.id = cpgs.id_alumno and ce.id = cpgs.id_ciclo_escolar and cpgs.recibido <>"202020.00" and m.id = cpgs.id_mes
WHERE m.id = idMes AND al.estado = "Activo"
GROUP BY al.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteFechas` (IN `idCiclo` INT(11), IN `fecha_ini` VARCHAR(14), IN `fecha_fin` VARCHAR(14))  BEGIN
SELECT 
		a.nombre,a.ape_pat,if(a.ape_mat<>"NULL",a.ape_mat,"")as ape_mat,pg.nivel,a.grado,m.mes,cp.descuento,cp.colegiatura,cpgs.recargo,cpgs.recibido,cpgs.transporte,cpgs.fecha,sum((cpgs.recibido+cpgs.transporte)+cpgs.recargo) as total

from 
	meses as m 
    INNER JOIN ciclo_escolar as ce on ce.id = idCiclo
    INNER JOIN alumnos as a ON a.id_ciclo_escolar = ce.id 
    INNER JOIN colegiatura_pagar as cp 
    	ON cp.id_mes = m.id and ce.id = cp.id_ciclo_escolar and cp.id_alumno = a.id
    INNER JOIN colegiatura_pagos as cpgs
    	ON cpgs.id_alumno = a.id and cpgs.recibido<>"202020.00" and cpgs.id_ciclo_escolar = ce.id and cpgs.id_mes = m.id and cpgs.id_mes = cp.id_mes and cpgs.fecha>= fecha_ini and cpgs.fecha<=fecha_fin
    INNER JOIN pagos as pg on a.id_pago = pg.id
        GROUP BY cpgs.id
        ORDER BY a.nombre ASC,cpgs.fecha ASC;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteGeneral` (IN `idCiclo` INT(11))  BEGIN
SELECT 
	a.nombre,a.ape_pat,if(a.ape_mat<>"NULL",a.ape_mat,"") as ape_mat,pg.nivel,a.grado,m.mes,cp.descuento,cp.colegiatura,cpgs.recargo,cpgs.recibido,cpgs.transporte,cpgs.fecha,sum((cpgs.recibido+cpgs.transporte)+cpgs.recargo) as total
from 
	meses as m 
    INNER JOIN ciclo_escolar as ce on ce.id = idCiclo
    INNER JOIN alumnos as a ON a.id_ciclo_escolar = ce.id 
    INNER JOIN colegiatura_pagar as cp 
    	ON cp.id_mes = m.id and ce.id = cp.id_ciclo_escolar and cp.id_alumno = a.id
    INNER JOIN colegiatura_pagos as cpgs
    	ON cpgs.id_alumno = a.id and cpgs.id_ciclo_escolar = ce.id and cpgs.id_mes = m.id and cpgs.id_mes = cp.id_mes 
    INNER JOIN pagos as pg on a.id_pago = pg.id
WHERE cpgs.recibido <> "202020.00"
        GROUP BY cpgs.id
        ORDER BY pg.nivel ASC,a.nombre ASC,a.grado ASC;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteIngresos` (IN `idCiclo` INT(11))  BEGIN
SELECT 
    m.mes,
    IFNULL(IyC.inscripcion, 0) AS inscripcion,
    IFNULL(IyC.cooperacion, 0) AS cooperacion,
    IFNULL(SUM(cpgs.recibido), 0) AS recibido,
    IFNULL(SUM(cpgs.recargo), 0) AS recargo,
    IFNULL(SUM(cpgs.transporte), 0) AS transporte,
    IFNULL(SUM(recibido + recargo + transporte), 0) + IFNULL(IyC.S1, 0) AS T1
FROM
    meses AS m
        JOIN
    ciclo_escolar AS ce ON ce.id = idCiclo
        JOIN
    alumnos AS al
        LEFT JOIN
    colegiatura_pagos AS cpgs ON cpgs.id_alumno = al.id
        AND m.id = DATE_FORMAT(cpgs.fecha, '%m')
        AND ce.id = cpgs.id_ciclo_escolar
        AND cpgs.recibido <> "202020.00"
        LEFT JOIN
    (SELECT 
        inscoo.id_mes,
            SUM(inscoo.inscripcion) AS inscripcion,
            SUM(inscoo.cooperacion) AS cooperacion,
            IFNULL(SUM(inscripcion + cooperacion), 0) AS S1
    FROM
        alumnos AS al
    JOIN meses AS m
    JOIN ciclo_escolar AS ce ON ce.id = idCiclo
    LEFT JOIN inscripcion_cooperacion AS inscoo ON al.id = inscoo.id_alumno
        AND al.id_ciclo_escolar = ce.id
        AND m.id = inscoo.id_mes
        AND ce.id = inscoo.id_ciclo_escolar) IyC ON IyC.id_mes = m.id
GROUP BY m.id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `reporteNivel` (IN `idCiclo` INT(11), IN `nivel` VARCHAR(30))  BEGIN
SELECT 
	a.nombre,a.ape_pat,if(a.ape_mat<>"NULL",a.ape_mat,"") as ape_mat,a.grado,m.mes,cp.descuento,cp.colegiatura,cpgs.recargo,cpgs.recibido,cpgs.transporte,cpgs.fecha,sum((cpgs.recibido+cpgs.transporte)+cpgs.recargo) as total
from 
	meses as m 
    INNER JOIN ciclo_escolar as ce on ce.id = idCiclo
    INNER JOIN alumnos as a ON a.id_ciclo_escolar = ce.id 
    INNER JOIN colegiatura_pagar as cp 
    	ON cp.id_mes = m.id and ce.id = cp.id_ciclo_escolar and cp.id_alumno = a.id
    INNER JOIN colegiatura_pagos as cpgs
    	ON cpgs.id_alumno = a.id and cpgs.id_ciclo_escolar = ce.id and cpgs.id_mes = m.id and cpgs.id_mes = cp.id_mes and cpgs.recibido <>"202020.00"
    INNER JOIN pagos as pg on a.id_pago = pg.id
        and m.mes = mes
WHERE pg.nivel  = nivel
        GROUP BY cpgs.id
        ORDER BY pg.nivel ASC,a.nombre ASC,a.grado ASC;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(11) NOT NULL,
  `id_ciclo_escolar` int(11) DEFAULT NULL,
  `id_pago` int(11) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  `ape_pat` varchar(40) DEFAULT NULL,
  `ape_mat` varchar(40) DEFAULT NULL,
  `tutor` varchar(80) DEFAULT NULL,
  `telefono` varchar(13) DEFAULT NULL,
  `grado` int(11) DEFAULT NULL,
  `estado` varchar(6) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `id_ciclo_escolar`, `id_pago`, `nombre`, `ape_pat`, `ape_mat`, `tutor`, `telefono`, `grado`, `estado`) VALUES
(1, 1, 3, 'Misael', 'Lezma', 'Mesino', 'Bernabe Lezma Antolino', '7421029009', 2, 'Activo'),
(2, 1, 3, 'Carlos Alberto', 'Valdez', 'Hernandez', 'Gary Valdez', '7458789658', 3, 'Activo'),
(3, 1, 3, 'Luis Enrique', 'Fierro', 'Perdomo', 'Reyna Aparacio Lezma', '745522112', 1, 'Activo'),
(4, 1, 3, 'Abimael', 'Lezma', 'Mesino', 'Bernabe Lezma Antolino', '7457894785', 3, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciclo_escolar`
--

CREATE TABLE `ciclo_escolar` (
  `id` int(11) NOT NULL,
  `ciclo` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ciclo_escolar`
--

INSERT INTO `ciclo_escolar` (`id`, `ciclo`) VALUES
(1, '2017-2018');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colegiatura_pagar`
--

CREATE TABLE `colegiatura_pagar` (
  `id` int(11) NOT NULL,
  `id_alumno` int(11) DEFAULT NULL,
  `id_ciclo_escolar` int(11) DEFAULT NULL,
  `id_mes` int(11) DEFAULT NULL,
  `colegiatura` decimal(9,2) DEFAULT NULL,
  `descuento` varchar(20) DEFAULT 'N/A'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `colegiatura_pagar`
--

INSERT INTO `colegiatura_pagar` (`id`, `id_alumno`, `id_ciclo_escolar`, `id_mes`, `colegiatura`, `descuento`) VALUES
(1, 3, 1, 8, '1050.00', 'N/A'),
(2, 3, 1, 9, '1050.00', 'N/A'),
(3, 4, 1, 8, '1050.00', 'N/A'),
(4, 4, 1, 9, '1050.00', 'N/A'),
(5, 3, 1, 10, '945.00', '10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colegiatura_pagos`
--

CREATE TABLE `colegiatura_pagos` (
  `id` int(11) NOT NULL,
  `id_ciclo_escolar` int(11) DEFAULT NULL,
  `id_alumno` int(11) DEFAULT NULL,
  `id_mes` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `recibido` decimal(9,2) DEFAULT NULL,
  `recargo` decimal(9,2) NOT NULL,
  `transporte` decimal(9,2) NOT NULL,
  `tipo_pago` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `colegiatura_pagos`
--

INSERT INTO `colegiatura_pagos` (`id`, `id_ciclo_escolar`, `id_alumno`, `id_mes`, `id_usuario`, `fecha`, `recibido`, `recargo`, `transporte`, `tipo_pago`) VALUES
(1, 1, 3, 8, 1, '2018-08-25', '202020.00', '0.00', '0.00', 'Indefinido'),
(2, 1, 3, 9, 1, '2018-08-25', '202020.00', '0.00', '0.00', 'Indefinido'),
(3, 1, 4, 8, 1, '2018-08-25', '202020.00', '0.00', '0.00', 'Indefinido'),
(4, 1, 4, 9, 1, '2018-08-25', '202020.00', '0.00', '0.00', 'Indefinido'),
(5, 1, 3, 10, 1, '2018-08-28', '800.00', '0.00', '0.00', 'Efectivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion_cooperacion`
--

CREATE TABLE `inscripcion_cooperacion` (
  `id` int(11) NOT NULL,
  `id_alumno` int(11) DEFAULT NULL,
  `id_ciclo_escolar` int(11) DEFAULT NULL,
  `id_mes` int(1) DEFAULT NULL,
  `inscripcion` decimal(7,2) DEFAULT NULL,
  `cooperacion` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `inscripcion_cooperacion`
--

INSERT INTO `inscripcion_cooperacion` (`id`, `id_alumno`, `id_ciclo_escolar`, `id_mes`, `inscripcion`, `cooperacion`) VALUES
(1, 1, 1, 8, '0.00', '0.00'),
(2, 2, 1, 8, '940.50', '400.00'),
(3, 3, 1, 8, '940.50', '400.00'),
(4, 4, 1, 8, '0.00', '0.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `meses`
--

CREATE TABLE `meses` (
  `id` int(11) DEFAULT NULL,
  `mes` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `meses`
--

INSERT INTO `meses` (`id`, `mes`) VALUES
(8, 'Agosto'),
(9, 'Septiembre'),
(10, 'Octubre'),
(11, 'Noviembre'),
(12, 'Diciembre'),
(1, 'Enero'),
(2, 'Febrero'),
(3, 'Marzo'),
(4, 'Abril'),
(5, 'Mayo'),
(6, 'Junio'),
(7, 'Julio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `id` int(11) NOT NULL,
  `id_ciclo_escolar` int(11) DEFAULT NULL,
  `inscripcion` decimal(9,2) DEFAULT NULL,
  `colegiatura` decimal(9,2) DEFAULT NULL,
  `nivel` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`id`, `id_ciclo_escolar`, `inscripcion`, `colegiatura`, `nivel`) VALUES
(1, 1, '800.00', '800.00', 'Preescolar'),
(2, 1, '825.00', '850.00', 'Primaria'),
(3, 1, '1045.00', '1050.00', 'Secundaria'),
(4, 2, '800.00', '800.00', 'Preescolar'),
(5, 2, '825.00', '850.00', 'Primaria'),
(6, 2, '1045.00', '1050.00', 'Secundaria'),
(7, 3, '800.00', '800.00', 'Preescolar'),
(8, 3, '920.00', '900.00', 'Primaria'),
(9, 3, '1050.00', '1045.00', 'Secundaria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usu` varchar(30) DEFAULT NULL,
  `pass` varchar(40) DEFAULT NULL,
  `nombre` varchar(30) NOT NULL,
  `App` varchar(30) NOT NULL,
  `Apm` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usu`, `pass`, `nombre`, `App`, `Apm`) VALUES
(1, 'Administrador', '12345', 'Enrique', 'Velazquez', 'nose'),
(2, 'Lezma92', '12345', 'Misael', 'Lezma', 'Mesino'),
(3, 'Admin', 'CpMg1808x2', 'Misael', 'L', 'Ad');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ciclo_escolar`
--
ALTER TABLE `ciclo_escolar`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `colegiatura_pagar`
--
ALTER TABLE `colegiatura_pagar`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `colegiatura_pagos`
--
ALTER TABLE `colegiatura_pagos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inscripcion_cooperacion`
--
ALTER TABLE `inscripcion_cooperacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `meses`
--
ALTER TABLE `meses`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `ciclo_escolar`
--
ALTER TABLE `ciclo_escolar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `colegiatura_pagar`
--
ALTER TABLE `colegiatura_pagar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `colegiatura_pagos`
--
ALTER TABLE `colegiatura_pagos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `inscripcion_cooperacion`
--
ALTER TABLE `inscripcion_cooperacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `pagos`
--
ALTER TABLE `pagos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
