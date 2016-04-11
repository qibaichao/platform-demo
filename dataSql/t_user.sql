
-- ----------------------------
-- Table structure for `t_user_test`
-- ----------------------------
DROP TABLE IF EXISTS t_user_test;

CREATE TABLE t_user_test (
  user_id NUMBER(11) NOT NULL  primary key,
  user_name varchar(255) NOT NULL,
  email varchar(255) DEFAULT NULL,
  phone varchar(16) DEFAULT NULL,
  address varchar(255) DEFAULT NULL,
  age NUMBER(3) DEFAULT NULL
) 

-- ----------------------------
-- Records of t_user_test
-- ----------------------------
INSERT INTO t_user_test VALUES ('1', 'cxq', '461393548@qq.com', '18910801303', '北京市昌平区天通苑', '27');
INSERT INTO t_user_test VALUES ('2', 'asdfasdf', 'asdfasdf', '1212312', '123123', '12');
INSERT INTO t_user_test VALUES ('3', 'hahh', 'asdfasdf', '1212312', '123123', '12');
INSERT INTO t_user_test VALUES ('4', 'qibasdfasd', 'sdfasd', '11899000222', '12131sfasdfasd', '12');
INSERT INTO t_user_test VALUES ('5', 'cxcasdf', 'sadfas', '2323423423', 'asefasdfasdf', '23');
INSERT INTO t_user_test VALUES ('6', 'cxasdfasdf', 'asdfas', '232343', '34534534', '12');


