/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/22  23:21
 *文件名称                     :ServerClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text05.ep05.Connection;
import com.fc.Schooltext.text05.ep05.ServerFactory;
import com.fc.Schooltext.text05.ep05.XMLUtil;

public class ServerClient {
    public static void main(String[] args) {
        ServerFactory factory;
        Connection Cn;
        factory= (ServerFactory)  XMLUtil.getBean();
        Cn=factory.createConnection();
        Cn.connect();
    }
}

   