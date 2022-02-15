package com.company;

public class Employee {
    int empId;
    String empName;
    String roleOfEmp;

    public Employee(int empId, String empName, String roleOfEmp) {
        this.empId = empId;
        this.empName = empName;
        this.roleOfEmp = roleOfEmp;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRoleOfEmp() {
        return roleOfEmp;
    }

    @Override
    public String toString() {
        return "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", roleOfEmp='" + roleOfEmp + '\'' +
                '}'+"\n";
    }
}
