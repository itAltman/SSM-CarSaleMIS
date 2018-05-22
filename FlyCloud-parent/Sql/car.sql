# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:32:38
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "car"
#

DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `carId` int(11) NOT NULL AUTO_INCREMENT COMMENT '汽车编号',
  `seriesId` int(11) NOT NULL COMMENT '车系编号',
  `carName` varchar(32) NOT NULL COMMENT '汽车名称',
  `carPrice` decimal(10,2) DEFAULT NULL COMMENT '汽车价格',
  `carTime` date NOT NULL COMMENT '出厂日期',
  PRIMARY KEY (`carId`),
  KEY `FK_seriesId` (`seriesId`),
  CONSTRAINT `FK_seriesId` FOREIGN KEY (`seriesId`) REFERENCES `carseries` (`seriesId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COMMENT='汽车表';

#
# Data for table "car"
#

INSERT INTO `car` VALUES (1,1,'2018款 30周年版 40 TFSI 进取版',309800.00,'2018-01-01'),(2,1,'2018款 30周年版 40 TFSI 运动版',369800.00,'2018-01-01'),(4,2,'2018款 30周年纪念版 TFSI 进取版',406000.00,'2018-01-01'),(5,2,'2018款 30周年纪念版 45 运动版',512800.00,'2018-01-01'),(8,3,'2018款 55 投放精英版',937800.00,'2018-01-01'),(9,3,'2018款 55 尊贵版',999800.00,'2018-01-01'),(10,4,'2013款 40 TFSI Hybrid',608000.00,'2013-11-07'),(11,4,'2013款 45 TFSI quattro 运动版',588000.00,'2013-05-22'),(12,7,'2018款 C 180 旅行轿车',380800.00,'2018-03-01'),(13,7,'2018款 C 200 轿跑车',380800.00,'2018-03-01'),(14,9,'2018款 CLA 260 4MATIC',383800.00,'2018-03-01'),(15,9,'2018款 CLA 180',252800.00,'2018-03-01'),(16,10,'2018款 320i M运动套装',316800.00,'2018-04-05'),(17,10,'2018款 xDrive 25i M运动套装',399800.00,'2018-04-05'),(18,11,'2018款 改款 540Li 行政版',659900.00,'2018-03-07'),(19,11,'2018款 xDrive28i',751900.00,'2018-03-07'),(20,12,'途观',199800.00,'2018-03-01'),(21,12,'POLO',75900.00,'2018-03-01'),(22,12,'朗逸',139900.00,'2018-03-01'),(23,13,'宝来',127800.00,'2018-04-11'),(24,13,'大众CC',252800.00,'2018-04-19');
