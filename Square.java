package model;

public class Square extends Rectangle{
   
   public double side;

   public Square() {
      super();
   }
   
   public Square(double side) {
      super(side, side);
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