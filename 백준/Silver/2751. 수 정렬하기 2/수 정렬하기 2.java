import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		boolean[] num = new boolean[2000001];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			num[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
		
		br.close();
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] == true) sb.append((i - 1000000) + "\n");
		}
		
		bw.write(sb.toString());
		bw.close();
	}
}