
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld 
{
    public static void main(String[] args) {
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      String data = formatter.format(date).toString();

      try {
        File file = new File("c:/temp/files.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write(data + "\n");
        fr.close();
      } 
      catch (IOException e) {
        e.printStackTrace();
      }
  } 
}
