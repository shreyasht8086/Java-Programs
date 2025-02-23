//Q5. Fetch file whose size is more than 2kb?

import java.io.File;

public class Program5 {
  public static void main(String args[]) {
    File f = new File("D:\\Practice programs");
    File file[] = f.listFiles();

    for (int i = 0; i < file.length; i++) {
      if (file[i].length() > 2048) {
        System.out.println(file[i]);
      }
    }

  }
}