package laranashapp;

import java.util.Scanner;


public class Airfareapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      
        float total = 0;
        System.out.print("Distance (KM): ");
        int km = sc.nextInt();
        System.out.print("Class: ");
        int cl = sc.nextInt();
        
if(cl == 1){
    float economy = 250;
     total =  economy * km;
    if(km >= 1000){
        total = total - (total * .10f);
    }
}  else if (cl == 2){
    float business = 500;
    total = business * km;
    if (km >= 1000){
        total = total - (total * .10f);
    }
}
System.out.printf("Total Fare: %.2f", total);
    }
  
}
      
       
