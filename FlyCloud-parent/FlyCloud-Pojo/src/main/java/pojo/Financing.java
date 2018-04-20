package pojo;

public class Financing {
    private Integer financingid;

    private Integer saleid;

    private Integer repertoryid;

    private Integer companyid;

    private Long financingmoney;

    private Short financingtype;

    public Integer getFinancingid() {
        return financingid;
    }

    public void setFinancingid(Integer financingid) {
        this.financingid = financingid;
    }

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Long getFinancingmoney() {
        return financingmoney;
    }

    public void setFinancingmoney(Long financingmoney) {
        this.financingmoney = financingmoney;
    }

    public Short getFinancingtype() {
        return financingtype;
    }

    public void setFinancingtype(Short financingtype) {
        this.financingtype = financingtype;
    }
}