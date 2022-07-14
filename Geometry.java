import model.Shape;
import model.Polygon;
import model.Rectangle;
import model.Square;
import model.Triangle;
import model.Ellipse;
import model.Circle;

public class Geometry {
   
   public static void main(String args[]) {
      Square square = new Square(10);
      System.out.println(square.toString());
      Rectangle rectangle = new Rectangle(20, 30);
      System.out.println(rectangle.toString());
      Triangle triangle = new Triangle(30, 40, 50);
      System.out.println(triangle.toString());
      Circle circle = new Circle(15);
      System.out.println(circle.toString());
      Ellipse ellipse = new Ellipse(20, 15);
      System.out.println(ellipse.toString());
   }
}