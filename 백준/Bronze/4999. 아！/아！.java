import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws Exception {
      String doctorAh = br.readLine();
      String patientAh = br.readLine();

      if (patientAh.length() <= doctorAh.length()) {
          bw.write("go\n");
      } else {
          bw.write("no\n");
      }

      bw.flush();
      bw.close();
  }
}
