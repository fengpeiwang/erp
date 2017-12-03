package cn.huaying.erp.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class StoredetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoredetailExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Long value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Long value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Long value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Long value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Long value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Long> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Long> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Long value1, Long value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Long value1, Long value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNull() {
            addCriterion("STOREUUID is null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIsNotNull() {
            addCriterion("STOREUUID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreuuidEqualTo(String value) {
            addCriterion("STOREUUID =", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotEqualTo(String value) {
            addCriterion("STOREUUID <>", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThan(String value) {
            addCriterion("STOREUUID >", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidGreaterThanOrEqualTo(String value) {
            addCriterion("STOREUUID >=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThan(String value) {
            addCriterion("STOREUUID <", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLessThanOrEqualTo(String value) {
            addCriterion("STOREUUID <=", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidLike(String value) {
            addCriterion("STOREUUID like", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotLike(String value) {
            addCriterion("STOREUUID not like", value, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidIn(List<String> values) {
            addCriterion("STOREUUID in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotIn(List<String> values) {
            addCriterion("STOREUUID not in", values, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidBetween(String value1, String value2) {
            addCriterion("STOREUUID between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andStoreuuidNotBetween(String value1, String value2) {
            addCriterion("STOREUUID not between", value1, value2, "storeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNull() {
            addCriterion("GOODSUUID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIsNotNull() {
            addCriterion("GOODSUUID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidEqualTo(String value) {
            addCriterion("GOODSUUID =", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotEqualTo(String value) {
            addCriterion("GOODSUUID <>", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThan(String value) {
            addCriterion("GOODSUUID >", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSUUID >=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThan(String value) {
            addCriterion("GOODSUUID <", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLessThanOrEqualTo(String value) {
            addCriterion("GOODSUUID <=", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidLike(String value) {
            addCriterion("GOODSUUID like", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotLike(String value) {
            addCriterion("GOODSUUID not like", value, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidIn(List<String> values) {
            addCriterion("GOODSUUID in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotIn(List<String> values) {
            addCriterion("GOODSUUID not in", values, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidBetween(String value1, String value2) {
            addCriterion("GOODSUUID between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andGoodsuuidNotBetween(String value1, String value2) {
            addCriterion("GOODSUUID not between", value1, value2, "goodsuuid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM not between", value1, value2, "num");
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