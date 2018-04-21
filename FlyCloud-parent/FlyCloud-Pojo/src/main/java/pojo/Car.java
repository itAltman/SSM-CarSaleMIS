package pojo;
public class Car {
    private Double carPrice;//汽车价格
    private String carName;//汽车名称
    private java.util.Date carTime;//出厂日期
    private Integer seriesId;//车系编号
    public Car() {
        super();
    }
    public Car(Double carPrice,String carName,java.util.Date carTime,Integer seriesId) {
        super();
        this.carPrice = carPrice;
        this.carName = carName;
        this.carTime = carTime;
        this.seriesId = seriesId;
    }
    public Double getCarPrice() {
        return this.carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public java.util.Date getCarTime() {
        return this.carTime;
    }

    public void setCarTime(java.util.Date carTime) {
        this.carTime = carTime;
    }

    public Integer getSeriesId() {
        return this.seriesId;
    }

    public void setSeriesId(Integer seriesId) {
        this.seriesId = seriesId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carPrice=" + carPrice +
                ", carName='" + carName + '\'' +
                ", carTime=" + carTime +
                ", seriesId=" + seriesId +
                '}';
    }
}
