package com.pojo;
public class Carbrand {
    private Integer brandId;//品牌编号
    private String brandName;//品牌名称
    private String brandNum;//品牌序号
    public Carbrand() {
        super();
    }
    public Carbrand(Integer brandId,String brandName,String brandNum) {
        super();
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandNum = brandNum;
    }
    public Integer getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandNum() {
        return this.brandNum;
    }

    public void setBrandNum(String brandNum) {
        this.brandNum = brandNum;
    }

    @Override
    public String toString() {
        return "Carbrand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandNum='" + brandNum + '\'' +
                '}';
    }
}
