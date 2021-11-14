
SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `mainmenu`;
CREATE TABLE `mainmenu` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;


INSERT INTO `mainmenu` VALUES ('100', '权限管理', '/admin');
INSERT INTO `mainmenu` VALUES ('200', '消息接收', '/message');

