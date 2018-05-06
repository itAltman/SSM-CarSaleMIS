package com.pojo;
public class Company {
    private Integer companyId;//公司编号
    private String companyName;//公司名称
    public Company() {
        super();
    }
    public Company(Integer companyId,String companyName) {
        super();
        this.companyId = companyId;
        this.companyName = companyName;
    }
    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
