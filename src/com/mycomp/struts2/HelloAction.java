package com.mycomp.struts2;

/*
 * Action类的三种写法:
 * 1. Action类是POJO的类(普通类), 自己手动实现execute方法 (也就是此类的这种写法)
 * 2. Action类实现一个Action接口 (详见HelloAction2.java)
 * 3. Action类继承ActionSupport类 (详见HelloAction3.java)
 */

public class HelloAction {

    public String execute() {
        System.out.println("hello from HelloAction...");
        return "success";
    }

}
