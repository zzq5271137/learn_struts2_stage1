package com.mycomp.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

    public String add() {
        System.out.println("添加操作");
        return null;
    }

    public String delete() {
        System.out.println("删除操作");
        return null;
    }

    public String update() {
        System.out.println("更新操作");
        return null;
    }

    public String find() {
        System.out.println("查找操作");
        return null;
    }

}
