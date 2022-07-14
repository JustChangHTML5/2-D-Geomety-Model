package model;
import java.lang.Math;

public class Ellipse extends Shape {
   
   public double axis1;
   public double axis2;
   
   public Ellipse() {
      super();
   }
   
   public Ellipse(double axis1, double axis2) {
      super();
      this.axis1 = axis1;
      this.axis2 = axis2;
   }
   
   public double getArea() {
      return axis1 * axis2 * Math.PI;
   }
   
   public double getPerimeter() {
      return Math.PI * (3 * (axis1 + axis2) - Math.sqrt((3 * axis1 + axis2) * (axis1 + 3 * axis2))); 
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " " + this.getArea() + " " + this.getPerimeter();
   }
   
}