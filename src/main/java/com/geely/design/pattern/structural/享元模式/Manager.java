package com.geely.design.pattern.structural.享元模式;

public class Manager implements Employee{
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
