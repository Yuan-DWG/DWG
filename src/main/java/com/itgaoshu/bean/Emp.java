package com.itgaoshu.bean;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Table(name="emp")
public class Emp implements Serializable {
    @Id
    private Integer empno;
    private String ename;
    private Double salary;
    private String hiredate;


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
