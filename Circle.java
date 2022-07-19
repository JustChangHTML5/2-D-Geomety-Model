package model;

public class Circle extends Ellipse {
   
   public double radius;

   public Circle() {
      super();
   }
   
   public Circle(double radius) {
      super(radius, radius);
   }
   
   public double getRadius() {
      return super.axis1;
   }
   
   public void setRadius(double radius) {
      super.axis1 = radius;
      super.axis2 = radius;
   }
}