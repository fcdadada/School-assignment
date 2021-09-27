/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  12:26
 *文件名称                     :SystemClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text05.ep06.InterfaceController;
import com.fc.Schooltext.text05.ep06.OperationController;
import com.fc.Schooltext.text05.ep06.SystemFactory;
import com.fc.Schooltext.text05.ep06.XMLUtil;

public class SystemClient {
    public static void main(String[] args) {
        SystemFactory factory;
        InterfaceController ifc;
        OperationController oc;
        factory=(SystemFactory) XMLUtil.getBean();
        oc=factory.createOperationController();
        ifc=factory.createInterfaceController();
        ifc.interfa();
        oc.operat();
   }


}

   