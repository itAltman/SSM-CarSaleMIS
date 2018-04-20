package pojo;

import java.util.ArrayList;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("customerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerId not between", value1, value2, "customerid");
            return (Criteria) this;
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

        public Criteria andEmpidIsNull() {
            addCriterion("empId is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empId is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empId =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empId <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empId >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empId >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empId <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empId <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empId in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empId not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empId between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empId not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceIsNull() {
            addCriterion("saleCurPrice is null");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceIsNotNull() {
            addCriterion("saleCurPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceEqualTo(Integer value) {
            addCriterion("saleCurPrice =", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceNotEqualTo(Integer value) {
            addCriterion("saleCurPrice <>", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceGreaterThan(Integer value) {
            addCriterion("saleCurPrice >", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleCurPrice >=", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceLessThan(Integer value) {
            addCriterion("saleCurPrice <", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceLessThanOrEqualTo(Integer value) {
            addCriterion("saleCurPrice <=", value, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceIn(List<Integer> values) {
            addCriterion("saleCurPrice in", values, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceNotIn(List<Integer> values) {
            addCriterion("saleCurPrice not in", values, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceBetween(Integer value1, Integer value2) {
            addCriterion("saleCurPrice between", value1, value2, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalecurpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("saleCurPrice not between", value1, value2, "salecurprice");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNull() {
            addCriterion("saleNum is null");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNotNull() {
            addCriterion("saleNum is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumEqualTo(Short value) {
            addCriterion("saleNum =", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotEqualTo(Short value) {
            addCriterion("saleNum <>", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThan(Short value) {
            addCriterion("saleNum >", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThanOrEqualTo(Short value) {
            addCriterion("saleNum >=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThan(Short value) {
            addCriterion("saleNum <", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThanOrEqualTo(Short value) {
            addCriterion("saleNum <=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumIn(List<Short> values) {
            addCriterion("saleNum in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotIn(List<Short> values) {
            addCriterion("saleNum not in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumBetween(Short value1, Short value2) {
            addCriterion("saleNum between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotBetween(Short value1, Short value2) {
            addCriterion("saleNum not between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNull() {
            addCriterion("saleType is null");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNotNull() {
            addCriterion("saleType is not null");
            return (Criteria) this;
        }

        public Criteria andSaletypeEqualTo(Short value) {
            addCriterion("saleType =", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotEqualTo(Short value) {
            addCriterion("saleType <>", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThan(Short value) {
            addCriterion("saleType >", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThanOrEqualTo(Short value) {
            addCriterion("saleType >=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThan(Short value) {
            addCriterion("saleType <", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThanOrEqualTo(Short value) {
            addCriterion("saleType <=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeIn(List<Short> values) {
            addCriterion("saleType in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotIn(List<Short> values) {
            addCriterion("saleType not in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeBetween(Short value1, Short value2) {
            addCriterion("saleType between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotBetween(Short value1, Short value2) {
            addCriterion("saleType not between", value1, value2, "saletype");
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