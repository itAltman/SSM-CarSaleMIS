# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2018-05-09 13:32:26
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "carbrand"
#

DROP TABLE IF EXISTS `carbrand`;
CREATE TABLE `carbrand` (
  `brandId` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `brandName` varchar(32) NOT NULL COMMENT '品牌名称',
  `brandNum` varchar(2) NOT NULL COMMENT '品牌序号',
  PRIMARY KEY (`brandId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='汽车品牌表';

#
# Data for table "carbrand"
#

INSERT INTO `carbrand` VALUES (1,'奥迪','A'),(2,'奔驰','B'),(3,'宝马','B'),(4,'大众','D');
