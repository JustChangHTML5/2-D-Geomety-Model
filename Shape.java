package model;

public abstract class Shape {
   public Shape() {
   
   }
   public abstract double getArea();
   public abstract double getPerimeter();
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " " + this.getArea() + " " + this.getPerimeter();
   }
}