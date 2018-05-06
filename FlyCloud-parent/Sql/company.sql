# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-06 09:24:23
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "company"
#

DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `companyId` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司编号',
  `companyName` varchar(40) NOT NULL DEFAULT '' COMMENT '公司名称',
  PRIMARY KEY (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='公司表';

#
# Data for table "company"
#

INSERT INTO `company` VALUES (1,'湖南闪电汽车服务有限公司'),(2,'湖南汽车AAA公司'),(3,'湖南汽车BBB公司');
