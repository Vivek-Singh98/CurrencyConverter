package AIntenship;

import java.util.Scanner;

public class CurrencyConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chose one of the following option");
        System.out.println("1) Rupee to United State Dollar");
        System.out.println("2) Rupee  to Singapore Dollar");
        System.out.println("3) Rupee to Russian Ruble");
        System.out.println("4) Rupee to Japanese Yen");
        System.out.println("5) Rupee to Chines Yen");
        int Exchange = sc.nextInt();
        switch (Exchange){


            case 1: {
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("you choose Rupee ------> United State Dollar($)");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("Enter the number of Rupee");
                double rupee = sc.nextDouble();
                if(rupee>=0){
                    System.out.println("The Amount is : "+ rupee * 0.014+" United State Dollar ");
                }
                else {
                    System.out.println("please enter positive number of rupee");
                }
            }
            break;


             case 2: {
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                 System.out.println("you choose Rupee  ------> Singapore Dollar");
                  System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("Enter the number of Rupee");
                double rupee = sc.nextDouble();
                if(rupee>=0){
                    System.out.println("The Amount is :"+  rupee*0.016+"  Singapore Dollar");
                }
                else {
                    System.out.println("please enter positive number of rupee");
                }
            }
            break;


             case 3: {
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                   System.out.println("you choose Rupee -----> Russian Ruble");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("Enter the number of Rupee");
                double rupee = sc.nextDouble();
                if(rupee>=0){
                    System.out.println("The Amount is :"+  rupee*0.013+"  Russian Ruble");
                }
                else {
                    System.out.println("please enter positive number of rupee");
                }
            }
            break;


             case 4: {
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                 System.out.println("you choose Rupee -------> Japanese Yen");
                  System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("Enter the number of Rupee");
                double rupee = sc.nextDouble();
                if(rupee>=0){
                    System.out.println("The Amount is :"+  rupee*0.015+"  Japanese Yen");
                }
                else {
                    System.out.println("please enter positive number of rupee");
                }
            }
            break;



             case 5: {
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                 System.out.println("you choose Rupee -------> Chines Yen");
                 System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("Enter the number of Rupee");
                double rupee = sc.nextDouble();
                if(rupee>=0){
                    System.out.println("The Amount is :"+  rupee*0.0144+"  Chines Yen");
                }
                else {
                    System.out.println("please enter positive number of rupee");
                }
            }
            break;

        }
    }
}
