import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {		            
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> nums = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(br.readLine()));
		}
        br.close();
        
        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            bw.write(nums.get(i) + "\n");
        }
        bw.flush();
		bw.close();
	}
}