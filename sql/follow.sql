DROP TABLE IF EXISTS `follow`;
CREATE TABLE `follow` (
  `Id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) DEFAULT NULL COMMENT '�û�ID',
  `followUid` bigint(20) DEFAULT NULL COMMENT '��עID',
  `forwardNickname` varchar(150) DEFAULT NULL COMMENT '��ע���û���',
  `followFollow` int(11) DEFAULT NULL COMMENT '��ע�߹�ע��',
  `followFans` int(11) DEFAULT NULL COMMENT '��ע�߷�˿��',
  `followWeibo` int(11) DEFAULT NULL COMMENT '��ע��΢����',

  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
