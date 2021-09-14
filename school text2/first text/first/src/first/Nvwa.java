package first;

import first.Person;

public class Nvwa{
    public static Person getProduct(String arg){
        Person person=null;
        if(arg.equalsIgnoreCase("W")){
            person=new Woman();
        }
        if(arg.equalsIgnoreCase("R")){
            person=new Robbit();
        }
        else if(arg.equalsIgnoreCase("M")){
            person=new Man();
        }
        return person;
    }
}
