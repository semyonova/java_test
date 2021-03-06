package ru.stqa.pft.addressbook.generators;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import ru.stqa.pft.addressbook.model.GroupData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GroupDataGenerator {

  public static void main(String[] args) throws IOException {
    int count = Integer.parseInt(args[0]);
    File file = new File(args[1]);
    String type = args[2];

    List<GroupData> groups = generateGroups(count);
    if (type.equals("csv")) {
      saveAsCsv(groups, file);
    }
    else if (type.equals("xml")) {
      saveAsXml(groups, file);
    }
    else if (type.equals("json")) {
      saveAsJson(groups, file);
    }
    else {
      System.out.println("Неверный формат файла");
    }
  }

  // Записываем сгенерированные данные в файл json
  private static void saveAsJson(List<GroupData> groups, File file) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
    String json = gson.toJson(groups);
    try (Writer writer = new FileWriter(file)) {
      writer.write(json);
    }
  }

  // Записываем сгенерированные данные в файл xml
  private static void saveAsXml(List<GroupData> groups, File file) throws IOException {
    XStream xstream = new XStream();
    xstream.processAnnotations(GroupData.class);
    String xml = xstream.toXML(groups);
    try (Writer writer = new FileWriter(file)) {
      writer.write(xml);
    }
  }

  // Записываем сгенерированные данные в файл csv
  private static void saveAsCsv(List<GroupData> groups, File file) throws IOException {

    try (Writer writer = new FileWriter(file)) {
      for (GroupData group : groups) {
        writer.write(String.format("%s;%s;%s\n", group.getName(), group.getHeader(), group.getFooter()));
      }
    }
  }

  // Генерируем тестовые данные
  private static List<GroupData> generateGroups(int count) {
    List<GroupData> groups = new ArrayList<>();
    for (int i = 0; i < count; i++){
      groups.add(new GroupData()
              .withName(String.format("test %s", i))
              .withHeader(String.format("header %s", i))
              .withFooter(String.format("footer %s", i)));
    }
    return groups;
  }

}
