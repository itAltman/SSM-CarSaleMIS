# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-06 09:23:44
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "position"
#

DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `positionId` int(11) NOT NULL AUTO_INCREMENT COMMENT '职务编号',
  `positionName` varchar(20) NOT NULL COMMENT '职务名称（经理、操作员、销售员）',
  `positionLevel` varchar(1) NOT NULL COMMENT '职务等级（1：经理、2：操作员、3：销售员）',
  PRIMARY KEY (`positionId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='职务表';

#
# Data for table "position"
#

INSERT INTO `position` VALUES (1,'经理','1'),(2,'操作员','2'),(3,'销售员','3');
