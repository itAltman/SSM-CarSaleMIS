package pojo;
public class Sale {
    private Integer empId;//员工编号
    private Integer companyId;//公司编号
    private Double saleType;//销售状态（1、未付款，2、已付款）
    private Integer customerId;//客户编号
    private Double saleNum;//销售数量
    private Double saleCurPrice;//销售价格
    private Integer carId;//汽车编号
    public Sale() {
        super();
    }
    public Sale(Integer empId,Integer companyId,Double saleType,Integer customerId,Double saleNum,Double saleCurPrice,Integer carId) {
        super();
        this.empId = empId;
        this.companyId = companyId;
        this.saleType = saleType;
        this.customerId = customerId;
        this.saleNum = saleNum;
        this.saleCurPrice = saleCurPrice;
        this.carId = carId;
    }
    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Double getSaleType() {
        return this.saleType;
    }

    public void setSaleType(Double saleType) {
        this.saleType = saleType;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getSaleNum() {
        return this.saleNum;
    }

    public void setSaleNum(Double saleNum) {
        this.saleNum = saleNum;
    }

    public Double getSaleCurPrice() {
        return this.saleCurPrice;
    }

    public void setSaleCurPrice(Double saleCurPrice) {
        this.saleCurPrice = saleCurPrice;
    }

    public Integer getCarId() {
        return this.carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "empId=" + empId +
                ", companyId=" + companyId +
                ", saleType=" + saleType +
                ", customerId=" + customerId +
                ", saleNum=" + saleNum +
                ", saleCurPrice=" + saleCurPrice +
                ", carId=" + carId +
                '}';
    }
}
