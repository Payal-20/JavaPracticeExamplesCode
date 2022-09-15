import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findandReplacePattern {
    public static void main(String[] args) {
        String words[] = {"abc","deq","mee","aqq","dkd","ccc"}; 
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern)); 
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isDesiredPattern(words[i],pattern)){
                ans.add(words[i]);
            }
        }
        
        return ans;
    }
    public static boolean isDesiredPattern(String s,String p){
        if(s.length()!=p.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(!map.containsValue(p.charAt(i))){
                    map.put(s.charAt(i),p.charAt(i));
                }else{
                    return false;
                }
            }else{
                if(map.get(s.charAt(i))!=p.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
