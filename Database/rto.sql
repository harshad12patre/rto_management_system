-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: rto
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `cityname`
--

DROP TABLE IF EXISTS `cityname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cityname` (
  `statecode` longtext,
  `name` longtext
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cityname`
--

LOCK TABLES `cityname` WRITE;
/*!40000 ALTER TABLE `cityname` DISABLE KEYS */;
INSERT INTO `cityname` VALUES ('01','Mumbai (South) - RTO is located in Tardeo'),('02','Mumbai (West) - RTO is located in Andheri'),('03','Mumbai (East) - RTO is located in Wadala'),('04','Thane'),('05','Kalyan: Kalyan, Dombivli, Ulhasnagar, Ambernath and Badlapur - RTO is located in Kalyan'),('06','Raigad - RTO is located in Pen (does not include Navi Mumbai, Kharghar to Panvel)'),('07','Sindhudurg - RTO is located in Sindhudurg Nagari'),('08','Ratnagiri'),('09','Kolhapur'),('10','Sangli'),('11','Satara'),('12','Pune'),('13','Solapur (city)'),('14','Pimpri-Chinchwad'),('15','Nashik (city)'),('16','Ahmednagar'),('17','Shrirampur, Ahmednagar District'),('18','Dhule'),('19','Jalgaon'),('20','Aurangabad'),('21','Jalna (city)'),('22','Parbhani'),('23','Beed'),('24','Latur'),('25','Osmanabad'),('26','Nanded'),('27','Amravati'),('28','Buldana'),('29','Yavatmal'),('30','Akola'),('31','Nagpur'),('32','Wardha'),('33','Gadchiroli'),('34','Chandrapur'),('35','Gondia'),('36','Bhandara'),('37','Washim'),('38','Hingoli'),('39','Nandurbar'),('40','Nagpur (rural)'),('41','Malegaon, Nashik District'),('42','Baramati, Pune'),('43','Navi Mumbai'),('44','Ambejogai, Beed'),('45','Akluj, Solapur'),('46','Panvel-Khopoli'),('47','Mumbai (North)'),('48','Vasai / Virar / Palghar'),('49','Nagpur (East)'),('50','Karad (Satara Rural)'),('51','Nashik (Rural)');
/*!40000 ALTER TABLE `cityname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `licence`
--

DROP TABLE IF EXISTS `licence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `licence` (
  `licenceno` int NOT NULL DEFAULT '0',
  `name` varchar(50) DEFAULT NULL,
  `fathername` varchar(50) DEFAULT NULL,
  `age` int DEFAULT '0',
  `gender` varchar(50) DEFAULT NULL,
  `bloodgroup` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`licenceno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `licence`
--

LOCK TABLES `licence` WRITE;
/*!40000 ALTER TABLE `licence` DISABLE KEYS */;
INSERT INTO `licence` VALUES (55565,'Vivek Tiwari','Dinesh Tiwari',21,'Male','O-'),(2,'Shruti Kher','Prafulla',19,'Female','O+'),(35,'Shruti Jain','Prafulla',19,'Female','O+'),(5,'Shruti Chaturvedi','P.K.S.Mahapatra',19,'Female','O+'),(44,'Neha Khandelwal','R.K.Khandelwal',20,'Male','B+'),(72301,'Trilok Gupta','Somesh Gupta',22,'Male','B+'),(72302,'Avadhesh Sony','Jagdish Sony',33,'Male','A-'),(72303,'Anjali Pathak','Ravish Pathak',20,'Female','A+'),(72304,'Sunil Purohit','Manoj Purohit',25,'Male','AB+'),(72305,'Rohit Bhansali','B.N.Bhansali',18,'Male','A+'),(1,'Sharad','Prem',20,'Male','O+'),(121212,'Harshad Barapatre','Arun Barapatre',20,'Male','A+'),(123456,'Harshad Barapatre','Arun Barapatre',20,'Male','A+');
/*!40000 ALTER TABLE `licence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registration` (
  `regnno` int NOT NULL DEFAULT '0',
  `engineno` varchar(50) DEFAULT NULL,
  `chasisno` varchar(50) DEFAULT NULL,
  `vehicleno` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fathername` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `make` varchar(50) DEFAULT NULL,
  `mfgby` varchar(50) DEFAULT NULL,
  `mfgyear` int DEFAULT '0',
  PRIMARY KEY (`regnno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES (1,'ruruyr1233245','trtyr132135','MP09LA1904','MP','Sharad Khandelwal','P.K. Khadelwal','40-A,Geeta Appt','Freedom','LML',2003),(72901,'uffxzd67332','gtggj56554','MP09HE1702','MP','Piyush yadav','Santosh yadav','Indore','Apache','TVS',2004),(72902,'dsfgh744','ufbvyjfj46454','MP04MC4534','MP','Yogendra Shukla','Dheeraj Shukla','Bhopal','Scooty','TVS',2004),(49,'uruyru1213','rytrty321321','MP13JE6053','MP','Ram Gopal','Priyank Goyal','40-Geet Nagar','Freedom','LML',2003),(46,'ruruyr1233245','trtyr132135','MP04LE4562','MP','Priya Shrama','Rohit Shrama','15-Saket','Scooty','TVs',2006),(2,'ruruyr1233245','trtyr132135','MP09LL1808','MP','Shruti Mahapatra','P.K.S.Mahapatra','S104/B,Krishna Appt','Scooty','TVs',2006),(12,'12','12','12','12','12','12','12','12','12',12),(121212,'ja12eqk','jk12j3k12','MH15GN2038','Maharashtra','Harshad Barapatre','Arun Barapatre','Upnagar, Nashik','Access 125','Suzuki',2018);
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-12 22:37:09
