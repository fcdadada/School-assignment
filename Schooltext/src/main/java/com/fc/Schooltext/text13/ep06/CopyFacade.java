/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/11/5  9:12
 *文件名称                     :CopyFacade.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text13.ep06;

public class CopyFacade {
    private AddressList ad=new AddressList();
    private Music ms=new Music();
    private Photograph pg=new Photograph();
    private SMS sms=new SMS();
    public void achive(){
        ad.copy();
        ms.copy();
        pg.copy();
        sms.copy();
    }
}
