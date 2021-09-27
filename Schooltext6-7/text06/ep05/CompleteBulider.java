/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  20:51
 *文件名称                     :CompleteBulider.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep05;

public class CompleteBulider extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("完整模式:");
    }

    @Override
    public void buildBar() {
       actor.setBar("收藏条");
    }

    @Override
    public void buildList() {
      actor.setList("播放列表");
    }

    @Override
    public void buildMenu() {
        actor.setMenu("菜单");
    }

    @Override
    public void buildStrip() {
        actor.setStrip("控制条");
    }

    @Override
    public void buildWindow() {
        actor.setWindow("主窗口");
    }
}

   