/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:13
 *文件名称                     :Equipment.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public class Equipment {
    private String type;//类型
    private String cpu;
    private String memory;//内存
    private String hd;//硬盘
    private String hc;//主机
    private String dd;//显示器


    public void setType(String type) {
        this.type = type;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getCpu() {
        return (this.cpu);
    }

    public String getDd() {
        return (this.dd);
    }

    public String getHc() {
        return (this.hc);
    }

    public String getHd() {
        return (this.hd);
    }

    public String getMemory() {
        return (this.memory);
    }

    public String getType() {
        return (this.type);
    }
}

   