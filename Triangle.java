package model;
import java.lang.Math;

public class Triangle extends Polygon {
   public double side1;
   public double side2;
   public double side3;
   
   public Triangle() {
      super(3);
   }
   
   public Triangle(double side1, double side2, double side3) {
      super(3);
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   
   public double getArea() {
      double s = (this.side1 + this.side2 + this.side3) / 2;
      return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
   }
   
   public double getPerimeter() {
      return this.side1 + this.side2 + this.side3;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " " + this.getArea() + " " + this.getPerimeter();
   }
}