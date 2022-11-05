package ConditionalFlow.SwitchCase;
import java.util.Scanner;

public class Default {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter a Num & Output is a Month : ");
        n=s.nextInt();
        switch (n){
            case 1:
                System.out.println("01 Month: January");
                break;
            case 2:
                System.out.println("02 Month: February");
                break;
            case 3:
                System.out.println("03 Month: March");
                break;
            case 4:
                System.out.println("04 Month: April");
                break;
            case 5:
                System.out.println("05 Month: May");
                break;
            case 6:
                System.out.println("06 Month: June");
                break;
            case 7:
                System.out.println("07 Month: July");
                break;
            case 8:
                System.out.println("08 Month: August");
                break;
            case 9:
                System.out.println("09 Month: September");
                break;
            case 10:
                System.out.println("10 Month: October");
                break;
            case 11:
                System.out.println("11 Month: November");
                break;
            case 12:
                System.out.println("12 Month: December");
                break;
            default:
                System.out.println("Invalid Options");
        }
    }
}
