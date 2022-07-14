package model;

public class Rectangle extends Polygon {
   
   public double side;
   public double side2;
   
   public Rectangle() {
      super(4);
   }
   
   public Rectangle(double side, double side2) {
      super(4);
      this.side = side;
      this.side2 = side2;
   }
   
   public double getArea() {
      return side * side2;
   }
   
   public double getPerimeter() {
      return 2 * (side + side2); 
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " " + this.getArea() + " " + this.getPerimeter();
   }
   
}