/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:39
 *文件名称                     :EquipClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text06.ep04.EquipBuilder;
import com.fc.Schooltext.text06.ep04.EquipController;
import com.fc.Schooltext.text06.ep04.Equipment;
import com.fc.Schooltext.text06.ep04.XMLUtil;

public class Client0604 {
    public static void main(String[] args) {
        EquipBuilder eb;
        eb=(EquipBuilder) XMLUtil.getBean();

        EquipController ec=new EquipController();
        Equipment equipment;
        equipment= ec.construct(eb);

        String type=equipment.getType();
        System.out.println(type+"的硬件设备:");
        System.out.println("CPU:"+equipment.getCpu());
        System.out.println("内存:"+equipment.getMemory());
        System.out.println("硬盘:"+equipment.getHd());
        System.out.println("主机:"+equipment.getHc());
        System.out.println("显示器:"+equipment.getDd());
    }
}

   