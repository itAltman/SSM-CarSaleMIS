package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Car {
    private Integer carid;

    private Integer seriesid;

    private String carname;

    private BigDecimal carprice;

    private Date cartime;

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(Integer seriesid) {
        this.seriesid = seriesid;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname == null ? null : carname.trim();
    }

    public BigDecimal getCarprice() {
        return carprice;
    }

    public void setCarprice(BigDecimal carprice) {
        this.carprice = carprice;
    }

    public Date getCartime() {
        return cartime;
    }

    public void setCartime(Date cartime) {
        this.cartime = cartime;
    }
}