create database more_pineapple default character set utf8;

use  more_pineapple;
DROP TABLE IF EXISTS `user`;
create table user(
id bigint auto_increment primary key  COMMENT '用户ID',
name varchar(50) not null  COMMENT '登录名',
passwoed varchar(100) not null  COMMENT '登录密码',
salt varchar(100) not null  COMMENT '盐值',
phone_num varchar(200) not null  COMMENT '手机号',
head_image varchar(200) not null  COMMENT '头像',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci  COMMENT='用户表';


use  more_pineapple;
create table company_info(company_id bigint auto_increment primary key not null  COMMENT '公司ID',
company_name varchar(200) not null  COMMENT '公司名称',
company_slogan varchar(300) not null  COMMENT '公司Slogan',
number_of_companies bigint not null  COMMENT '公司人数',
financing_scale int not null  COMMENT '融资规模：见约定',
city varchar(200) not null  COMMENT '城市',
area varchar(200) not null  COMMENT '区县',
company_industry int not null  COMMENT '公司行业:见约定',
company_logo varchar(200) not null  COMMENT '公司logo',
company_profile varchar(1000) not null  COMMENT '公司简介',
company_tag varchar(100) not null  COMMENT '公司标签',
Is_approve int not null  COMMENT '认证状态:0:未认证 1:已认证  ',
Is_frozen int not null  COMMENT '公司冻结状态:0:未冻结 1:已冻结',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公司信息表';


use  more_pineapple;
create table company_produce(
id bigint auto_increment primary key  COMMENT '产品ID',
company_id bigint not null  COMMENT '公司id',
produce_name varchar(100) not null  COMMENT '产品名称',
produce_slogan varchar(100) not null  COMMENT '产品slogan',
produce_logo varchar(100) not null  COMMENT '产品logo',
produce_introduction varchar(100) not null  COMMENT '产品介绍',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公司产品表';

use  more_pineapple;
create table recruiting_company_information(
id bigint auto_increment primary key not null  COMMENT '相关信息id',
company_id bigint not null  COMMENT '公司id',
phone varchar(100) not null  COMMENT '招聘电话',
email varchar(100) not null  COMMENT '招聘邮件',
adress varchar(200) not null  COMMENT '公司详细地址',
map varchar(100) not null  COMMENT '公司地图',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公司招聘信息表';

use  more_pineapple;
create table position_info(
position_id bigint auto_increment primary key not null  COMMENT '职位id',
is_recommend int not null  COMMENT '是否推荐：0:未推荐，1：推荐',
position_name varchar(100) not null  COMMENT '职位',
company_id long not null  COMMENT '公司id',
company_name varchar(100) not null  COMMENT '公司名称',
work_experience int not null  COMMENT '工作经验:见约定',
education int not null  COMMENT '学历：见约定',
salary int not null  COMMENT '薪资:见约定',
position_type int not null  COMMENT '职业类型：见约定',
position_tag varchar(255) not null  COMMENT '职位标签:见约定',
positionlevel varchar(255) not null  COMMENT '职位等级:见约定',
post_duties varchar(500) not null  COMMENT '岗位职责',
skills varchar(500) not null  COMMENT '必备技能',
welfare varchar(200) not null  COMMENT '公司福利',
online_time long not null  COMMENT '上线时间',
is_online int not null  COMMENT '上线状态:见约定',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='职位信息表';

use  more_pineapple;
create table banner_show(id bigint auto_increment primary key not null COMMENT 'banner图id',
type int not null  COMMENT 'banner图类型：见约定',
tiles_name varchar(100) not null  COMMENT '标题名称',
photo varchar(100) not null  COMMENT '图片',
is_online int not null  COMMENT '是否上线：0:未上线1:已上线',
jump_url varchar(100) not null  COMMENT '点击图片跳转链接',
industry_type int not null  COMMENT '见约定',
online_time long not null  COMMENT '上线时间',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Banner图展示表';

use  more_pineapple;
create table user_roler(useruserid int auto_increment primary key  COMMENT 'id',
user_id bigint not null  COMMENT '用户id',
role_id bigint not null  COMMENT '角色id',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户角色表';


use  more_pineapple;
create table role(
id int auto_increment primary key not null  COMMENT '角色id',
role_name varchar(200) not null  COMMENT '角色名称',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use  more_pineapple;
create table role_permission(
id int auto_increment primary key  COMMENT 'id',
role_id int not null  COMMENT '角色ID',
node_id int not null  COMMENT '权限id',
status varchar(200)  COMMENT '描述',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use  more_pineapple;
create table permission(
id int auto_increment primary key  COMMENT 'id',
permission_name varchar(100) not null  COMMENT '权限名',
in_new int not null  COMMENT '新增',
in_edit int not null  COMMENT '编辑',
in_delete int not null  COMMENT '删除',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

use  more_pineapple;
create table module_table(
id int auto_increment primary key  COMMENT 'id',
name varchar(100) not null  COMMENT '模块名',
menuld varchar(100) not null  COMMENT '模块ID',
url varchar(200) not null  COMMENT 'URL地址',
parent_module_ID int not null  COMMENT '父模块ID',
module_category varchar(100) not null  COMMENT '模块类别',
gmt_create bigint not null  COMMENT '注册时间',
gmt_update bigint not null  COMMENT '更新时间',
create_by varchar(100) not null  COMMENT '创建人',
update_by varchar(100) not null  COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;