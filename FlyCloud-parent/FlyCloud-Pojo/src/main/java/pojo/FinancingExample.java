package pojo;

import java.util.ArrayList;
import java.util.List;

public class FinancingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancingExample() {
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

        public Criteria andFinancingidIsNull() {
            addCriterion("financingId is null");
            return (Criteria) this;
        }

        public Criteria andFinancingidIsNotNull() {
            addCriterion("financingId is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingidEqualTo(Integer value) {
            addCriterion("financingId =", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidNotEqualTo(Integer value) {
            addCriterion("financingId <>", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidGreaterThan(Integer value) {
            addCriterion("financingId >", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("financingId >=", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidLessThan(Integer value) {
            addCriterion("financingId <", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidLessThanOrEqualTo(Integer value) {
            addCriterion("financingId <=", value, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidIn(List<Integer> values) {
            addCriterion("financingId in", values, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidNotIn(List<Integer> values) {
            addCriterion("financingId not in", values, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidBetween(Integer value1, Integer value2) {
            addCriterion("financingId between", value1, value2, "financingid");
            return (Criteria) this;
        }

        public Criteria andFinancingidNotBetween(Integer value1, Integer value2) {
            addCriterion("financingId not between", value1, value2, "financingid");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNull() {
            addCriterion("saleId is null");
            return (Criteria) this;
        }

        public Criteria andSaleidIsNotNull() {
            addCriterion("saleId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleidEqualTo(Integer value) {
            addCriterion("saleId =", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotEqualTo(Integer value) {
            addCriterion("saleId <>", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThan(Integer value) {
            addCriterion("saleId >", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleId >=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThan(Integer value) {
            addCriterion("saleId <", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidLessThanOrEqualTo(Integer value) {
            addCriterion("saleId <=", value, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidIn(List<Integer> values) {
            addCriterion("saleId in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotIn(List<Integer> values) {
            addCriterion("saleId not in", values, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidBetween(Integer value1, Integer value2) {
            addCriterion("saleId between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andSaleidNotBetween(Integer value1, Integer value2) {
            addCriterion("saleId not between", value1, value2, "saleid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidIsNull() {
            addCriterion("repertoryId is null");
            return (Criteria) this;
        }

        public Criteria andRepertoryidIsNotNull() {
            addCriterion("repertoryId is not null");
            return (Criteria) this;
        }

        public Criteria andRepertoryidEqualTo(Integer value) {
            addCriterion("repertoryId =", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidNotEqualTo(Integer value) {
            addCriterion("repertoryId <>", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidGreaterThan(Integer value) {
            addCriterion("repertoryId >", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("repertoryId >=", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidLessThan(Integer value) {
            addCriterion("repertoryId <", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidLessThanOrEqualTo(Integer value) {
            addCriterion("repertoryId <=", value, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidIn(List<Integer> values) {
            addCriterion("repertoryId in", values, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidNotIn(List<Integer> values) {
            addCriterion("repertoryId not in", values, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidBetween(Integer value1, Integer value2) {
            addCriterion("repertoryId between", value1, value2, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andRepertoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("repertoryId not between", value1, value2, "repertoryid");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyIsNull() {
            addCriterion("financingMoney is null");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyIsNotNull() {
            addCriterion("financingMoney is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyEqualTo(Long value) {
            addCriterion("financingMoney =", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyNotEqualTo(Long value) {
            addCriterion("financingMoney <>", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyGreaterThan(Long value) {
            addCriterion("financingMoney >", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("financingMoney >=", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyLessThan(Long value) {
            addCriterion("financingMoney <", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyLessThanOrEqualTo(Long value) {
            addCriterion("financingMoney <=", value, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyIn(List<Long> values) {
            addCriterion("financingMoney in", values, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyNotIn(List<Long> values) {
            addCriterion("financingMoney not in", values, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyBetween(Long value1, Long value2) {
            addCriterion("financingMoney between", value1, value2, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingmoneyNotBetween(Long value1, Long value2) {
            addCriterion("financingMoney not between", value1, value2, "financingmoney");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeIsNull() {
            addCriterion("financingType is null");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeIsNotNull() {
            addCriterion("financingType is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeEqualTo(Short value) {
            addCriterion("financingType =", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotEqualTo(Short value) {
            addCriterion("financingType <>", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeGreaterThan(Short value) {
            addCriterion("financingType >", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("financingType >=", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeLessThan(Short value) {
            addCriterion("financingType <", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeLessThanOrEqualTo(Short value) {
            addCriterion("financingType <=", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeIn(List<Short> values) {
            addCriterion("financingType in", values, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotIn(List<Short> values) {
            addCriterion("financingType not in", values, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeBetween(Short value1, Short value2) {
            addCriterion("financingType between", value1, value2, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotBetween(Short value1, Short value2) {
            addCriterion("financingType not between", value1, value2, "financingtype");
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