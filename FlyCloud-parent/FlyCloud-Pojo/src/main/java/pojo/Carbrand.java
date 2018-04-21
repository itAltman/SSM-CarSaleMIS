package pojo;
public class Carbrand {
    private String brandName;//品牌名称
    private String brandNum;//品牌序号
    public Carbrand() {
        super();
    }
    public Carbrand(String brandName,String brandNum) {
        super();
        this.brandName = brandName;
        this.brandNum = brandNum;
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
                "brandName='" + brandName + '\'' +
                ", brandNum='" + brandNum + '\'' +
                '}';
    }
}
