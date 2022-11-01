package Numbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num,i,d,rem,r=0,n=0;
        System.out.println("Enter a num: ");
        num=s.nextInt();
        for(i=num;i>0;n++)
        {
            i /=10;
        }
        for(i=num;i>0;i/=10){
            rem=i%10;
            r +=Math.pow(rem,n);
        }
        if (r==num){
            System.out.println("Eureka! Armstrong Num Found "+r);
        }
        else
            System.out.println("Na Na! Armstrong not found");
    }
}
