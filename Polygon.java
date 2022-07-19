package model;

public abstract class Polygon extends Shape{
   
   public double[] sides;
   
   public Polygon() {
      super();
   }
   
   public Polygon(int size) {
      super();
      sides = new double[size];
   }
   
   /*@Override
   public double computePerimeter() {
      
   }*/
   
   @Override
   public String toString() {
      return super.toString() + "size: " + sides.length;
      
   }
}