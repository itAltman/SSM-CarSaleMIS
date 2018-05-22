package com.pojo;
public class Carseries {
    private Integer seriesId;//车系编号
    private String seriesName;//车系名称
    private Integer brandId;//品牌编号
    private Carbrand carbrand;
    public Carseries() {
        super();
    }
    public Carseries(Integer seriesId,String seriesName,Integer brandId,Carbrand carbrand) {
        super();
        this.seriesId = seriesId;
        this.seriesName = seriesName;
        this.brandId = brandId;
        this.carbrand = carbrand;
    }
    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return this.seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Carbrand getCarbrand() {
        return this.carbrand;
    }

    public void setCarbrand(Carbrand carbrand) {
        this.carbrand = carbrand;
    }

    @Override
    public String toString() {
        return "Carseries{" +
                "seriesId=" + seriesId +
                ", seriesName='" + seriesName + '\'' +
                ", brandId=" + brandId +
                ", carbrand=" + carbrand +
                '}';
    }
}
