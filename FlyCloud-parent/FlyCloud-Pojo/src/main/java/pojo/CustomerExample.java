package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNull() {
            addCriterion("customerPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("customerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(Long value) {
            addCriterion("customerPhone =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(Long value) {
            addCriterion("customerPhone <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(Long value) {
            addCriterion("customerPhone >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("customerPhone >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(Long value) {
            addCriterion("customerPhone <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(Long value) {
            addCriterion("customerPhone <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<Long> values) {
            addCriterion("customerPhone in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<Long> values) {
            addCriterion("customerPhone not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(Long value1, Long value2) {
            addCriterion("customerPhone between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(Long value1, Long value2) {
            addCriterion("customerPhone not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("customerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("customerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(String value) {
            addCriterion("customerSex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(String value) {
            addCriterion("customerSex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(String value) {
            addCriterion("customerSex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(String value) {
            addCriterion("customerSex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(String value) {
            addCriterion("customerSex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(String value) {
            addCriterion("customerSex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLike(String value) {
            addCriterion("customerSex like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotLike(String value) {
            addCriterion("customerSex not like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<String> values) {
            addCriterion("customerSex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<String> values) {
            addCriterion("customerSex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(String value1, String value2) {
            addCriterion("customerSex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(String value1, String value2) {
            addCriterion("customerSex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNull() {
            addCriterion("customerType is null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIsNotNull() {
            addCriterion("customerType is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertypeEqualTo(Short value) {
            addCriterion("customerType =", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotEqualTo(Short value) {
            addCriterion("customerType <>", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThan(Short value) {
            addCriterion("customerType >", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("customerType >=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThan(Short value) {
            addCriterion("customerType <", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeLessThanOrEqualTo(Short value) {
            addCriterion("customerType <=", value, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeIn(List<Short> values) {
            addCriterion("customerType in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotIn(List<Short> values) {
            addCriterion("customerType not in", values, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeBetween(Short value1, Short value2) {
            addCriterion("customerType between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomertypeNotBetween(Short value1, Short value2) {
            addCriterion("customerType not between", value1, value2, "customertype");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNull() {
            addCriterion("customerBirthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNotNull() {
            addCriterion("customerBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday =", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday <>", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("customerBirthday >", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday >=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("customerBirthday <", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday <=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("customerBirthday in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("customerBirthday not in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customerBirthday between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customerBirthday not between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeIsNull() {
            addCriterion("customerCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeIsNotNull() {
            addCriterion("customerCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeEqualTo(Date value) {
            addCriterion("customerCreateTime =", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeNotEqualTo(Date value) {
            addCriterion("customerCreateTime <>", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeGreaterThan(Date value) {
            addCriterion("customerCreateTime >", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("customerCreateTime >=", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeLessThan(Date value) {
            addCriterion("customerCreateTime <", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("customerCreateTime <=", value, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeIn(List<Date> values) {
            addCriterion("customerCreateTime in", values, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeNotIn(List<Date> values) {
            addCriterion("customerCreateTime not in", values, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeBetween(Date value1, Date value2) {
            addCriterion("customerCreateTime between", value1, value2, "customercreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomercreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("customerCreateTime not between", value1, value2, "customercreatetime");
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