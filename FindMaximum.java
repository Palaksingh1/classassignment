package basicprogram;

import java.util.Scanner;

public class FindMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.println("Enter num1");
		System.out.println("Enter num2");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
        if(num1>num2)
        	System.out.println("Maximum:" +num1);
        else
        	System.out.println("Maximum:" +num2);
        
        sc.close();
	}

}
