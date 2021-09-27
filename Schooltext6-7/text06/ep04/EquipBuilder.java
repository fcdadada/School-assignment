/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:24
 *文件名称                     :EquipBuilder.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public abstract class EquipBuilder {
    protected Equipment equipment=new Equipment();

    public abstract void buildType();
    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildHd();
    public abstract void buildHc();
    public abstract void buildDd();

    public Equipment createEquipment() {
        return equipment;
    }
}

   