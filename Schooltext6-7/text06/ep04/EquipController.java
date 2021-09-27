/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:35
 *文件名称                     :EquipController.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

public class EquipController {
    public Equipment construct(EquipBuilder eb){
        Equipment equipment;
        eb.buildType();
        eb.buildCpu();
        eb.buildMemory();
        eb.buildHc();
        eb.buildHd();
        eb.buildDd();
        equipment= eb.createEquipment();
        return equipment;
    }
}

   