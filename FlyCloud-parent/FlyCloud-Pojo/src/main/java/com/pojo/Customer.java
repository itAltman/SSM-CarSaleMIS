package com.pojo;

import java.text.SimpleDateFormat;

public class Customer {
    private Integer customerId;//客户编号
    private Integer companyId;//公司编号
    private String customerPhone;//客户电话
    private String customerType;//客户类型（1：个人、2：公司）
    private java.util.Date customerCreateTime;//创建时间
    private String customerSex;//客户性别
    private java.util.Date customerBirthday;//客户生日
    private String customerName;//客户姓名
    private String birthdayFormat;//客户生日的格式化类型
    private String CreateTimeFormat;//创建时间的格式化类型
    private String typeFormat;//客户类型的格式化类型

    private Company company;
    public Customer() {
        super();
    }
    public Customer(Integer customerId,Integer companyId,String customerPhone,String customerType,java.util.Date customerCreateTime,String customerSex,java.util.Date customerBirthday,String customerName,Company company) {
        super();
        this.customerId = customerId;
        this.companyId = companyId;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.customerCreateTime = customerCreateTime;
        this.customerSex = customerSex;
        this.customerBirthday = customerBirthday;
        this.customerName = customerName;
        this.company = company;
    }

    public String getTypeFormat() {
        String str = null;
        if ("1".equals(customerType)){
            str = "个人";
        } else if ("2".equals(customerType)){
            str = "公司";
        }
        return str;
    }
    public String getBirthdayFormat() {
        return new SimpleDateFormat("yyyy/MM/dd").format(customerBirthday);
    }

    public String getCreateTimeFormat() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(customerCreateTime);
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public java.util.Date getCustomerCreateTime() {
        return this.customerCreateTime;
    }

    public void setCustomerCreateTime(java.util.Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public String getCustomerSex() {
        return this.customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public java.util.Date getCustomerBirthday() {
        return this.customerBirthday;
    }

    public void setCustomerBirthday(java.util.Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", companyId=" + companyId +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerCreateTime=" + customerCreateTime +
                ", customerSex='" + customerSex + '\'' +
                ", customerBirthday=" + customerBirthday +
                ", customerName='" + customerName + '\'' +
                ", birthdayFormat='" + birthdayFormat + '\'' +
                ", CreateTimeFormat='" + CreateTimeFormat + '\'' +
                ", company=" + company +
                '}';
    }
}
