import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateTimeToFile 
{
  public static void main(String[] args) {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String data = formatter.format(new Date()).toString();

    try {
      FileWriter fr = new FileWriter(new File("c:/temp/files.txt"), true);
      fr.write(data + "\n");
      fr.close();
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
  } 
}
