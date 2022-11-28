package oopsconcepts;

class UserDetails
{
	int id;
	String name;
	long phno;
	
	BankAccount bankAccount; //entity reference
	
	Company company;  //entity reference
	
	public UserDetails(int id,String name,long phno,BankAccount bankAccount,Company company)
	{
		super();
		this.id=id;
		this.name=name;
		this.phno=phno;
		this.bankAccount=bankAccount;
		this.company=company;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public long getPhno()
	{
		return phno;
	}
	
	public BankAccount getBankAccount()
	{
		return bankAccount;
	}
	public Company getCompany()
	{
		return company;
	}

@Override
public String toString()
{
	StringBuilder builder=new StringBuilder();
	builder.append("UserDetails [id=").append(id).append(", name=").append(name).append(", phno=").append(phno).append(", bankAccount=").append(bankAccount).append(", company=").append(company).append("]");
	return builder.toString();
}
}

public class AggregatoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount acc1=new BankAccount("SBI", 6546, "JJ Futura");
        BankAccount acc2=new BankAccount("UBI", 6546, "IU Minasaka");
        
        Company tcs= new Company(101, "TCS", "gurgaon");
        Company capgemini= new Company(102, "Capgemini", "Noida");
        
        UserDetails palak=new UserDetails(1, "Palak", 384280, acc2,capgemini);
        UserDetails sana=new UserDetails(2, "Sana", 43287, acc1,tcs);
        
        System.out.println(palak);  //using toString method
        
        System.out.println("====================================================");
        //using getter method
        
        System.out.println("Id: "+sana.getId());
        System.out.println("Name: "+sana.getName());
        System.out.println("Phone no: "+sana.getPhno());
        
        //bank details
        System.out.println("bank Name: "+sana.getBankAccount().getBankName());
        System.out.println("Account no: "+sana.getBankAccount().getAccountNo());
        System.out.println("Branch: "+sana.getBankAccount().getBranch());
        
        System.out.println();
        //company details
        System.out.println("Company ID: "+sana.getCompany().getCompanyId());
        System.out.println("Company Name: "+sana.getCompany().getCompanyName());
        System.out.println("Company Address: "+sana.getCompany().getAddress());
	}

}
