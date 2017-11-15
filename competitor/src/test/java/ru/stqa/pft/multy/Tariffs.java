package ru.stqa.pft.multy;

public class Tariffs {

  public String cell1;
  public String cell2;
  public String cell3;
  public String cell4;
  public String cell5;
  public String cell6;


  public String getCell2() {
    return cell2;
  }

  public Tariffs withCell2(String price) {
    this.cell2 = price;
    return this;
  }

  public String getCell3() {
    return cell3;
  }

  public Tariffs withCell3(String cell3) {
    this.cell3 = cell3;
    return  this;
  }

  public String getCell4() {
    return cell4;
  }

  public Tariffs withCell4(String buy) {
    this.cell4 = buy;
    return this;
  }

  public String getCell1() {
    return cell1;
  }

  public Tariffs withCell1(String name) {
    this.cell1 = name;
    return this;
  }

  public String getCell5() {
    return cell5;
  }

  public Tariffs withCell5(String price) {
    this.cell5 = price;
    return this;
  }

  public String getCell6() {
    return cell6;
  }

  public Tariffs withCell6(String price) {
    this.cell6 = price;
    return this;
  }


  @Override
  public String toString() {
    return "Tariffs{" +
            "cell1='" + cell1 + '\'' +
            ", cell2='" + cell2 + '\'' +
            ", cell3='" + cell3 + '\'' +
            ", cell4='" + cell4 + '\'' +
            ", cell5='" + cell5 + '\'' +
            ", cell6='" + cell6 + '\'' +
            '}';
  }
}
