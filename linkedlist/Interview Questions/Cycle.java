class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// solving using Fast and Slow Pointer for Linkedlist cycle questions.

public class Cycle {

    public static int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next;
            if(fast == slow){
                // calc the length
                ListNode temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    ++length;
                }
                while(temp!=fast);

                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        int lengthOfCycle = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                lengthOfCycle = lengthCycle(slow);
                break;
            }
        }
        if(fast == null || fast.next == null ){
            return null;
        }

        //find the start node , first and second are just pointers whereas fast and slow method are nodes.
        ListNode first = head;
        ListNode second = head;

        while (lengthOfCycle > 0){
            second = second.next;     // while length of cycle is > 0 , move the pointer 1 by 1.
            --lengthOfCycle;
        }

        // keep moving both forward and they will meet at cycle start NODE.
        while( first != second){
            first = first.next;
            second = second.next;
        }

        // return any , coz they are pointing to the same !

        return first;
        // return second;
    }

    // Happy Number : leetcode
    public boolean isHappy(int num) {
        int slow = num;
        int fast = num;

        do{

            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans = ans + (rem * rem);
            num = num / 10;
        }
        return ans;
    }

}