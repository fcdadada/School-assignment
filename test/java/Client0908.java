/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/10/27  22:24
 *文件名称                     :Client0908.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text09.ep08.CiperAp;
import com.fc.Schooltext.text09.ep08.Data;

public class Client0908 {
    public static void main(String[] args) {
        // write your code here
        Data data = new CiperAp();
        data.setPassword("000000");
        String psd = data.getPassword();
        String str = data.doEnctypt();
        System.out.println("password："+psd);
        System.out.println(str);
    }
}
