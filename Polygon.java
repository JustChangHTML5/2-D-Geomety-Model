package model;

public abstract class Polygon extends Shape{
   
   public int sides;
   
   public Polygon() {
      super();
   }
   
   public Polygon(int sides) {
      super();
      this.sides = sides;
   }
}