import java.io.*;
import java.time.LocalDate;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
      LocalDate today = LocalDate.now();
      bw.write(today + "\n");
      bw.flush();
      br.close();
      bw.close();
    }
}
