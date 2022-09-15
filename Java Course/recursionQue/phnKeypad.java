import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23")); 
    }
    static void help(int i, String digits, String temp, ArrayList<String> ans, HashMap<Character, String> map){
        if(i == digits.length()){
            ans.add(temp);
            return;
        }
        
        char ch = digits.charAt(i);
        String str = map.get(ch);
        
        for(int j = 0; j<str.length(); j++){
            char chr = str.charAt(j);
            help(i+1, digits, temp + chr, ans, map);
        }
        
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character , String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        ArrayList<String> ans = new ArrayList<>();
        
        if(digits.length() == 0){
            return ans;
        }
        String temp = "";
        help(0,digits,temp,ans,map);
        return ans;
    }
}