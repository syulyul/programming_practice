import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    
    Set<String> unheard = new HashSet<>();
    Set<String> names = new TreeSet<>();

    for (int i = 0; i < N; i++) {
      unheard.add(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      String name = br.readLine();
      if (unheard.contains(name)) {
        names.add(name);
      }
    }

    bw.write(names.size() + "\n");
    for (String name : names) {
      bw.write(name + "\n");
    }
    br.close();
    bw.close();
  }
}
