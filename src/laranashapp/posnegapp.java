package laranashapp;

import java.util.Scanner;

        
public class posnegapp {

    
    public static void main(String[] args) {
 

        
         Scanner sc =  new Scanner (System.in);
         
         int num;
         System.out.print("Enter a Number: ");
         num = sc.nextInt();
         
         
         if (num > 0){
             System.out.println(num+" is a Positive Number");
         }else if (num < 0){
             System.out.println(num+" is a Negative Number");
         } else 
             System.out.println("Inputted Number Zero");
    }
    
}