package com.accp.sprintboot002.pojo;

import java.util.List;

public class Itemtype {
    private Integer typeid;

    private String typename;

    private List<Peitem> list;

    public List<Peitem> getList() {
        return list;
    }

    public void setList(List<Peitem> list) {
        this.list = list;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}