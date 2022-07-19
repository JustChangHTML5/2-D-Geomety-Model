package model;

public class Square extends Rectangle {

   public Square() {
      super();
   }
   
   public Square(double side) {
      super(side, side);
   }
   
   public double getSide() {
      return super.side;
   }
   
   public void setSide(double side) {
      super.side = side;
      super.side2 = side;
   }
}