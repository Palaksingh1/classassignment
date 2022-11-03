package basicprogram;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float basicsalary,hra,da,grosssalary;
        System.out.println("Enter basic salary of an employee");
        basicsalary=sc.nextFloat();
        
        //Calculate DA and HRA according to specified conditions
        if(basicsalary<=10000)
        {
        	da = basicsalary*80/100;
        	hra = basicsalary*20/100;
        }
        else if(basicsalary<=20000)
        {
        	da = basicsalary*90/100;
        	hra = basicsalary*25/100;
        }
        else
        {
        	da = basicsalary*95/100;
        	hra = basicsalary*30/100;
        }
        
        //Calculate gross salary
        grosssalary = basicsalary + hra + da;
        
        System.out.println("Gross salary of employee is ="+ grosssalary);
        
        sc.close();
        }

}
