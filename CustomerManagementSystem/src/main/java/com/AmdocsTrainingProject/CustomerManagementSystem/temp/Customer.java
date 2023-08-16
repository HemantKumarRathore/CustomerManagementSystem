package com.AmdocsTrainingProject.CustomerManagementSystem.temp;

public class Customer {
	public int cId;
	public String cName;
	public int cContact;
	public String cAddress;
	
	public Customer(int cId, String cName, int cContact, String cAddress) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cContact = cContact;
		this.cAddress = cAddress;
	}
	public String toString(){
		return "Customer["+cId+" "+cName+" "+cContact+" "+cAddress+"]";
	}
}
