package model;
import java.lang.Math;

public class Triangle extends Polygon {
   
   public Triangle() {
      super(3);
   }
   
   public Triangle(double side1, double side2, double side3) {
      super(3);
      this.sides[0] = side1;
      this.sides[1] = side2;
      this.sides[2] = side3;
   }
   
   @Override
   public double getArea() {
      double s = (this.sides[0] + this.sides[1] + this.sides[3]) / 2;
      return Math.sqrt(s*(s-this.sides[0])*(s-this.sides[1])*(s-this.sides[2]));
   }
   
   @Override
   public double getPerimeter() {
      return this.sides[0] + this.sides[1] + this.sides[2];
   }
   
   @Override
   public String toString() {
      return super.toString() + " " + this.sides[0] + " " + this.sides[1] + " " + this.sides[2];
   }
}