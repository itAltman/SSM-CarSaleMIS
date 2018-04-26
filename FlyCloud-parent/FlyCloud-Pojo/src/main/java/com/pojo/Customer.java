package com.pojo;
public class Customer {
    private Integer companyId;//公司编号
    private String customerPhone;//客户电话
    private String customerType;//客户类型（1：个人、2：公司）
    private java.util.Date customerCreateTime;//创建时间
    private String customerSex;//客户性别
    private java.util.Date customerBirthday;//客户生日
    private String customerName;//客户姓名
    public Customer() {
        super();
    }
    public Customer(Integer companyId,String customerPhone,String customerType,java.util.Date customerCreateTime,String customerSex,java.util.Date customerBirthday,String customerName) {
        super();
        this.companyId = companyId;
        this.customerPhone = customerPhone;
        this.customerType = customerType;
        this.customerCreateTime = customerCreateTime;
        this.customerSex = customerSex;
        this.customerBirthday = customerBirthday;
        this.customerName = customerName;
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

}
