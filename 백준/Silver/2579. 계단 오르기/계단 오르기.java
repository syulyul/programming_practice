import java.io.*;

public class Main {
  private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
  public static void main(String[] args) throws IOException {
    int stairs = Integer.parseInt(br.readLine());
    int[] score = new int[stairs + 1];

    for (int i = 1; i <= stairs; i++) {
      score[i] = Integer.parseInt(br.readLine());
    }
    br.close();

    int[] g = new int[stairs + 1];
    int[] h = new int[stairs + 1];
    h[1] = score[1];

    for (int i = 2; i <= stairs; i++) {
      g[i] = h[i - 1] + score[i];
      h[i] = Math.max(h[i - 2], g[i - 2]) + score[i];
    }
    bw.write(Math.max(g[stairs], h[stairs]) + "\n");
    bw.close();
  }
}