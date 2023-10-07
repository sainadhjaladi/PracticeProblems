
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
	public SLLNode cycleStartNode(SLLNode A) {
	    
	    
	    if(A == null || A.next==null)
	    {
	        return A;
	    }
	    
	   
		SLLNode sp = A;
		SLLNode fp = A;
		
		
		while(sp!=null && fp!=null && fp.next!=null)
		{
		    sp = sp.next;
		    fp = fp.next.next;
		    
		    if(sp == fp)
		    {
		        sp=A;
		        while(sp!=fp)
		        {
		            fp=fp.next;
		            sp=sp.next;
		        }
		        return sp;
		    }
		}
		return null;
		
		
		
	}
}
