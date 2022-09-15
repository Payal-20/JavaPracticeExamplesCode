import java.util.Set;

public class removeVowel {
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;
    
    public removeVowel(){
        this(10);
        //default capacity
    }
    public removeVowel(int capacity){
        this.numOfBuckets=capacity;
        buckets=new HashNode[numOfBuckets];
        this.size=0;
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        HashNode(int key,String value){
            this.key=key;
            this.value=value;

        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getBucketIndex(int key){
        return key % buckets.length;
    }
    public static String removeVowels(String str){
        Set<Character> vowels=Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();

        char[] charArray=str.toCharArray();
        for(Character ch:charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeVowels("ice Cream"));
    }
}
