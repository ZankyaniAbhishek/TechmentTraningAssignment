package com.Techment.OOPs.Assignment;

class Addressnew
{
	private String Addressline;
	private String City;
	
	public Addressnew(String addressline, String city) {
		super();
		setAddressline(addressline);
		setCity(city);
		
	}
	public String getAddressline() {
		return Addressline;
	}
	public void setAddressline(String addressline) {
		Addressline = addressline;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void getAddressDetails()
	{
		System.out.print(getAddressline() + " , "+getCity());
	}
	
}

class Customernew
{
	private String customerName ;
	private Address residentialAddress ;
	private Address OfficialAddress;
	
	public Address getOfficialAddress() {
		return OfficialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		OfficialAddress = officialAddress;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	 
	@Override
	public String toString() {
		return " CustomerName :" + customerName + "\n residentialAddress : " + residentialAddress.getAddressline() + " , " + residentialAddress.getCity()
				+ "\n OfficialAddress : " + OfficialAddress.getAddressline()+ " , " + OfficialAddress.getCity() +" ";
	}

	public void getCustomerDetails (String details ) {
		System.out.println(details);
		//System.out.println("Residential Address : " + residentialAddress.getAddressline() + ", "+ residentialAddress.getCity() );
	}
	public Customernew(String customerName, Address residentialAddress ,Address OfficialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.OfficialAddress=OfficialAddress;
	}
	
	
}


public class TechmentAssignmentEncapsulationandAggrigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address residAddress = new Address("Lonavala Streets Basil , Complex", "Banglore");
		Address offAddress = new Address("Nehru Nagar", "Bhilai");
		Customernew customer = new Customernew("Ram", residAddress, offAddress);
		customer.getCustomerDetails(customer.toString());

	}

}
