/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/20  10:06
 *文件名称                     :CurveGraphFactory.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text04.ep05;

public class CurveGraphFactory implements CreatorFactory{
    public Graph createGraph() {
        Graph graph=new CurveGraph();
        return graph;
    }
}

   