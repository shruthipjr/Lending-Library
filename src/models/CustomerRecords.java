package models;

import java.util.HashSet;

public class CustomerRecords {


	private HashSet<Customer> customerSet;

	public CustomerRecords(){
		customerSet = new HashSet<Customer>();
	}

	public void add(Customer customer){
		customerSet.add(customer);
	}

	public Customer findByName(String name) throws CustomerNotFoundException{
		for(Customer nextCustomer: customerSet )
		{
			if(nextCustomer.getMailingName().equalsIgnoreCase(name))
			{
				return nextCustomer;
			}
		}

		throw new CustomerNotFoundException();
	}
	
	public int getNumberOfCustomer(){
		return customerSet.size();
	}

}
