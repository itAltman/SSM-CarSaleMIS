package pojo;

import java.util.Date;

public class Customer {
    private Integer customerid;

    private Integer companyid;

    private String customername;

    private Long customerphone;

    private String customersex;

    private Short customertype;

    private Date customerbirthday;

    private Date customercreatetime;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public Long getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(Long customerphone) {
        this.customerphone = customerphone;
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public Short getCustomertype() {
        return customertype;
    }

    public void setCustomertype(Short customertype) {
        this.customertype = customertype;
    }

    public Date getCustomerbirthday() {
        return customerbirthday;
    }

    public void setCustomerbirthday(Date customerbirthday) {
        this.customerbirthday = customerbirthday;
    }

    public Date getCustomercreatetime() {
        return customercreatetime;
    }

    public void setCustomercreatetime(Date customercreatetime) {
        this.customercreatetime = customercreatetime;
    }
}