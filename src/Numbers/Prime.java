package Numbers;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i, c = 0;
        System.out.println("Enter a num: ");
        num = s.nextInt();
        for(i=1;i<=num;i++){
            if(num%i==0){
                c++;
            }
        }
        if (c==2){
            System.out.println("prime ");
        }
        else
            System.out.println("Not a prime");
    }
}
