/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : bj_gb_aic

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2020-03-15 14:53:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for c_tenant
-- ----------------------------
DROP TABLE IF EXISTS `c_tenant`;
CREATE TABLE `c_tenant` (
  `id` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of c_tenant
-- ----------------------------
INSERT INTO `c_tenant` VALUES ('01', '张三', '23');
INSERT INTO `c_tenant` VALUES ('02', '李四', '24');
INSERT INTO `c_tenant` VALUES ('03', '王五', '25');
