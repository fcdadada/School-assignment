/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  10:45
 *文件名称                     :Client2.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
import com.fc.cn.tx05.xt04.Factory;
import com.fc.cn.tx05.xt04.AirConditioner;
import com.fc.cn.tx05.xt04.TV;
import com.fc.cn.tx05.xt04.XMLUtil;



public class Client2 {
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

   