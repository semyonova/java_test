package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Евгения on 17.09.2016.
 */
public class PointTests {

  @Test
  public void TestDistancePlus(){
    Point table1 = new Point(1,1);
    Point table2 = new Point(1,2);
    Assert.assertEquals(table1.distance(table2), 1.0);
  }

  @Test
  public void TestDistanceZero(){
    Point table1 = new Point(0,0);
    Point table2 = new Point(0,0);
    Assert.assertEquals(table1.distance(table2), 3.0);
  }

  @Test
  public void TestDistanceMinus() {
    Point table1 = new Point(-4, -1);
    Point table2 = new Point(-4, -4);
    Assert.assertEquals(table1.distance(table2), 3.0);
  }

  @Test
  public void TestDistanceMinusPlus() {
    Point table1 = new Point(-4, 0);
    Point table2 = new Point(4, 0);
    Assert.assertEquals(table1.distance(table2), 8.0);
  }
}
