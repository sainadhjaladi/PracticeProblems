import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class BeingZero {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Finding the length of the first List
       int lena = 0;
       ListNode tempA = headA;
       while(tempA!=null)
       {
           lena++;
           tempA = tempA.next;
       }
       
       //Finding the length of the second List
       int lenb = 0;
       ListNode tempB = headB;
       while(tempB!=null)
       {
           lenb++;
           tempB = tempB.next;
       }
       
       
       //Finding the difference of the larger list and smaller list.
       int diff = Math.abs(lena-lenb);
       
       // Moving the head of the larger list front for the diff times 
       ListNode tempa = headA;
       ListNode tempb = headB;
       
       if(lena>lenb)
       {
           while(diff-->0)
           {
               tempa = tempa.next;
           }
       }
       else if(lenb>lena)
       {
           while(diff-->0)
           {
               tempb = tempb.next;
           }
       }
       
       //Finding the equality
       while(tempa!=tempb)
       {
           tempa = tempa.next;
           tempb = tempb.next;
       if(tempa == null || tempb == null)
       {
           return null;
       }
       }
       return tempa;
       
       
	
    }
}
