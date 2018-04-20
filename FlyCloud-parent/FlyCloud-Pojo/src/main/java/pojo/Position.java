package pojo;

public class Position {
    private Integer positionid;

    private String positionname;

    private Short positionlevel;

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    public Short getPositionlevel() {
        return positionlevel;
    }

    public void setPositionlevel(Short positionlevel) {
        this.positionlevel = positionlevel;
    }
}