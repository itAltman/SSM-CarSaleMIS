package pojo;
import pojo.Carbrand;
public class Carseries {
    private Integer seriesId;//车系编号
    private String seriesName;//车系名称
    private Carbrand carbrand;
    public Carseries() {
        super();
    }
    public Carseries(Integer seriesId,String seriesName,Carbrand carbrand) {
        super();
        this.seriesId = seriesId;
        this.seriesName = seriesName;
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
                ", carbrand=" + carbrand +
                '}';
    }
}
