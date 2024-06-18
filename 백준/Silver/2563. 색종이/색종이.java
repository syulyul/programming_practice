import java.io.*;
import java.util.*;

public class Main  {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        boolean[][] coordinates = new boolean[100][100];
        int area = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (coordinates[j][k] == true) {
                        continue;
                    } else {
                        coordinates[j][k] = true;
                        area++;
                    }
                }
            }
        }
        
        bw.write(area + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
