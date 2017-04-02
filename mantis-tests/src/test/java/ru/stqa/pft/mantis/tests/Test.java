package ru.stqa.pft.mantis.tests;


import org.testng.annotations.BeforeMethod;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class Test extends BaseTest {

  @BeforeMethod
  public void test1() throws RemoteException, ServiceException, MalformedURLException {
    skipIfNotFixed(0000001);
  }

  @org.testng.annotations.Test
  public void test() throws RemoteException, ServiceException, MalformedURLException {
    skipIfNotFixed(0000007);
  }


}
