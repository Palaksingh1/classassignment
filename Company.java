package oopsconcepts;

public class Company {
    int companyId;
    String companyName;
    String address;
    
    public Company( int companyId,String companyName,String address)
    {
    	super();
    	this.companyId=companyId;
    	this.companyName=companyName;
    	this.address=address;
    }
    
    
	public int getCompanyId() {
		return companyId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public String getAddress() {
		return address;
	}
     
	@Override
	public String toString()
	{
		StringBuilder builder=new StringBuilder();
		builder.append("Company [CompanyId=").append(companyId).append(", CompanyName=").append(companyName).append(", Address=").append(address).append("]");
		return builder.toString();
	}
	//methods

}
