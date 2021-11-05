/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  21:47
 *文件名称                     :equipmentClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text05.ep04.XMLUtil;
import com.fc.Schooltext.text05.ep04.AirConditioner;
import com.fc.Schooltext.text05.ep04.Factory;
import com.fc.Schooltext.text05.ep04.TV;

public class Client0504 {
    public static void main(String[] args) {
        Factory factory;
        TV tv;
        AirConditioner  ac;
        factory=(Factory) XMLUtil.getBean();
        tv= factory.createTV();
        ac= factory.createAirConditioner();
        tv.dispaly();
        ac.display();
    }
}

   