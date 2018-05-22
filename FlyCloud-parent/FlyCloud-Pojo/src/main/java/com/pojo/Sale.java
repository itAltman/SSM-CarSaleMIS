package com.pojo;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import common.MyConst;

public class Sale {
    private Integer saleId;//销售编号
    private Integer empId;//员工编号
    private Integer companyId;//公司编号
    private java.util.Date saleTime;//销售时间
    private String saleType;//销售状态（1、未付款，2、已付款）
    private Integer customerId;//客户编号
    private Double saleTotalPrice;//销售总价
    private Integer saleNum;//销售数量
    private Double saleCurPrice;//销售价格
    private Integer carId;//汽车编号
    private Employee employee;
    private Company company;
    private Customer customer;
    private Car car;
    private String saleTypeFormat;


    public Sale() {
        super();
    }
    public Sale(Integer saleId,Integer empId,Integer companyId,java.util.Date saleTime,String saleType,Integer customerId,Double saleTotalPrice,Integer saleNum,Double saleCurPrice,Integer carId,Employee employee,Company company,Customer customer,Car car) {
        super();
        this.saleId = saleId;
        this.empId = empId;
        this.companyId = companyId;
        this.saleTime = saleTime;
        this.saleType = saleType;
        this.customerId = customerId;
        this.saleTotalPrice = saleTotalPrice;
        this.saleNum = saleNum;
        this.saleCurPrice = saleCurPrice;
        this.carId = carId;
        this.employee = employee;
        this.company = company;
        this.customer = customer;
        this.car = car;
    }

    public String getSaleTypeFormat() {
        String str = null;
        if (MyConst.NOTPAYING.equals(saleType)){
            str = "未付款";
        } else if (MyConst.HASPAYING.equals(saleType)){
            str = "已付款";
        }
        return str;
    }

    public Integer getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public java.util.Date getSaleTime() {
        return this.saleTime;
    }

    public void setSaleTime(java.util.Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getSaleType() {
        return this.saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getSaleTotalPrice() {
        return this.saleTotalPrice;
    }

    public void setSaleTotalPrice(Double saleTotalPrice) {
        this.saleTotalPrice = saleTotalPrice;
    }

    public Integer getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Double getSaleCurPrice() {
        return this.saleCurPrice;
    }

    public void setSaleCurPrice(Double saleCurPrice) {
        this.saleCurPrice = saleCurPrice;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", empId=" + empId +
                ", companyId=" + companyId +
                ", saleType='" + saleType + '\'' +
                ", customerId=" + customerId +
                ", saleNum=" + saleNum +
                ", saleCurPrice=" + saleCurPrice +
                ", carId=" + carId +
                ", employee=" + employee +
                ", company=" + company +
                ", customer=" + customer +
                ", car=" + car +
                '}';
    }
}
