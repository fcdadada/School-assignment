package second;

import second.*;

import java.util.Scanner;

public class Factory {
    public static Shape getShape(String type) throws UnsupportedShapeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要绘制的图形");
        type= sc.nextLine();
        Shape shape=null;
        if (type.equalsIgnoreCase("cirle")){
            shape=new Cirle();
            System.out.println("初始化设置圆形");
        }
        else if (type.equalsIgnoreCase("rectangle")){
            shape=new Rectangle();
            System.out.println("初始化设置矩形");
        }
        else if (type.equalsIgnoreCase("triangle")){
            shape=new Triangle();
            System.out.println("初始化设置三角形");
        }
        else {
            throw new UnsupportedShapeException("无法绘制该图形");
        }

        return shape;
    }
}
