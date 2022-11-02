package com.demo.entity;

public class Student {
    public int sNo;
    public String sName;
    public int sAge;

    public Student(int sNo, String sName, int sAge) {
        this.sNo = sNo;
        this.sName = sName;
        this.sAge = sAge;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}