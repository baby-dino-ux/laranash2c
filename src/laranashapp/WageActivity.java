
package laranashapp;

import java.util.Scanner;


public class WageActivity {

    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String name;
        System.out.print("Enter Employee Name: ");
        name=sc.nextLine();
        
        float rate;
        System.out.print("Enter hourly rate: ");
        rate = sc.nextFloat();
        
        int total;
        System.out.print("Enter total hours worked this week: ");
        total = sc.nextInt();
        
        System.out.println("-----Wage Summary-----");
        System.out.println("Employee: "+name);
        System.out.printf("Hourly Rate: ₽%.2f\n", rate);
        System.out.println("Hours Worked: "+total);
        
        float gross;
        gross = rate * total;
        
        System.out.printf("Gross Weekly: ₽%.2f\n", gross);
        
  float dis = gross / 10.0f;
        System.out.printf("SSS Contribution 10percent: ₽%.2f\n", dis);
        
        
        float net;
        net = gross - dis;
        System.out.println("-------------------------");
        System.out.printf("Net Weekly Wage: ₽%.2f\n", net);
        
        
        
                
                
    }
    
}