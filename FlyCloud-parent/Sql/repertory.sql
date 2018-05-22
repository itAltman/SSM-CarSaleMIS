# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:30:44
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "repertory"
#

DROP TABLE IF EXISTS `repertory`;
CREATE TABLE `repertory` (
  `repertoryId` int(11) NOT NULL AUTO_INCREMENT COMMENT '库存编号',
  `carId` int(11) NOT NULL COMMENT '汽车编号',
  `companyId` int(11) NOT NULL COMMENT '公司编号',
  `purchasePrice` decimal(10,2) DEFAULT NULL COMMENT '含税价格',
  `inTime` date NOT NULL COMMENT '入库时间',
  `repertoryNum` int(11) NOT NULL COMMENT '库存数量',
  PRIMARY KEY (`repertoryId`),
  KEY `FK_carId_repertory` (`carId`),
  KEY `FK_companyId_repertory` (`companyId`),
  CONSTRAINT `FK_carId_repertory` FOREIGN KEY (`carId`) REFERENCES `car` (`carId`),
  CONSTRAINT `FK_companyId_repertory` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='库存表';

#
# Data for table "repertory"
#

INSERT INTO `repertory` VALUES (1,20,1,259740.00,'2018-05-05',3),(3,21,1,91080.00,'2018-05-09',3),(4,19,1,902280.00,'2018-05-09',1);
