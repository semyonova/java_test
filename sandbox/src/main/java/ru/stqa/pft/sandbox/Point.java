package ru.stqa.pft.sandbox;

import static java.lang.Math.pow;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y){
  this.x=x;
  this.y=y;
}

  public double distance(Point p1) {
    double d;
    d = Math.sqrt(pow((this.x - p1.x), 2) + pow((this.y - p1.y), 2));
    return d;
  }

}
