package Numbers;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,d,rev=0;
        System.out.println("Enter a num: ");
        num=s.nextInt();
        while (num!=0){
            d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        System.out.println("The Reverse of Num is "+rev);
    }
}
