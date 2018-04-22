package pojo;
public class Carseries {
    private String seriesName;//车系名称
    private Integer brandId;//品牌编号
    public Carseries() {
        super();
    }
    public Carseries(String seriesName,Integer brandId) {
        super();
        this.seriesName = seriesName;
        this.brandId = brandId;
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

}
