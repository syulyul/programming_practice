import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    String str = br.readLine();
    switch (str) {
      case "A+":
        bw.write(String.valueOf(4.3));
        break;

      case "A0":
        bw.write(String.valueOf(4.0));
        break;

      case "A-":
        bw.write(String.valueOf(3.7));
        break;

      case "B+":
        bw.write(String.valueOf(3.3));
        break;

      case "B0":
        bw.write(String.valueOf(3.0));
        break;

      case "B-":
        bw.write(String.valueOf(2.7));
        break;

      case "C+":
        bw.write(String.valueOf(2.3));
        break;

      case "C0":
        bw.write(String.valueOf(2.0));
        break;

      case "C-":
        bw.write(String.valueOf(1.7));
        break;

      case "D+":
        bw.write(String.valueOf(1.3));
        break;

      case "D0":
        bw.write(String.valueOf(1.0));
        break;

      case "D-":
        bw.write(String.valueOf(0.7));
        break;

      case "F":
        bw.write(String.valueOf(0.0));

      default:
        break;
    }
    bw.newLine();
    bw.flush();
    br.close();
    bw.close();
  }
}
