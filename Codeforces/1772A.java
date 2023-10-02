import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0)
      {
          String str = sc.next();
          char ch1=str.charAt(0);
          char ch2=str.charAt(2);
            int a = Character.getNumericValue(ch1); 
            int b = Character.getNumericValue(ch2); 
          int res = a+b;
          System.out.println(res);
      }
    }
}
