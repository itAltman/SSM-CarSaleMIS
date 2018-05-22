package com.pojo;

import common.MyConst;

public class Carorder {
    private Integer orderId;//订单编号
    private String orderType;//订单状态（1：未审核、2：已审核）
    private Integer companyId;//公司编号
    private Double orderTotalPrice;//订单总价
    private Integer orderNum;//车辆数量
    private Integer carId;//汽车编号
    private Car car;
    private Company company;
    public Carorder() {
        super();
    }
    public Carorder(Integer orderId,String orderType,Integer companyId,Double orderTotalPrice,Integer orderNum,Integer carId,Car car,Company company) {
        super();
        this.orderId = orderId;
        this.orderType = orderType;
        this.companyId = companyId;
        this.orderTotalPrice = orderTotalPrice;
        this.orderNum = orderNum;
        this.carId = carId;
        this.car = car;
        this.company = company;
    }
    public String getOrderTypeFormat(){
        String str = null;
        if (MyConst.NOTAUDIT.equals(orderType)){
            str = "未审核";
        } else if (MyConst.HASAUDIT.equals(orderType)){
            str = "已审核";
        }
        return str;
    }
    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getOrderTotalPrice() {
        return this.orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public Integer getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Carorder{" +
                "orderId=" + orderId +
                ", orderType='" + orderType + '\'' +
                ", companyId=" + companyId +
                ", orderTotalPrice=" + orderTotalPrice +
                ", orderNum=" + orderNum +
                ", carId=" + carId +
                ", car=" + car +
                ", company=" + company +
                '}';
    }
}
