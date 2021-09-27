/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/20  10:39
 *文件名称                     :DataClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text04.ep06.DataFactory;
import com.fc.Schooltext.text04.ep06.DataSource;
import com.fc.Schooltext.text04.ep06.XMLUtil;

public class Client0406 {
    public static void main(String[] args) {
        DataFactory  factory;
        DataSource ds;
        factory=(DataFactory) XMLUtil.getBean();
        ds= factory.createData();
        ds.display();

    }

}

   