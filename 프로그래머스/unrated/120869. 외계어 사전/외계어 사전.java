import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String word = "";
        String dicWord = "";
        char[] dicChar = {};
        
        Arrays.sort(spell);
        for (int i = 0 ; i < spell.length ; i++) {
            word += spell[i];
        }
        
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < dic[i].length(); j++) {
                dicChar = new char[dic[i].length()];
                dicChar = dic[i].toCharArray();
            }
            Arrays.sort(dicChar);
            
            for (int j = 0; j < dicChar.length; j++) {
                dicWord += dicChar[j];
            }
            if (word.equals(dicWord)) {
                answer = 1;
            }
            dicChar = new char[]{};
            dicWord = "";
        }
        
        return answer;
    }
}