package com.accp.sprintboot002.pojo;

import java.util.Date;

public class Student {
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", grade='" + grade + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", tel='" + tel + '\'' +
                ", job=" + job +
                '}';
    }

    public Student(String code, String name, Integer major, String grade, Integer sex, Date birthday, String tel, Integer job) {
        this.code = code;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.sex = sex;
        this.birthday = birthday;
        this.tel = tel;
        this.job = job;
    }

    private Integer id;

    private String code;

    private String name;

    private Integer major;

    private String grade;

    private Integer sex;

    private Date birthday;

    private String tel;

    private Integer job;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }
}