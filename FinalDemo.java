package oopsconcepts;

public class FinalDemo {
    
	final int var;
	final static int num;
	static
	{
		num=23;
	}
	
	final void display()
	{
		System.out.println("final method !!" + var+" "+ num);
	}
	
	public FinalDemo(int var)
	{
		this.var=var;
	}
	int cube(final int n)
	{
		return n*n*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalDemo demo=new FinalDemo(10);
       // demo.var=455;
        demo.display();
       int cube= demo.cube(3);
       System.out.println("cube: "+ cube);
      //  abc obj=new abc();
       // obj.display();
	}

}
//class abc extends FinalDemo
//{
//	@Override
//	void display()
//	{
		
//	}
//}
