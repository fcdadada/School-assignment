/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  21:36
 *文件名称                     :DataSet.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text07.ep04;

import java.io.Serializable;

public class DataSet implements Serializable {
    private String  name;

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }
    public void download(){
        System.out.println("下载附件，文件名为"+name);
    }

}

   