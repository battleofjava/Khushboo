package Numbers;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,i,f=1;
        System.out.println("Enter a num: ");
        num=s.nextInt();
            for(i=num;i!=0;i--)
            {
                f=f*i;
            }
        System.out.println("Factorial is "+f);
    }
}
