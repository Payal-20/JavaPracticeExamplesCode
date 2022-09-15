package linkedlist;

public class isPalindrome {
    public static void main(String[] args) {
        
    }
    public boolean isPalindrome(ListNode head){
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findMiddle(head);
        ListNode secondHalfStart=reverse(middle.next);

        ListNode firstHalfStart=head;
        while(secondHalfStart!=null){
            if(firstHalfStart.val!=secondHalfStart.val){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
}//1221
//1.middle of link ListNode
//2.reverse second half
//3.check first half and second half
