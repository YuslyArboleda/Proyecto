-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: tiendacom
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cargo`
--

DROP TABLE IF EXISTS `cargo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cargo` (
  `idcargo` int NOT NULL,
  `nombre` varchar(245) NOT NULL,
  PRIMARY KEY (`idcargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cargo`
--

LOCK TABLES `cargo` WRITE;
/*!40000 ALTER TABLE `cargo` DISABLE KEYS */;
INSERT INTO `cargo` VALUES (1,'Administrador'),(2,'Usuario'),(3,'Invitado');
/*!40000 ALTER TABLE `cargo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `tipoDocumento` varchar(245) NOT NULL,
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `sexo2` int NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `condicion` tinyint NOT NULL,
  PRIMARY KEY (`idcliente`),
  KEY `sexo_idx` (`sexo2`)
) ENGINE=InnoDB AUTO_INCREMENT=323232326 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('selecione...',123,'edw','1212','sdsdsds',1,'2023-01-01','sdsdsds',0),('cedula de ciudania',222,'edw','212','assa',1,'2023-11-02','assa',0),('cedula de ciudania',21212,'edw','2121212','andres@gmail.com',1,'2023-11-09','andres@gmail.com',1),('cedula extranjera',121212212,'edwar','2121213212','edw@gmial.com',1,'2023-11-10','remor',1),('selecione...',323232323,'edwar chris','3232323','dfdffd',2,'2023-11-02','roma',0);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura_compra`
--

DROP TABLE IF EXISTS `detalle_factura_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_factura_compra` (
  `id_detalle_factura_compra` int NOT NULL AUTO_INCREMENT,
  `id_fact_compra` int NOT NULL,
  `id_producto` int NOT NULL,
  `cantidad_comprado` int NOT NULL,
  `precio_unitario_compra` float NOT NULL,
  `precio_total_compra` float NOT NULL,
  PRIMARY KEY (`id_detalle_factura_compra`),
  KEY `id_producto_idx` (`id_producto`),
  KEY `id_factura_compra_idx` (`id_fact_compra`),
  CONSTRAINT `id_factura_compra` FOREIGN KEY (`id_fact_compra`) REFERENCES `factura_compra` (`idfactura_compra`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura_compra`
--

