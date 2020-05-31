/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : zz

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2020-05-31 22:43:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_resource`;
CREATE TABLE `t_sys_resource` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(50) NOT NULL COMMENT '资源名字',
  `resource_url` varchar(100) NOT NULL COMMENT '资源路径',
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_resource
-- ----------------------------
INSERT INTO `t_sys_resource` VALUES ('1', '文章管理', '/a/b.do', '2020-05-31 22:27:19', '2020-05-31 22:27:21', '0');

-- ----------------------------
-- Table structure for t_sys_resource_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_resource_role`;
CREATE TABLE `t_sys_resource_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `resource_id` int(10) NOT NULL,
  `role_id` int(10) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_resource_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(25) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('1', '系统管理员', '2020-05-31 22:27:55', '2020-05-31 22:27:58', '0');
INSERT INTO `t_sys_role` VALUES ('2', '老板', '2020-05-31 22:30:15', '2020-05-31 22:30:18', '0');

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '记录id',
  `login_account` varchar(25) NOT NULL COMMENT '登录账户',
  `real_name` varchar(25) NOT NULL COMMENT '姓名',
  `login_pwd` varchar(50) NOT NULL COMMENT '登录密码',
  `last_login` datetime NOT NULL COMMENT '最后登录的时间',
  `lock` smallint(1) NOT NULL DEFAULT '1' COMMENT '是否锁定',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', 'lishiliang', '李世梁', '123456', '2020-05-31 22:26:33', '1');

-- ----------------------------
-- Table structure for t_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` int(10) NOT NULL,
  `role_id` int(10) NOT NULL,
  `add_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------
INSERT INTO `t_sys_user_role` VALUES ('1', '1', '1', '2020-05-31 22:29:53', '2020-05-31 22:29:55', '0');
INSERT INTO `t_sys_user_role` VALUES ('2', '1', '2', '2020-05-31 22:30:30', '2020-05-31 22:30:33', '0');
