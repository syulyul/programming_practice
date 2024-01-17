import java.io.*;
import java.util.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {

    int[] arr = new int[10001];

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      arr[Integer.parseInt(br.readLine())]++;
    }
    br.close();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      while(arr[i]>0){
        sb.append(i).append('\n');
        arr[i]--;
      }
    }
    bw.write(sb.toString());
    bw.close();
  }
}
