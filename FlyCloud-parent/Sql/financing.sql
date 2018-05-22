# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:31:21
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "financing"
#

DROP TABLE IF EXISTS `financing`;
CREATE TABLE `financing` (
  `financingId` int(11) NOT NULL AUTO_INCREMENT COMMENT '财务编号',
  `saleId` int(11) DEFAULT NULL COMMENT '销售编号',
  `repertoryId` int(11) DEFAULT NULL COMMENT '库存编号',
  `companyId` int(11) DEFAULT NULL COMMENT '公司编号',
  `financingMoney` decimal(10,2) DEFAULT NULL COMMENT '涉及金额',
  `financingType` varchar(1) DEFAULT NULL COMMENT '财务状态（1：收入，2：支出）',
  `financingTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '生成时间',
  PRIMARY KEY (`financingId`),
  KEY `FK_companyId_financing` (`companyId`),
  KEY `FK_repertoryId` (`repertoryId`),
  KEY `FK_saleId` (`saleId`),
  CONSTRAINT `FK_companyId_financing` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`),
  CONSTRAINT `FK_repertoryId` FOREIGN KEY (`repertoryId`) REFERENCES `repertory` (`repertoryId`),
  CONSTRAINT `FK_saleId` FOREIGN KEY (`saleId`) REFERENCES `sale` (`saleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='财务表';

#
# Data for table "financing"
#

INSERT INTO `financing` VALUES (2,NULL,NULL,1,380800.00,'2','2018-05-09 00:27:27'),(3,NULL,NULL,1,227700.00,'2','2018-05-09 10:51:14'),(4,NULL,NULL,1,751900.00,'2','2018-05-09 10:51:38');
