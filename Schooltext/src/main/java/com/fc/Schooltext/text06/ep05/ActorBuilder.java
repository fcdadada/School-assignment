/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  20:48
 *文件名称                     :ActorBuilder.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep05;

public abstract class ActorBuilder {
    protected Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildMenu();
    public abstract void buildList();
    public abstract void buildBar();
    public abstract void buildStrip();
    public abstract void buildWindow();

    public Actor createActor() {
        return actor;
    }
}

   