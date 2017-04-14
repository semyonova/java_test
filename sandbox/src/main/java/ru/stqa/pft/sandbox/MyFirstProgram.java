package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p = new Point(3, 4);
    Point p1 = new Point(3, 2);
    System.out.println(p.distance(p1));

    //Пример использования метода
    Point house = new Point(20, 40);
    Point cat = new Point(20, 50);
    System.out.println("Расстояние от дома до котa " + house.distance(cat) + " пунктов");
  }
}



