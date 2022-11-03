package basicprogram;

import java.util.Scanner;
public class MaximumAmongThreeDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2,num3,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        if(num1>num2)  //external
        {
        	if(num1>num3)  //internal
        	{
        		max=num1;
        	}
        	else  //internal else
        	{
        		max=num3;
        	}
        } //external if
        else  //external else
        {
        	if(num2>num3)  //internal if
        	{
        		max=num2;
        	}
        	else //internal else
        	{
        		max=num3;
        	}
        
        	sc.close();
        }
        System.out.println("Maximum number among all three is: "+ max);

}
}