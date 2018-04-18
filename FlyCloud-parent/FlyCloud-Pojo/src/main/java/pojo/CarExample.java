package pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCaridIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(Integer value) {
            addCriterion("carId =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(Integer value) {
            addCriterion("carId <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(Integer value) {
            addCriterion("carId >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("carId >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(Integer value) {
            addCriterion("carId <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(Integer value) {
            addCriterion("carId <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<Integer> values) {
            addCriterion("carId in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<Integer> values) {
            addCriterion("carId not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(Integer value1, Integer value2) {
            addCriterion("carId between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(Integer value1, Integer value2) {
            addCriterion("carId not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNull() {
            addCriterion("seriesId is null");
            return (Criteria) this;
        }

        public Criteria andSeriesidIsNotNull() {
            addCriterion("seriesId is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesidEqualTo(Integer value) {
            addCriterion("seriesId =", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotEqualTo(Integer value) {
            addCriterion("seriesId <>", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThan(Integer value) {
            addCriterion("seriesId >", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seriesId >=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThan(Integer value) {
            addCriterion("seriesId <", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidLessThanOrEqualTo(Integer value) {
            addCriterion("seriesId <=", value, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidIn(List<Integer> values) {
            addCriterion("seriesId in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotIn(List<Integer> values) {
            addCriterion("seriesId not in", values, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidBetween(Integer value1, Integer value2) {
            addCriterion("seriesId between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andSeriesidNotBetween(Integer value1, Integer value2) {
            addCriterion("seriesId not between", value1, value2, "seriesid");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNull() {
            addCriterion("carName is null");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNotNull() {
            addCriterion("carName is not null");
            return (Criteria) this;
        }

        public Criteria andCarnameEqualTo(String value) {
            addCriterion("carName =", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotEqualTo(String value) {
            addCriterion("carName <>", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThan(String value) {
            addCriterion("carName >", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThanOrEqualTo(String value) {
            addCriterion("carName >=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThan(String value) {
            addCriterion("carName <", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThanOrEqualTo(String value) {
            addCriterion("carName <=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLike(String value) {
            addCriterion("carName like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotLike(String value) {
            addCriterion("carName not like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameIn(List<String> values) {
            addCriterion("carName in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotIn(List<String> values) {
            addCriterion("carName not in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameBetween(String value1, String value2) {
            addCriterion("carName between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotBetween(String value1, String value2) {
            addCriterion("carName not between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andCarpriceIsNull() {
            addCriterion("carPrice is null");
            return (Criteria) this;
        }

        public Criteria andCarpriceIsNotNull() {
            addCriterion("carPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCarpriceEqualTo(BigDecimal value) {
            addCriterion("carPrice =", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotEqualTo(BigDecimal value) {
            addCriterion("carPrice <>", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThan(BigDecimal value) {
            addCriterion("carPrice >", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("carPrice >=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThan(BigDecimal value) {
            addCriterion("carPrice <", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("carPrice <=", value, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceIn(List<BigDecimal> values) {
            addCriterion("carPrice in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotIn(List<BigDecimal> values) {
            addCriterion("carPrice not in", values, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carPrice between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andCarpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("carPrice not between", value1, value2, "carprice");
            return (Criteria) this;
        }

        public Criteria andCartimeIsNull() {
            addCriterion("carTime is null");
            return (Criteria) this;
        }

        public Criteria andCartimeIsNotNull() {
            addCriterion("carTime is not null");
            return (Criteria) this;
        }

        public Criteria andCartimeEqualTo(Date value) {
            addCriterionForJDBCDate("carTime =", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("carTime <>", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("carTime >", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carTime >=", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeLessThan(Date value) {
            addCriterionForJDBCDate("carTime <", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("carTime <=", value, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeIn(List<Date> values) {
            addCriterionForJDBCDate("carTime in", values, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("carTime not in", values, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carTime between", value1, value2, "cartime");
            return (Criteria) this;
        }

        public Criteria andCartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("carTime not between", value1, value2, "cartime");
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