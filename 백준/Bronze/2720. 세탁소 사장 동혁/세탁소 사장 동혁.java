import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int Quarter = 25, Dime = 10, Nickel = 5, Penny = 1;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine()); 
            if(money / Quarter >= 0) {
                bw.write(String.valueOf(money / Quarter) + " ");
                money -= Quarter * (money / Quarter);
            }
            if(money /Dime >= 0) {
                bw.write(String.valueOf(money / Dime) + " ");
                money -= Dime * (money / Dime);
            }
            if(money / Nickel >= 0) {
                bw.write(String.valueOf(money / Nickel) + " ");
                money -= Nickel * (money / Nickel);
            }
            if( money / Penny >= 0) {
                bw.write(String.valueOf(money / Penny));
                money -= Penny * (money / Penny);
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
