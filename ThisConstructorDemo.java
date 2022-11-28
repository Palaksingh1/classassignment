package oopsconcepts;
class DD
{
	public DD()
	{
		System.out.println("this is default constructor");
	}
	public DD(int p)
	{
		this();  //invoke default constructor
		System.out.println("the value of a is: "+ p);
	}
}

public class ThisConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DD obj=new DD(10);
    
	}
}
