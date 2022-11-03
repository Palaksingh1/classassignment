package basicprogram;

import java.util.Scanner;

public class NumberDivisibleBy5And11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check its divisibility by 5and 11");
        num=sc.nextInt();
        
        if((num%5==0)&&(num%11==0))
        	System.out.println(num+ " is divisible by 5 and 11");
        else 
        	System.out.println(num+ " is not divisible by 5 and 11");
        	
        
        sc.close();
        }
      
	}


