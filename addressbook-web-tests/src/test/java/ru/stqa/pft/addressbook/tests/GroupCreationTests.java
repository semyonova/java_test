package ru.stqa.pft.addressbook.tests;

import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.junit.MatcherAssert.assertThat;


public class GroupCreationTests extends BaseTest {

  @DataProvider
  public Iterator<Object[]> validGroups() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
    list.add(new Object[]{new GroupData().withName("name1").withHeader("header1").withFooter("footer1")});
    list.add(new Object[]{new GroupData().withName("name2").withHeader("header2").withFooter("footer2")});
    return list.iterator();
  }

  //Нужно ещё поизучать
  @DataProvider
  public Iterator<Object[]> validGroupsCsv() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.csv")));
    String line = reader.readLine();
    while (line != null) {
      String[] split = line.split(";");
      list.add(new Object[]{new GroupData().withName(split[0]).withHeader(split[1]).withFooter(split[2])});
      line = reader.readLine();
    }
    return list.iterator();
  }

  @DataProvider
  public Iterator<Object[]> validGroupsXml() throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/groups.xml")))){
    String line = reader.readLine();
      String xml = "";
      while (line != null) {
        xml += line;
        line = reader.readLine();
      }
      XStream xstream = new XStream();
      xstream.processAnnotations(GroupData.class);
      List<GroupData> groups = (List<GroupData>) xstream.fromXML(xml);
      return groups.stream().map((g) -> new Object[]{g}).collect(Collectors.toList()).iterator();
    }
  }


  @Test(dataProvider = "validGroupsXml")
  public void testGroupCreation(GroupData group) {
    app.goTo().groupPage();

    //Формируем список(массив) из элементов групп До теста
    Groups beforeGroup = app.db().groups();

    app.group().createGroup(group);

    //Проверяем количeство групп до и после выполнения теста
    Assert.assertThat(app.group().count(), equalTo(beforeGroup.size() + 1));

    //Формируем список(массив) из элементов групп ПОСЛЕ теста
    Groups afterGroup = app.db().groups();

    //Сравниваем множества ДО и ПОСЛЕ с использованием hamcrest
    assertThat(afterGroup, equalTo(
            beforeGroup.withAdded(group.withId(afterGroup.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
  }

}
