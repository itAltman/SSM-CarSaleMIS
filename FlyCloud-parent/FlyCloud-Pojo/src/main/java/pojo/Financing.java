package pojo;
import pojo.Company;
import pojo.Sale;
import pojo.Repertory;
public class Financing {
    private Integer financingId;//财务编号
    private Double financingMoney;//涉及金额
    private Double financingType;//财务状态（1：收入，2：支出）
    private Company company;
    private Sale sale;
    private Repertory repertory;
    public Financing() {
        super();
    }
    public Financing(Integer financingId,Double financingMoney,Double financingType,Company company,Sale sale,Repertory repertory) {
        super();
        this.financingId = financingId;
        this.financingMoney = financingMoney;
        this.financingType = financingType;
        this.company = company;
        this.sale = sale;
        this.repertory = repertory;
    }
    public Integer getFinancingId() {
        return this.financingId;
    }

    public void setFinancingId(Integer financingId) {
        this.financingId = financingId;
    }

    public Double getFinancingMoney() {
        return this.financingMoney;
    }

    public void setFinancingMoney(Double financingMoney) {
        this.financingMoney = financingMoney;
    }

    public Double getFinancingType() {
        return this.financingType;
    }

    public void setFinancingType(Double financingType) {
        this.financingType = financingType;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Sale getSale() {
        return this.sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Repertory getRepertory() {
        return this.repertory;
    }

    public void setRepertory(Repertory repertory) {
        this.repertory = repertory;
    }

    @Override
    public String toString() {
        return "Financing{" +
                "financingId=" + financingId +
                ", financingMoney=" + financingMoney +
                ", financingType=" + financingType +
                ", company=" + company +
                ", sale=" + sale +
                ", repertory=" + repertory +
                '}';
    }
}
