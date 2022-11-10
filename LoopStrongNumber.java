package basicprogram;

import java.util.Scanner;
public class LoopStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,temp,rem,sum=0,i,fact;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any number");
        n=sc.nextInt();
        
        temp=n;
        while(temp>0)
        {
        	fact=1;
        	i=1;
        	rem=temp%10;
        	while(i<=rem)
        	{
        		fact=fact*i;
        		i++;
        	}
        	System.out.println("The factorial of " +rem+ "=" +fact);
        	sum=sum+fact;
        	temp=temp/10;
            sc.close();
        }
        
        System.out.println("The sum of the factorials of a given number" +n+ "=" +sum);
        if(n==sum)
        	System.out.println("\n" +n+ "is a strong number");
        else
        	System.out.println("\n" +n+ "is not a strong number");
	}

}
