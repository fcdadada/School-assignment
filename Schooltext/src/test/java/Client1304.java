/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/11/5  8:53
 *文件名称                     :Client1304.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text13.ep04.AbstractDataFacade;
import com.fc.Schooltext.text13.ep04.XMLUtil;

public class Client1304 {
    public static void main(String[] args) {
        AbstractDataFacade df;
        df=(AbstractDataFacade) XMLUtil.getBean();
        df.achieve();
    }
}
