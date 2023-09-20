import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0)
      {
          int range = sc.nextInt();
          int arr[]= new int[range];
          for(int i=0;i<range;i++)
          {
              arr[i]=sc.nextInt();
          }
          Arrays.sort(arr);
          int n = arr[0];
          int res=0;
          for(int i=1;i<range;i++)
          {
              int sol = Math.abs(n-arr[i]);
              res = res+sol;
          }
          System.out.println(res);
      }
    }
}
