package com.pojo;

import java.text.SimpleDateFormat;

public class Adminlog {
    private Integer logId;//日志编号
    private Integer empId;//员工编号
    private Integer companyId;//公司编号
    private String logContent;//操作内容
    private java.util.Date logTime;//操作时间
    private Employee employee;
    private Company company;
    public Adminlog() {
        super();
    }
    public Adminlog(Integer logId,Integer empId,Integer companyId,String logContent,java.util.Date logTime,Employee employee,Company company) {
        super();
        this.logId = logId;
        this.empId = empId;
        this.companyId = companyId;
        this.logContent = logContent;
        this.logTime = logTime;
        this.employee = employee;
        this.company = company;
    }
    public String getLogTimeFormat(){
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(logTime);
    }
    public Integer getLogId() {
        return this.logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
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

    public String getLogContent() {
        return this.logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public java.util.Date getLogTime() {
        return this.logTime;
    }

    public void setLogTime(java.util.Date logTime) {
        this.logTime = logTime;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Adminlog{" +
                "logId=" + logId +
                ", empId=" + empId +
                ", companyId=" + companyId +
                ", logContent='" + logContent + '\'' +
                ", logTime=" + logTime +
                ", employee=" + employee +
                ", company=" + company +
                '}';
    }
}
