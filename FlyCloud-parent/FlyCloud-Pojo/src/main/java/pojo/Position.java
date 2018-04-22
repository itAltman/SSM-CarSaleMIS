package pojo;
public class Position {
    private String positionName;//职务名称（经理、操作员、销售员）
    private String positionLevel;//职务等级（1：经理、2：操作员、3：销售员）
    public Position() {
        super();
    }
    public Position(String positionName,String positionLevel) {
        super();
        this.positionName = positionName;
        this.positionLevel = positionLevel;
    }
    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionLevel() {
        return this.positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

}
