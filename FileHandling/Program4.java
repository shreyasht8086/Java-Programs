// Fetch file whose extension is .doc or .txt

import java.io.File;

public class Program4 {
  public static void main(String args[]) {
    File f = new File("D:\\Practice programs");
    File file[] = f.listFiles();

    for (int i = 0; i < file.length; i++) {
      if (file[i].getName().toLowerCase().endsWith(".doc") || file[i].getName().toLowerCase().endsWith(".txt")) {
        System.out.println(file[i]);
      }
    }
  }
}