/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  22:36
 *文件名称                     :Client0705.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text07.ep05.Archives;


public class Client0705 {
    public static void main(String[] args){
        Archives log_previous, log_new;
        log_previous = new Archives();
        log_new=log_previous.clone();
        System.out.println("" + (log_previous == log_new));
    }
}

   