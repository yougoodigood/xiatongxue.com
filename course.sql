/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : course

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-07-11 17:36:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_author`
-- ----------------------------
DROP TABLE IF EXISTS `t_author`;
CREATE TABLE `t_author` (
  `id` varchar(255) NOT NULL,
  `role_id` char(10) DEFAULT NULL,
  `login_name` varchar(255) DEFAULT NULL,
  `real_name` varchar(255) DEFAULT NULL,
  `id_card` char(10) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `community_age` int(11) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_author
-- ----------------------------

-- ----------------------------
-- Table structure for `t_cg_file`
-- ----------------------------
DROP TABLE IF EXISTS `t_cg_file`;
CREATE TABLE `t_cg_file` (
  `id` varchar(255) NOT NULL,
  `auth_id` varchar(255) DEFAULT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  `file_type` varchar(10) DEFAULT NULL,
  `file_size` int(11) DEFAULT NULL,
  `file_md5` varchar(64) DEFAULT NULL,
  `access_url` varchar(255) DEFAULT NULL,
  `download_times` int(11) DEFAULT NULL,
  `upload_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cg_file
-- ----------------------------

-- ----------------------------
-- Table structure for `t_chapter`
-- ----------------------------
DROP TABLE IF EXISTS `t_chapter`;
CREATE TABLE `t_chapter` (
  `id` varchar(255) NOT NULL,
  `chapter_number` varchar(255) DEFAULT NULL,
  `chapter_name` varchar(255) DEFAULT NULL,
  `importance` int(11) DEFAULT NULL,
  `course_id` varchar(255) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_chapter
-- ----------------------------

-- ----------------------------
-- Table structure for `t_city`
-- ----------------------------
DROP TABLE IF EXISTS `t_city`;
CREATE TABLE `t_city` (
  `id` varchar(255) NOT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_city
-- ----------------------------

-- ----------------------------
-- Table structure for `t_country`
-- ----------------------------
DROP TABLE IF EXISTS `t_country`;
CREATE TABLE `t_country` (
  `id` varchar(255) NOT NULL,
  `country_name` varchar(50) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `cretate_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_country
-- ----------------------------

-- ----------------------------
-- Table structure for `t_course`
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `id` varchar(255) NOT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `course_number` varchar(255) DEFAULT NULL,
  `project_class_id` varchar(255) DEFAULT NULL,
  `chapter_number` int(11) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------

-- ----------------------------
-- Table structure for `t_file`
-- ----------------------------
DROP TABLE IF EXISTS `t_file`;
CREATE TABLE `t_file` (
  `id` varchar(255) NOT NULL,
  `parent_id` varchar(255) DEFAULT NULL,
  `file_number` char(10) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `file_size` int(11) DEFAULT NULL,
  `file_md5` varchar(255) DEFAULT NULL,
  `file_url` varchar(255) DEFAULT NULL,
  `download_times` int(11) DEFAULT NULL,
  `file_suffix` varchar(20) DEFAULT NULL,
  `like_times` int(11) DEFAULT NULL,
  `not_like_times` int(11) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_file
-- ----------------------------

-- ----------------------------
-- Table structure for `t_file_comment`
-- ----------------------------
DROP TABLE IF EXISTS `t_file_comment`;
CREATE TABLE `t_file_comment` (
  `id` varchar(255) NOT NULL,
  `file_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `comments` varchar(500) DEFAULT NULL,
  `like_times` int(11) DEFAULT NULL,
  `not_like_times` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_file_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `t_file_suggestion`
-- ----------------------------
DROP TABLE IF EXISTS `t_file_suggestion`;
CREATE TABLE `t_file_suggestion` (
  `id` varchar(255) NOT NULL,
  `file_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `suggestion` varchar(1024) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_file_suggestion
-- ----------------------------

-- ----------------------------
-- Table structure for `t_permission`
-- ----------------------------
DROP TABLE IF EXISTS `t_permission`;
CREATE TABLE `t_permission` (
  `id` varchar(255) NOT NULL,
  `permission_name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `resource_type` varchar(20) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `system_menu_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_permission
-- ----------------------------
INSERT INTO `t_permission` VALUES ('4028e4f66bd9d536016bd9d647cf0000', '删除权限', '/permission/delete', '0', '1', '2019-07-10 11:03:47', null, '2019-07-10 11:03:47', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9d536016bd9d9edfb0002', '增加权限', '/permission/add', '0', '1', '2019-07-10 11:07:46', null, '2019-07-10 11:07:46', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9d536016bd9da96de0003', '修改权限', '/permission/update', '0', '1', '2019-07-10 11:08:29', null, '2019-07-10 11:08:29', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9dc21ea0000', '查询权限', '/permission/getList', '0', '1', '2019-07-10 11:10:10', null, '2019-07-10 11:10:10', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9dcef070001', '查询权限', '/permission/getById', '0', '1', '2019-07-10 11:11:03', null, '2019-07-10 11:11:03', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e0b5b70002', '查看所有用户', '/user/getList', '0', '1', '2019-07-10 11:15:10', null, '2019-07-10 11:15:10', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e1331e0003', '查看单个用户', '/user/findById', '0', '1', '2019-07-10 11:15:43', null, '2019-07-10 11:15:43', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e18be10004', '删除用户', '/user/delete', '0', '1', '2019-07-10 11:16:05', null, '2019-07-10 11:16:05', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e1f7720005', '更新用户', '/user/update', '0', '1', '2019-07-10 11:16:33', null, '2019-07-10 11:16:33', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e247a10006', '增加用户', '/user/add', '0', '1', '2019-07-10 11:16:53', null, '2019-07-10 11:16:53', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e2bc860007', '用户登录', '/user/login', '0', '1', '2019-07-10 11:17:23', null, '2019-07-10 11:17:23', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e366010008', '去登录', '/user/toLogin', '0', '1', '2019-07-10 11:18:07', null, '2019-07-10 11:18:07', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bd9db5e016bd9e411350009', '获取验证码', '/user/changeVerifiedCode', '0', '1', '2019-07-10 11:18:50', null, '2019-07-10 11:18:50', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bdab7b9016bdabc8b3b0000', '删除文件', '/file/delete', '0', '1', '2019-07-10 15:15:17', null, '2019-07-10 15:15:17', '0', null);
INSERT INTO `t_permission` VALUES ('4028e4f66bde9c47016bde9d12b10000', '测试', '/test', '0', '1', '2019-07-11 09:19:24', null, '2019-07-11 09:19:24', '0', null);

-- ----------------------------
-- Table structure for `t_project_class`
-- ----------------------------
DROP TABLE IF EXISTS `t_project_class`;
CREATE TABLE `t_project_class` (
  `id` varchar(255) NOT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `project_class_no` char(10) DEFAULT NULL,
  `short_comment` varchar(1024) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_project_class
-- ----------------------------

-- ----------------------------
-- Table structure for `t_province`
-- ----------------------------
DROP TABLE IF EXISTS `t_province`;
CREATE TABLE `t_province` (
  `id` varchar(255) NOT NULL,
  `province_name` varchar(255) DEFAULT NULL,
  `country_id` varchar(255) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_province
-- ----------------------------

-- ----------------------------
-- Table structure for `t_realtime_comments`
-- ----------------------------
DROP TABLE IF EXISTS `t_realtime_comments`;
CREATE TABLE `t_realtime_comments` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `video_id` varchar(255) DEFAULT NULL,
  `comment` varchar(1024) DEFAULT NULL,
  `videos_time` int(11) DEFAULT NULL,
  `font_size` int(11) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_realtime_comments
-- ----------------------------

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` varchar(255) NOT NULL,
  `role_name` varchar(50) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('4028e4f66bda1233016bda4211070004', '管理员', null, '2019-07-10 13:01:31', '2019-07-10 13:01:31', null, '0');
INSERT INTO `t_role` VALUES ('4028e4f66bda1233016bda42301d0005', '普通用户', null, '2019-07-10 13:01:39', '2019-07-10 13:01:39', null, '0');
INSERT INTO `t_role` VALUES ('4028e4f66bda1233016bda425c870006', '游客', null, '2019-07-10 13:01:50', '2019-07-10 13:01:50', null, '0');
INSERT INTO `t_role` VALUES ('4028e4f66bdaf44e016bdaf573f80000', '普通管理员', null, '2019-07-10 16:17:27', '2019-07-10 16:17:27', null, '0');

-- ----------------------------
-- Table structure for `t_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` varchar(255) DEFAULT NULL,
  `menu_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `t_school`
-- ----------------------------
DROP TABLE IF EXISTS `t_school`;
CREATE TABLE `t_school` (
  `id` varchar(255) NOT NULL,
  `school_name` varchar(255) DEFAULT NULL,
  `school_number` varchar(255) DEFAULT NULL,
  `student_numbers` int(11) DEFAULT NULL,
  `course_numbers` int(11) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_school
-- ----------------------------

-- ----------------------------
-- Table structure for `t_school_course`
-- ----------------------------
DROP TABLE IF EXISTS `t_school_course`;
CREATE TABLE `t_school_course` (
  `id` varchar(255) NOT NULL,
  `school_id` varchar(255) DEFAULT NULL,
  `course_id` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_school_course
-- ----------------------------

-- ----------------------------
-- Table structure for `t_section`
-- ----------------------------
DROP TABLE IF EXISTS `t_section`;
CREATE TABLE `t_section` (
  `id` varchar(255) NOT NULL,
  `section_number` char(10) DEFAULT NULL,
  `section_name` varchar(255) DEFAULT NULL,
  `chapter` varchar(255) DEFAULT NULL,
  `file_id` varchar(255) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_section
-- ----------------------------

-- ----------------------------
-- Table structure for `t_system_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_system_menu`;
CREATE TABLE `t_system_menu` (
  `id` varchar(255) NOT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `parentide` varchar(255) DEFAULT NULL,
  `navigate_url` varchar(255) DEFAULT NULL,
  `menu_cssid` varchar(255) DEFAULT NULL,
  `order_seq` int(11) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_system_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(255) NOT NULL,
  `user_class_id` varchar(255) DEFAULT NULL,
  `user_group_id` varchar(255) DEFAULT NULL,
  `user_number` int(11) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `login_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `is_phone_checked` tinyint(1) DEFAULT NULL,
  `is_email_checked` tinyint(1) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `country_id` varchar(255) DEFAULT NULL,
  `province_id` varchar(255) DEFAULT NULL,
  `detail_address` varchar(255) DEFAULT NULL,
  `city_id` varchar(255) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `isBan` tinyint(1) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '2019-06-28', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2019-06-28 13:20:58', '1', '2019-06-28 13:21:08', '1', '2019-06-28 13:21:17', '0', '0', null);
INSERT INTO `t_user` VALUES ('4028e4f66bd5f19e016bd5f274680000', null, null, '0', 'admin', 'admin', '21232f297a57a5a743894a0e4a801fc3', '0', '2019-07-09', null, '1326737913@qq.com', '0', '0', '/img/32233.png', null, null, null, null, null, null, '2019-07-09 16:56:04', null, '2019-07-09 16:56:04', null, '0', '15301969209');

-- ----------------------------
-- Table structure for `t_user_class`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_class`;
CREATE TABLE `t_user_class` (
  `id` varchar(255) NOT NULL,
  `class_number` varchar(255) DEFAULT NULL,
  `class_name` varchar(255) DEFAULT NULL,
  `user_amount` int(11) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_class
-- ----------------------------
INSERT INTO `t_user_class` VALUES ('1', 'CN001', '管理员组', '1', '1', '2019-06-28 17:03:45', '0', null, null);

-- ----------------------------
-- Table structure for `t_user_download`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_download`;
CREATE TABLE `t_user_download` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `file_id` varchar(255) DEFAULT NULL,
  `download_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_download
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user_group`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_group`;
CREATE TABLE `t_user_group` (
  `id` varchar(255) NOT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  `group_name` varchar(255) DEFAULT NULL,
  `group_numbers` int(11) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_group
-- ----------------------------
INSERT INTO `t_user_group` VALUES ('1', '1', '管理员', '1', '1', '2019-06-28 15:56:27', null, null, '0');

-- ----------------------------
-- Table structure for `t_user_like_comment`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_like_comment`;
CREATE TABLE `t_user_like_comment` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `comment_id` varchar(255) DEFAULT NULL,
  `is_like` tinyint(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_like_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user_login`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_login`;
CREATE TABLE `t_user_login` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `retry_times` int(11) DEFAULT NULL,
  `login_ip` varchar(50) DEFAULT NULL,
  `login_browser` varchar(255) DEFAULT NULL,
  `login_place` varchar(255) DEFAULT NULL,
  `identify_code` varchar(10) DEFAULT NULL,
  `login_domain` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_login
-- ----------------------------
INSERT INTO `t_user_login` VALUES ('1', '1', '0', '192.168.0.1', 'firefox', 'sh', '453', 'xiatongxue', null, null, null, '0', null);

-- ----------------------------
-- Table structure for `t_user_video_note`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_video_note`;
CREATE TABLE `t_user_video_note` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `video_id` varchar(255) DEFAULT NULL,
  `note_content` varchar(1024) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_video_note
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user_watch_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_watch_record`;
CREATE TABLE `t_user_watch_record` (
  `id` varchar(255) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `video_id` varchar(255) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `end` int(11) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_watch_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_video`
-- ----------------------------
DROP TABLE IF EXISTS `t_video`;
CREATE TABLE `t_video` (
  `id` varchar(255) NOT NULL,
  `video_number` char(10) DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `watch_times` int(11) DEFAULT NULL,
  `online_users` int(11) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_video
-- ----------------------------

-- ----------------------------
-- Table structure for `t_video_segment_info`
-- ----------------------------
DROP TABLE IF EXISTS `t_video_segment_info`;
CREATE TABLE `t_video_segment_info` (
  `id` varchar(255) NOT NULL,
  `video_id` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `end` int(11) DEFAULT NULL,
  `create_id` varchar(255) DEFAULT NULL,
  `delflag` tinyint(1) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_id` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_video_segment_info
-- ----------------------------
