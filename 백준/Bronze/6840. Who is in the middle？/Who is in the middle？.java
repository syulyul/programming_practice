import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws Exception {
    ArrayList<Integer> numbers = new ArrayList<>();
    String str = "";
    while ((str = br.readLine()) != null && !str.isEmpty()) {
        numbers.add(Integer.parseInt(str));
    }
    Collections.sort(numbers);

    bw.write(numbers.get(numbers.size() / 2) + "\n");
    bw.flush();
    br.close();
    bw.close();
  }
}
