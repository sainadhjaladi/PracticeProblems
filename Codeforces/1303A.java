import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
        String str = sc.next();
        int x=0,y=-1;
        int count=0;
        int num = str.length();
        for(int i=0;i<num;i++)
        {
            if(str.charAt(i)=='1')
            {
                x=i;
                break;
            }
        }
        for(int j=num-1;j>=0;j--)
        {
            if(str.charAt(j)=='1')
            {
                y=j;
                break;
            }
        }
        for(int i=x;i<=y;i++)
        {
            if(str.charAt(i)=='0')
            {
                count++;
            }
        }
        System.out.println(count);
        }
    }
}
