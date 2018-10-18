#3.2.1 接口名称：获取 Banner图
select id,photo,jump_url from banner_show where type=1 limit 3; 

#### 3.2.2 接口名称：获取最新、推荐职位列表(与 “找职业页面” 的最新职位、推荐职位公用一个接口)
select c.company_id,c.company_name,c.company_logo,p.position_id,p.position_name,p.salary from 
company_info c,position_info p where c.company_id=p.company_id order by p.gmt_update desc  limit 20 ;


#### 3.2.3 接口名称：推荐职位、最新职位(待修改，似乎只有城市)

##可执行语句
select c.company_id,c.company_name,c.company_logo,c.city,c.area,p.position_id,p.position_name,p.salary,p.salary, p.education,p.work_experience,p.welfare,p.gmt_update from company_info c,position_info p where c.company_id=p.company_id  and c.company_name like'%西安%' order by p.gmt_update desc

动态SQL
select c.companyId,c.companyName,c.companyLogo,c.city,c.area,p.positionId,p.positionName,p.salary,p.salary,
p.education,p.workExperience,p.welfare,p.gmt_update from company_info c,position_info p 
<where>
 c.companyId=p.companyId  
    <if test="companyName != null and companyName != ''">
      AND  c.companyName like CONCAT('%',#{companyName},'%')
    </if>
   <if test="isRecommend != null and isRecommend != ''">
      AND  c.isRecommend =#{isRecommend}
    </if>
    <if test="positioName != null and positioName != ''">
      AND  p.positioName = #{positioName}
    </if>
     <if test="positioName != null and positioName != ''">\
      AND  c.city = #{city}
    </if>
   <if test="companyIndustry != null and companyIndustry != ''">
      AND  c.companyIndustry = #{companyIndustry}
    </if>
	   <if test="workExperience != null and workExperience != ''">
      AND  p.workExperience = #{workExperience}
    </if>
		   <if test="salary != null and salary != ''">
      AND  p.salary = #{salary}
    </if>
	<if test="releaseTime != null and releaseTime != ''">
      AND  p.releaseTime = #{releaseTime}
    </if>
	<if test="limit != null and limit != ''">
      AND limit = #{limit}
    </if>
  </where>
  order by p.gmt_update desc
  
  
  
  #### 3.2.4 接口名称：推荐公司
  select company_id,company_name,company_logo,city,company_industry,is_approve from company_info where is_approve=1 order by gmt_update desc limit 1;
  select company_id,company_name,company_logo,city,company_industry,is_approve from company_info where is_approve=0 order by gmt_update desc limit 8;
  
  
  
  #### 3.2.5 接口名称：最新发布职位认证公司Banner图
  ##查找出符合条件的4家认证公司
   select c.company_id,c.company_name,c.company_logo,c.city,c.area,c.financing_scale,c.company_industry,c.Is_approve,CONCAT("[",GROUP_CONCAT(p.position_name),"]")  AS recruitingPosition
   from position_info p,company_info c where p.company_id=c.company_id and  p.company_id in (select t.company_id from( select distinct(company_id) from company_info where Is_approve=1 order by gmt_update desc limit 4) as t ) group by p.company_id;
   
   
   #### 3.2.6 接口名称：搜索公司
   可执行语句 
   select c.company_id,c.company_name,c.company_logo,c.city,c.area,c.company_industry,c.financing_scale  from company_info c,position_info p where  c.company_id=p.company_id  and c.company_name like'%西安%' 
   
   动态SQL
      select c.companyId,c.companyName,c.companyLogo,c.city,c.area,c.companyIndustry,c.financingScale  from company_info c,position_info p 
<where>   
c.companyId=p.companyId 
<if test="companyName != null and companyName != ''">   
	 AND  c.companyName like CONCAT('%',#{companyName},'%')
    </if>
    <if test="positioName != null and positioName != ''">
      AND  p.positioName = #{positioName}
    </if>
     <if test="positioName != null and positioName != ''">\
      AND  c.city = #{city}
    </if>
   <if test="companyIndustry != null and companyIndustry != ''">
      AND  c.companyIndustry = #{companyIndustry}
    </if>
	   <if test="workExperience != null and workExperience != ''">
      AND  p.workExperience = #{workExperience}
    </if>
		   <if test="salary != null and salary != ''">
      AND  p.salary = #{salary}
    </if>
	<if test="releaseTime != null and releaseTime != ''">
      AND  p.releaseTime = #{releaseTime}
    </if>
	<if test="limit != null and limit != ''">
      AND limit = #{limit}
    </if>
  </where>
  
  ##返回对应公司正在招聘职位数量
  select count(1) from  position_info where companyId=#{companyId} and isOnline=1;
  
  
      #### 3.2.7 接口名称：公司详情
  select company_id,Is_approve,company_name,company_slogan,company_logo,city,area,company_industry,number_of_companies,
company_tag,company_profile  from company_info where company_id=1

##产品列表
select produce_name,produce_slogan,produce_logo,product_introduction from company_produce where company_id=1


#### 3.2.8 接口名称：公司在招职位

##查询对应id公司的详细信息
select companyId,isApprove,companyName,companySlogan,companyLogo,city,area,companyIndustry,numberOfCompanies,
companyTag,companyProfile  from company_info where companyId=#{companyId};

##公司在招职位
select p.position_id,p.position_name,p.position_type,c.city,p.work_experience,p.education,p.salary,p.gmt_update from position_info p,company_info c where  p.company_id= 2 and p.is_online=1;

select p.positionId,p.positionName,p.positionType,c.city,p.workExperience,p.education,p.salary,p.gmtUpdate from position_info p,company_info c where p.companyId=#{companyId} and p.isOnline=1;
  
  
  #### 3.2.9 接口名称：搜索职位
  
  select c.companyId,c.companyName,c.companySlogan,c.companyLogo,c.city,c.area,c.companyIndustry,c.companyTag,p.positionId,p.position,p.education,p.workExperience,
  p.salary,p.gmtUpdate from company_info c,position_info p 
  <where>   
<if test="positioName!= null and positioName != ''">   
	 AND  p.positioName like CONCAT('%',#{positioName},'%')
    </if>
    <if test="positionType != null and positionType != ''">
      AND  p.positionType = #{positionType}
    </if>
    <if test="city != null and city != ''">
      AND  c.city = #{city}
    </if>
   <if test="companyIndustry != null and companyIndustry != ''">
      AND  c.companyIndustry = #{companyIndustry}
    </if>
	   <if test="area != null and area != ''">
      AND  c.area = #{area}
    </if>
	<if test="workExperience != null and workExperience != ''">
      AND  p.workExperience = #{workExperience}
    </if>
	<if test="releaseTime != null and releaseTime != ''">
      AND  p.releaseTime = #{releaseTime}
    </if>
	<if test="salary != null and salary != ''">
      AND  p.salary = #{salary}
    </if>
  </where>
  
#### 3.2.10 接口名称：职位介绍

  select  c.company_id,c.company_name,c.company_slogan,c.company_logo,c.city,c.area,c.company_industry,c.company_tag,p.position_id,p.position_name,p.education,p.work_experience,
  p.salary,p.welfare,c.number_of_companies,p.gmt_update,p.skills,p.post_duties from company_info c,position_info p  where p.company_id=c.company_id ; 

  
#### 3.2.11 接口名称：成功案例

select count(1) from company_info where isApprove=1 
if (count(1)>8){
select companyId,companyName,companySlogan from company_info where isApprove=1  limit 8;
}else{
select companyId,companyName,companySlogan from company_info where isApprove=1 ;
select companyId,companyName,companySlogan from company_info where isApprove=0  limit (8-count(1)) order by gmtUpdate;
}



### 显示最新后台推荐4个职位
select c.company_id,c.company_logo,c.company_name,p.position_id,p.position_name,p.salary from company_info c,position_info p where is_approve=1 order by p.gmt_update limit 4;
     