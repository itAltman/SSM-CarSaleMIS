package pojo;
public class Company {
    private String companyName;//公司编号
    public Company() {
        super();
    }
    public Company(String companyName) {
        super();
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
