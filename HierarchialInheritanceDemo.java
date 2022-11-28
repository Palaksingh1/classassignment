package oopsconcepts;

class Bank
{
	int rateOfInterest()
	{
		return 8;
	}
}
class Sbi extends Bank
{
	int rateOfInterest()   //overridden method
	{
		return 7;
	}
}
class Axis extends Bank
{
	int rateOfInterest()
	{
		return 5;
	}
}

public class HierarchialInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sbi sbi=new Sbi();
        System.out.println("rate of interest: "+ sbi.rateOfInterest()+" %");  
        
        Axis axis=new Axis();
        System.out.println("rate of interest: "+ axis.rateOfInterest()+" %");
	}
	
	//one more way of doing this
	public class HierarchialInheritance{
		public static void main(String[] args) {
			//upcasting
			//we will create reference variable of parent class ,but object will be type
			//child class
			
			Bank bank; //parent type of reference variable
			bank=new Sbi();  //creating object of child type of
			System.out.println("rate of interest: "+ bank.rateOfInterest()+"%");
			
			bank =new Axis();
			System.out.println("rate of interest: "+ bank.rateOfInterest()+"%");
		}
	}

}


