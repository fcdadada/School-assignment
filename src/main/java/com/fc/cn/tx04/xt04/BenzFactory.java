/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  8:39
 *文件名称                     :BenzFactory.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.cn.tx04.xt04;

public class BenzFactory implements Factory {
    @Override
    public Car creatFactory() {
        Car car=new BenzCar();
        return car;
    }
}

   