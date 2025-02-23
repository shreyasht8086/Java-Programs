import java.io.*;

public class Program7 {
  public static void main(String x[]) throws IOException {
    File file = new File("D:\\ABC");
    System.out.println(file.getName());
    File f[] = file.listFiles();
    for (int i = 0; i < f.length; i++) {
      if (f[i].isFile()) {
        System.out.println(f[i].getName());
        System.out.println("-----------------------------------------------------------------------------------");
      } else if (f[i].isDirectory()) {
        System.out.println(f[i].getName());
        System.out.println("-----------------------------------------------------------------------------------");
        File subFile[] = f[i].listFiles();
        for (int j = 0; j < subFile.length; j++) {
          System.out.println(subFile[i].getName());
        }
        System.out.println("-----------------------------------------------------------------------------------");
      } else {
        System.out.println("No Directory Found ");
      }
    }

  }

}
