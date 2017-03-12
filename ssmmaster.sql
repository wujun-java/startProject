/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : ssmmaster

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2017-03-01 23:11:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) DEFAULT NULL,
  `dnumber` varchar(255) DEFAULT NULL,
  `parentid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '部门1', '1000', '4');
INSERT INTO `department` VALUES ('2', '部门2', '10002', '1');
INSERT INTO `department` VALUES ('3', '部门3', '10003', '1');
INSERT INTO `department` VALUES ('4', '部门4', '1005', null);

-- ----------------------------
-- Table structure for `loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `loginlog`;
CREATE TABLE `loginlog` (
  `logid` bigint(20) NOT NULL AUTO_INCREMENT,
  `logintime` datetime DEFAULT NULL COMMENT '登录时间',
  `detail` varchar(255) DEFAULT NULL COMMENT '详情',
  `loginman` varchar(255) DEFAULT NULL COMMENT '登录人',
  `loginmianid` bigint(20) DEFAULT NULL COMMENT '登录人id',
  PRIMARY KEY (`logid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loginlog
-- ----------------------------
INSERT INTO `loginlog` VALUES ('4', '2017-02-18 00:08:15', '用户登陆了系统', '12', null);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `dept_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '吴均', '1234567', '1');
INSERT INTO `user` VALUES ('2', 'wujun', 'admin', '2');
INSERT INTO `user` VALUES ('3', 'wujun1', 'pass', '1');
INSERT INTO `user` VALUES ('4', 'wujun1', 'pass', '1');
INSERT INTO `user` VALUES ('5', 'wujun1', 'pass', '1');
INSERT INTO `user` VALUES ('6', 'wujun1', 'pass', '1');
INSERT INTO `user` VALUES ('7', 'wujun1', 'pass', '2');
INSERT INTO `user` VALUES ('8', 'wujun1', 'pass', '1');
INSERT INTO `user` VALUES ('9', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('10', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('11', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('12', 'wujun1', 'pass', '2');
INSERT INTO `user` VALUES ('13', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('14', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('15', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('16', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('17', 'wujun2', 'pass2', '2');
INSERT INTO `user` VALUES ('18', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('19', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('20', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('21', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('22', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('23', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('24', 'wujun112', 'pass2', '2123456');
INSERT INTO `user` VALUES ('25', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('26', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('27', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('28', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('29', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('30', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('31', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('32', 'wujun112', 'pass111', '2123456');
INSERT INTO `user` VALUES ('33', 'wujun111', 'wujun111', '2123456');
INSERT INTO `user` VALUES ('34', 'wujun1111', 'wujun111', '2123456');
INSERT INTO `user` VALUES ('35', 'wujun1111', 'wujun1111', '2123456');
INSERT INTO `user` VALUES ('36', 'wujun11112', 'wujun11112', '2123456');
INSERT INTO `user` VALUES ('37', 'wujun11112', 'wujun11112', '2123456');
INSERT INTO `user` VALUES ('38', 'wujun11112', 'wujun111122', '2123456');
INSERT INTO `user` VALUES ('39', 'wujun33', 'wujun33', '2123456');
INSERT INTO `user` VALUES ('40', 'wujun33', 'wujun33', '2123456');
INSERT INTO `user` VALUES ('41', 'wujun33', 'wujun33', '2123456');
INSERT INTO `user` VALUES ('42', 'wujun33', 'wujun33', '2123456');
INSERT INTO `user` VALUES ('45', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('46', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('47', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('48', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('49', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('50', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('51', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('52', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('53', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('54', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('55', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('56', 'wujun2', 'pass2', '2123456');
INSERT INTO `user` VALUES ('57', 'wujun1', 'pass', '22');
INSERT INTO `user` VALUES ('58', 'wujun2', 'pass2', '2123456');

-- ----------------------------
-- Procedure structure for `call2result`
-- ----------------------------
DROP PROCEDURE IF EXISTS `call2result`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `call2result`(IN  `username` VARCHAR(64),IN`password` VARCHAR(64)
,IN `dept_id` int(11),OUT `errorcode` int(11))
BEGIN
 DECLARE t_error INTEGER DEFAULT 0;  
 START TRANSACTION; -- 开始事务
	INSERT INTO `user` (username,password,dept_id) VALUES(username,password,dept_id);
		SELECT COUNT(id)FROM user into errorcode;
 if errorcode>=10 THEN
		ROLLBACK;
	else
		COMMIT;
	end if;

END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `call2resultmap`
-- ----------------------------
DROP PROCEDURE IF EXISTS `call2resultmap`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `call2resultmap`(IN `user_id` BIGINT)
BEGIN
	SELECT * FROM user WHERE `user`.id>user_id;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `insertcall1`
-- ----------------------------
DROP PROCEDURE IF EXISTS `insertcall1`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertcall1`(IN  `username` VARCHAR(64),IN `password` VARCHAR(64),IN `dept_id` int(11))
BEGIN

	INSERT INTO `user` (username,password,dept_id) VALUES(username,password,dept_id);
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `loginlogT`
-- ----------------------------
DROP PROCEDURE IF EXISTS `loginlogT`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `loginlogT`(IN usernameText VARCHAR(60),IN passwordText VARCHAR(60),OUT `flagNum` INT(11))
BEGIN
	declare numflag INTEGER DEFAULT 0; 
	SELECT COUNT(*) FROM `user` WHERE username=usernameText AND password=passwordText INTO numflag;
	INSERT INTO loginlog   (logintime,detail,loginman) VALUE(NOW(),'用户登陆了系统',12);
	IF numflag>0 THEN
			SET flagNum=1;
	ELSE
		SET flagNum=0;
	END IF;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `Proc`
-- ----------------------------
DROP PROCEDURE IF EXISTS `Proc`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Proc`()
BEGIN
SELECT    COUNT(*)   FROM `user`;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `proc1`
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc1`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc1`()
BEGIN
DECLARE i INT;
DECLARE j INT;	
SELECT * from `user`;
SET i = i+5;
SET j =j+5;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for `proc1_copy`
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc1_copy`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc1_copy`()
BEGIN
DECLARE i INT;
DECLARE j INT;	
SELECT * from `user`;
SET i = i+5;
SET j =j+5;
END
;;
DELIMITER ;
