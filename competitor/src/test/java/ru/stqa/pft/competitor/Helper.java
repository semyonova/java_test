package ru.stqa.pft.competitor;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Helper {

  private final AppManager app;
  private final WebDriver wd;

  public Helper(AppManager app) {
    this.app = app;
    this.wd = app.getDriver();
  }

  //вход на сайт
  public void start() {
    wd.get(app.getProperty("web.baseUrl"));
  }

  //Получаем тарифы со страницы ОТС
  public ArrayList<Tariffs> getTariffOts() {

   ArrayList<Tariffs> tariffs = new ArrayList<>();

    WebElement table = wd.findElement(By.tagName("table"));

    List<WebElement> rows = table.findElements(By.tagName("tr"));

    //Находим каждую строку
    for (WebElement row : rows) {
      //System.out.println("");
     // System.out.println(row.getText());

      //Находим каждую ячейку
      List<WebElement> cells = row.findElements(By.tagName("td"));

      //Формируем объекты Тарифов с элементами ячеек
      if (cells.size() == 2) {
        Tariffs tariff = new Tariffs()
                .withCell1(cells.get(0).getText())
                .withCell2(cells.get(1).getText());
        tariffs.add(tariff);
        System.out.println(tariff);
      }
      if (cells.size() == 3) {
        Tariffs tariff = new Tariffs()
                .withCell1(cells.get(0).getText())
                .withCell2(cells.get(1).getText())
                .withCell3(cells.get(2).getText());
        tariffs.add(tariff);
        System.out.println(tariff);
      }
      if (cells.size() == 4) {
        Tariffs tariff = new Tariffs()
                .withCell1(cells.get(0).getText())
                .withCell2(cells.get(1).getText())
                .withCell3(cells.get(2).getText())
                .withCell4(cells.get(3).getText());
        tariffs.add(tariff);
        System.out.println(tariff);
      }
      if (cells.size() == 5) {
        Tariffs tariff = new Tariffs()
                .withCell1(cells.get(0).getText())
                .withCell2(cells.get(1).getText())
                .withCell3(cells.get(2).getText())
                .withCell4(cells.get(3).getText())
                .withCell5(cells.get(4).getText());
        tariffs.add(tariff);
        System.out.println(tariff);
      }
      if (cells.size() == 6 || cells.size() == 7) {
        Tariffs tariff = new Tariffs()
                .withCell1(cells.get(0).getText())
                .withCell2(cells.get(1).getText())
                .withCell3(cells.get(2).getText())
                .withCell4(cells.get(3).getText())
                .withCell5(cells.get(4).getText())
                .withCell6(cells.get(5).getText());
        tariffs.add(tariff);
        System.out.println(tariff);
      }
    }
    return tariffs;
   }

  //Записываем тарифы в файл Exel
  public void tariffToExel(ArrayList<Tariffs> tariffs) throws IOException {

    Workbook book = new HSSFWorkbook();
    Sheet sheet = book.createSheet("Тарифы");
    sheet.setColumnWidth((short)0, (short) (356*20));
    sheet.setColumnWidth((short)1, (short) (356*10));
    sheet.setColumnWidth((short)2, (short) (356*40));
    sheet.setColumnWidth((short)3, (short) (356*40));
    sheet.setColumnWidth((short)4, (short) (356*40));
    sheet.setColumnWidth((short)5, (short) (356*40));

    int m = 0;

    for(Tariffs tariff: tariffs) {
      Row row = sheet.createRow(m);
      row.createCell(0).setCellValue(app.getProperty("web.baseUrl"));
      row.createCell(1).setCellValue(tariff.getCell1());
      row.createCell(2).setCellValue(tariff.getCell2());
      row.createCell(3).setCellValue(tariff.getCell3());
      row.createCell(4).setCellValue(tariff.getCell4());
      row.createCell(5).setCellValue(tariff.getCell5());
      row.createCell(6).setCellValue(tariff.getCell6());
      m = m + 1;
    }



    book.write(new FileOutputStream("C:\\Users\\Evgeniya\\Downloads\\tariff.xls"));
    book.close();
  }
}

