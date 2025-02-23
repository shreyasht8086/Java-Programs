// Q3. Fetch folder whose name start with m from particular path

import java.io.File;

public class Program3 {
  public static void main(String args[]) {
    File f = new File("D:\\Practice programs");
    File file[] = f.listFiles();

    for (int i = 0; i < file.length; i++) {
      if (file[i].getName().toLowerCase().startsWith("m")) {
        System.out.println(file[i]);
      }
    }
  }
}