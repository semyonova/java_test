package ru.stqa.pft.sandbox;

import static java.lang.Math.pow;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(25, 2);
    Point p2 = new Point(3, 4);
    System.out.print(distance(p1, p2));
  }

  public static double distance(Point p1, Point p2) {
    double d;
    d = Math.sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2));
    return d;
  }
}



