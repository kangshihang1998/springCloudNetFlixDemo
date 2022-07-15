/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50611
 Source Host           : localhost:3306
 Source Schema         : sqltest

 Target Server Type    : MySQL
 Target Server Version : 50611
 File Encoding         : 65001

 Date: 15/07/2022 10:53:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `dname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源',
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '康世行部门', 'sqltest');

SET FOREIGN_KEY_CHECKS = 1;
