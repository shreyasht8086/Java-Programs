// Q6. Fetch files whose extension is .png or jpeg etc

import java.io.File;

public class Program6 {
  public static void main(String[] args) {
    File f = new File("D:\\Practice programs");
    File file[] = f.listFiles();

    for (int i = 0; i < file.length; i++) {
      if (file[i].getName().toLowerCase().endsWith(".png") || file[i].getName().toLowerCase().endsWith(".jpeg")) {
        System.out.println(file[i]);
      }
    }
  }

}