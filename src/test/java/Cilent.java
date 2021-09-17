/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  8:47
 *文件名称                     :Cilent.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.cn.tx04.xt04.BMWFactory;
import com.fc.cn.tx04.xt04.BenzFactory;
import com.fc.cn.tx04.xt04.Car;
import com.fc.cn.tx04.xt04.Factory;

public class Cilent {
    public static void main(String[] args) {
        Car car;
        Factory factory;
        factory = new BMWFactory();
        car=factory.creatFactory();
        car.creatCar();
    }
}

   