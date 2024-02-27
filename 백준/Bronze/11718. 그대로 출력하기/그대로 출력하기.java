import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            StringBuilder sb = new StringBuilder();

            String str = br.readLine();
            if (str == null) {
                break;
            }

            sb.append(str).append("\n");
            bw.write(sb.toString());
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

