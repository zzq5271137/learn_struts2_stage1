package com.mycomp.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        System.out.println("hello from HelloAction3...");
        return SUCCESS;
    }


}
