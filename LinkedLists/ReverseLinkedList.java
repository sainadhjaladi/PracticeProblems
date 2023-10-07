import java.util.*;
class SLLNode
{
    int data;
    SLLNode next;
    SLLNode(int d)
    {
        data = d;
        next = null;
    }
}
class BeingZero
{
    SLLNode sortList(SLLNode head)
    {
        SLLNode prev = null;
        SLLNode current = head;
        SLLNode next = null;
        while(current!=null)
        {
            next = current.next;
            current.next=prev;
            prev=current;
            current = next;
        }
        head = prev;
        return head;
    }
}
