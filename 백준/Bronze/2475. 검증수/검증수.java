import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] num = br.readLine().split("\\s+");
    int sum = 0;
    
    for (int i = 0; i < num.length; i++) {
      sum += Integer.parseInt(num[i]) * Integer.parseInt(num[i]);
    }

    bw.write(String.valueOf(sum % 10));
    bw.newLine();
    bw.flush();

    bw.close();
  }
}
