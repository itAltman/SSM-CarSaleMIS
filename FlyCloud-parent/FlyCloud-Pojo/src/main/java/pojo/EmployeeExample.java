package pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andPositionidIsNull() {
            addCriterion("positionId is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("positionId is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Integer value) {
            addCriterion("positionId =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Integer value) {
            addCriterion("positionId <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Integer value) {
            addCriterion("positionId >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionId >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Integer value) {
            addCriterion("positionId <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Integer value) {
            addCriterion("positionId <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Integer> values) {
            addCriterion("positionId in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Integer> values) {
            addCriterion("positionId not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Integer value1, Integer value2) {
            addCriterion("positionId between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("positionId not between", value1, value2, "positionid");
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

        public Criteria andEmpnameIsNull() {
            addCriterion("empName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("empName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("empName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("empName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("empName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("empName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("empName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("empName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("empName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("empName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("empName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("empName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("empName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("empName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNull() {
            addCriterion("empPhone is null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIsNotNull() {
            addCriterion("empPhone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpphoneEqualTo(Long value) {
            addCriterion("empPhone =", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotEqualTo(Long value) {
            addCriterion("empPhone <>", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThan(Long value) {
            addCriterion("empPhone >", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("empPhone >=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThan(Long value) {
            addCriterion("empPhone <", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneLessThanOrEqualTo(Long value) {
            addCriterion("empPhone <=", value, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneIn(List<Long> values) {
            addCriterion("empPhone in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotIn(List<Long> values) {
            addCriterion("empPhone not in", values, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneBetween(Long value1, Long value2) {
            addCriterion("empPhone between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmpphoneNotBetween(Long value1, Long value2) {
            addCriterion("empPhone not between", value1, value2, "empphone");
            return (Criteria) this;
        }

        public Criteria andEmppasswordIsNull() {
            addCriterion("empPassword is null");
            return (Criteria) this;
        }

        public Criteria andEmppasswordIsNotNull() {
            addCriterion("empPassword is not null");
            return (Criteria) this;
        }

        public Criteria andEmppasswordEqualTo(String value) {
            addCriterion("empPassword =", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordNotEqualTo(String value) {
            addCriterion("empPassword <>", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordGreaterThan(String value) {
            addCriterion("empPassword >", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordGreaterThanOrEqualTo(String value) {
            addCriterion("empPassword >=", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordLessThan(String value) {
            addCriterion("empPassword <", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordLessThanOrEqualTo(String value) {
            addCriterion("empPassword <=", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordLike(String value) {
            addCriterion("empPassword like", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordNotLike(String value) {
            addCriterion("empPassword not like", value, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordIn(List<String> values) {
            addCriterion("empPassword in", values, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordNotIn(List<String> values) {
            addCriterion("empPassword not in", values, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordBetween(String value1, String value2) {
            addCriterion("empPassword between", value1, value2, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmppasswordNotBetween(String value1, String value2) {
            addCriterion("empPassword not between", value1, value2, "emppassword");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryIsNull() {
            addCriterion("empSalery is null");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryIsNotNull() {
            addCriterion("empSalery is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryEqualTo(Integer value) {
            addCriterion("empSalery =", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryNotEqualTo(Integer value) {
            addCriterion("empSalery <>", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryGreaterThan(Integer value) {
            addCriterion("empSalery >", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryGreaterThanOrEqualTo(Integer value) {
            addCriterion("empSalery >=", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryLessThan(Integer value) {
            addCriterion("empSalery <", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryLessThanOrEqualTo(Integer value) {
            addCriterion("empSalery <=", value, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryIn(List<Integer> values) {
            addCriterion("empSalery in", values, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryNotIn(List<Integer> values) {
            addCriterion("empSalery not in", values, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryBetween(Integer value1, Integer value2) {
            addCriterion("empSalery between", value1, value2, "empsalery");
            return (Criteria) this;
        }

        public Criteria andEmpsaleryNotBetween(Integer value1, Integer value2) {
            addCriterion("empSalery not between", value1, value2, "empsalery");
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