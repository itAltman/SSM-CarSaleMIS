# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:31:43
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='客户表';

#
# Data for table "customer"
#

INSERT INTO `customer` VALUES (1,1,'张三','18612344321','男','1','1996-01-01','2018-05-03 12:36:34'),(2,1,'李四','18609877890','男','1','1996-01-02','2018-05-03 12:43:42'),(3,2,'王五','13511223344','男','1','1997-01-01','2018-05-05 19:30:40'),(4,2,'赵六','13555667788','女','1','1997-01-01','2018-05-05 19:31:16'),(5,1,'七哥','13200775431','女','2','1996-02-22','2018-05-06 16:43:52'),(6,1,'AAA','13309809124','女','2','1980-06-07','2018-05-06 17:27:57'),(7,1,'BBB','18512340991','男','1','1981-08-02','2018-05-06 17:30:18'),(8,1,'CCC','17798204214','女','2','1997-04-22','2018-05-06 19:41:05'),(9,1,'DDD','15192740187','男','1','1986-05-20','2018-05-06 20:17:10'),(10,1,'EEE','18710295231','男','1','1990-03-31','2018-05-06 20:47:48'),(11,1,'FFF','15239401111','女','1','1989-12-04','2018-05-06 20:48:33'),(12,1,'GGG','17529402873','男','1','1984-11-29','2018-05-06 20:49:26'),(13,1,'HHH','15698232342','男','1','1997-01-20','2018-05-06 20:49:55'),(14,1,'大i','16738293331','男','1','1984-01-31','2018-05-06 20:50:53');
