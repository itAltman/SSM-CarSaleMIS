# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:32:14
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "carorder"
#

DROP TABLE IF EXISTS `carorder`;
CREATE TABLE `carorder` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `carId` int(11) DEFAULT NULL COMMENT '汽车编号',
  `companyId` int(11) DEFAULT NULL COMMENT '公司编号',
  `orderNum` int(11) DEFAULT NULL COMMENT '车辆数量',
  `orderType` varchar(1) DEFAULT NULL COMMENT '订单状态（1：未审核、2：已审核）',
  `orderTotalPrice` decimal(10,2) DEFAULT NULL COMMENT '订单总价',
  PRIMARY KEY (`orderId`),
  KEY `FK_carId_order` (`carId`),
  KEY `FK_companyId_order` (`companyId`),
  CONSTRAINT `FK_carId_order` FOREIGN KEY (`carId`) REFERENCES `car` (`carId`),
  CONSTRAINT `FK_companyId_order` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='订单表';

#
# Data for table "carorder"
#

INSERT INTO `carorder` VALUES (2,12,1,1,'2',380800.00),(3,19,1,1,'2',751900.00),(4,21,1,3,'2',227700.00);
