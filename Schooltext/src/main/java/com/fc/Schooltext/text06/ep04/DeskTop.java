/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:47
 *文件名称                     :DeskTop.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public class DeskTop extends EquipBuilder{
    public void buildType() {
        equipment.setType("台式机");
    }
    public void buildCpu() {
        equipment.setCpu("AMD Ryzen 9 5900X");
    }

    @Override
    public void buildMemory() {
        equipment.setMemory("16GB");
    }

    @Override
    public void buildHc() {
        equipment.setHc(" 华硕  ");
    }

    @Override
    public void buildHd() {
        equipment.setHd("西数 SN550 1T M2 NVMe SSD");
    }

    @Override
    public void buildDd() {
        equipment.setDd("27英寸");
    }
}

   