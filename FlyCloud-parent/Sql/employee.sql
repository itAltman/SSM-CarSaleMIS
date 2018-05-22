# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:31:33
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "employee"
#

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `empId` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `positionId` int(11) NOT NULL COMMENT '职务编号',
  `companyId` int(11) NOT NULL COMMENT '公司编号',
  `empName` varchar(10) NOT NULL COMMENT '员工姓名',
  `empPhone` varchar(11) NOT NULL COMMENT '登录手机',
  `empPassword` varchar(50) NOT NULL COMMENT '登录密码',
  `empSalery` decimal(10,2) DEFAULT NULL COMMENT '员工工资',
  PRIMARY KEY (`empId`),
  KEY `FK_companyId_emp` (`companyId`),
  KEY `FK_positionId` (`positionId`),
  CONSTRAINT `FK_companyId_emp` FOREIGN KEY (`companyId`) REFERENCES `company` (`companyId`),
  CONSTRAINT `FK_positionId` FOREIGN KEY (`positionId`) REFERENCES `position` (`positionId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='员工表';

#
# Data for table "employee"
#

INSERT INTO `employee` VALUES (1,1,1,'万宇','18673615878','123456',10000.00),(2,1,2,'赵一','18673615878','123456',NULL),(3,1,3,'王一','18673615878','123456',NULL),(4,2,1,'万二','18673615789','123456',3000.00),(5,2,2,'赵二','18123456789','123456',NULL),(7,3,1,'万销1','18809572241','123456',4000.00),(8,3,1,'万销2','17682941111','123456',4000.00),(9,1,4,'平安','13077265111','123456',NULL);
