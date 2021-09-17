/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  21:21
 *文件名称                     :CarClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text04.ep04.*;

public class CarClient {
    public static void main(String[] args) {
        CarFactory factory;
        Car car;
       factory= (CarFactory) XMLUtil.getBean();
        car=factory.createcar();
        car.display();

    }
}

   