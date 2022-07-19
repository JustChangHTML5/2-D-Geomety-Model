import model.Shape;
import model.Polygon;
import model.Rectangle;
import model.Square;
import model.Triangle;
import model.Ellipse;
import model.Circle;

public class Geometry {
   
   public static void main(String args[]) {
      if (args[0].equals("Square")) {
         Square square = new Square(Integer.parseInt(args[1]));
         System.out.println(square.toString());
      }
      
      if (args[0].equals("Rectangle")) {
         Rectangle rectangle = new Rectangle(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
         System.out.println(rectangle.toString());
      }
      
      if (args[0].equals("Triangle")) {
         Triangle triangle = new Triangle(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
         System.out.println(triangle.toString());
      }
      
      if (args[0].equals("Circle")) {   
         Circle circle = new Circle(Integer.parseInt(args[1]));
         System.out.println(circle.toString());
      }
      
      if (args[0].equals("Ellipse")) {
         Ellipse ellipse = new Ellipse(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
         System.out.println(ellipse.toString());
      }
   }
}