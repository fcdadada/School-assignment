public class Cilent{
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

