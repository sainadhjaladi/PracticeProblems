import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) 
	{
		this.val = val; 
		next = null;
	}
}

class BeingZero {
    public ListNode middleNode(ListNode head) {
        // complete the function
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
