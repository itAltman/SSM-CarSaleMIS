package pojo;

import java.util.Date;

public class Repertory {
    private Integer repertoryid;

    private Integer carid;

    private Integer companyid;

    private Integer purchaseprice;

    private Date intime;

    private Short repertorynum;

    public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Integer purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Short getRepertorynum() {
        return repertorynum;
    }

    public void setRepertorynum(Short repertorynum) {
        this.repertorynum = repertorynum;
    }
}