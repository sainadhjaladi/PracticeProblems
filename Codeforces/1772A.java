import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
       sc.nextLine();
      while(t-->0)
      {
            String input = sc.nextLine();
            String[] parts = input.split("\\+"); 
            int a = Integer.parseInt(parts[0].trim()); 
            int b = Integer.parseInt(parts[1].trim()); 
            int res = a + b;
            System.out.println(res);
      }
    }
}
