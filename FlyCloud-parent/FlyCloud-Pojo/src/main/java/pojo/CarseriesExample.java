package pojo;

import java.util.ArrayList;
import java.util.List;

public class CarseriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarseriesExample() {
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

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andSeriesnameIsNull() {
            addCriterion("seriesName is null");
            return (Criteria) this;
        }

        public Criteria andSeriesnameIsNotNull() {
            addCriterion("seriesName is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesnameEqualTo(String value) {
            addCriterion("seriesName =", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameNotEqualTo(String value) {
            addCriterion("seriesName <>", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameGreaterThan(String value) {
            addCriterion("seriesName >", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameGreaterThanOrEqualTo(String value) {
            addCriterion("seriesName >=", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameLessThan(String value) {
            addCriterion("seriesName <", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameLessThanOrEqualTo(String value) {
            addCriterion("seriesName <=", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameLike(String value) {
            addCriterion("seriesName like", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameNotLike(String value) {
            addCriterion("seriesName not like", value, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameIn(List<String> values) {
            addCriterion("seriesName in", values, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameNotIn(List<String> values) {
            addCriterion("seriesName not in", values, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameBetween(String value1, String value2) {
            addCriterion("seriesName between", value1, value2, "seriesname");
            return (Criteria) this;
        }

        public Criteria andSeriesnameNotBetween(String value1, String value2) {
            addCriterion("seriesName not between", value1, value2, "seriesname");
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