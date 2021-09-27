/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  22:51
 *文件名称                     :Archives.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text07.ep05;

public class Archives implements Cloneable{
    private String name;
    private String data;

    public void setName(String name){
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return (this.name);
    }

    public String getData() {
        return (this.data);
    }

    public Archives clone(){
        Object obj=null;
        try{
            obj=super.clone();
            return (Archives) obj;
        }
        catch (CloneNotSupportedException e){
            System.out.println("不支持复制");
            return null;
        }
    }
}

   