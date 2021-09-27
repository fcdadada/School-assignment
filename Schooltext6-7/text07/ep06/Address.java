/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/27  19:04
 *文件名称                     :Address.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text07.ep06;

import java.io.Serializable;

public class Address implements Serializable {
    private String add;

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return (this.add);
    }
}

   