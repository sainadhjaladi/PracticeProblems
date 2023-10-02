import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0)
      {
        int n=sc.nextInt();
        String str1=sc.next();
        String str2=sc.next();
        int S1C=0;
        int S2C=0;
        for(int i=0;i<n;i++)
        {
            if(str1.charAt(i)=='R')
            {
                S1C=S1C+1;
            }
            else if(str1.charAt(i)=='B' || str1.charAt(i)=='G')
            {
                S1C=S1C+2;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(str2.charAt(j)=='R')
            {
                S2C=S2C+1;
            }
            else if(str1.charAt(j)=='B' || str1.charAt(j)=='G')
            {
                S2C=S2C+2;
            }
        }
        if(S1C==S2C)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
      }
    }
}
