import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S;
        int i;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        i = sc.nextInt();
        sc.nextLine();
        
        System.out.println(S.charAt(i - 1));
        
        sc.close();
    }
}