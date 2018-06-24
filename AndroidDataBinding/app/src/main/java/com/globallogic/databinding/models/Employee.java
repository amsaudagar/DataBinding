package com.globallogic.databinding.models;


/**
 * @author : Abdul Mateen
 * Model class to hold employee details
 */
public class Employee {

    private int mEmployeeId;
    private String mEmpName;
    private String mEmpDesignation;

    public Employee(int employeeId, String empName, String empDesignation) {
        this.mEmployeeId = employeeId;
        this.mEmpName = empName;
        this.mEmpDesignation = empDesignation;
    }

    public String getEmployeeId() {
        return Integer.toString(mEmployeeId);
    }

    public void setEmployeeId(int employeeId) {
        this.mEmployeeId = employeeId;
    }

    public String getEmpName() {
        return mEmpName;
    }

    public void setEmpName(String empName) {
        this.mEmpName = empName;
    }

    public String getEmpDesignation() {
        return mEmpDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.mEmpDesignation = empDesignation;
    }
}
