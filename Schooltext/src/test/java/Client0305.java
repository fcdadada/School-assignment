/*
 *开发团队                     :fc开发团队
 *开发团队领导                  :fangcun
 *开发人员姓名                  :fangcun
 *开发人员学号                  :2019110505
 *个人邮箱                     :fc20001126@163.com
 *开发时间                     :2021/9/17  21:01
 *文件名称                     :ShapeClient.java
 *开发工具                     :IntelliJ IDEA
 *开发系统当前用户               :86138
 */

import com.fc.Schooltext.text03.ep05.Shape;
import com.fc.Schooltext.text03.ep05.ShapeFactory;
import com.fc.Schooltext.text03.ep05.UnsupportedShapeException;

public class Client0305 {
    public static void main(String[] args){
        try {

            Shape shape;
            shape = ShapeFactory.getShape("type");
            shape.draw();
            shape.erase();
        }

        catch(UnsupportedShapeException e){
            System.out.println(e.getMessage());

        }
    }
}

   