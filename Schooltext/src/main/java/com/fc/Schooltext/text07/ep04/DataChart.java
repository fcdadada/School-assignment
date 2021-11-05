/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  21:33
 *文件名称                     :DataChart.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text07.ep04;

import com.fc.Schooltext.text05.ep06.OperationController;

import java.io.*;

public class DataChart implements Serializable {
    private DataSet dataSet;
    private String name;
    public int number;
    public String color;
    public int data;

    public void setDataSet(DataSet dataSet){
        this.dataSet=dataSet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(){
        this.number=number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return (this.name);
    }

    public DataSet getDataSet() {
        return (this.dataSet);
    }

    public int getData() {
        return (this.data);
    }

    public int getNumber() {
        return (this.number);
    }

    public String getColor() {
        return (this.color);
    }

    public DataChart deepClone() throws IOException,ClassNotFoundException, OptionalDataException{
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return(DataChart) ois.readObject();

    }
}

   