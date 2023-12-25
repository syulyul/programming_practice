import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] num = br.readLine().split("\\s+");

    String[] origin = Arrays.copyOf(num, num.length);
    Arrays.sort(num);
    String[] rev = Arrays.copyOf(num, num.length);
    Collections.reverse(Arrays.asList(rev));

    if (Arrays.equals(origin, num)) {
      bw.write("ascending");
    } else if (Arrays.equals(origin, rev)) {
      bw.write("descending");
    } else {
      bw.write("mixed");
    }

    bw.newLine();
    bw.flush();

    bw.close();
  }
}
