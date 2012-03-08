/*
Navicat MySQL Data Transfer

Source Server         : Store
Source Server Version : 50516
Source Host           : localhost:3306
Source Database       : bikestore

Target Server Type    : MYSQL
Target Server Version : 50516
File Encoding         : 65001

Date: 2012-01-31 10:55:28
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `login` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  KEY `role_id_fk` (`role_id`),
  CONSTRAINT `role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '1', 'admin', 'admin');
INSERT INTO `account` VALUES ('2', '2', 'user', 'user');

-- ----------------------------
-- Table structure for `bike`
-- ----------------------------
DROP TABLE IF EXISTS `bike`;
CREATE TABLE `bike` (
  `bike_id` int(11) NOT NULL AUTO_INCREMENT,
  `bike_category_id` int(11) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `description` text,
  `price` decimal(10,2) DEFAULT NULL,
  `discount_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`bike_id`),
  KEY `bike_category_fk` (`bike_category_id`),
  CONSTRAINT `bike_category_fk` FOREIGN KEY (`bike_category_id`) REFERENCES `bike_category` (`bike_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bike
-- ----------------------------
INSERT INTO `bike` VALUES ('1', '1', 'Kellys Mobster', 'Kellys Mobster, lorem ipsut...', '6500.00', null);
INSERT INTO `bike` VALUES ('2', '1', 'Scott Scale', 'Scott Scale, lorem ipsut...', '18900.00', null);
INSERT INTO `bike` VALUES ('3', '1', 'Author Magnum', 'Author Magnum, lorem ipsut...', '17200.00', '15500.00');
INSERT INTO `bike` VALUES ('4', '2', 'Giant Accend', 'Giant Accend, lorem ipsut...', '5000.00', '4600.00');
INSERT INTO `bike` VALUES ('5', '2', 'Merida Freeway', 'Merida Freeway, lorem ipsut...', '2400.00', '2100.00');
INSERT INTO `bike` VALUES ('6', '2', 'Mbike Massive', 'Mbike Massive, lorem ipsut...', '1900.00', null);
INSERT INTO `bike` VALUES ('7', '3', 'Giant Roam XR 1', 'Giant Roam XR 1, lorem ipsut...', '3900.00', null);
INSERT INTO `bike` VALUES ('8', '1', 'mycare', 'thjis good car', '3400.00', '2300.00');
INSERT INTO `bike` VALUES ('9', '3', 'the car', 'this is good car as well', '121.00', '121.00');
INSERT INTO `bike` VALUES ('10', '3', 'the car', 'this is good car as well', '121.00', '121.00');
INSERT INTO `bike` VALUES ('11', '3', 'the car', 'this is good car as well', '121.00', '121.00');

-- ----------------------------
-- Table structure for `bike_category`
-- ----------------------------
DROP TABLE IF EXISTS `bike_category`;
CREATE TABLE `bike_category` (
  `bike_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`bike_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of bike_category
-- ----------------------------
INSERT INTO `bike_category` VALUES ('1', 'Mountain');
INSERT INTO `bike_category` VALUES ('2', 'Trekking');
INSERT INTO `bike_category` VALUES ('3', 'Cross');
INSERT INTO `bike_category` VALUES ('4', 'my favorite');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `role` VALUES ('2', 'ROLE_REGISTERED');
