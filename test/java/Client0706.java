/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/27  19:15
 *文件名称                     :Client0706.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text07.ep06.Address;
import com.fc.Schooltext.text07.ep06.Customer;

public class Client0706 {
    public static void main(String[] args) {
        Customer cu1,cu2=null;
        cu1 =new Customer();
        Address address=new Address();
        cu1.setAddress(address);
      // 浅克隆
        //cu2=cu1.clone();
        try {
            cu2=cu1.deepClone();
        }
        catch (Exception e){
            System.out.println("克隆失败！");
        }

        System.out.println((cu1==cu2));
        System.out.println((cu1.getAddress()==cu2.getAddress()));
    }
}

   