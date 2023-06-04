import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ret = "";
    
        sc.close();
    
        for (int i = 0; i < a.length(); i++){
        if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
            ret += (char)(a.charAt(i) + ('a' - 'A'));
        }
        else {
            ret += (char)(a.charAt(i) - ('a' - 'A'));
        }
    }
    System.out.println(ret);
    }
}