/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/26  19:05
 *文件名称                     :XMLUtil.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */
package com.fc.Schooltext.text06.ep04;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(){
        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= dFactory.newDocumentBuilder();
            Document doc;
            doc= builder.
                    parse(new File("src//main//java//com//fc//Schooltext//text06//ep04//config.xml"));

            NodeList nl= doc.getElementsByTagName("className");
            Node classNode= nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            Class c=Class.forName(cName);
            Object obj=c.newInstance();
            return obj;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

   