/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  22:49
 *文件名称                     :MediaRun.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text09.ep07;

public  class MediaRun implements Run{
    @Override
    public void run() {
        System.out.println("运行Media");
    }
    private MediaAPI mediaAPI;

    public MediaRun(){
        mediaAPI=new MediaAPI();
    }

    public void display(){
       mediaAPI.api();
    }
}
