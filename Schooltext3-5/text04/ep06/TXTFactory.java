/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/20  10:27
 *文件名称                     :TXTFactory.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text04.ep06;

public class TXTFactory implements DataFactory{
    @Override
    public DataSource createData() {
        DataSource dataSource=new TXT();
        System.out.println("初始化");
        System.out.println("创建");
        return dataSource;
    }
}

   