/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  20:52
 *文件名称                     :Adapter.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text09.ep06;

public class Adapter implements Cat,Dog{
    private Dog dog;
    private Cat cat;

    public Adapter(Cat cat) {
        this.cat = cat;
    }

    public Adapter(Dog dog) {
        this.dog = dog;
    }
    public void catn(){
        dog.dogn();
    }
    public void catchMouse(){
        dog.cry();
    }
    public void cry(){
        cat.catchMouse();
    }
    public void dogn(){
        cat.catn();
    }


}
