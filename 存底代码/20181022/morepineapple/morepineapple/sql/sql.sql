create database more_pineapple default character set utf8;
use  more_pineapple;
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

use  more_pineapple;
create table company_info(
 company_id bigint auto_increment primary key NOT NULL COMMENT '公司ID',
 company_name varchar(200) NOT NULL COMMENT '公司名称',
 company_slogan varchar(300) NOT NULL COMMENT '公司Slogan',
 number_of_companies bigint NOT NULL COMMENT '公司人数',
 financing_scale int NOT NULL COMMENT '融资规模天使轮、A轮、B轮、C轮、D轮及以上、上市、无需融资-------------0、1、2、3、4、5、6',
 city varchar(200) NOT NULL COMMENT '城市',
 area varchar(200) NOT NULL COMMENT '区县',
 company_industry int NOT NULL COMMENT '公司行业移动互联网、电子商务、企业服务、O2O、教育、金融、游戏----------0、1、2、3、4、5、6',
 company_logo varchar(200)  COMMENT '公司logo',
 company_profile varchar(1000) NOT NULL COMMENT '公司简介',
 company_tag varchar(100) NOT NULL COMMENT '公司标签',
 Is_approve int NOT NULL COMMENT '认证状态：0:未认证1:已认证',
 Is_frozen int NOT NULL COMMENT '公司冻结状态：0:未冻结1:已冻结',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公司信息表';

use  more_pineapple;
create table company_produce(
 id bigint auto_increment primary key NOT NULL COMMENT '产品ID',
 company_id bigint NOT NULL COMMENT '公司id：与 company_info 表中的 id 对应',
 produce_name varchar(100) NOT NULL COMMENT '产品名称',
 produce_slogan varchar(100) NOT NULL COMMENT '产品slogan',
 produce_logo varchar(100)  COMMENT '产品logo',
 product_introduction varchar(100) NOT NULL COMMENT '产品介绍',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='公司产品';

use  more_pineapple;
create table recruiting_company_information(
 id bigint auto_increment primary key NOT NULL COMMENT '相关信息id',
 company_id bigint NOT NULL COMMENT '公司id：与 company_info 表中的 id 对应',
 phone varchar(100) NOT NULL COMMENT '招聘电话',
 email varchar(100) NOT NULL COMMENT '招聘邮件',
 adress varchar(200)  COMMENT '公司详细地址',
 map varchar(100)  COMMENT '公司地图',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='招聘公司相关信息表';

use  more_pineapple;
create table position_info(
 position_id bigint auto_increment primary key NOT NULL COMMENT '职位id',
 is_recommend int NOT NULL COMMENT '是否推荐：0:未推荐1:已推荐',
 position_name varchar(100) NOT NULL COMMENT '职位',
 company_id bigint  COMMENT '公司id',
 company_name varchar(100) NOT NULL COMMENT '公司名称',
 work_experience int NOT NULL COMMENT '工作经验:见约定',
 education int NOT NULL COMMENT '学历：高中及以下、大专、本科、硕士、博士---0、1、2、3、4',
 salary int NOT NULL COMMENT '薪资：8K以下、8-15K、16-25K、26k及以上----0、1、2、3',
 position_type int NOT NULL COMMENT '职业类型：产品、UI、QA、Android、IOS、WEB、OP、Java、NLP，DM，DL----0、1、2、3、4、5、6、7、8、9、10',
 position_tag varchar(255) NOT NULL COMMENT '职位标签',
 positionlevel varchar(255) NOT NULL COMMENT '职位等级：助理、初级、中级、高级、总监 ---------0、1、2、3、4',
 post_duties varchar(500) NOT NULL COMMENT '岗位职责',
 skills varchar(500) NOT NULL COMMENT '必备技能',
 welfare varchar(200) NOT NULL COMMENT '公司福利',
 online_time bigint  COMMENT '上线时间：对应新增需求：定时上线',
 is_online int NOT NULL COMMENT '上线状态:下架状态：0 上架状态：1',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='职位信息表';

use  more_pineapple;
create table banner_show(
 id bigint auto_increment primary key NOT NULL COMMENT 'banner图id',
 type int NOT NULL COMMENT 'banner图类型：首页、找职位、找精英 --------- 1、2、3',
 tiles_name varchar(100) NOT NULL COMMENT '标题名称',
 photo varchar(100)  COMMENT '图片',
 is_online int NOT NULL COMMENT '是否上线：0:未上线1:已上线',
 jump_url varchar(100)  COMMENT '点击图片跳转链接',
 industry_type int NOT NULL COMMENT '见约定',
 online_time bigint NOT NULL COMMENT '上线时间',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='banner图展示表';

use  more_pineapple;
create table user_roler(
 id int auto_increment primary key NOT NULL COMMENT 'id：与 User 表中的id 对应',
 user_id bigint NOT NULL COMMENT '用户id',
 role_id bigint NOT NULL COMMENT '角色id',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户角色表';

use  more_pineapple;
create table role(
 id int auto_increment primary key NOT NULL COMMENT '角色id',
 role_name varchar(200) NOT NULL COMMENT '角色名称',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='角色表';

use  more_pineapple;
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

use  more_pineapple;
create table permission(
 id int auto_increment primary key NOT NULL COMMENT 'id',
 permission_name varchar(100) NOT NULL COMMENT '权限名',
 gmt_create bigint NOT NULL COMMENT '注册时间',
 gmt_update bigint NOT NULL COMMENT '更新时间',
 create_by varchar(100) NOT NULL COMMENT '创建人',
 update_by varchar(100) NOT NULL COMMENT '更新人 ')
 ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='权限表';

use  more_pineapple;
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

INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司1 ,  西安诚邦企业管理咨询有限公司1 ,  5000   ,  1  ,  西安市1 ,  怀安区1 ,  0  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  0  ,  0  ,     ,  1.53737E+12    ,  小米1    ,  晓明2    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司2 ,  西安诚邦企业管理咨询有限公司2 ,  5001   ,  2  ,  西安市2 ,  怀安区2 ,  1  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/4.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  1  ,  1  ,     ,  1.53737E+12    ,  小米2    ,  晓明3    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司3 ,  西安诚邦企业管理咨询有限公司3 ,  5002   ,  3  ,  西安市3 ,  怀安区3 ,  2  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/5.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  2  ,  2  ,     ,  1.53737E+12    ,  小米3    ,  晓明4    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司4 ,  西安诚邦企业管理咨询有限公司4 ,  5003   ,  4  ,  西安市4 ,  怀安区4 ,  3  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/6.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  3  ,  3  ,     ,  1.53737E+12    ,  小米4    ,  晓明5    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司5 ,  西安诚邦企业管理咨询有限公司5 ,  5004   ,  5  ,  西安市5 ,  怀安区5 ,  4  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/7.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  4  ,  4  ,     ,  1.53737E+12    ,  小米5    ,  晓明6    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司6 ,  西安诚邦企业管理咨询有限公司6 ,  5005   ,  6  ,  西安市6 ,  怀安区6 ,  5  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/8.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  5  ,  5  ,     ,  1.53737E+12    ,  小米6    ,  晓明7    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司7 ,  西安诚邦企业管理咨询有限公司7 ,  5006   ,  7  ,  西安市7 ,  怀安区7 ,  6  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/9.jpg    ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  6  ,  6  ,     ,  1.53737E+12    ,  小米7    ,  晓明8    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司8 ,  西安诚邦企业管理咨询有限公司8 ,  5007   ,  8  ,  西安市8 ,  怀安区8 ,  7  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/10.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  7  ,  7  ,     ,  1.53737E+12    ,  小米8    ,  晓明9    );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司9 ,  西安诚邦企业管理咨询有限公司9 ,  5008   ,  9  ,  西安市9 ,  怀安区9 ,  8  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/11.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  8  ,  8  ,     ,  1.53737E+12    ,  小米9    ,  晓明10   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司10 ,  西安诚邦企业管理咨询有限公司10 ,  5009   ,  10 ,  西安市10 ,  怀安区10 ,  9  ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/12.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  9  ,  9  ,     ,  1.53737E+12    ,  小米10   ,  晓明11   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司11 ,  西安诚邦企业管理咨询有限公司11 ,  5010   ,  11 ,  西安市11 ,  怀安区11 ,  10 ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/13.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  10 ,  10 ,     ,  1.53737E+12    ,  小米11   ,  晓明12   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司12 ,  西安诚邦企业管理咨询有限公司12 ,  5011   ,  12 ,  西安市12 ,  怀安区12 ,  11 ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/14.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  11 ,  11 ,     ,  1.53737E+12    ,  小米12   ,  晓明13   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司13 ,  西安诚邦企业管理咨询有限公司13 ,  5012   ,  13 ,  西安市13 ,  怀安区13 ,  12 ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/15.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  12 ,  12 ,     ,  1.53737E+12    ,  小米13   ,  晓明14   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司14 ,  西安诚邦企业管理咨询有限公司14 ,  5013   ,  14 ,  西安市14 ,  怀安区14 ,  13 ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/16.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  13 ,  13 ,     ,  1.53737E+12    ,  小米14   ,  晓明15   );
INSERT INTO `more_pineapple`.`company_info` (`company_name`, `company_slogan`, `number_of_companies`, `financing_scale`, `city`, `area`, `company_industry`, `company_logo`, `company_profile`, `company_tag`, `Is_approve`, `Is_frozen`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 西安诚邦企业管理咨询有限公司15 ,  西安诚邦企业管理咨询有限公司15 ,  5014   ,  15 ,  西安市15 ,  怀安区15 ,  14 ,  http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/17.jpg   ,  指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。 ,  五险一金   ,  14 ,  14 ,     ,  1.53737E+12    ,  小米15   ,  晓明16   );


INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师1'  ,  1  ,  '西安诚邦企业管理咨询有限公司'   ,  0  ,  0  ,  0  ,  0  ,  '节日礼金，健康体检，国企背景1'  ,  0  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心1'  ,  '数据js开发，有较强的沟通能力1' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金1'   ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗1' ,  '李辉1'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师2'  ,  2  ,  '西安诚邦企业管理咨询有限公司'   ,  1  ,  1  ,  1  ,  1  ,  '节日礼金，健康体检，国企背景2'  ,  1  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心2'  ,  '数据js开发，有较强的沟通能力2' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金2'   ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗2' ,  '李辉2'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师3'  ,  3  ,  '西安诚邦企业管理咨询有限公司'   ,  2  ,  2  ,  2  ,  2  ,  '节日礼金，健康体检，国企背景3'  ,  2  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心3'  ,  '数据js开发，有较强的沟通能力3' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金3'   ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗3' ,  '李辉3'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师4'  ,  4  ,  '西安诚邦企业管理咨询有限公司'   ,  3  ,  3  ,  3  ,  3  ,  '节日礼金，健康体检，国企背景4'  ,  3  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心4'  ,  '数据js开发，有较强的沟通能力4' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金4'   ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗4' ,  '李辉4'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师5'  ,  5  ,  '西安诚邦企业管理咨询有限公司'   ,  4  ,  4  ,  0  ,  4  ,  '节日礼金，健康体检，国企背景5'  ,  4  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心5'  ,  '数据js开发，有较强的沟通能力5' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金5'   ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗5' ,  '李辉5'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师6'  ,  6  ,  '西安诚邦企业管理咨询有限公司'   ,  0  ,  0  ,  1  ,  5  ,  '节日礼金，健康体检，国企背景6'  ,  0  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心6'  ,  '数据js开发，有较强的沟通能力6' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金6'   ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗6' ,  '李辉6'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师7'  ,  7  ,  '西安诚邦企业管理咨询有限公司'   ,  1  ,  1  ,  2  ,  6  ,  '节日礼金，健康体检，国企背景7'  ,  1  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心7'  ,  '数据js开发，有较强的沟通能力7' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金7'   ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗7' ,  '李辉7'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师8'  ,  8  ,  '西安诚邦企业管理咨询有限公司'   ,  2  ,  2  ,  3  ,  7  ,  '节日礼金，健康体检，国企背景8'  ,  2  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心8'  ,  '数据js开发，有较强的沟通能力8' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金8'   ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗8' ,  '李辉8'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师9'  ,  9  ,  '西安诚邦企业管理咨询有限公司'   ,  3  ,  3  ,  0  ,  8  ,  '节日礼金，健康体检，国企背景9'  ,  3  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心9'  ,  '数据js开发，有较强的沟通能力9' ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金9'   ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗9' ,  '李辉9'  );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师10' ,  10 ,  '西安诚邦企业管理咨询有限公司'   ,  4  ,  4  ,  1  ,  9  ,  '节日礼金，健康体检，国企背景10' ,  4  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心10' ,  '数据js开发，有较强的沟通能力10'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金10'  ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗10'    ,  '李辉10' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师11' ,  11 ,  '西安诚邦企业管理咨询有限公司'   ,  0  ,  0  ,  2  ,  10 ,  '节日礼金，健康体检，国企背景11' ,  0  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心11' ,  '数据js开发，有较强的沟通能力11'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金11'  ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗11'    ,  '李辉11' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师12' ,  12 ,  '西安诚邦企业管理咨询有限公司'   ,  1  ,  1  ,  3  ,  0  ,  '节日礼金，健康体检，国企背景12' ,  1  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心12' ,  '数据js开发，有较强的沟通能力12'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金12'  ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗12'    ,  '李辉12' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师13' ,  13 ,  '西安诚邦企业管理咨询有限公司'   ,  2  ,  2  ,  0  ,  1  ,  '节日礼金，健康体检，国企背景13' ,  2  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心13' ,  '数据js开发，有较强的沟通能力13'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金13'  ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗13'    ,  '李辉13' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师14' ,  14 ,  '西安诚邦企业管理咨询有限公司'   ,  3  ,  3  ,  1  ,  2  ,  '节日礼金，健康体检，国企背景14' ,  3  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心14' ,  '数据js开发，有较强的沟通能力14'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金14'  ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗14'    ,  '李辉14' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师15' ,  15 ,  '西安诚邦企业管理咨询有限公司'   ,  4  ,  4  ,  2  ,  3  ,  '节日礼金，健康体检，国企背景15' ,  4  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心15' ,  '数据js开发，有较强的沟通能力15'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金15'  ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗15'    ,  '李辉15' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师16' ,  16 ,  '西安诚邦企业管理咨询有限公司'   ,  0  ,  0  ,  3  ,  4  ,  '节日礼金，健康体检，国企背景16' ,  0  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心16' ,  '数据js开发，有较强的沟通能力16'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金16'  ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗16'    ,  '李辉16' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 0  ,  'web工程师17' ,  17 ,  '西安诚邦企业管理咨询有限公司'   ,  1  ,  1  ,  0  ,  5  ,  '节日礼金，健康体检，国企背景17' ,  1  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心17' ,  '数据js开发，有较强的沟通能力17'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金17'  ,  1537367472203  ,  0  ,  1537367472203  ,  1537367472203  ,  '王小苗17'    ,  '李辉17' );
INSERT INTO `more_pineapple`.`position_info` (`is_recommend`, `position_name`, `company_id`, `company_name`, `work_experience`, `education`, `salary`, `position_type`, `position_tag`, `positionlevel`, `post_duties`, `skills`, `welfare`, `online_time`, `is_online`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  'web工程师18' ,  18 ,  '西安诚邦企业管理咨询有限公司'   ,  2  ,  2  ,  1  ,  6  ,  '节日礼金，健康体检，国企背景18' ,  2  ,  '能吃苦耐劳，有比较强责任心，为人和善，有较强的上进心18' ,  '数据js开发，有较强的沟通能力18'    ,  '底薪+奖金, 一年6次加薪机会，饭补，提供住宿或者房补，各种聚餐，各种奖金18'  ,  1537367472203  ,  1  ,  1537367472203  ,  1537367472203  ,  '王小苗18'    ,  '李辉18' );


INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  '携程网1' ,  '携程在手，一手游天下1'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg1' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。1'    ,  1537367472203  ,  1537367472203  ,  '刚强1'  ,  '维冈1'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 2  ,  '携程网2' ,  '携程在手，一手游天下2'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg2' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。2'    ,  1537367472203  ,  1537367472203  ,  '刚强2'  ,  '维冈2'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 3  ,  '携程网3' ,  '携程在手，一手游天下3'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg3' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。3'    ,  1537367472203  ,  1537367472203  ,  '刚强3'  ,  '维冈3'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 4  ,  '携程网4' ,  '携程在手，一手游天下4'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg4' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。4'    ,  1537367472203  ,  1537367472203  ,  '刚强4'  ,  '维冈4'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 5  ,  '携程网5' ,  '携程在手，一手游天下5'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg5' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。5'    ,  1537367472203  ,  1537367472203  ,  '刚强5'  ,  '维冈5'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 6  ,  '携程网6' ,  '携程在手，一手游天下6'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg6' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。6'    ,  1537367472203  ,  1537367472203  ,  '刚强6'  ,  '维冈6'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 7  ,  '携程网7' ,  '携程在手，一手游天下7'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg7' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。7'    ,  1537367472203  ,  1537367472203  ,  '刚强7'  ,  '维冈7'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 8  ,  '携程网8' ,  '携程在手，一手游天下8'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg8' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。8'    ,  1537367472203  ,  1537367472203  ,  '刚强8'  ,  '维冈8'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 9  ,  '携程网9' ,  '携程在手，一手游天下9'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg9' ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。9'    ,  1537367472203  ,  1537367472203  ,  '刚强9'  ,  '维冈9'  );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 10 ,  '携程网10'    ,  '携程在手，一手游天下10' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg10'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。10'   ,  1537367472203  ,  1537367472203  ,  '刚强10' ,  '维冈10' );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 11 ,  '携程网11'    ,  '携程在手，一手游天下11' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg11'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。11'   ,  1537367472203  ,  1537367472203  ,  '刚强11' ,  '维冈11' );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 12 ,  '携程网12'    ,  '携程在手，一手游天下12' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg12'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。12'   ,  1537367472203  ,  1537367472203  ,  '刚强12' ,  '维冈12' );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 13 ,  '携程网13'    ,  '携程在手，一手游天下13' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg13'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。13'   ,  1537367472203  ,  1537367472203  ,  '刚强13' ,  '维冈13' );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 14 ,  '携程网14'    ,  '携程在手，一手游天下14' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg14'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。14'   ,  1537367472203  ,  1537367472203  ,  '刚强14' ,  '维冈14' );
INSERT INTO `more_pineapple`.`company_produce` (`company_id`, `produce_name`, `produce_slogan`, `produce_logo`, `product_introduction`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 15 ,  '携程网15'    ,  '携程在手，一手游天下15' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg15'    ,  '携程是个优秀的网站，集成了吃喝玩乐。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。15'   ,  1537367472203  ,  1537367472203  ,  '刚强15' ,  '维冈15' );




INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 1  ,  '  15502296644    '  ,  '103147456@qq.com' ,  '北京市海定市1'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/4.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭1'  ,  '陈康辉1' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 2  ,  '  15502296646    '  ,  '103147457@qq.com' ,  '北京市海定市2'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/5.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭2'  ,  '陈康辉2' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 3  ,  '  15502296646    '  ,  '103147458@qq.com' ,  '北京市海定市3'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/6.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭3'  ,  '陈康辉3' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 4  ,  '  15502296647    '  ,  '103147459@qq.com' ,  '北京市海定市4'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/7.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭4'  ,  '陈康辉4' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 5  ,  '  15502296648    '  ,  '103147460@qq.com' ,  '北京市海定市5'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/8.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭5'  ,  '陈康辉5' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 6  ,  '  15502296649    '  ,  '103147461@qq.com' ,  '北京市海定市6'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/9.jpg'  ,  1537367472203  ,  1537367472203  ,  '唐铭6'  ,  '陈康辉6' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 7  ,  '  15502296650    '  ,  '103147462@qq.com' ,  '北京市海定市7'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/10.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭7'  ,  '陈康辉7' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 8  ,  '  15502296651    '  ,  '103147463@qq.com' ,  '北京市海定市8'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/11.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭8'  ,  '陈康辉8' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 9  ,  '  15502296652    '  ,  '103147464@qq.com' ,  '北京市海定市9'  ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/12.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭9'  ,  '陈康辉9' );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 10 ,  '  15502296653    '  ,  '103147465@qq.com' ,  '北京市海定市10' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/13.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭10' ,  '陈康辉10'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 11 ,  '  15502296654    '  ,  '103147466@qq.com' ,  '北京市海定市11' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/14.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭11' ,  '陈康辉11'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 12 ,  '  15502296655    '  ,  '103147467@qq.com' ,  '北京市海定市12' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/15.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭12' ,  '陈康辉12'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 13 ,  '  15502296656    '  ,  '103147468@qq.com' ,  '北京市海定市13' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/16.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭13' ,  '陈康辉13'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 14 ,  '  15502296657    '  ,  '103147469@qq.com' ,  '北京市海定市14' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/17.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭14' ,  '陈康辉14'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 15 ,  '  15502296658    '  ,  '103147470@qq.com' ,  '北京市海定市15' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/18.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭15' ,  '陈康辉15'    );
INSERT INTO `more_pineapple`.`recruiting_company_information` (`company_id`, `phone`, `email`, `adress`, `map`, `gmt_create`, `gmt_update`, `create_by`, `update_by`) VALUES ( 16 ,  '  15502296659    '  ,  '103147471@qq.com' ,  '北京市海定市16' ,  'http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/19.jpg' ,  1537367472203  ,  1537367472203  ,  '唐铭16' ,  '陈康辉16'    );