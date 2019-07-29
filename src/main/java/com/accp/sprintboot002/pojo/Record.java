package com.accp.sprintboot002.pojo;

import java.util.Date;

public class Record {
    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stucode='" + stucode + '\'' +
                ", createdate=" + createdate +
                ", createby='" + createby + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public Record(String name, String stucode, Date createdate, String createby, String des) {
        this.name = name;
        this.stucode = stucode;
        this.createdate = createdate;
        this.createby = createby;
        this.des = des;
    }

    public Record() {
    }

    private Integer id;

    private String name;

    private String stucode;

    private Date createdate;

    private String createby;

    private String des;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }
}