CREATE SCHEMA `springmvc-electronicemporium` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `user_table` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(11) DEFAULT NULL,
  `address` varchar(255) NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO user_table(name, email,address) VALUES("…œ –", "83","3333");
INSERT INTO user_table(name, email,address) VALUES("∫ÀÃ“", "99","222");
INSERT INTO user_table(name, email,address) VALUES("∫ÀÃ“", "94","222");