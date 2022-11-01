package Numbers;
import java.util.Scanner;
public class RangeNumChk {
    static void palindrome(int n){
        int i,d,temp,rev=0;
        System.out.println("Palindrome Num Btw 1 to "+n);
        for (i=1;i<=n;i++)
       {
           for (temp=i;n!=0;n /=10)
           {
               d=i%10;
               rev=(rev*10)+d;
               if (temp==rev){
                   System.out.println("Your num "+n+" is palindrome");
               }
           }
        }
       }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Enter a num: ");
        num=s.nextInt();
        System.out.println("Palindrome");
        palindrome(num);
    }
}
