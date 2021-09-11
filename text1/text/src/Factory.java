import java.util.Scanner;
//抽象产品
 interface Shape{
    public void draw();
    public void erase();
}
//圆形
 class Cirle implements Shape{
    public void draw(){
        System.out.println("绘制圆形");
    }
    public void erase(){
        System.out.println("擦除圆形");
    }
}
//矩形
 class Rectangle implements Shape{
    public void draw(){
        System.out.println("绘制矩形");
    }
    public void erase(){
        System.out.println("擦除矩形");
    }

}
//三角形
 class Triangle implements Shape{
     public void draw(){
         System.out.println("绘制三角形");
     }
     public void erase(){
         System.out.println("擦除三角形");
     }
}

//工厂
public class Factory {
    public static Shape getShape(String type) throws UnsupportedShapeException{
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
//异常
class  UnsupportedShapeException extends Exception{
    public UnsupportedShapeException(String message){
        super(message);
    }

}

 class Cilent{
    public static void main(String[] args){
        try {

            Shape shape;
            shape = Factory.getShape("type");
            shape.draw();
            shape.erase();
        }

      catch(UnsupportedShapeException e){
          System.out.println(e.getMessage());

        }
    }
}
