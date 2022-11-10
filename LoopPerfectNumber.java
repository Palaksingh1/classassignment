package basicprogram;

import java.util.Scanner;
public class LoopPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
		 * Write a program
		 */
		int n,sum=0,i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check perfect or not");
		n=sc.nextInt();  //6
		
		for(i=1;i<n;i++)  //i=1<6t  i=2<6t  i=3<6t    i=4<6t  i=5<6t
		{
			if(n%i==0)   //6%1  =0==0 t   6%2=0==0t  6%3=0==0t  6%4=0f
			{
				sum=sum+i;   //0+1=1 1+2=3  3+3=6
				sc.close();
			}
		}
		
		if(n==sum)
		System.out.println(n+" is a perfect number");
		else
			System.out.println(n+" is not a perfect number");
		
	}

}
