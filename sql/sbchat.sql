/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : sbchat

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-09-22 22:39:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'shawn', '123', null, '2017-09-22 22:05:15');
INSERT INTO `user` VALUES ('2', 'david', '123', null, '2017-09-22 22:05:22');
INSERT INTO `user` VALUES ('3', 'mary', '123', null, '2017-09-22 22:31:16');

-- ----------------------------
-- Table structure for user_user
-- ----------------------------
DROP TABLE IF EXISTS `user_user`;
CREATE TABLE `user_user` (
  `a_id` bigint(20) NOT NULL,
  `b_id` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_user
-- ----------------------------
INSERT INTO `user_user` VALUES ('1', '2', '2017-09-22 22:05:27');
INSERT INTO `user_user` VALUES ('1', '3', '2017-09-22 22:31:25');
