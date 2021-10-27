/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  22:23
 *文件名称                     :CiperAp.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text09.ep08;

public class CiperAp extends Data{
    private final Ciper ciper;

    public CiperAp() {
        ciper = new Ciper();
    }

    //有参构造方法
    public CiperAp(Ciper ciper) {
        super();
        this.ciper = ciper;
    }

    @Override
    public String doEnctypt() {
        return ciper.doEncrypt();
    }
}
