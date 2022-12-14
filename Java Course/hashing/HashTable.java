public class HashTable {//instance variable
    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;
     
    public HashTable(){
        this(10);
        //default capacity
    }
    public HashTable(int capacity){
        this.numOfBuckets=capacity;
        buckets=new HashNode[numOfBuckets];//array of hashNode
        this.size=0;
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key,String value){
            this.key=key;
            this.value=value;
        }
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public int getBucketIndex(Integer key) {
        return key % buckets.length;
    }
    public void put(Integer key,String value) {
        if(key==null && value==null){
            throw new IllegalArgumentException("key or value is null");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head= buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketIndex];
        
        HashNode node=new HashNode(key,value);
        node.next=head;
        buckets[bucketIndex]=node;
    }
    public String get(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while (head!=null) {
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public String remove(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        HashNode previous =null;
        while (head!=null) {
            if(head.key.equals(key)){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null;
        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }
        else{
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }
    public static void main(String[] args) {
        HashTable table =new HashTable(10);
        table.put(20,"Payal");
        table.put(26,"GHRCEM");
        table.put(14,"AMAMAMAMA");
        System.out.println(table.size);
        System.out.println(table.get(20));
        System.out.println(table.get(2));
        System.out.println(table.remove(14));
        System.out.println(table.size);
    
    }
}
