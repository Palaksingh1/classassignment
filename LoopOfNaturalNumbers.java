package basicprogram;

import java.util.Scanner;

public class LoopOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loop for printing the sum of numbers between 1 to n
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        n=sc.nextInt();
        
        for(i=1;i<=n;++i)
        {
        	sum=sum+i;
        }
	System.out.println("sum of natural numbers from 1 to "+n+" is :" +sum);
	sc.close();
	}

}
