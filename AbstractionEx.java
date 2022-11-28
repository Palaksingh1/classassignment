package oopsconcepts;

/*
 * you can't instantiate abstract class but you can create reference variable
 */
abstract class AbstractDemo
{
	void fun()    //concrete method
	{
		System.out.println("we are learning with fun");
	}
	 abstract void display();  //abstract method
}

//implmentation class-child class
class impl extends AbstractDemo
{
	
	@Override
	void display()
	{
		System.out.println("displaying impl class");
	}
}

class impl2 extends AbstractDemo
{
	
	@Override
	void display()
	{
		System.out.println("displaying impl 2 class");
	}
}
public class AbstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AbstractDemo demo;
        
        demo=new impl();
        demo.fun();
        demo.display();
        
        demo=new impl2();
        demo.fun();
        demo.display();
	}

}
