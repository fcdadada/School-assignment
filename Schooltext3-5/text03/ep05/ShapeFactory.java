/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  21:01
 *文件名称                     :ShapeFactory.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text03.ep05;

import java.util.Scanner;

public class ShapeFactory {
    public static Shape getShape(String type) throws UnsupportedShapeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要绘制的图形");
        type= sc.nextLine();
        Shape shape=null;
        if (type.equalsIgnoreCase("circle")){
            shape=new Circle();
            System.out.println("初始化设置圆形");
        }
        else if (type.equalsIgnoreCase("rectangle")){
            shape=new Rectangle();
            System.out.println("初始化设置矩形");
        }
        else if (type.equalsIgnoreCase("triangle")){
            shape=new Triangle();
            System.out.println("初始化设置三角形");
        }
        else {
            throw new UnsupportedShapeException("无法绘制该图形");
        }

        return shape;
    }
}

   