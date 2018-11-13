package com.jnshu.backendsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyProduceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyProduceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andProduceNameIsNull() {
            addCriterion("produce_name is null");
            return (Criteria) this;
        }

        public Criteria andProduceNameIsNotNull() {
            addCriterion("produce_name is not null");
            return (Criteria) this;
        }

        public Criteria andProduceNameEqualTo(String value) {
            addCriterion("produce_name =", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotEqualTo(String value) {
            addCriterion("produce_name <>", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThan(String value) {
            addCriterion("produce_name >", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThanOrEqualTo(String value) {
            addCriterion("produce_name >=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThan(String value) {
            addCriterion("produce_name <", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThanOrEqualTo(String value) {
            addCriterion("produce_name <=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLike(String value) {
            addCriterion("produce_name like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotLike(String value) {
            addCriterion("produce_name not like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameIn(List<String> values) {
            addCriterion("produce_name in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotIn(List<String> values) {
            addCriterion("produce_name not in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameBetween(String value1, String value2) {
            addCriterion("produce_name between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotBetween(String value1, String value2) {
            addCriterion("produce_name not between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceSloganIsNull() {
            addCriterion("produce_slogan is null");
            return (Criteria) this;
        }

        public Criteria andProduceSloganIsNotNull() {
            addCriterion("produce_slogan is not null");
            return (Criteria) this;
        }

        public Criteria andProduceSloganEqualTo(String value) {
            addCriterion("produce_slogan =", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganNotEqualTo(String value) {
            addCriterion("produce_slogan <>", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganGreaterThan(String value) {
            addCriterion("produce_slogan >", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganGreaterThanOrEqualTo(String value) {
            addCriterion("produce_slogan >=", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganLessThan(String value) {
            addCriterion("produce_slogan <", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganLessThanOrEqualTo(String value) {
            addCriterion("produce_slogan <=", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganLike(String value) {
            addCriterion("produce_slogan like", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganNotLike(String value) {
            addCriterion("produce_slogan not like", value, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganIn(List<String> values) {
            addCriterion("produce_slogan in", values, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganNotIn(List<String> values) {
            addCriterion("produce_slogan not in", values, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganBetween(String value1, String value2) {
            addCriterion("produce_slogan between", value1, value2, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceSloganNotBetween(String value1, String value2) {
            addCriterion("produce_slogan not between", value1, value2, "produceSlogan");
            return (Criteria) this;
        }

        public Criteria andProduceLogoIsNull() {
            addCriterion("produce_logo is null");
            return (Criteria) this;
        }

        public Criteria andProduceLogoIsNotNull() {
            addCriterion("produce_logo is not null");
            return (Criteria) this;
        }

        public Criteria andProduceLogoEqualTo(String value) {
            addCriterion("produce_logo =", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoNotEqualTo(String value) {
            addCriterion("produce_logo <>", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoGreaterThan(String value) {
            addCriterion("produce_logo >", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoGreaterThanOrEqualTo(String value) {
            addCriterion("produce_logo >=", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoLessThan(String value) {
            addCriterion("produce_logo <", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoLessThanOrEqualTo(String value) {
            addCriterion("produce_logo <=", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoLike(String value) {
            addCriterion("produce_logo like", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoNotLike(String value) {
            addCriterion("produce_logo not like", value, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoIn(List<String> values) {
            addCriterion("produce_logo in", values, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoNotIn(List<String> values) {
            addCriterion("produce_logo not in", values, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoBetween(String value1, String value2) {
            addCriterion("produce_logo between", value1, value2, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProduceLogoNotBetween(String value1, String value2) {
            addCriterion("produce_logo not between", value1, value2, "produceLogo");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNull() {
            addCriterion("product_introduction is null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIsNotNull() {
            addCriterion("product_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionEqualTo(String value) {
            addCriterion("product_introduction =", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotEqualTo(String value) {
            addCriterion("product_introduction <>", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThan(String value) {
            addCriterion("product_introduction >", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("product_introduction >=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThan(String value) {
            addCriterion("product_introduction <", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLessThanOrEqualTo(String value) {
            addCriterion("product_introduction <=", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionLike(String value) {
            addCriterion("product_introduction like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotLike(String value) {
            addCriterion("product_introduction not like", value, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionIn(List<String> values) {
            addCriterion("product_introduction in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotIn(List<String> values) {
            addCriterion("product_introduction not in", values, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionBetween(String value1, String value2) {
            addCriterion("product_introduction between", value1, value2, "productIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductIntroductionNotBetween(String value1, String value2) {
            addCriterion("product_introduction not between", value1, value2, "productIntroduction");
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