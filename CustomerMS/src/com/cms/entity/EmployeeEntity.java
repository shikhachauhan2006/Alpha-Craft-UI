package com.cms.entity;

import java.util.Objects;

public class EmployeeEntity {
    private String empName;
    private String empDepartment;

    public EmployeeEntity(String empName, String empDepartment) {
        this.empName = empName;
        this.empDepartment = empDepartment;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    @Override
    public String toString() {
        return "EmployeeEntity [empName=" + empName + ", empDepartment=" + empDepartment + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeEntity)) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return empName.equals(that.empName) && empDepartment.equals(that.empDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empDepartment);
    }
}
