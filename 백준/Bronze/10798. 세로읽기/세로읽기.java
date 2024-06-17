import java.io.*;

public class Main  {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        String[] arr = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            if (max < arr[i].length())
                max = arr[i].length();
        }

        for (int i = 0; i < 5; i++) {
            int arrSize = arr[i].length();
            if (arrSize < max) {
                for (int j = 0; j < max - arrSize; j++) {
                    arr[i] += " ";
                }
            }
        }

        String str = "";
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].charAt(i) == ' ')
                    continue;
                str += arr[j].charAt(i);
            }
        }

        bw.write(str);
        bw.flush();
        br.close();
        bw.close();
    }
}
