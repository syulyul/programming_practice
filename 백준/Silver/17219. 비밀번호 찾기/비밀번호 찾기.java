import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    HashMap<String, String> sites = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String str = br.readLine();
      String[] arr = new String[2];
      arr = str.split(" ");
      sites.put(arr[0], arr[1]);
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      sb.append(sites.get(br.readLine()) + "\n");
    }
    br.close();

    bw.write(sb.toString());
    bw.close();
  }
}
