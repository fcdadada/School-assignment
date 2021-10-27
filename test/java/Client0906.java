/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/15  8:17
 *文件名称                     :Client0906.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text09.ep06.*;

public class Client0906 {
    public static void main(String[] args) {
        Cat cat;
        cat = new Adapter(new ConcreteDog());
        cat.catn();
        cat.catchMouse();



        Dog dog;
        dog = new Adapter(new ConcreteCat());
        dog.dogn();
        dog.cry();

    }
}

   