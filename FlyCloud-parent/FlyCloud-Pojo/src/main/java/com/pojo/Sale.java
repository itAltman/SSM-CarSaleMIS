package com.pojo;

public class Sale {
    private Integer saleId;//销售编号
    private Integer empId;//员工编号
    private Integer companyId;//公司编号
    private String saleType;//销售状态（1、未付款，2、已付款）
    private Integer customerId;//客户编号
    private Integer saleNum;//销售数量
    private Double saleCurPrice;//销售价格
    private Integer carId;//汽车编号
    private Employee employee;
    private Company company;
    private Customer customer;
    private Car car;
    public Sale() {
        super();
    }
    public Sale(Integer saleId,Integer empId,Integer companyId,String saleType,Integer customerId,Integer saleNum,Double saleCurPrice,Integer carId,Employee employee,Company company,Customer customer,Car car) {
        super();
        this.saleId = saleId;
        this.empId = empId;
        this.companyId = companyId;
        this.saleType = saleType;
        this.customerId = customerId;
        this.saleNum = saleNum;
        this.saleCurPrice = saleCurPrice;
        this.carId = carId;
        this.employee = employee;
        this.company = company;
        this.customer = customer;
        this.car = car;
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

}
