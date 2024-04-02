import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = null;
        int[][] num = new int[9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int x = 0, y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (num[i][j] >= max) {
                    max = num[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(x + " " + y + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}