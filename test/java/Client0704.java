/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  21:58
 *文件名称                     :Client0704.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text07.ep04.DataChart;
import com.fc.Schooltext.text07.ep04.DataSet;

import java.io.IOException;

public class Client0704 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataChart log_previous, log_new = null;
        log_previous = new DataChart();
        DataSet dataSet = new DataSet();
        log_previous.setDataSet(dataSet);
        try {
            log_new = log_previous.deepClone();
        } catch (Exception e) {
            System.err.println("克隆失败");
        }
        System.out.println("" + (log_previous == log_new));
        System.out.println("" + (log_previous.getDataSet() == log_new.getDataSet()));
    }
}

   