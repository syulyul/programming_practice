import java.io.*;
import java.math.BigInteger;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        BigInteger n = new BigInteger(input[0]);
        BigInteger m = new BigInteger(input[1]);

        BigInteger result = countPaths(n, m);
        
        bw.write(result.mod(MOD).toString());
        bw.newLine();
        bw.flush();
        bw.close();
    }

    static BigInteger countPaths(BigInteger n, BigInteger m) {
        BigInteger[][] dp = new BigInteger[n.intValue() + 1][m.intValue() + 1];
        for (int i = 0; i <= n.intValue(); i++) {
            for (int j = 0; j <= m.intValue(); j++) {
                dp[i][j] = BigInteger.ZERO;
            }
        }

        dp[1][1] = BigInteger.ONE;

        for (int i = 1; i <= n.intValue(); i++) {
            for (int j = 1; j <= m.intValue(); j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                dp[i][j] = dp[i][j].add(dp[i - 1][j]).add(dp[i][j - 1]).add(dp[i - 1][j - 1]);
                dp[i][j] = dp[i][j].mod(MOD);
            }
        }

        return dp[n.intValue()][m.intValue()];
    }
}
