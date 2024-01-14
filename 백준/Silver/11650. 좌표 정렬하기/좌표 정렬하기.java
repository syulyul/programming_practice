import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        
        for (int i = 0; i < N; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          arr[i][0] = st.nextToken();
          arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (a, b) -> {
          int compare = Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
          if (compare == 0) {
            return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
          }
          return compare;
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
          sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}
