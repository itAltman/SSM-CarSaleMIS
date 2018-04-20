package pojo;

public class Carorder {
    private Integer orderid;

    private Integer carid;

    private Integer companyid;

    private Short ordernum;

    private Short ordertype;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public Short getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Short ordernum) {
        this.ordernum = ordernum;
    }

    public Short getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Short ordertype) {
        this.ordertype = ordertype;
    }
}