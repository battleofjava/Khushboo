package ConditionalFlow.SwitchCase;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        String s;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Character and Output is Similar Word");
        s = n.next();
        switch (s) {
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Ball");
                break;
            case "C":
                System.out.println("Cat");
                break;
            case "D":
                System.out.println("Dog");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
