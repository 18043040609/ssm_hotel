package com.bdqn.entity;

import java.util.Date;

public class Dept {
    private Integer id;
    private String deptName;
    private String address;
    private Date createDate;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static void main(String[] args) {
        System.out.println("hello,git");
        System.out.println("hello,git2");
        System.out.println("hello,git3");
        System.out.println("master test!");
        System.out.println("hot-fix test!");
        System.out.println("push test!");
        System.out.println("pull test!");
    }
}
