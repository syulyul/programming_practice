import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\nMM\ndd");
    bw.write(date.format(formatter) + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}