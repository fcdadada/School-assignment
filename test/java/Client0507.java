/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  18:54
 *文件名称                     :OperateClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text05.ep07.Button;
import com.fc.Schooltext.text05.ep07.OperateFactory;
import com.fc.Schooltext.text05.ep07.Text;
import com.fc.Schooltext.text05.ep07.XMLUtil;

public class Client0507 {
    public static void main(String[] args) {
        OperateFactory factory;
        Button bu;
        Text tx;
        factory=(OperateFactory) XMLUtil.getBean();
        bu= factory.createButton();
        tx=factory.createText();
        bu.display();
        tx.dispaly();
    }


}

   