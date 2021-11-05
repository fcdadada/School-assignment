/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:30
 *文件名称                     :NoteBook.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public class NoteBook extends EquipBuilder{
    @Override
    public void buildType() {
        equipment.setType("笔记本");
    }
    public void buildCpu() {
        equipment.setCpu("i5-9300H");
    }

    @Override
    public void buildMemory() {
        equipment.setMemory("8GB");
    }

    @Override
    public void buildHc() {
        equipment.setHc("飞行堡垒7");
    }

    @Override
    public void buildHd() {
        equipment.setHd("机械硬盘");
    }

    @Override
    public void buildDd() {
        equipment.setDd("15.6英寸");
    }
}

   