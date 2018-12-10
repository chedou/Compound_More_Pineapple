
create database more_pineapple default character set utf8;
use  more_pineapple_purview_uaa;
create table user(
 id bigint auto_increment primary key NOT NULL COMMENT '用户ID',
 name varchar(50) NOT NULL COMMENT '登录名',
 password varchar(100)  COMMENT '登录密码',
 salt varchar(100) NOT NULL COMMENT '盐值',
 phone_num varchar(200)  COMMENT '手机号',
 head_image varchar(200)   COMMENT '头像',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='后台用户信息表';

use  more_pineapple_purview_uaa;
create table user_role(
 id int auto_increment primary key NOT NULL COMMENT 'id：与 User 表中的id 对应',
 user_id bigint NOT NULL COMMENT '用户id',
 role_id bigint NOT NULL COMMENT '角色id',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户角色表';

use  more_pineapple_purview_uaa;
create table role(
 id int auto_increment primary key NOT NULL COMMENT '角色id',
 role_name varchar(200) NOT NULL COMMENT '角色名称',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='角色表';

use  more_pineapple_purview_uaa;
create table role_permission(
 id int auto_increment primary key NOT NULL COMMENT 'id',
 role_id int NOT NULL COMMENT '角色ID：与 role 表中的 id 对应',
 node_id int NOT NULL COMMENT '权限id：与 permission 表中的 id 对应',
 status varchar(200) NOT NULL COMMENT '描述',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='角色权限关联表';

use  more_pineapple_purview_uaa;
create table permission(
 id int auto_increment primary key NOT NULL COMMENT 'id',
 permission_name varchar(100) NOT NULL COMMENT '权限名',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='权限表';

use  more_pineapple_purview_uaa;
create table module_table(
 id int auto_increment primary key NOT NULL COMMENT 'id',
 name varchar(100) NOT NULL COMMENT '模块名',
 menuld varchar(100) NOT NULL COMMENT '模块ID',
 url varchar(200) NOT NULL COMMENT 'URL地址',
 parent_module_ID int NOT NULL COMMENT '父模块ID',
 module_category varchar(100) NOT NULL COMMENT '模块类别',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='模块管理表';