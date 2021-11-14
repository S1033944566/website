
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `submenu`;
CREATE TABLE `submenu` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `mid` int(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mid` (`mid`),
  CONSTRAINT `submenu_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `mainmenu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8;

INSERT INTO `submenu` VALUES ('101', '用户列表', '/user', '100');
INSERT INTO `submenu` VALUES ('201', '客户信息', '/message', '200');




