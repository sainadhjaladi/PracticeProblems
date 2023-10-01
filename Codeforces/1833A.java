import java.util.*;
public class MyClass 
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
      while(test-->0)
      {
      Set<String> set = new HashSet<>();
          int num = sc.nextInt();
          String str = sc.next();
          for(int i=0;i<num-1;i++)
          {
              String s = str.charAt(i)+""+str.charAt(i+1);
              set.add(s);
          }
          System.out.println(set.size());
      }
    }
}
