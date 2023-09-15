import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        String str = sc.next();
        for(int i=0;i<num-2;i++)
        {
            if(str.charAt(i)=='x' && str.charAt(i+1)=='x' && str.charAt(i+2)=='x')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
