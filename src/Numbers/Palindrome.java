package Numbers;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,i,d,rev=0;
        System.out.println("Enter a num: ");
        num=s.nextInt();
        i=num;
        while (i!=0){
            d=i%10;
            rev=rev*10+d;
            i=i/10;
        }
    if (num==rev){
        System.out.println("Your num "+num+" is palindrome");
    }
    }
}
