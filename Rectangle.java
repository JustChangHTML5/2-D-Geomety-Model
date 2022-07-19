package model;

public class Rectangle extends Polygon {
   
   public Rectangle() {
      super(4);
   }
   
   public Rectangle(double side, double side2) {
      super(4);
      this.sides[0] = side;
      this.sides[1] = side2;
      this.sides[2] = side;
      this.sides[3] = side2;
   }
   
   @Override
   public double getArea() {
      return this.sides[0] * this.sides[1];
   }
   
   @Override
   public double getPerimeter() {
      return 2 * (this.sides[0] + this.sides[1]); 
   }
   
   @Override
   public String toString() {
      return super.toString() + " " + this.getWidth() + " " + this.getHeight();
   }
   
   public double getWidth() {
      return this.sides[0];
   }
   
   public double getHeight() {
      return this.sides[1];
   }
   
}