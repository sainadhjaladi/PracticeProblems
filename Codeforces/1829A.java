import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = "codeforces";
            String str2 = sc.next();
            
            char arr1[]=str1.toCharArray();
            char arr2[]=str2.toCharArray();
            int count = 0;
            for(int i=0;i<10;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
