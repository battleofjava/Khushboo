package ConditionalFlow.SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int type,wheels = 0;
        System.out.println("Enter the Option Type Of Transportation \n 1).By-Air\n 2).By-Water\n 3).By-Road\n");
        type=s.nextInt();
        if (type==3){
            System.out.println("Enter the no of wheels : ");
            wheels=s.nextInt();
        }
       switch (type){
           case 1:
               System.out.println("Airplane\nHelicopter\nJet");
               break;
           case 2:
               System.out.println("Ship\nBoat\nCursier\n");
           case 3:
               switch (wheels){
                   case 2:
                       System.out.println("Bike\nScooty");
                       break;
                   case 3:
                       System.out.println("Rickshaw\nAuto");
                       break;
                   case 4:
                       System.out.println("Car\nScorpio\nBolero");
                       break;
                   case 8:
                       System.out.println("Truck\nBus");
                       break;
                   default:
                       System.out.println("Invalid");
               }
               break;
           default:
               System.out.println("Other Transport Type");
       }
    }
}

