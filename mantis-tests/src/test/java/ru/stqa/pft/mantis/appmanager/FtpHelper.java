package ru.stqa.pft.mantis.appmanager;


import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FtpHelper {
  private final ApplicationManager app;
  private FTPClient ftp;

  //Создаётся ftp-клиент, который устанавливает соединение с сервером
  public FtpHelper(ApplicationManager app) {
    this.app = app;
    ftp = new FTPClient();
  }

  //Загружает новый файл и переименовывает старый
  public void upload(File file, String target, String backup) throws IOException {
    ftp.connect(app.getProperty("ftp.host"));
    ftp.login(app.getProperty("ftp.login"), app.getProperty("ftp.password"));
    //Удаляем предыдущую резервную копию
    ftp.deleteFile(backup);
    //Переименовываем файл настоящий - в название копии
    ftp.rename(target, backup);
    ftp.enterLocalPassiveMode();
    //Файл загружается на сервер и принимает нужное имя
    ftp.storeFile(target, new FileInputStream(file));
    ftp.disconnect();
  }

  //Восстанавливает старый файл (переименовывает)
  public void restore(String backup, String target) throws IOException  {
    ftp.connect(app.getProperty("ftp.host"));
    ftp.login(app.getProperty("ftp.login"), app.getProperty("ftp.password"));
    //Удаляем файл, который загрузили вначале
    ftp.deleteFile(target);
    //Восстанавливаем оригинальнй файл из резервной копии
    ftp.rename(backup, target);
    ftp.disconnect();
  }
}
