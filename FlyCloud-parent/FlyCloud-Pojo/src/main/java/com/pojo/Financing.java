package com.pojo;
public class Financing {
    private Integer financingId;//财务编号
    private Integer companyId;//公司编号
    private Double financingMoney;//涉及金额
    private Integer saleId;//销售编号
    private Integer repertoryId;//库存编号
    private String financingType;//财务状态（1：收入，2：支出）
    private Company company;
    private Sale sale;
    private Repertory repertory;
    public Financing() {
        super();
    }
    public Financing(Integer financingId,Integer companyId,Double financingMoney,Integer saleId,Integer repertoryId,String financingType,Company company,Sale sale,Repertory repertory) {
        super();
        this.financingId = financingId;
        this.companyId = companyId;
        this.financingMoney = financingMoney;
        this.saleId = saleId;
        this.repertoryId = repertoryId;
        this.financingType = financingType;
        this.company = company;
        this.sale = sale;
        this.repertory = repertory;
    }
    public Integer getFinancingId() {
        return this.financingId;
    }

    public void setFinancingId(Integer financingId) {
        this.financingId = financingId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getFinancingMoney() {
        return this.financingMoney;
    }

    public void setFinancingMoney(Double financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Integer getSaleId() {
        return this.saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getRepertoryId() {
        return this.repertoryId;
    }

    public void setRepertoryId(Integer repertoryId) {
        this.repertoryId = repertoryId;
    }

    public String getFinancingType() {
        return this.financingType;
    }

    public void setFinancingType(String financingType) {
        this.financingType = financingType;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Sale getSale() {
        return this.sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Repertory getRepertory() {
        return this.repertory;
    }

    public void setRepertory(Repertory repertory) {
        this.repertory = repertory;
    }

}
