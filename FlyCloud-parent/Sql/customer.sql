# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-06 09:24:12
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "customer"
#

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `companyId` int(11) NOT NULL COMMENT '公司编号',
  `customerName` varchar(10) NOT NULL COMMENT '客户姓名',
  `customerPhone` varchar(11) NOT NULL COMMENT '客户电话',
  `customerSex` varchar(2) NOT NULL COMMENT '客户性别',
  `customerType` varchar(1) NOT NULL COMMENT '客户类型（1：个人、2：公司）',
  `customerBirthday` date DEFAULT NULL COMMENT '客户生日',
  `customerCreateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`customerId`),
  KEY `FK_companyId_cus` (`companyId`),
  CONSTRAINT `FK_companyId_cus` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='客户表';

#
# Data for table "customer"
#

INSERT INTO `customer` VALUES (1,1,'张三','18612344321','男','1','1996-01-01','2018-05-03 12:36:34'),(2,1,'李四','18609877890','男','1','1996-01-02','2018-05-03 12:43:42'),(3,2,'王五','13511223344','男','1','1997-01-01','2018-05-05 19:30:40'),(4,2,'赵六','13555667788','女','1','1997-01-01','2018-05-05 19:31:16');
