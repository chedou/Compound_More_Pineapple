package com.jnshu.backendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class PositionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Long value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Long value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Long value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Long value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Long value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Long> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Long> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Long value1, Long value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Long value1, Long value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Integer value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Integer value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Integer value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Integer value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Integer> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Integer> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPositionNameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPositionNameEqualTo(String value) {
            addCriterion("position_name =", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThan(String value) {
            addCriterion("position_name >", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThan(String value) {
            addCriterion("position_name <", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameLike(String value) {
            addCriterion("position_name like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotLike(String value) {
            addCriterion("position_name not like", value, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameIn(List<String> values) {
            addCriterion("position_name in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andPositionNameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "positionName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNull() {
            addCriterion("work_experience is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNotNull() {
            addCriterion("work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceEqualTo(Integer value) {
            addCriterion("work_experience =", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotEqualTo(Integer value) {
            addCriterion("work_experience <>", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThan(Integer value) {
            addCriterion("work_experience >", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_experience >=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThan(Integer value) {
            addCriterion("work_experience <", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("work_experience <=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIn(List<Integer> values) {
            addCriterion("work_experience in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotIn(List<Integer> values) {
            addCriterion("work_experience not in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceBetween(Integer value1, Integer value2) {
            addCriterion("work_experience between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("work_experience not between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNull() {
            addCriterion("position_type is null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIsNotNull() {
            addCriterion("position_type is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTypeEqualTo(Integer value) {
            addCriterion("position_type =", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotEqualTo(Integer value) {
            addCriterion("position_type <>", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThan(Integer value) {
            addCriterion("position_type >", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_type >=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThan(Integer value) {
            addCriterion("position_type <", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("position_type <=", value, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeIn(List<Integer> values) {
            addCriterion("position_type in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotIn(List<Integer> values) {
            addCriterion("position_type not in", values, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeBetween(Integer value1, Integer value2) {
            addCriterion("position_type between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("position_type not between", value1, value2, "positionType");
            return (Criteria) this;
        }

        public Criteria andPositionTagIsNull() {
            addCriterion("position_tag is null");
            return (Criteria) this;
        }

        public Criteria andPositionTagIsNotNull() {
            addCriterion("position_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPositionTagEqualTo(String value) {
            addCriterion("position_tag =", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagNotEqualTo(String value) {
            addCriterion("position_tag <>", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagGreaterThan(String value) {
            addCriterion("position_tag >", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagGreaterThanOrEqualTo(String value) {
            addCriterion("position_tag >=", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagLessThan(String value) {
            addCriterion("position_tag <", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagLessThanOrEqualTo(String value) {
            addCriterion("position_tag <=", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagLike(String value) {
            addCriterion("position_tag like", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagNotLike(String value) {
            addCriterion("position_tag not like", value, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagIn(List<String> values) {
            addCriterion("position_tag in", values, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagNotIn(List<String> values) {
            addCriterion("position_tag not in", values, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagBetween(String value1, String value2) {
            addCriterion("position_tag between", value1, value2, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionTagNotBetween(String value1, String value2) {
            addCriterion("position_tag not between", value1, value2, "positionTag");
            return (Criteria) this;
        }

        public Criteria andPositionlevelIsNull() {
            addCriterion("positionlevel is null");
            return (Criteria) this;
        }

        public Criteria andPositionlevelIsNotNull() {
            addCriterion("positionlevel is not null");
            return (Criteria) this;
        }

        public Criteria andPositionlevelEqualTo(String value) {
            addCriterion("positionlevel =", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelNotEqualTo(String value) {
            addCriterion("positionlevel <>", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelGreaterThan(String value) {
            addCriterion("positionlevel >", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelGreaterThanOrEqualTo(String value) {
            addCriterion("positionlevel >=", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelLessThan(String value) {
            addCriterion("positionlevel <", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelLessThanOrEqualTo(String value) {
            addCriterion("positionlevel <=", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelLike(String value) {
            addCriterion("positionlevel like", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelNotLike(String value) {
            addCriterion("positionlevel not like", value, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelIn(List<String> values) {
            addCriterion("positionlevel in", values, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelNotIn(List<String> values) {
            addCriterion("positionlevel not in", values, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelBetween(String value1, String value2) {
            addCriterion("positionlevel between", value1, value2, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPositionlevelNotBetween(String value1, String value2) {
            addCriterion("positionlevel not between", value1, value2, "positionlevel");
            return (Criteria) this;
        }

        public Criteria andPostDutiesIsNull() {
            addCriterion("post_duties is null");
            return (Criteria) this;
        }

        public Criteria andPostDutiesIsNotNull() {
            addCriterion("post_duties is not null");
            return (Criteria) this;
        }

        public Criteria andPostDutiesEqualTo(String value) {
            addCriterion("post_duties =", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesNotEqualTo(String value) {
            addCriterion("post_duties <>", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesGreaterThan(String value) {
            addCriterion("post_duties >", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("post_duties >=", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesLessThan(String value) {
            addCriterion("post_duties <", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesLessThanOrEqualTo(String value) {
            addCriterion("post_duties <=", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesLike(String value) {
            addCriterion("post_duties like", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesNotLike(String value) {
            addCriterion("post_duties not like", value, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesIn(List<String> values) {
            addCriterion("post_duties in", values, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesNotIn(List<String> values) {
            addCriterion("post_duties not in", values, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesBetween(String value1, String value2) {
            addCriterion("post_duties between", value1, value2, "postDuties");
            return (Criteria) this;
        }

        public Criteria andPostDutiesNotBetween(String value1, String value2) {
            addCriterion("post_duties not between", value1, value2, "postDuties");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNull() {
            addCriterion("skills is null");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNotNull() {
            addCriterion("skills is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsEqualTo(String value) {
            addCriterion("skills =", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotEqualTo(String value) {
            addCriterion("skills <>", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThan(String value) {
            addCriterion("skills >", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("skills >=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThan(String value) {
            addCriterion("skills <", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThanOrEqualTo(String value) {
            addCriterion("skills <=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLike(String value) {
            addCriterion("skills like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotLike(String value) {
            addCriterion("skills not like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsIn(List<String> values) {
            addCriterion("skills in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotIn(List<String> values) {
            addCriterion("skills not in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsBetween(String value1, String value2) {
            addCriterion("skills between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotBetween(String value1, String value2) {
            addCriterion("skills not between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNull() {
            addCriterion("welfare is null");
            return (Criteria) this;
        }

        public Criteria andWelfareIsNotNull() {
            addCriterion("welfare is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareEqualTo(String value) {
            addCriterion("welfare =", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotEqualTo(String value) {
            addCriterion("welfare <>", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThan(String value) {
            addCriterion("welfare >", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareGreaterThanOrEqualTo(String value) {
            addCriterion("welfare >=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThan(String value) {
            addCriterion("welfare <", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLessThanOrEqualTo(String value) {
            addCriterion("welfare <=", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareLike(String value) {
            addCriterion("welfare like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotLike(String value) {
            addCriterion("welfare not like", value, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareIn(List<String> values) {
            addCriterion("welfare in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotIn(List<String> values) {
            addCriterion("welfare not in", values, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareBetween(String value1, String value2) {
            addCriterion("welfare between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andWelfareNotBetween(String value1, String value2) {
            addCriterion("welfare not between", value1, value2, "welfare");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("online_time is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("online_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(Long value) {
            addCriterion("online_time =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(Long value) {
            addCriterion("online_time <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(Long value) {
            addCriterion("online_time >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("online_time >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(Long value) {
            addCriterion("online_time <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(Long value) {
            addCriterion("online_time <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<Long> values) {
            addCriterion("online_time in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<Long> values) {
            addCriterion("online_time not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(Long value1, Long value2) {
            addCriterion("online_time between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(Long value1, Long value2) {
            addCriterion("online_time not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("is_online is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("is_online is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("is_online =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("is_online <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("is_online >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_online >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("is_online <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("is_online <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("is_online in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("is_online not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("is_online between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("is_online not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNull() {
            addCriterion("gmt_update is null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIsNotNull() {
            addCriterion("gmt_update is not null");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateEqualTo(Long value) {
            addCriterion("gmt_update =", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotEqualTo(Long value) {
            addCriterion("gmt_update <>", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThan(Long value) {
            addCriterion("gmt_update >", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_update >=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThan(Long value) {
            addCriterion("gmt_update <", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_update <=", value, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateIn(List<Long> values) {
            addCriterion("gmt_update in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotIn(List<Long> values) {
            addCriterion("gmt_update not in", values, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateBetween(Long value1, Long value2) {
            addCriterion("gmt_update between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andGmtUpdateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_update not between", value1, value2, "gmtUpdate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}