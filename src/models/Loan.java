package models;

import java.util.Calendar;
import java.util.Date;

import utilities.LoanStatus;

public class Loan {

	 private int id;
	 private Customer customer;
	 private Book book;
	 private Date startDate;
	 private Date dueDate;
	 private Date returnDate;
	 private LoanStatus status;
	 
	 public Loan(int id, Customer customer, Book book){
		 this.id = id;
		 this.customer = customer;
		 this.book = book;
		  status = LoanStatus.CURRENT;
		 this.startDate = new Date();
		 Calendar gcal = Calendar.getInstance();
		 gcal.add(Calendar.DAY_OF_MONTH, 14);
		 this.dueDate = gcal.getTime();
		 
		 
	 }
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle() + "]";
	}

	public Customer getCustomer(){
		return customer;
	}
	
	 public Book getBook(){
		 return book;
	 }
	 
	 public Date getDueDate(){
		 return dueDate;
	 }
	 
	 public LoanStatus getStatus(){
		 return status;
	 }
	 
	 public void endLoan(){
		 status = status.HISTORIC;
		 returnDate = new Date();
	 }
	 
	 
}
