/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/11/5  8:58
 *文件名称                     :NewDataFacade.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text13.ep04;

public class NewDataFacade extends AbstractDataFacade{
    private DP dp=new DP();
    private ReportShows rp=new ReportShows();
    public void achieve(){
        dp.processing();
        rp.shows();
    }
}