LOCK TABLES `detalle_factura_compra` WRITE;
/*!40000 ALTER TABLE `detalle_factura_compra` DISABLE KEYS */;
INSERT INTO `detalle_factura_compra` VALUES (1,6,7779,10,2000,20000),(2,6,7779,6,1000,6000),(3,6,7779,4,5000,20000),(4,6,7779,4,5000,20000),(5,6,7779,6,2000,12000),(6,6,7779,5,400000,2000000),(7,6,7780,4,500000,2000000),(8,6,7779,23,5000,115000),(9,6,7780,0,70000,0),(10,6,7779,3,4,12),(11,6,7779,12,123456,1481470),(12,6,7779,34,54545500,1854550000),(13,6,7779,4,60000,240000),(14,6,7779,3,34000,102000);
/*!40000 ALTER TABLE `detalle_factura_compra` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `detalle_factura_compra_BEFORE_INSERT` BEFORE INSERT ON `detalle_factura_compra` FOR EACH ROW begin set new.precio_total_compra= new.cantidad_comprado * new.precio_unitario_compra; 
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `atualizar_cantidad` AFTER INSERT ON `detalle_factura_compra` FOR EACH ROW begin 
update producto as p  set cantidad = p.cantidad + NEW.cantidad_comprado, p.precio = NEW.precio_unitario_compra + ( NEW.precio_unitario_compra*0.20 )
where NEW.id_producto= p.idproducto;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `idfactura` int NOT NULL,
  `idcliente` int NOT NULL,
  `idusuario` int NOT NULL,
  `NÂ°_comprobante` varchar(45) NOT NULL,
  `tipo_pago` varchar(100) NOT NULL,
  `impuesto` float NOT NULL,
  `total_pagar` float NOT NULL,
  `fecha` date NOT NULL,
  `condicion` tinyint NOT NULL,
  PRIMARY KEY (`idfactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (0,21212,12312,'0','Tarjeta',0,0,'2023-12-10',1),(11,21212,12121212,'1212','Efectivo',0,0,'2023-12-10',1),(23,21212,12121212,'23','Efectivo',0,0,'2023-12-10',1),(233,222,12,'11','tarjeta',0,0,'2023-12-10',1),(2222,222,12,'11','efectivo',0,0,'2023-12-10',1),(2322,222,12,'11','efectivo',0,0,'2023-12-10',1);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_compra`
--

DROP TABLE IF EXISTS `factura_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura_compra` (
  `idfactura_compra` int NOT NULL AUTO_INCREMENT,
  `id_provedor` int NOT NULL,
  `id_usuario` int NOT NULL,
  `NÂ°_comprobante` int NOT NULL,
  `tipo_pago` varchar(245) NOT NULL,
  `descuento` float NOT NULL,
  `total_compra` float NOT NULL,
  `fecha_compra` date NOT NULL,
  PRIMARY KEY (`idfactura_compra`),
  KEY `id_peovedor_idx` (`id_provedor`),
  KEY `id_usuario_idx` (`id_usuario`),
  CONSTRAINT `id_peovedor` FOREIGN KEY (`id_provedor`) REFERENCES `provedor` (`idprovedor`),
  CONSTRAINT `id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`idusuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura_compra`
--

LOCK TABLES `factura_compra` WRITE;
/*!40000 ALTER TABLE `factura_compra` DISABLE KEYS */;
INSERT INTO `factura_compra` VALUES (6,22,12,0,'sddsdsd',0.19,0,'2023-11-23'),(7,22,12,0,'efetivo',0.19,0,'2023-11-28'),(8,22,12,0,'efetivo',0.19,0,'2023-11-28'),(9,22,12,0,'efetivo',0.19,0,'2023-11-28'),(10,22,12,0,'efetivo',0.19,0,'2023-11-28'),(11,22,12,0,'efetivo',0.19,0,'2023-11-28'),(12,22,12,0,'efetivo',0.19,0,'2023-11-28'),(13,22,12,0,'efetivo',0.19,0,'2023-11-28'),(14,22,12,0,'efetivo',0.19,0,'2023-11-28'),(15,212121,12121212,0,'Tarjeta de Debito',0.19,0,'2023-11-29'),(16,22,12121212,0,'Tarjeta de Debito',0.19,0,'2023-11-30'),(17,22,11111,0,'Tarjeta de Debito',0.19,0,'2023-12-06');
/*!40000 ALTER TABLE `factura_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `mostrar_cargo`
--

DROP TABLE IF EXISTS `mostrar_cargo`;
/*!50001 DROP VIEW IF EXISTS `mostrar_cargo`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_cargo` AS SELECT 
 1 AS `idcargo`,
 1 AS `nombre`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_cliente`
--

DROP TABLE IF EXISTS `mostrar_cliente`;
/*!50001 DROP VIEW IF EXISTS `mostrar_cliente`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_cliente` AS SELECT 
 1 AS `tipoDocumento`,
 1 AS `idcliente`,
 1 AS `nombre`,
 1 AS `telefono`,
 1 AS `correo`,
 1 AS `sexo`,
 1 AS `fecha_nacimiento`,
 1 AS `direccion`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_detalle_factura`
--

DROP TABLE IF EXISTS `mostrar_detalle_factura`;
/*!50001 DROP VIEW IF EXISTS `mostrar_detalle_factura`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_detalle_factura` AS SELECT 
 1 AS `id_detalle_factura_compra`,
 1 AS `id_fact_compra`,
 1 AS `id_producto`,
 1 AS `cantidad_comprado`,
 1 AS `precio_unitario_compra`,
 1 AS `precio_total_compra`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_factura`
--

DROP TABLE IF EXISTS `mostrar_factura`;
/*!50001 DROP VIEW IF EXISTS `mostrar_factura`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_factura` AS SELECT 
 1 AS `idfactura`,
 1 AS `idcliente`,
 1 AS `idusuario`,
 1 AS `tipo_pago`,
 1 AS `NÂ°_comprobante`,
 1 AS `total_pagar`,
 1 AS `fecha`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_factura_compra`
--

DROP TABLE IF EXISTS `mostrar_factura_compra`;
/*!50001 DROP VIEW IF EXISTS `mostrar_factura_compra`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_factura_compra` AS SELECT 
 1 AS `idfactura_compra`,
 1 AS `id_provedor`,
 1 AS `id_usuario`,
 1 AS `NÂ°_comprobante`,
 1 AS `tipo_pago`,
 1 AS `descuento`,
 1 AS `total_compra`,
 1 AS `fecha_compra`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_producto`
--

DROP TABLE IF EXISTS `mostrar_producto`;
/*!50001 DROP VIEW IF EXISTS `mostrar_producto`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_producto` AS SELECT 
 1 AS `idproducto`,
 1 AS `nombre`,
 1 AS `descripcion`,
 1 AS `cantidad`,
 1 AS `imagen`,
 1 AS `precio`,
 1 AS `condicion`,
 1 AS `ruta`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_provedor`
--

DROP TABLE IF EXISTS `mostrar_provedor`;
/*!50001 DROP VIEW IF EXISTS `mostrar_provedor`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_provedor` AS SELECT 
 1 AS `idprovedor`,
 1 AS `tipo_nit`,
 1 AS `nombre`,
 1 AS `tipoPersona`,
 1 AS `telefono`,
 1 AS `correo`,
 1 AS `sexo`,
 1 AS `fecha`,
 1 AS `direccion`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_sexo`
--

DROP TABLE IF EXISTS `mostrar_sexo`;
/*!50001 DROP VIEW IF EXISTS `mostrar_sexo`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_sexo` AS SELECT 
 1 AS `idsexo`,
 1 AS `nombre`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `mostrar_usuario`
--

DROP TABLE IF EXISTS `mostrar_usuario`;
/*!50001 DROP VIEW IF EXISTS `mostrar_usuario`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `mostrar_usuario` AS SELECT 
 1 AS `idusuario`,
 1 AS `tipoDocumento`,
 1 AS `nombre`,
 1 AS `cargo`,
 1 AS `telefono`,
 1 AS `correo`,
 1 AS `sexo`,
 1 AS `direccion`,
 1 AS `fecha_nacimiento`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(245) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `cantidad` int NOT NULL,
  `imagen` longblob,
  `precio` float NOT NULL,
  `condicion` tinyint NOT NULL,
  `ruta` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=7784 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (7779,'TECLADO',' EDWAR',114,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0 \0\0\0 \0\0\0szzô\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\ì\0\0\0\ìy(q½\0\0\0tEXtSoftware\0www.inkscape.org›\î<\Z\0\0IDATX…\í—kl\å†Ÿ\ÏŞ½¾¬7¶c¯\×vl\ìPSDC‰”•4MK# ¤JijQ\ÓDB«\Ğ6M-JB[™¨¤\Ğ6¨ ¨\åGK\Õ?!œb%N\\\Ø\Ä\×8¶²±w\í½\Í^<{ïµ#_6±!ôG¥¾\Òh\æ;\ßy¿ó\Îw\Ş\ÍÀÿ±rÈŸ‘g\0¤\ë-^œü´¤†r\í›š‹R·¹¤d­M\Ü½\">56\ÔKªzdU.úüª\\[•N)”#|\Î5\ïš?©YuÔŸ\á\Ôx5\ÍôJx{Ş¸x8œ›=†€7€²ü·\×4\Ù\Åş\Æ2±(™­\ØK€Ø¼(^\0|À­+]l>YiâŸ€=×˜¿‰¼À\ëÂµ<\à\0\Ü×˜?ô³t‡>7¯—\á÷\ë¯6i..»d4Z\Õ\ÊjW\ĞQY–\r–C\ä[{še\nüh\'o¼tù[€$ğ\ïBd[i\åf«­Ló\ĞÎŸCı§ùğ½·r3ñXf\Ú7©›\Ë“\ÖTˆ\Õ\ë4[\Ôd®gÀ—\ŞHŞµ·\0\Ú5vÍ \Â\æ„\Zg\Âs ŠˆÎŠ¢»úı·\ÕI)õÈªÜ¦¦¢4`™\rKÀ\Ò;gÈ»{Á#&Ë¦—$½¡\Çb±½c±\Ø\ŞA¯¿j»® \É.÷\ßa\Ê6\Ù\Å\è¼pğÊ¢T»,\ë²¬\0öe\Î\ã«Ào—K’»Óµ’ôswÛºö\\Ûºöœ\Ş`\î^¡\0\Ğ<?pÅ„²,\ï\ĞIú§ §[B+€d2QSR\æÓ“iI*\Z_™MJM\Ît¦Tõ\Õù\ì\å*\Ïúöoˆ‚¶×–\"—Í¢„%\×\Ë!›\É\Ğ}\â\ï\é)¯§\nğ\ÍU\ÛPW\ßò\İ\éĞ”fF\Ò2\ì>ƒ³¶‘SşY\Òr\ê\ä	’‰8—F\ÏúğM\\blô<²N\Ã\'g?B\Ğjøøt7\Å\Å&<\ã#TT\Ö\â÷\r\àŸú£#ƒDR\à9w\í\åqR\é4\é™òz\Ş†\Ê¶>ıKÌ¥yO9*«\è\Øı8\Íko¢}\ËV6}}+·ß±™¯|ó\ZšZxlÏ“\Ô:\ëÙ¶ıQj\ë\\\ì}\ê\0š\ÙM(´¬’J*\Ô~\éË¤R	6JzÂ¾‰…\r™=oim»õo\ÕN!¬‘$™\Õ\Õu\\º8H&\"	£“d\Èeó$A ™P1™­Ä¢\n²Á\ÄL<Š\Ål\Åd)¡¤\ÜA*•$¡ÎÉ¤\ÑjE2™Z­¢\"™÷™¬»\ï£;,xe’	²j\ï¤\Å\ïe&Ál)&\"¥\ÓhÈ‘\Ëe\Ñ\"	5$I\Ì\Äc Ñ\ÈE£d \ÜA8\à#\è÷\Ğ\Í$b“”ZÁh«_¸\éó!¿—W^{“\Z§“}‡\ãt\Õó\Â\ÑcÜ°öl{¸ƒ{\ï€m<È½\ÛwrÃmyñ%œ.û¦º¤”“7¢x\Æ\0P\Â~wı§«}‡³¦&\Í\É?Œ¡ø‡¯Ş‚™¸\"\Ø+\r¸iX\Ó\ÂP¿›º†FFG†)³W‹(‚\Ù` äŸ¦\ÆY\ÏÅ‘A\ê«j¨LgøKm\ëúpmü\ZgzN`1›¸0<Hcs+ú{¹Ù©\ábÀˆhY}¥sOAƒ\İQı ¨\Óiÿùs\\¡\ë\å\ãôö\â;»ö!f“<ò\ènD£Ws+}o\étŠ»¶\ï\Â74@·½–û‹óH\Çü^lµ\r(\á\0;8€\ÒC\×\ï\Óÿş¼[öEûC¤Š\äÜ”\×ó\Z0¼Àj,ÂŸ»\Ã\İwš½?\ØI_oqºˆ¦¹8ù\"\Ñhş\í\ìv÷1\Ö\ïf\âòeúG¸½Q`lü­\Í-\É5UxóØ¯ù¸\ï4{&89¶Jc\0‹\Õ\ÆOñ,ü!\ß~d7a5\É}¿yy		\à\İg~\Ì\ß\ï\àW\Ïp_\Ç^^?ú<?zööt\ì\0ÀZlcÿ\Ó\é\ìü•¿E\ê±.‚©\ä’u\æ<°¾©õ\æªk\ê„H\ØO8\Â`4‰F0ZmÄ”6‹E	c0š‰\Ç\"X­Å˜­¥”UT˜š ôT‚ˆ™\éå¢ŒÁQ\ÅØ¤\';x\î\Ì {N€`±–xK\Ê+l¢V\\\î#åºÎ¤si_@	ù@vq±U|ö_°•\"xÿ\Ë5ş‡ğ\é\ZD-\É\è±&\0\0\0\0IEND®B`‚',40800,1,'C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\target\\classes\\producto\\teclado.png'),(7780,'sdd','dsddsdsds',4,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0 \0\0\0 \0\0\0szzô\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\ì\0\0\0\ìy(q½\0\0\0tEXtSoftware\0www.inkscape.org›\î<\Z\0\0IDATX…\í—kl\å†Ÿ\ÏŞ½¾¬7¶c¯\×vl\ìPSDC‰”•4MK# ¤JijQ\ÓDB«\Ğ6M-JB[™¨¤\Ğ6¨ ¨\åGK\Õ?!œb%N\\\Ø\Ä\×8¶²±w\í½\Í^<{ïµ#_6±!ôG¥¾\Òh\æ;\ßy¿ó\Îw\Ş\ÍÀÿ±rÈŸ‘g\0¤\ë-^œü´¤†r\í›š‹R·¹¤d­M\Ü½\">56\ÔKªzdU.úüª\\[•N)”#|\Î5\ïš?©YuÔŸ\á\Ôx5\ÍôJx{Ş¸x8œ›=†€7€²ü·\×4\Ù\Åş\Æ2±(™­\ØK€Ø¼(^\0|À­+]l>YiâŸ€=×˜¿‰¼À\ëÂµ<\à\0\Ü×˜?ô³t‡>7¯—\á÷\ë¯6i..»d4Z\Õ\ÊjW\ĞQY–\r–C\ä[{še\nüh\'o¼tù[€$ğ\ïBd[i\åf«­Ló\ĞÎŸCı§ùğ½·r3ñXf\Ú7©›\Ë“\ÖTˆ\Õ\ë4[\Ôd®gÀ—\ŞHŞµ·\0\Ú5vÍ \Â\æ„\Zg\Âs ŠˆÎŠ¢»úı·\ÕI)õÈªÜ¦¦¢4`™\rKÀ\Ò;gÈ»{Á#&Ë¦—$½¡\Çb±½c±\Ø\ŞA¯¿j»® \É.÷\ßa\Ê6\Ù\Å\è¼pğÊ¢T»,\ë²¬\0öe\Î\ã«Ào—K’»Óµ’ôswÛºö\\Ûºöœ\Ş`\î^¡\0\Ğ<?pÅ„²,\ï\ĞIú§ §[B+€d2QSR\æÓ“iI*\Z_™MJM\Ît¦Tõ\Õù\ì\å*\Ïúöoˆ‚¶×–\"—Í¢„%\×\Ë!›\É\Ğ}\â\ï\é)¯§\nğ\ÍU\ÛPW\ßò\İ\éĞ”fF\Ò2\ì>ƒ³¶‘SşY\Òr\ê\ä	’‰8—F\ÏúğM\\blô<²N\Ã\'g?B\Ğjøøt7\Å\Å&<\ã#TT\Ö\â÷\r\àŸú£#ƒDR\à9w\í\åqR\é4\é™òz\Ş†\Ê¶>ıKÌ¥yO9*«\è\Øı8\Íko¢}\ËV6}}+·ß±™¯|ó\ZšZxlÏ“\Ô:\ëÙ¶ıQj\ë\\\ì}\ê\0š\ÙM(´¬’J*\Ô~\éË¤R	6JzÂ¾‰…\r™=oim»õo\ÕN!¬‘$™\Õ\Õu\\º8H&\"	£“d\Èeó$A ™P1™­Ä¢\n²Á\ÄL<Š\Ål\Åd)¡¤\ÜA*•$¡ÎÉ¤\ÑjE2™Z­¢\"™÷™¬»\ï£;,xe’	²j\ï¤\Å\ïe&Ál)&\"¥\ÓhÈ‘\Ëe\Ñ\"	5$I\Ì\Äc Ñ\ÈE£d \ÜA8\à#\è÷\Ğ\Í$b“”ZÁh«_¸\éó!¿—W^{“\Z§“}‡\ãt\Õó\Â\ÑcÜ°öl{¸ƒ{\ï€m<È½\ÛwrÃmyñ%œ.û¦º¤”“7¢x\Æ\0P\Â~wı§«}‡³¦&\Í\É?Œ¡ø‡¯Ş‚™¸\"\Ø+\r¸iX\Ó\ÂP¿›º†FFG†)³W‹(‚\Ù` äŸ¦\ÆY\ÏÅ‘A\ê«j¨LgøKm\ëúpmü\ZgzN`1›¸0<Hcs+ú{¹Ù©\ábÀˆhY}¥sOAƒ\İQı ¨\Óiÿùs\\¡\ë\å\ãôö\â;»ö!f“<ò\ènD£Ws+}o\étŠ»¶\ï\Â74@·½–û‹óH\Çü^lµ\r(\á\0;8€\ÒC\×\ï\Óÿş¼[öEûC¤Š\äÜ”\×ó\Z0¼Àj,ÂŸ»\Ã\İwš½?\ØI_oqºˆ¦¹8ù\"\Ñhş\í\ìv÷1\Ö\ïf\âòeúG¸½Q`lü­\Í-\É5UxóØ¯ù¸\ï4{&89¶Jc\0‹\Õ\ÆOñ,ü!\ß~d7a5\É}¿yy		\à\İg~\Ì\ß\ï\àW\Ïp_\Ç^^?ú<?zööt\ì\0ÀZlcÿ\Ó\é\ìü•¿E\ê±.‚©\ä’u\æ<°¾©õ\æªk\ê„H\ØO8\Â`4‰F0ZmÄ”6‹E	c0š‰\Ç\"X­Å˜­¥”UT˜š ôT‚ˆ™\éå¢ŒÁQ\ÅØ¤\';x\î\Ì {N€`±–xK\Ê+l¢V\\\î#åºÎ¤si_@	ù@vq±U|ö_°•\"xÿ\Ë5ş‡ğ\é\ZD-\É\è±&\0\0\0\0IEND®B`‚',84000,1,'C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\target\\classes\\producto\\teclado.png'),(7781,'fdfd','fdffdf',0,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0 \0\0\0 \0\0\0szzô\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\ì\0\0\0\ìy(q½\0\0\0tEXtSoftware\0www.inkscape.org›\î<\Z\0\0IDATX…\í—kl\å†Ÿ\ÏŞ½¾¬7¶c¯\×vl\ìPSDC‰”•4MK# ¤JijQ\ÓDB«\Ğ6M-JB[™¨¤\Ğ6¨ ¨\åGK\Õ?!œb%N\\\Ø\Ä\×8¶²±w\í½\Í^<{ïµ#_6±!ôG¥¾\Òh\æ;\ßy¿ó\Îw\Ş\ÍÀÿ±rÈŸ‘g\0¤\ë-^œü´¤†r\í›š‹R·¹¤d­M\Ü½\">56\ÔKªzdU.úüª\\[•N)”#|\Î5\ïš?©YuÔŸ\á\Ôx5\ÍôJx{Ş¸x8œ›=†€7€²ü·\×4\Ù\Åş\Æ2±(™­\ØK€Ø¼(^\0|À­+]l>YiâŸ€=×˜¿‰¼À\ëÂµ<\à\0\Ü×˜?ô³t‡>7¯—\á÷\ë¯6i..»d4Z\Õ\ÊjW\ĞQY–\r–C\ä[{še\nüh\'o¼tù[€$ğ\ïBd[i\åf«­Ló\ĞÎŸCı§ùğ½·r3ñXf\Ú7©›\Ë“\ÖTˆ\Õ\ë4[\Ôd®gÀ—\ŞHŞµ·\0\Ú5vÍ \Â\æ„\Zg\Âs ŠˆÎŠ¢»úı·\ÕI)õÈªÜ¦¦¢4`™\rKÀ\Ò;gÈ»{Á#&Ë¦—$½¡\Çb±½c±\Ø\ŞA¯¿j»® \É.÷\ßa\Ê6\Ù\Å\è¼pğÊ¢T»,\ë²¬\0öe\Î\ã«Ào—K’»Óµ’ôswÛºö\\Ûºöœ\Ş`\î^¡\0\Ğ<?pÅ„²,\ï\ĞIú§ §[B+€d2QSR\æÓ“iI*\Z_™MJM\Ît¦Tõ\Õù\ì\å*\Ïúöoˆ‚¶×–\"—Í¢„%\×\Ë!›\É\Ğ}\â\ï\é)¯§\nğ\ÍU\ÛPW\ßò\İ\éĞ”fF\Ò2\ì>ƒ³¶‘SşY\Òr\ê\ä	’‰8—F\ÏúğM\\blô<²N\Ã\'g?B\Ğjøøt7\Å\Å&<\ã#TT\Ö\â÷\r\àŸú£#ƒDR\à9w\í\åqR\é4\é™òz\Ş†\Ê¶>ıKÌ¥yO9*«\è\Øı8\Íko¢}\ËV6}}+·ß±™¯|ó\ZšZxlÏ“\Ô:\ëÙ¶ıQj\ë\\\ì}\ê\0š\ÙM(´¬’J*\Ô~\éË¤R	6JzÂ¾‰…\r™=oim»õo\ÕN!¬‘$™\Õ\Õu\\º8H&\"	£“d\Èeó$A ™P1™­Ä¢\n²Á\ÄL<Š\Ål\Åd)¡¤\ÜA*•$¡ÎÉ¤\ÑjE2™Z­¢\"™÷™¬»\ï£;,xe’	²j\ï¤\Å\ïe&Ál)&\"¥\ÓhÈ‘\Ëe\Ñ\"	5$I\Ì\Äc Ñ\ÈE£d \ÜA8\à#\è÷\Ğ\Í$b“”ZÁh«_¸\éó!¿—W^{“\Z§“}‡\ãt\Õó\Â\ÑcÜ°öl{¸ƒ{\ï€m<È½\ÛwrÃmyñ%œ.û¦º¤”“7¢x\Æ\0P\Â~wı§«}‡³¦&\Í\É?Œ¡ø‡¯Ş‚™¸\"\Ø+\r¸iX\Ó\ÂP¿›º†FFG†)³W‹(‚\Ù` äŸ¦\ÆY\ÏÅ‘A\ê«j¨LgøKm\ëúpmü\ZgzN`1›¸0<Hcs+ú{¹Ù©\ábÀˆhY}¥sOAƒ\İQı ¨\Óiÿùs\\¡\ë\å\ãôö\â;»ö!f“<ò\ènD£Ws+}o\étŠ»¶\ï\Â74@·½–û‹óH\Çü^lµ\r(\á\0;8€\ÒC\×\ï\Óÿş¼[öEûC¤Š\äÜ”\×ó\Z0¼Àj,ÂŸ»\Ã\İwš½?\ØI_oqºˆ¦¹8ù\"\Ñhş\í\ìv÷1\Ö\ïf\âòeúG¸½Q`lü­\Í-\É5UxóØ¯ù¸\ï4{&89¶Jc\0‹\Õ\ÆOñ,ü!\ß~d7a5\É}¿yy		\à\İg~\Ì\ß\ï\àW\Ïp_\Ç^^?ú<?zööt\ì\0ÀZlcÿ\Ó\é\ìü•¿E\ê±.‚©\ä’u\æ<°¾©õ\æªk\ê„H\ØO8\Â`4‰F0ZmÄ”6‹E	c0š‰\Ç\"X­Å˜­¥”UT˜š ôT‚ˆ™\éå¢ŒÁQ\ÅØ¤\';x\î\Ì {N€`±–xK\Ê+l¢V\\\î#åºÎ¤si_@	ù@vq±U|ö_°•\"xÿ\Ë5ş‡ğ\é\ZD-\É\è±&\0\0\0\0IEND®B`‚',0,1,'C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\target\\classes\\producto\\teclado.png'),(7782,'EL MAS BONITO','LO  MEJOR DE LO MEJOR',0,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0 \0\0\0 \0\0\0szzô\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\ì\0\0\0\ìy(q½\0\0\0tEXtSoftware\0www.inkscape.org›\î<\Z\0\0IDATX…\í—kl\å†Ÿ\ÏŞ½¾¬7¶c¯\×vl\ìPSDC‰”•4MK# ¤JijQ\ÓDB«\Ğ6M-JB[™¨¤\Ğ6¨ ¨\åGK\Õ?!œb%N\\\Ø\Ä\×8¶²±w\í½\Í^<{ïµ#_6±!ôG¥¾\Òh\æ;\ßy¿ó\Îw\Ş\ÍÀÿ±rÈŸ‘g\0¤\ë-^œü´¤†r\í›š‹R·¹¤d­M\Ü½\">56\ÔKªzdU.úüª\\[•N)”#|\Î5\ïš?©YuÔŸ\á\Ôx5\ÍôJx{Ş¸x8œ›=†€7€²ü·\×4\Ù\Åş\Æ2±(™­\ØK€Ø¼(^\0|À­+]l>YiâŸ€=×˜¿‰¼À\ëÂµ<\à\0\Ü×˜?ô³t‡>7¯—\á÷\ë¯6i..»d4Z\Õ\ÊjW\ĞQY–\r–C\ä[{še\nüh\'o¼tù[€$ğ\ïBd[i\åf«­Ló\ĞÎŸCı§ùğ½·r3ñXf\Ú7©›\Ë“\ÖTˆ\Õ\ë4[\Ôd®gÀ—\ŞHŞµ·\0\Ú5vÍ \Â\æ„\Zg\Âs ŠˆÎŠ¢»úı·\ÕI)õÈªÜ¦¦¢4`™\rKÀ\Ò;gÈ»{Á#&Ë¦—$½¡\Çb±½c±\Ø\ŞA¯¿j»® \É.÷\ßa\Ê6\Ù\Å\è¼pğÊ¢T»,\ë²¬\0öe\Î\ã«Ào—K’»Óµ’ôswÛºö\\Ûºöœ\Ş`\î^¡\0\Ğ<?pÅ„²,\ï\ĞIú§ §[B+€d2QSR\æÓ“iI*\Z_™MJM\Ît¦Tõ\Õù\ì\å*\Ïúöoˆ‚¶×–\"—Í¢„%\×\Ë!›\É\Ğ}\â\ï\é)¯§\nğ\ÍU\ÛPW\ßò\İ\éĞ”fF\Ò2\ì>ƒ³¶‘SşY\Òr\ê\ä	’‰8—F\ÏúğM\\blô<²N\Ã\'g?B\Ğjøøt7\Å\Å&<\ã#TT\Ö\â÷\r\àŸú£#ƒDR\à9w\í\åqR\é4\é™òz\Ş†\Ê¶>ıKÌ¥yO9*«\è\Øı8\Íko¢}\ËV6}}+·ß±™¯|ó\ZšZxlÏ“\Ô:\ëÙ¶ıQj\ë\\\ì}\ê\0š\ÙM(´¬’J*\Ô~\éË¤R	6JzÂ¾‰…\r™=oim»õo\ÕN!¬‘$™\Õ\Õu\\º8H&\"	£“d\Èeó$A ™P1™­Ä¢\n²Á\ÄL<Š\Ål\Åd)¡¤\ÜA*•$¡ÎÉ¤\ÑjE2™Z­¢\"™÷™¬»\ï£;,xe’	²j\ï¤\Å\ïe&Ál)&\"¥\ÓhÈ‘\Ëe\Ñ\"	5$I\Ì\Äc Ñ\ÈE£d \ÜA8\à#\è÷\Ğ\Í$b“”ZÁh«_¸\éó!¿—W^{“\Z§“}‡\ãt\Õó\Â\ÑcÜ°öl{¸ƒ{\ï€m<È½\ÛwrÃmyñ%œ.û¦º¤”“7¢x\Æ\0P\Â~wı§«}‡³¦&\Í\É?Œ¡ø‡¯Ş‚™¸\"\Ø+\r¸iX\Ó\ÂP¿›º†FFG†)³W‹(‚\Ù` äŸ¦\ÆY\ÏÅ‘A\ê«j¨LgøKm\ëúpmü\ZgzN`1›¸0<Hcs+ú{¹Ù©\ábÀˆhY}¥sOAƒ\İQı ¨\Óiÿùs\\¡\ë\å\ãôö\â;»ö!f“<ò\ènD£Ws+}o\étŠ»¶\ï\Â74@·½–û‹óH\Çü^lµ\r(\á\0;8€\ÒC\×\ï\Óÿş¼[öEûC¤Š\äÜ”\×ó\Z0¼Àj,ÂŸ»\Ã\İwš½?\ØI_oqºˆ¦¹8ù\"\Ñhş\í\ìv÷1\Ö\ïf\âòeúG¸½Q`lü­\Í-\É5UxóØ¯ù¸\ï4{&89¶Jc\0‹\Õ\ÆOñ,ü!\ß~d7a5\É}¿yy		\à\İg~\Ì\ß\ï\àW\Ïp_\Ç^^?ú<?zööt\ì\0ÀZlcÿ\Ó\é\ìü•¿E\ê±.‚©\ä’u\æ<°¾©õ\æªk\ê„H\ØO8\Â`4‰F0ZmÄ”6‹E	c0š‰\Ç\"X­Å˜­¥”UT˜š ôT‚ˆ™\éå¢ŒÁQ\ÅØ¤\';x\î\Ì {N€`±–xK\Ê+l¢V\\\î#åºÎ¤si_@	ù@vq±U|ö_°•\"xÿ\Ë5ş‡ğ\é\ZD-\É\è±&\0\0\0\0IEND®B`‚',0,1,'C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\target\\classes\\producto\\teclado.png'),(7783,'luis','lilili',0,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0 \0\0\0 \0\0\0szzô\0\0\0sBIT|dˆ\0\0\0	pHYs\0\0\0\ì\0\0\0\ìy(q½\0\0\0tEXtSoftware\0www.inkscape.org›\î<\Z\0\0IDATX…\í—kl\å†Ÿ\ÏŞ½¾¬7¶c¯\×vl\ìPSDC‰”•4MK# ¤JijQ\ÓDB«\Ğ6M-JB[™¨¤\Ğ6¨ ¨\åGK\Õ?!œb%N\\\Ø\Ä\×8¶²±w\í½\Í^<{ïµ#_6±!ôG¥¾\Òh\æ;\ßy¿ó\Îw\Ş\ÍÀÿ±rÈŸ‘g\0¤\ë-^œü´¤†r\í›š‹R·¹¤d­M\Ü½\">56\ÔKªzdU.úüª\\[•N)”#|\Î5\ïš?©YuÔŸ\á\Ôx5\ÍôJx{Ş¸x8œ›=†€7€²ü·\×4\Ù\Åş\Æ2±(™­\ØK€Ø¼(^\0|À­+]l>YiâŸ€=×˜¿‰¼À\ëÂµ<\à\0\Ü×˜?ô³t‡>7¯—\á÷\ë¯6i..»d4Z\Õ\ÊjW\ĞQY–\r–C\ä[{še\nüh\'o¼tù[€$ğ\ïBd[i\åf«­Ló\ĞÎŸCı§ùğ½·r3ñXf\Ú7©›\Ë“\ÖTˆ\Õ\ë4[\Ôd®gÀ—\ŞHŞµ·\0\Ú5vÍ \Â\æ„\Zg\Âs ŠˆÎŠ¢»úı·\ÕI)õÈªÜ¦¦¢4`™\rKÀ\Ò;gÈ»{Á#&Ë¦—$½¡\Çb±½c±\Ø\ŞA¯¿j»® \É.÷\ßa\Ê6\Ù\Å\è¼pğÊ¢T»,\ë²¬\0öe\Î\ã«Ào—K’»Óµ’ôswÛºö\\Ûºöœ\Ş`\î^¡\0\Ğ<?pÅ„²,\ï\ĞIú§ §[B+€d2QSR\æÓ“iI*\Z_™MJM\Ît¦Tõ\Õù\ì\å*\Ïúöoˆ‚¶×–\"—Í¢„%\×\Ë!›\É\Ğ}\â\ï\é)¯§\nğ\ÍU\ÛPW\ßò\İ\éĞ”fF\Ò2\ì>ƒ³¶‘SşY\Òr\ê\ä	’‰8—F\ÏúğM\\blô<²N\Ã\'g?B\Ğjøøt7\Å\Å&<\ã#TT\Ö\â÷\r\àŸú£#ƒDR\à9w\í\åqR\é4\é™òz\Ş†\Ê¶>ıKÌ¥yO9*«\è\Øı8\Íko¢}\ËV6}}+·ß±™¯|ó\ZšZxlÏ“\Ô:\ëÙ¶ıQj\ë\\\ì}\ê\0š\ÙM(´¬’J*\Ô~\éË¤R	6JzÂ¾‰…\r™=oim»õo\ÕN!¬‘$™\Õ\Õu\\º8H&\"	£“d\Èeó$A ™P1™­Ä¢\n²Á\ÄL<Š\Ål\Åd)¡¤\ÜA*•$¡ÎÉ¤\ÑjE2™Z­¢\"™÷™¬»\ï£;,xe’	²j\ï¤\Å\ïe&Ál)&\"¥\ÓhÈ‘\Ëe\Ñ\"	5$I\Ì\Äc Ñ\ÈE£d \ÜA8\à#\è÷\Ğ\Í$b“”ZÁh«_¸\éó!¿—W^{“\Z§“}‡\ãt\Õó\Â\ÑcÜ°öl{¸ƒ{\ï€m<È½\ÛwrÃmyñ%œ.û¦º¤”“7¢x\Æ\0P\Â~wı§«}‡³¦&\Í\É?Œ¡ø‡¯Ş‚™¸\"\Ø+\r¸iX\Ó\ÂP¿›º†FFG†)³W‹(‚\Ù` äŸ¦\ÆY\ÏÅ‘A\ê«j¨LgøKm\ëúpmü\ZgzN`1›¸0<Hcs+ú{¹Ù©\ábÀˆhY}¥sOAƒ\İQı ¨\Óiÿùs\\¡\ë\å\ãôö\â;»ö!f“<ò\ènD£Ws+}o\étŠ»¶\ï\Â74@·½–û‹óH\Çü^lµ\r(\á\0;8€\ÒC\×\ï\Óÿş¼[öEûC¤Š\äÜ”\×ó\Z0¼Àj,ÂŸ»\Ã\İwš½?\ØI_oqºˆ¦¹8ù\"\Ñhş\í\ìv÷1\Ö\ïf\âòeúG¸½Q`lü­\Í-\É5UxóØ¯ù¸\ï4{&89¶Jc\0‹\Õ\ÆOñ,ü!\ß~d7a5\É}¿yy		\à\İg~\Ì\ß\ï\àW\Ïp_\Ç^^?ú<?zööt\ì\0ÀZlcÿ\Ó\é\ìü•¿E\ê±.‚©\ä’u\æ<°¾©õ\æªk\ê„H\ØO8\Â`4‰F0ZmÄ”6‹E	c0š‰\Ç\"X­Å˜­¥”UT˜š ôT‚ˆ™\éå¢ŒÁQ\ÅØ¤\';x\î\Ì {N€`±–xK\Ê+l¢V\\\î#åºÎ¤si_@	ù@vq±U|ö_°•\"xÿ\Ë5ş‡ğ\é\ZD-\É\è±&\0\0\0\0IEND®B`‚',0,1,'C:\\Users\\edwch\\OneDrive\\Documentos\\NetBeansProjects\\Tienda.com\\target\\classes\\producto\\teclado.png');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_factura`
--

DROP TABLE IF EXISTS `producto_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto_factura` (
  `idproducto_factura` int NOT NULL,
  `idproducto` int NOT NULL,
  `idfactura` int NOT NULL,
  `cantidad` int NOT NULL,
  `descuento` float NOT NULL,
  `total_venta` varchar(45) NOT NULL,
  `condicion` tinyint NOT NULL,
  PRIMARY KEY (`idproducto_factura`),
  KEY `idfactura_idx` (`idfactura`),
  KEY `idproducto_idx` (`idproducto`),
  CONSTRAINT `idfactura` FOREIGN KEY (`idfactura`) REFERENCES `factura` (`idfactura`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idproducto` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_factura`
--

LOCK TABLES `producto_factura` WRITE;
/*!40000 ALTER TABLE `producto_factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provedor`
--

DROP TABLE IF EXISTS `provedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provedor` (
  `idprovedor` int NOT NULL AUTO_INCREMENT,
  `nit` varchar(45) NOT NULL,
  `nombre` varchar(245) NOT NULL,
  `tipoPersona` varchar(245) NOT NULL,
  `telefono` varchar(14) NOT NULL,
  `correo` varchar(245) NOT NULL,
  `sexo1` int NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `condicion` tinyint NOT NULL,
  PRIMARY KEY (`idprovedor`),
  KEY `sexo_idx` (`sexo1`),
  CONSTRAINT `sexo1` FOREIGN KEY (`sexo1`) REFERENCES `sexo` (`idsexo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2121213 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provedor`
--

LOCK TABLES `provedor` WRITE;
/*!40000 ALTER TABLE `provedor` DISABLE KEYS */;
INSERT INTO `provedor` VALUES (22,'cedula extranjera','edwar','Juridica','212','wd',1,'2023-11-09','dsds',1),(12212,'cedula de ciudania','edwar chris','Juridica','1426256353','edw@gmail.com',1,'2023-11-01','roma',1),(212121,'cedula de ciudania','edwar','Juridica','2122121','ddsdsd',2,'2023-11-07','dsdsdds',1);
/*!40000 ALTER TABLE `provedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sexo`
--

DROP TABLE IF EXISTS `sexo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sexo` (
  `idsexo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(245) NOT NULL,
  PRIMARY KEY (`idsexo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sexo`
--

LOCK TABLES `sexo` WRITE;
/*!40000 ALTER TABLE `sexo` DISABLE KEYS */;
INSERT INTO `sexo` VALUES (1,'Masculino'),(2,'Femenino');
/*!40000 ALTER TABLE `sexo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` int NOT NULL,
  `tipoDocumento` varchar(245) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `cargo` int NOT NULL,
  `sexo` int NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `login` varchar(100) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  `condicion` tinyint NOT NULL,
  PRIMARY KEY (`idusuario`),
  KEY `sexo_idx` (`sexo`),
  KEY `cargo_idx` (`cargo`),
  CONSTRAINT `cargo` FOREIGN KEY (`cargo`) REFERENCES `cargo` (`idcargo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sexo` FOREIGN KEY (`sexo`) REFERENCES `sexo` (`idsexo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (12,'sss','saasa','2232','sdsds1','sdsd',1,1,'2023-01-01','1212','121',1),(11111,'cedula extranjera','111','1111','1@gmail.com','1',1,1,'2023-11-10','1','1',1),(12312,'cedula de ciudania','Yuyu','12345678','yuyuarpa@gmail.com','cll 22 ',1,2,'2023-11-08','123','123',1),(12121212,'cedula de ciudania','edw chris','23456445','edw@hot.com','andes',2,1,'2023-11-22','2323','2323',1),(12311223,'cedula de ciudania','edw','12333433','edw@gmail.com','estrellas',1,1,'2023-11-10','222','222',1),(1077380019,'cedula','edwar','3105186227','edw@gmail.com','roma',1,1,'2023-01-01','123','123',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'tiendacom'
--
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_cliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_cliente`(in tipo varchar(245),in idcli int,in nom varchar(250),in tel varchar(13),in corre varchar(100),in sex int,in fech date,in direc varchar(45))
BEGIN
update cliente set tipoDocumento=tipo,nombre=nom,telefono=tel,correo=corre,sexo2=sex,fecha_nacimiento=fech,direccion=direc where idcliente=idcli;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_factuta_compra1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_factuta_compra1`(in idfac int, in idpro int,in idusu int, in tipo varchar(100))
BEGIN
update factura_compra set id_provedor=idpro,id_usuario=idusu,tipo_pago=tipo where idfactura_compra=idfac;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `actualizar_producto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_producto`(in idpro int,in nom varchar(245),in descri varchar(250),in img longblob,in route varchar(500))
BEGIN
update producto set nombre=nom,descripcion=descri,imagen=img,ruta=route where idproducto=idpro;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_provedor`(in idpro int,in nitt varchar(45),in nom varchar(245),in tipo varchar(245),in tell varchar(14),in corre varchar(245),in sex int,in fech date,in direc varchar(45))
BEGIN
update provedor set nit=nitt,nombre=nom,tipoPersona=tipo,telefono=tell,correo=corre,sexo1=sex,fecha_nacimiento=fech,direccion=direc where idprovedor=idpro;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Actualizar_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_usuario`(in idusu int,in nom varchar(250), in tell varchar(15),in corr varchar(100),in direc varchar(45),in carg int,in sex int,in fech date, in contra varchar(45))
BEGIN
update usuario set idusuario=idusu,nombre=nom,telefono=tell,correo=corr,direccion=direc,cargo=carg,sexo=sex,fecha_nacimiento=fech,contrasena=contra where idusuario= idusu;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Atualizar_Usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Atualizar_Usuario`(in tipo varchar(245),in nom varchar(250), in tell varchar(15),in corr varchar(100),in direc varchar(45),in carg int,in sex int,in fech date, in contra varchar(45))
BEGIN
update usuario set tipoDocumento=tipo,nombre=nom,telefono=tell,correo=corr,direccion=direc,cargo=car,sexo=sex,fecha_nacimiento=fech,contrasena=contra where idusuario= idusu;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscar_cliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_cliente`(in valor int)
BEGIN
select * from cliente where idcliente = valor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscar_facturacompra` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_facturacompra`(in valor int)
BEGIN
select * from Factura_compra where idfactura_compra = valor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscar_producto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_producto`(in valor int)
BEGIN
select * from producto where idproducto = valor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscar_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_provedor`(in valor int)
BEGIN
select * from provedor where idprovedor = valor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `buscar_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_usuario`(in valor int )
BEGIN
select * from usuario where idusuario = valor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_cliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_cliente`(in valor varchar (45))
BEGIN
select * from mostrar_cliente where Tipodocumento like concat('%',valor,'%')   
|| idcliente  like concat('%',valor,'%') || nombre like concat('%',valor,'%') 
|| telefono like concat('%',valor,'%') || correo  like concat('%',valor,'%')
 || nombre like concat('%',valor,'%') || fecha_nacimiento like concat('%',valor,'%') 
 || direccion  like concat('%',valor,'%') ;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_factura_compra` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_factura_compra`(in valor varchar(45))
BEGIN
select * from mostrar_factura_compra where idfactura_compra like concat('%',valor,'%') 
  || id_provedor like concat('%',valor,'%')
 || id_usuario like concat('%',valor,'%')
 || tipo_pago like concat('%',valor,'%') 
 || descuento like concat('%',valor,'%') 
   || total_compra like concat('%',valor,'%') 
   || fecha_compra like concat('%',valor,'%') ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_factura_comptra` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_factura_comptra`(in valor varchar(45))
BEGIN
select * from mostrar_factura_compra where factura_compra like concat('%',valor,'%') 
 || idfactura_compra like concat('%',valor,'%') 
  || idprovedor like concat('%',valor,'%')
 || idusuario like concat('%',valor,'%')
 || tipo_pago like concat('%',valor,'%') 
 || descuento like concat('%',valor,'%') 
   || total_compra like concat('%',valor,'%') 
   || fecha_compra like concat('%',valor,'%') ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_producto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_producto`(in valor varchar(45))
BEGIN
select * from mostrar_producto where idproducto like concat('%',valor,'%')   
|| nombre  like concat('%',valor,'%') ||descripcion like concat('%',valor,'%') 
|| cantidad like concat('%',valor,'%') || imagen like concat('%',valor,'%')
 || precio like concat('%',valor,'%') 
 ||ruta  like concat('%',valor,'%') ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_provedor`(in valor varchar(45))
BEGIN
select * from mostrar_provedor where idprovedor like concat('%',valor,'%') 
|| tipo_nit like concat('%',valor,'%')
 || nombre like concat('%',valor,'%')
 || tipoPersona like concat('%',valor,'%') 
|| telefono  like concat('%',valor,'%')
|| correo like concat('%',valor,'%')
|| sexo like concat('%',valor,'%') 
||fecha like concat('%',valor,'%') 
 || direccion like concat('%',valor,'%') ;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `consul_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `consul_usuario`(in valor varchar(45))
BEGIN
select * from mostrar_usuario where   idusuario like concat('%',valor,'%')
|| Tipodocumento like concat('%',valor,'%') 
|| nombre like concat('%',valor,'%')  
|| telefono like concat('%',valor,'%') || correo  like concat('%',valor,'%')
 || direccion like concat('%',valor,'%') || nombre like concat('%',valor,'%') 
 || fecha_nacimiento like concat('%',valor,'%') || nombre like concat('%',valor,'%');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `detalle_factura_mostrar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `detalle_factura_mostrar`(in valor int)
BEGIN
select f.idfactura_compra 'Factura', o.nombre 'Proveedor', u.nombre 'Usuario', f.tipo_pago 'Tipo Pago', 
f.NÂ°_comprobante 'NÂ° Comprobante', f.descuento 'Descuento',
 f.total_compra 'Total Compra', f.fecha_compra 'Fecha', p.idproducto 'Codigo',
 p.nombre 'Producto', p.descripcion 'DescripciÃƒÂ³n', d.cantidad_comprado 'Cantidad',
 d.precio_unitario_compra 'Precio Unitario', d.precio_total_compra'Total' 
 from factura_compra f inner join detalle_factura_compra d on d.id_fact_compra=f.idfactura_compra 
 inner join producto p on d.id_producto = p.idproducto inner join usuario u on 
 f.id_usuario = u.idusuario inner join provedor o on f.id_provedor = o.idprovedor
 where f.idfactura_compra = valor; 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `de_fac_compra` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `de_fac_compra`(in id_de_fac_comp int,in id_fact_comp int,in id_produc int,in canti_compra int)
BEGIN
insert into detalle_factura_compra value (id_de_fac_comp,id_fact_comp,id_produc,canti_compra,'0','0');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminar_cliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_cliente`(in idcli int)
BEGIN
update cliente set condicion='0' where idcliente =idcli;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminar_producto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_producto`(in idpro int)
BEGIN
update producto set condicion='0' where idproducto=idpro;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminar_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_provedor`(in idpro int)
BEGIN
update provedor set condicion='0' where idprovedor =idpro;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `eliminar_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_usuario`(in idUsu int)
BEGIN
update usuario set condicion='0' where idusuario =idUsu;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ingreso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ingreso`(in log varchar(100), in contra varchar(45))
BEGIN
select login, contrasena from usuario where login= log && clave=contra && condicion = '1';
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insDetalleFactura` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insDetalleFactura`(in idfat int,in idpro int,in can int,in preci float)
BEGIN
insert into detalle_factura_compra(id_fact_compra,id_producto,cantidad_comprado,precio_unitario_compra,precio_total_compra) values (idfat,idpro,can,preci,'0');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `inss_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `inss_usuario`(in usu int,in tipo varchar(245),in nom varchar(250), in tell varchar(15),in corr varchar(100),in direc varchar(45),in carg int,in sex int,in fech date, in log varchar(100), in contra varchar(45))
BEGIN
insert into usuario (idusuario,tipoDocumento,nombre,telefono,correo,direccion,cargo,sexo,fecha_nacimiento,login,contrasena,condicion) values (usu,tipo,nom,tell,corr,direc,carg,sex,fech,log,contra,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_clic` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_clic`(in docu int,in tipo varchar(245),in nom varchar(250), in corre varchar(100),in tel varchar(23),in sex int,fech date,in direc varchar(45))
BEGIN
insert into cliente  values (docu,tipo,nom,corre,tel,sex,fech,direc,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_cliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_cliente`(in tipo varchar(245),in docu int,in nom varchar(250),in tel varchar(13), in corre varchar(100),in sex int,in fech date,in direc varchar(45))
BEGIN
insert into cliente values (tipo,docu,nom,tel,corre,sex,fech,direc,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_facturacompra` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_facturacompra`(in idpro int,in idusu int,in com int,in tipo varchar(45))
BEGIN
insert into factura_compra(id_provedor,id_usuario,NÂ°_comprobante,tipo_pago,descuento,total_compra,fecha_compra) values (idpro,idusu,com,tipo,'0.19','0',current_date());
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_ingreso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_ingreso`(in log varchar(100), in contra varchar(45))
BEGIN
select login, contrasena from usuario where login= log && contrasena=contra && condicion = '1';
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_producto` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_producto`(in nom varchar(245),in descrip varchar(250),in imag longblob,in route varchar(500))
BEGIN
insert into producto(nombre,descripcion,cantidad,imagen,precio,condicion,ruta)  values (nom,descrip,'0',imag,'0','1',route);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ins_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ins_provedor`(in idDocu int,in tipo varchar(45),in nom varchar(245), in tipo_per varchar(245),in tell int,in corr varchar(245),in sex int,in fecha date,in direc varchar(45))
BEGIN
insert into provedor values (idDocu,tipo,nom,tipo_per,tell,corr,sex, fecha ,direc,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `in_fact` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `in_fact`(in idfac int,in id_cli int,in id_usu int,in com int,tipo_pag varchar(100) )
BEGIN
insert into factura (idfactura,fecha,idcliente,idusuario,NÂ°_comprobante,tipo_pago,impuesto,total_pagar,condicion)value (idfac,current_timestamp(),id_cli,id_usu,com,tipo-pag,'0','0','1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `in_facturaVenta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `in_facturaVenta`(in idfact int,id_cli int,in id_usu int,in com int,tipo varchar(100) )
BEGIN
insert into factura value (idfact,id_cli,id_usu,com,tipo,'0','0',current_date(),'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `in_ingreso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `in_ingreso`(in log varchar(100), in contra varchar(45))
BEGIN
select usuario , contrasena from usuario where login = log && clave=contra && condicion = '1';
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `in_produc` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `in_produc`(in nom varchar(245),in descrip varchar(250),in imag varchar(250))
BEGIN
insert into producto (nombre,descripcion,cantidad,imagen,precio, condicion) value(nom,descrip,'0','imagen','0','1' );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `in_provedor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `in_provedor`(in nom varchar(245),in cedu varchar(15), in tipo_per varchar(245),in tell int,in fecha date,in sex int,in direc varchar(45))
BEGIN
insert into provedor values (idprovedor,nom,cedu,tipo_per,tell,fecha, sex ,direc,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `mostrar_usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `mostrar_usuario`(in valor varchar(245))
BEGIN
select * from mostrar_usuario;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `new_procedure` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `new_procedure`(in valor int)
BEGIN
select f.idfactura_compra 'Factura', o.nombre 'Proveedor', u.nombre 'Usuario', f.tipo_pago 'Tipo Pago', 
f.NÂ°_comprobante 'NÃ‚Â° Comprobante', f.descuento 'Descuento',
 f.total_compra 'Total Compra', f.fecha_compra 'Fecha', p.idproducto 'CÃƒÂ³digo',
 p.nombre 'Producto', p.descripcion 'DescripciÃƒÂ³n', d.cantidad_comprado 'Cantidad',
 d.precio_unitario_compra 'Precio Unitario', d.precio_total_compra'Total' 
 from factura_compra f inner join detalle_factura_compra d on d.id_factcompra=f.idfactura_compra 
 inner join producto p on d.id_producto = p.idproducto inner join usuario u on 
 f.id_usuario = u.idusuario inner join provedor o on f.id_proveedor = o.idproveedor
 where f.idfactura_compra = valor; 
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `usuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `usuario`(in id_usu int,in nom varchar(250), in tell varchar(15),in corr varchar(100),in direc varchar(45),in sex int,in fech date,in carg int, in log varchar(100), in contra varchar(45))
BEGIN
insert into usuario (idusuario,nombre,telefono,correo,direcion,sexo,fecha_nacimiento,cargo,login,contrasena,condicion) value (id_usu,nom,tell,corr,direc,sex,fech,carg,log,contra,'1');
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `mostrar_cargo`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_cargo`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_cargo` AS select `cargo`.`idcargo` AS `idcargo`,`cargo`.`nombre` AS `nombre` from `cargo` where (0 <> '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_cliente`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_cliente`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_cliente` AS select `cliente`.`tipoDocumento` AS `tipoDocumento`,`cliente`.`idcliente` AS `idcliente`,`cliente`.`nombre` AS `nombre`,`cliente`.`telefono` AS `telefono`,`cliente`.`correo` AS `correo`,`sexo`.`nombre` AS `sexo`,`cliente`.`fecha_nacimiento` AS `fecha_nacimiento`,`cliente`.`direccion` AS `direccion` from (`cliente` join `sexo` on((`sexo`.`idsexo` = `cliente`.`sexo2`))) where (`cliente`.`condicion` = '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_detalle_factura`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_detalle_factura`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_detalle_factura` AS select `detalle_factura_compra`.`id_detalle_factura_compra` AS `id_detalle_factura_compra`,`detalle_factura_compra`.`id_fact_compra` AS `id_fact_compra`,`detalle_factura_compra`.`id_producto` AS `id_producto`,`detalle_factura_compra`.`cantidad_comprado` AS `cantidad_comprado`,`detalle_factura_compra`.`precio_unitario_compra` AS `precio_unitario_compra`,`detalle_factura_compra`.`precio_total_compra` AS `precio_total_compra` from `detalle_factura_compra` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_factura`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_factura`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_factura` AS select `factura`.`idfactura` AS `idfactura`,`factura`.`idcliente` AS `idcliente`,`factura`.`idusuario` AS `idusuario`,`factura`.`tipo_pago` AS `tipo_pago`,`factura`.`NÂ°_comprobante` AS `NÂ°_comprobante`,`factura`.`total_pagar` AS `total_pagar`,`factura`.`fecha` AS `fecha` from `factura` where (`factura`.`condicion` = '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_factura_compra`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_factura_compra`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_factura_compra` AS select `factura_compra`.`idfactura_compra` AS `idfactura_compra`,`factura_compra`.`id_provedor` AS `id_provedor`,`factura_compra`.`id_usuario` AS `id_usuario`,`factura_compra`.`NÂ°_comprobante` AS `NÂ°_comprobante`,`factura_compra`.`tipo_pago` AS `tipo_pago`,`factura_compra`.`descuento` AS `descuento`,`factura_compra`.`total_compra` AS `total_compra`,`factura_compra`.`fecha_compra` AS `fecha_compra` from `factura_compra` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_producto`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_producto`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_producto` AS select `producto`.`idproducto` AS `idproducto`,`producto`.`nombre` AS `nombre`,`producto`.`descripcion` AS `descripcion`,`producto`.`cantidad` AS `cantidad`,`producto`.`imagen` AS `imagen`,`producto`.`precio` AS `precio`,`producto`.`condicion` AS `condicion`,`producto`.`ruta` AS `ruta` from `producto` where (`producto`.`condicion` = '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_provedor`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_provedor`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_provedor` AS select `provedor`.`idprovedor` AS `idprovedor`,`provedor`.`nit` AS `tipo_nit`,`provedor`.`nombre` AS `nombre`,`provedor`.`tipoPersona` AS `tipoPersona`,`provedor`.`telefono` AS `telefono`,`provedor`.`correo` AS `correo`,`sexo`.`nombre` AS `sexo`,`provedor`.`fecha_nacimiento` AS `fecha`,`provedor`.`direccion` AS `direccion` from (`provedor` join `sexo` on((`provedor`.`sexo1` = `sexo`.`idsexo`))) where (`provedor`.`condicion` = '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_sexo`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_sexo`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_sexo` AS select `sexo`.`idsexo` AS `idsexo`,`sexo`.`nombre` AS `nombre` from `sexo` where (0 <> '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `mostrar_usuario`
--

/*!50001 DROP VIEW IF EXISTS `mostrar_usuario`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `mostrar_usuario` AS select `usuario`.`idusuario` AS `idusuario`,`usuario`.`tipoDocumento` AS `tipoDocumento`,`usuario`.`nombre` AS `nombre`,`cargo`.`nombre` AS `cargo`,`usuario`.`telefono` AS `telefono`,`usuario`.`correo` AS `correo`,`sexo`.`nombre` AS `sexo`,`usuario`.`direccion` AS `direccion`,`usuario`.`fecha_nacimiento` AS `fecha_nacimiento` from ((`usuario` join `cargo` on((`cargo`.`idcargo` = `usuario`.`cargo`))) join `sexo` on((`sexo`.`idsexo` = `usuario`.`sexo`))) where (`usuario`.`condicion` = '1') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-12  2:54:40
