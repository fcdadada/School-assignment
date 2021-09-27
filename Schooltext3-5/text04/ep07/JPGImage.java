/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/20  11:32
 *文件名称                     :JPGImage.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text04.ep07;

public class JPGImage implements ImageReader{
    @Override
    public Image createImage() {
        Image image=new JPG();
        return image;
    }
}

   