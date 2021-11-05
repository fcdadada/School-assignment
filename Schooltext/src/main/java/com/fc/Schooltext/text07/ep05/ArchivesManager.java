/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  22:56
 *文件名称                     :ArchivesManager.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text07.ep05;

import java.util.Hashtable;

public class ArchivesManager {
    private Hashtable archivesTable=new Hashtable();
    public void add(String key,Archives archives){
        archivesTable.put(key,archives);
    }

    public Archives get(String key){
        Archives clone=null;
        clone=((Archives) archivesTable.get(key)).clone();
        return clone;
    }
}

   