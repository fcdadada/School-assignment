/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/20  10:04
 *文件名称                     :GraphClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text04.ep05.BarGraphFactory;
import com.fc.Schooltext.text04.ep05.CreatorFactory;
import com.fc.Schooltext.text04.ep05.Graph;
import com.fc.Schooltext.text04.ep05.XMLUtil;

public class Client0405 {
    public static void main(String[] args) {
    CreatorFactory factory;
    Graph graph;
    factory=(CreatorFactory) XMLUtil.getBean();
    graph=factory.createGraph();
    graph.display();
}
}

   