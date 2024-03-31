import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(br.readLine().trim());
            sum += nums[i];
        }
        Arrays.sort(nums);
        
        bw.write(sum / 5 + "\n");
        bw.write(nums[2] + "\n");
        bw.flush();
        bw.close();
    }
}