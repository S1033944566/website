

SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `easyuser`;
CREATE TABLE `easyuser` (
  `id` int(24) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `state` tinyint(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


INSERT INTO `easyuser` VALUES ('1', 'admin', '123456', '123@qq.com', '超级管理员', '1');


