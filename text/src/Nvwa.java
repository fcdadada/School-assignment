import java.util.Scanner;

abstract  class Person{
    public abstract void methodDiff();

}

class ConcreteProductW extends Person{
    public void methodDiff(){
        System.out.println("Woman");
    }
}
class ConcreteProductM extends Person{
        public void methodDiff(){
            System.out.println("Man");
        }
}
class ConcreteProductR extends Person{
    public void methodDiff(){
        System.out.println("Robbit");
    }
}

public class Nvwa{
    public static Person getProduct(String arg){
        Person person=null;
        if(arg.equalsIgnoreCase("W")){
            person=new ConcreteProductW();
        }
        if(arg.equalsIgnoreCase("R")){
            person=new ConcreteProductR();
        }
        else if(arg.equalsIgnoreCase("M")){
            person=new ConcreteProductM();
        }
        return person;
    }
}
class Client {
   public static void main(String[] args){
      Person person;
      person=Nvwa.getProduct("M");
      person.methodDiff();
    }
}