/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : mytable

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2019-09-21 19:06:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `poeject_role_menu_info`
-- ----------------------------
DROP TABLE IF EXISTS `poeject_role_menu_info`;
CREATE TABLE `poeject_role_menu_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(11) DEFAULT NULL COMMENT '角色id',
  `menu_id` bigint(11) DEFAULT NULL COMMENT '菜单id',
  `authority_type` int(11) DEFAULT NULL COMMENT '权限类型 1菜单权限 2 页面按钮权限',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updete_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `s_flag` int(11) DEFAULT NULL COMMENT '可用标志',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of poeject_role_menu_info
-- ----------------------------

-- ----------------------------
-- Table structure for `porject_menu_info`
-- ----------------------------
DROP TABLE IF EXISTS `porject_menu_info`;
CREATE TABLE `porject_menu_info` (
  `menu_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `menu_name` varchar(40) DEFAULT NULL COMMENT '菜单名字',
  `menu_url` varchar(40) DEFAULT NULL COMMENT '菜单地址',
  `parent_menu` int(11) DEFAULT NULL COMMENT '菜单层级',
  `menu_sort` int(11) DEFAULT NULL COMMENT '菜单顺序',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updete_tme` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `s_flag` int(11) DEFAULT '1' COMMENT '可用标志 0 不可 1 可用',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of porject_menu_info
-- ----------------------------

-- ----------------------------
-- Table structure for `porject_role_info`
-- ----------------------------
DROP TABLE IF EXISTS `porject_role_info`;
CREATE TABLE `porject_role_info` (
  `role_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(40) DEFAULT NULL COMMENT '角色名称',
  `role_sort` int(11) DEFAULT NULL COMMENT '排序',
  `parent_role` int(11) DEFAULT NULL COMMENT '角色层级',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updete_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `s_flag` int(11) DEFAULT '1' COMMENT '是否可用 0 可用 1 不可用',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of porject_role_info
-- ----------------------------

-- ----------------------------
-- Table structure for `porject_user_login_info`
-- ----------------------------
DROP TABLE IF EXISTS `porject_user_login_info`;
CREATE TABLE `porject_user_login_info` (
  `user_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_login_name` varchar(40) DEFAULT NULL COMMENT '登录名',
  `user_login_password` varchar(40) DEFAULT NULL COMMENT '用户登录密码',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updete_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `s_flag` int(11) DEFAULT '1' COMMENT '鍙敤鏍囧織 0 涓嶅彲鐢?1 鍙敤',
  `ipadress` varchar(11) DEFAULT NULL COMMENT '登录ip地址',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of porject_user_login_info
-- ----------------------------

-- ----------------------------
-- Table structure for `porject_user_role_info`
-- ----------------------------
DROP TABLE IF EXISTS `porject_user_role_info`;
CREATE TABLE `porject_user_role_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) DEFAULT NULL COMMENT '用户id',
  `role_id` bigint(11) DEFAULT NULL COMMENT '角色ID',
  `add_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `updete_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `s_flag` int(4) DEFAULT '1' COMMENT '可用标志 0 不可 1 可',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of porject_user_role_info
-- ----------------------------

-- ----------------------------
-- Table structure for `project_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `project_user_info`;
CREATE TABLE `project_user_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL COMMENT '鐢ㄦ埛id',
  `user_name` varchar(11) DEFAULT NULL COMMENT '姓名',
  `sex` int(2) DEFAULT NULL COMMENT '性别 1 男 2 女',
  `adress` varchar(40) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project_user_info
-- ----------------------------
