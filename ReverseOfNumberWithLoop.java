package basicprogram;

import java.util.Scanner;

public class ReverseOfNumberWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,rem,reverse=0,temp;
        Scanner sc=new Scanner(System.in);
        
        //input number from user
        System.out.println("Enter number to reverse");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
        	rem=n%10;
        	reverse=reverse*10+rem;
        	n=n/10;
        }
        System.out.println("Reverse of "+temp+" is:"+ reverse);
        
        
        //to check if a number is palindrome or not
        if(temp==reverse)
        	System.out.println(temp+" is palindrome number");
        else
        	System.out.println(temp+" is not palindrome number");
        sc.close();
	}

}
