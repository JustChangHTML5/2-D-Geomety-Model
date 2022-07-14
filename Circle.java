package model;

public class Circle extends Ellipse{
   
   public double radius;

   public Circle() {
      super();
   }
   
   public Circle(double radius) {
      super(radius, radius);
   }
   
   public double getArea() {
      return super.getArea();
   }
   
   public double getPerimeter() {
      return super.getPerimeter();
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " " + this.getArea() + " " + this.getPerimeter();
   }
}