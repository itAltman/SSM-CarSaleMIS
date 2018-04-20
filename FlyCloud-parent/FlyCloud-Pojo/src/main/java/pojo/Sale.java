package pojo;

public class Sale {
    private Integer saleid;

    private Integer customerid;

    private Integer carid;

    private Integer empid;

    private Integer companyid;

    private Integer salecurprice;

    private Short salenum;

    private Short saletype;

    public Integer getSaleid() {
        return saleid;
    }

    public void setSaleid(Integer saleid) {
        this.saleid = saleid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getSalecurprice() {
        return salecurprice;
    }

    public void setSalecurprice(Integer salecurprice) {
        this.salecurprice = salecurprice;
    }

    public Short getSalenum() {
        return salenum;
    }

    public void setSalenum(Short salenum) {
        this.salenum = salenum;
    }

    public Short getSaletype() {
        return saletype;
    }

    public void setSaletype(Short saletype) {
        this.saletype = saletype;
    }
}