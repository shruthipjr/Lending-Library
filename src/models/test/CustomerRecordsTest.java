package models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import models.Customer;
import models.CustomerNotFoundException;
import models.CustomerRecords;
import utilities.GenderType;

public class CustomerRecordsTest {
	
	CustomerRecords records;
	
	public CustomerRecordsTest(){
		records = new CustomerRecords(); 
		Customer newCustomer = new Customer("Miss","Sandra","Smith","123 high strrt","125545","sandra@matt.com",3,GenderType.FEMALE); 
		records.add(newCustomer);
		System.out.println("in constructor  "+ newCustomer);
	}
	
	/*@Test
	public void testAddCustomer() {
		
	Customer newCustomer = new Customer("MR","Matt","Greencroft","1 high strrt","123545","matt@matt.com",1,GenderType.MALE); 
		int initialSize = records.getNumberOfCustomer();
		
		records.add(newCustomer);
		
		assertTrue(initialSize == records.getNumberOfCustomer()-1);
		
	}
	
	
	@Test
	public void testFindCustomer(){
		try {
			Customer foundCustomer = records.findByName("Miss S Smith");
		} catch (CustomerNotFoundException e) {
			fail("Customer not found");
		}
	}*/
	
	@Test
	public void testNoDuplicates(){
		System.out.println(records.getNumberOfCustomer());
		Customer newCustomer = new Customer("Miss","Sandra","Smith","123 high strrt","125545","sandra@matt.com",3,GenderType.FEMALE); 
		records.add(newCustomer);
		records.add(newCustomer);
		records.add(newCustomer);
		records.add(newCustomer);
		System.out.println("in method  "+ newCustomer);
		System.out.println(records.getNumberOfCustomer());
		assertEquals(1, records.getNumberOfCustomer());
	}
	

}
