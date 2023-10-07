
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class SLLNode{
	int data;
	SLLNode next;
	SLLNode(int d){
		data = d;
		next = null;
	}
};

class BeingZero{
	public SLLNode mergeTwoSortedLists(SLLNode A, SLLNode B) {
		if(A==null && B==null)
		{
		    return null;
		}
		if(B==null)
		{
		    return A;
		}
		if(A==null)
		{
		    return B;
		}
		
		if(A.data<=B.data)
		{
		    A.next=mergeTwoSortedLists(A.next,B);
		    return A;
		}
		else
		{
		    B.next=mergeTwoSortedLists(A,B.next);
		    return B;
		}
	}
}
