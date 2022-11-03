package basicprogram;

import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        n=sc.nextFloat();
        
        if(n>=0)
        	System.out.println("The number is positive");
        else
        	System.out.println("The number is negative");
        
        sc.close();
	}

}
