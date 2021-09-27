/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  13:10
 *文件名称                     :WindowsPhoneFactory.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text05.ep06;

public class WindowsPhoneFactory extends SystemFactory{
    public InterfaceController createInterfaceController() {
        return new AndroidIterface();
    }

    @Override
    public OperationController createOperationController() {
        return new AndroidOperation();
    }
}

   