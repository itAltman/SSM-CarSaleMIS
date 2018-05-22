# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:32:06
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "carseries"
#

DROP TABLE IF EXISTS `carseries`;
CREATE TABLE `carseries` (
  `seriesId` int(11) NOT NULL AUTO_INCREMENT COMMENT '车系编号',
  `brandId` int(11) NOT NULL COMMENT '品牌编号',
  `seriesName` varchar(32) NOT NULL COMMENT '车系名称',
  PRIMARY KEY (`seriesId`),
  KEY `FK_brandId` (`brandId`),
  CONSTRAINT `FK_brandId` FOREIGN KEY (`brandId`) REFERENCES `carbrand` (`brandId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='汽车车系表';

#
# Data for table "carseries"
#

INSERT INTO `carseries` VALUES (1,1,'奥迪A4'),(2,1,'奥迪A6'),(3,1,'奥迪A8L'),(4,1,'奥迪Q5'),(7,2,'奔驰C级'),(9,2,'奔驰CLA级'),(10,3,'宝马3系'),(11,3,'宝马5系'),(12,4,'一汽大众'),(13,4,'上汽大众');
