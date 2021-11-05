/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  20:41
 *文件名称                     :Actor.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep05;

public class Actor {
    private String type;
    private String menu;//菜单
    private String list;//列表
    private String window;//主窗口
    private String strip;//控制条
    private String bar;//收藏条

    public void setType(String type) {
        this.type = type;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setStrip(String strip) {
        this.strip = strip;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getType() {
        return (this.type);
    }

    public String getBar() {
        return (this.bar);
    }

    public String getList() {
        return (this.list);
    }

    public String getMenu() {
        return (this.menu);
    }

    public String getStrip() {
        return (this.strip);
    }

    public String getWindow() {
        return (this.window);
    }
}

   