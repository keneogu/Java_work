package File;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  
  public static void main(String[] args) {
    File file = new File("C:\\Users\\Administrator\\Documents\\java\\kene\\Controller\\File\\secret-message.txt");
    FileWriter writer;
    FileReader reader;

    try {
      reader = new FileReader("poem.txt");
      int data = reader.read();
      while(data != -1) {
        System.out.print((char)data);
        data = reader.read();
      }
      reader.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }

    try {
      writer = new FileWriter("poem.txt");
      writer.write("Roses are red");
      writer.append("\n God is good");
      writer.close();
    }catch(IOException e) {
      e.printStackTrace();
    }

    if(file.exists()){
      System.out.println("the file exists");
      System.out.println(file.getPath());
      System.out.println(file.getAbsolutePath());
      System.out.println(file.isFile());
      file.delete();
    }else{
      System.out.println("The file doesn't exists");
    }
  }
}
