/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  22:21
 *文件名称                     :Data.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text09.ep08;

public abstract class Data {

        //目标抽象类
        private String password;

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        //加密
        public abstract String doEnctypt();
    }

