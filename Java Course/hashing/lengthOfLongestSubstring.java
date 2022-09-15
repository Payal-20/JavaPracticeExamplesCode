import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    static int lenOfLongestSubstring(String s){
        Map<Character,Integer> map= new HashMap<>();
        int maxLength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            char rightChar=s.charAt(end);
            if(map.containsKey(rightChar)){
                start=Math.max(start, map.get(rightChar)+1);
            }
            map.put(rightChar, end);
            maxLength=Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(lenOfLongestSubstring("pwwkew"));
    }
}
//substring
//1.lie withn string
//2. sequence sholud be contineous
 