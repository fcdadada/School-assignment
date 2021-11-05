/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:49
 *文件名称                     :ServerHost.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public class ServerHost extends EquipBuilder{
    public void buildType() {
        equipment.setType("服务器主机");
    }
    public void buildCpu() {
        equipment.setCpu("inter酷睿i9");
    }

    @Override
    public void buildMemory() {
        equipment.setMemory("16GB");
    }

    @Override
    public void buildHc() {
        equipment.setHc("技嘉");
    }

    @Override
    public void buildHd() {
        equipment.setHd("希捷Barracuda 3TB");
    }

    @Override
    public void buildDd() {
        equipment.setDd("无");
    }
}

   