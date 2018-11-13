package com.jnshu.backendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInfoExample() {
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

        public Criteria andCompanySloganIsNull() {
            addCriterion("company_slogan is null");
            return (Criteria) this;
        }

        public Criteria andCompanySloganIsNotNull() {
            addCriterion("company_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySloganEqualTo(String value) {
            addCriterion("company_slogan =", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganNotEqualTo(String value) {
            addCriterion("company_slogan <>", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganGreaterThan(String value) {
            addCriterion("company_slogan >", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganGreaterThanOrEqualTo(String value) {
            addCriterion("company_slogan >=", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganLessThan(String value) {
            addCriterion("company_slogan <", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganLessThanOrEqualTo(String value) {
            addCriterion("company_slogan <=", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganLike(String value) {
            addCriterion("company_slogan like", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganNotLike(String value) {
            addCriterion("company_slogan not like", value, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganIn(List<String> values) {
            addCriterion("company_slogan in", values, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganNotIn(List<String> values) {
            addCriterion("company_slogan not in", values, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganBetween(String value1, String value2) {
            addCriterion("company_slogan between", value1, value2, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andCompanySloganNotBetween(String value1, String value2) {
            addCriterion("company_slogan not between", value1, value2, "companySlogan");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesIsNull() {
            addCriterion("number_of_companies is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesIsNotNull() {
            addCriterion("number_of_companies is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesEqualTo(Long value) {
            addCriterion("number_of_companies =", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesNotEqualTo(Long value) {
            addCriterion("number_of_companies <>", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesGreaterThan(Long value) {
            addCriterion("number_of_companies >", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesGreaterThanOrEqualTo(Long value) {
            addCriterion("number_of_companies >=", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesLessThan(Long value) {
            addCriterion("number_of_companies <", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesLessThanOrEqualTo(Long value) {
            addCriterion("number_of_companies <=", value, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesIn(List<Long> values) {
            addCriterion("number_of_companies in", values, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesNotIn(List<Long> values) {
            addCriterion("number_of_companies not in", values, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesBetween(Long value1, Long value2) {
            addCriterion("number_of_companies between", value1, value2, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andNumberOfCompaniesNotBetween(Long value1, Long value2) {
            addCriterion("number_of_companies not between", value1, value2, "numberOfCompanies");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleIsNull() {
            addCriterion("financing_scale is null");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleIsNotNull() {
            addCriterion("financing_scale is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleEqualTo(Integer value) {
            addCriterion("financing_scale =", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleNotEqualTo(Integer value) {
            addCriterion("financing_scale <>", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleGreaterThan(Integer value) {
            addCriterion("financing_scale >", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("financing_scale >=", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleLessThan(Integer value) {
            addCriterion("financing_scale <", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleLessThanOrEqualTo(Integer value) {
            addCriterion("financing_scale <=", value, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleIn(List<Integer> values) {
            addCriterion("financing_scale in", values, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleNotIn(List<Integer> values) {
            addCriterion("financing_scale not in", values, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleBetween(Integer value1, Integer value2) {
            addCriterion("financing_scale between", value1, value2, "financingScale");
            return (Criteria) this;
        }

        public Criteria andFinancingScaleNotBetween(Integer value1, Integer value2) {
            addCriterion("financing_scale not between", value1, value2, "financingScale");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNull() {
            addCriterion("company_industry is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIsNotNull() {
            addCriterion("company_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryEqualTo(Integer value) {
            addCriterion("company_industry =", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotEqualTo(Integer value) {
            addCriterion("company_industry <>", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThan(Integer value) {
            addCriterion("company_industry >", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_industry >=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThan(Integer value) {
            addCriterion("company_industry <", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("company_industry <=", value, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryIn(List<Integer> values) {
            addCriterion("company_industry in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotIn(List<Integer> values) {
            addCriterion("company_industry not in", values, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryBetween(Integer value1, Integer value2) {
            addCriterion("company_industry between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("company_industry not between", value1, value2, "companyIndustry");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNull() {
            addCriterion("company_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIsNotNull() {
            addCriterion("company_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoEqualTo(String value) {
            addCriterion("company_logo =", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotEqualTo(String value) {
            addCriterion("company_logo <>", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThan(String value) {
            addCriterion("company_logo >", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoGreaterThanOrEqualTo(String value) {
            addCriterion("company_logo >=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThan(String value) {
            addCriterion("company_logo <", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLessThanOrEqualTo(String value) {
            addCriterion("company_logo <=", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoLike(String value) {
            addCriterion("company_logo like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotLike(String value) {
            addCriterion("company_logo not like", value, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoIn(List<String> values) {
            addCriterion("company_logo in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotIn(List<String> values) {
            addCriterion("company_logo not in", values, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoBetween(String value1, String value2) {
            addCriterion("company_logo between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyLogoNotBetween(String value1, String value2) {
            addCriterion("company_logo not between", value1, value2, "companyLogo");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNull() {
            addCriterion("company_profile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNotNull() {
            addCriterion("company_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileEqualTo(String value) {
            addCriterion("company_profile =", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotEqualTo(String value) {
            addCriterion("company_profile <>", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThan(String value) {
            addCriterion("company_profile >", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThanOrEqualTo(String value) {
            addCriterion("company_profile >=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThan(String value) {
            addCriterion("company_profile <", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThanOrEqualTo(String value) {
            addCriterion("company_profile <=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLike(String value) {
            addCriterion("company_profile like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotLike(String value) {
            addCriterion("company_profile not like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIn(List<String> values) {
            addCriterion("company_profile in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotIn(List<String> values) {
            addCriterion("company_profile not in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileBetween(String value1, String value2) {
            addCriterion("company_profile between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotBetween(String value1, String value2) {
            addCriterion("company_profile not between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyTagIsNull() {
            addCriterion("company_tag is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTagIsNotNull() {
            addCriterion("company_tag is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTagEqualTo(String value) {
            addCriterion("company_tag =", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagNotEqualTo(String value) {
            addCriterion("company_tag <>", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagGreaterThan(String value) {
            addCriterion("company_tag >", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagGreaterThanOrEqualTo(String value) {
            addCriterion("company_tag >=", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagLessThan(String value) {
            addCriterion("company_tag <", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagLessThanOrEqualTo(String value) {
            addCriterion("company_tag <=", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagLike(String value) {
            addCriterion("company_tag like", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagNotLike(String value) {
            addCriterion("company_tag not like", value, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagIn(List<String> values) {
            addCriterion("company_tag in", values, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagNotIn(List<String> values) {
            addCriterion("company_tag not in", values, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagBetween(String value1, String value2) {
            addCriterion("company_tag between", value1, value2, "companyTag");
            return (Criteria) this;
        }

        public Criteria andCompanyTagNotBetween(String value1, String value2) {
            addCriterion("company_tag not between", value1, value2, "companyTag");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNull() {
            addCriterion("Is_approve is null");
            return (Criteria) this;
        }

        public Criteria andIsApproveIsNotNull() {
            addCriterion("Is_approve is not null");
            return (Criteria) this;
        }

        public Criteria andIsApproveEqualTo(Integer value) {
            addCriterion("Is_approve =", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotEqualTo(Integer value) {
            addCriterion("Is_approve <>", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThan(Integer value) {
            addCriterion("Is_approve >", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("Is_approve >=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThan(Integer value) {
            addCriterion("Is_approve <", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveLessThanOrEqualTo(Integer value) {
            addCriterion("Is_approve <=", value, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveIn(List<Integer> values) {
            addCriterion("Is_approve in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotIn(List<Integer> values) {
            addCriterion("Is_approve not in", values, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveBetween(Integer value1, Integer value2) {
            addCriterion("Is_approve between", value1, value2, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("Is_approve not between", value1, value2, "isApprove");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNull() {
            addCriterion("Is_frozen is null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIsNotNull() {
            addCriterion("Is_frozen is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrozenEqualTo(Integer value) {
            addCriterion("Is_frozen =", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotEqualTo(Integer value) {
            addCriterion("Is_frozen <>", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThan(Integer value) {
            addCriterion("Is_frozen >", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenGreaterThanOrEqualTo(Integer value) {
            addCriterion("Is_frozen >=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThan(Integer value) {
            addCriterion("Is_frozen <", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenLessThanOrEqualTo(Integer value) {
            addCriterion("Is_frozen <=", value, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenIn(List<Integer> values) {
            addCriterion("Is_frozen in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotIn(List<Integer> values) {
            addCriterion("Is_frozen not in", values, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenBetween(Integer value1, Integer value2) {
            addCriterion("Is_frozen between", value1, value2, "isFrozen");
            return (Criteria) this;
        }

        public Criteria andIsFrozenNotBetween(Integer value1, Integer value2) {
            addCriterion("Is_frozen not between", value1, value2, "isFrozen");
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