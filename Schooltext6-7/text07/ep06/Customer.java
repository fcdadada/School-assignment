/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  23:13
 *文件名称                     :Customer.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */


package com.fc.Schooltext.text07.ep06;


import java.io.*;

public class Customer implements Cloneable,Serializable{
    private Address address;
    private String name;

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return (this.address);
    }

    public String getName() {
        return (this.name);
    }
/*
    //使用clone（）方法实现浅克隆
    public Customer clone(){
        Object obj=null;
        try{
            obj=super.clone();
            return (Customer) obj;
        }
        catch (CloneNotSupportedException e){
            System.out.println("不支持复制");
            return null;
        }
    }
*/
    //使用序列化技术实现深克隆
    public Customer deepClone() throws IOException,ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return(Customer) ois.readObject();

    }
}

   