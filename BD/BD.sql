CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.26, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.26-0ubuntu0.21.04.3

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
-- Table structure for table `partida`
--

DROP TABLE IF EXISTS `partida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partida` (
  `idpartida` int NOT NULL AUTO_INCREMENT,
  `nombreJugador` char(30) NOT NULL,
  `acumulado` int NOT NULL,
  `rondaAlcanzada` int NOT NULL,
  PRIMARY KEY (`idpartida`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partida`
--

LOCK TABLES `partida` WRITE;
/*!40000 ALTER TABLE `partida` DISABLE KEYS */;
INSERT INTO `partida` VALUES (19,'prueba24',0,4),(20,'prueba20',0,1),(21,'prueba21',0,0),(22,'prueba22',0,0),(23,'prueba23',400,5),(24,'prueba24',0,4),(26,'prueba26',400,5),(27,'prueba25',400,5),(28,'prueba26',400,5),(29,'prueba27',120,3),(30,'prueba29',30,1),(31,'prueba30',200,4),(32,'prueba31',200,4),(33,'Prueba32',0,0),(34,'Prueba33',70,2),(35,'Prueba34',30,1),(37,'LMDEM',0,0);
/*!40000 ALTER TABLE `partida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pregunta` (
  `idpregunta` int NOT NULL AUTO_INCREMENT,
  `preguntaText` text NOT NULL,
  `categoria` int NOT NULL,
  `opcion1` text NOT NULL,
  `opcion2` text NOT NULL,
  `opcion3` text NOT NULL,
  `opcion4` text NOT NULL,
  `respuesta` int NOT NULL,
  PRIMARY KEY (`idpregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` VALUES (1,'??Cu??l es la flor nacional de Jap??n?',1,'Flor de banb??','Flor de Casta??o','Flor de Cerezo','Flor de nogal',3),(2,'??Cu??ntas franjas tiene la bandera de Estados Unidos?',1,'13','12','11','14',1),(3,'??Cu??l es el animal nacional de Australia?',1,'Wombat','Canguro','Koala','Dragon de komodo',2),(4,'??Cu??l es la capital de Canad???',1,'Seattle','Toronto','Vancouver','Ottawa',4),(5,'??Cu??l es el r??o m??s largo del mundo?',1,'Amazonas','Nilo','Ganges','Sena',2),(6,'Cu??l de los siguientes imperios no ten??a un idioma',2,'Romanos','Egipcios','Azteca','Inca',4),(7,'??Cu??ntas zonas horarias tiene en Rusia?',2,'8','12','10','11',4),(8,'??Qu?? pa??s tiene la mayor cantidad de islas en el mundo?',2,'Suecia','Islandia','Bolivia','Nueva Zelanda',1),(9,'??Cu??l es el idioma que tiene m??s palabras?',2,'Mandarin','Espa??ol','Ingl??s','Aleman',3),(10,'??Cu??ndo se inaugur?? el metro de Londres?',2,'1863','1872','1916','1924',1),(11,'??De qu?? ciudad son originarios los Beatles?',3,'Manchester','Liverpool','Londres','Worcerter',2),(12,'??Cu??ntas teclas tiene un piano?',3,'76','92','88','80',3),(13,'En qu?? a??o se fund?? Netflix',3,'1995','2001','2003','1997',4),(14,'??Cu??l fue el primer largometraje de Pixar?',3,'toy Story','Buscando a Nemo','Los increibles','Up',1),(15,'??Cu??l fue la primer pel??cula de Disney?',3,'La bella y la bestia','Blanca Nieves','La sirenita','Pinocho',2),(16,'System.out.println(\"Hola Mundo\")',4,'C','Python','Java','php',3),(17,'Quien cre?? el lenguaje Python',4,'Microsoft','Guido Van Halen','Bill Gates','Guido Van Rossum',4),(18,'x = {   \"brand\": \"Ford\",   \"model\": \"Mustang\",   \"year\": 1964 }',4,'x es un Diccionario','x es un Set','x es una Cadena','x es una Libreria',1),(19,'Es un lenguaje de etiquetas',4,'php','HTML','SQL','JavaScript',2),(20,'SELECT * FROM tabla1',4,'Borra elementos de tabla 1','Edita los elementos de tabla1','Muestra todos los elementos de tabla1','Muestra elementos especiales de tabla1',3),(21,'??En qu?? a??o fue asesinado John F. Kennedy?',5,'1962','1964','1960','1963',4),(22,'??C??mo muri?? Louis XVI de Francia?',5,'Decapitado','Sifilis','Gripe espa??ola','Envenenado',1),(23,'??En qu?? a??o se disolvi?? la Uni??n Sovi??tica?',5,'1984','1991','1996','1989',2),(24,'??De qu?? a??o es la Constituci??n Espa??ola?',5,'1979','1977','1978','1976',3),(25,'??en que a??o aluniz?? el Apolo 11?',5,'1971','1968','No aluniz??','1969',4),(26,'??Cual NO es un color de los anillos olimpicos?',1,'Morado','Verde','Amarillo','Negro',1);
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-26 11:10:37
