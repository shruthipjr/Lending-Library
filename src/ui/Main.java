package ui;
import java.text.NumberFormat;
import java.util.Locale;

import models.Book;

import models.Customer;
import models.DVD;
import models.Loan;
import models.LoanAlreadyExistsException;
import models.LoanRegistry;
import models.Material;
import models.MaterialCatelog;

import models.MaterialNotFoundException;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {
	
		MaterialCatelog materialCatalog = new MaterialCatelog();
		
		
		Book book1 = new Book("1001","An introduction to Java","Matt Greencroft","12345","Anytown Branch",400);
		Book book2 = new Book("223X","Better Java","Joe Le Blanc","23456","Anytown Branch",150);
        Book book3 = new Book("9120", "Learning French","Anton le noir","87654","Anytown Branch",200);
        Book book4 = new Book("444X", "Learning More French","Anton le noir","87654","Anytown Branch",200);
        Book book5 = new Book("3345", "Enough Learning French","Anton le noir","87654","Anytown Branch",200);
		
        
        DVD dvd1 = new DVD("3","An epic film java","Anytown Branch","Stephen Spielberg","99887",120);
		DVD dvd2 = new DVD("4","An epic film java","Anytown Branch","Stephen Spielberg","99887",120);
		//book1.relocate("MyCity branch");
		//System.out.println(dvd1.getTitle());
        
        
		materialCatalog.addMaterial(book1);
		materialCatalog.addMaterial(book2);
		materialCatalog.addMaterial(book3);
		materialCatalog.addMaterial(book4);
		materialCatalog.addMaterial(book5);
		materialCatalog.addMaterial(dvd1);
		materialCatalog.addMaterial(dvd2);


		UI ui = new UI();
		ui.printHeader();
		ui.printMaterialCatalog(materialCatalog.getMap());
		
		Material foundBook;
		
			try {
				foundBook = materialCatalog.findMaterial("Better");
			} catch (MaterialNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("the book was not found");
			}
		
		
		Customer customer = new Customer("Mr", "Michael", "Smith", "1 The High Street","1234","a@b.com",1,GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());
		
		
		
		double d = 1.2345;
		Locale india = new Locale("en","IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(india);
		System.out.println(nf.format(d));
		
		//System.out.println(dvd1.lend(customer));
		//dvd1.licence();
		//System.out.println(dvd1.lend(customer));
		//System.out.println(dvd1.lend(customer));
		
		System.out.println(book1.lend(customer));
		System.out.println(book1.lend(customer));
		
		System.out.println(book1.getLoanPeriod());
		//System.out.println(dvd1.getLoanPeriod());
		
		System.out.println(customer);
		//System.out.println(dvd1);
		
		//System.out.println(dvd1.equals(dvd2));
		
		Loan loan = new Loan(2,customer,book1) ; 
		
		System.out.println(loan.getDueDate());
		
		LoanRegistry loanRegistry = new LoanRegistry();
		
		try{
		loanRegistry.addLoan(loan);
		System.out.println("Add loan worked");
		}
		
		catch(LoanAlreadyExistsException e){
			System.out.println("Add loan failed");
		}
		
		try{
			loanRegistry.addLoan(loan);
			System.out.println("Add loan worked");
			}
			
			catch(LoanAlreadyExistsException e){
				System.out.println("Add loan failed");
			}
		
		System.out.println(loanRegistry.isBookOnLoan(book1.getID()));
		loan.endLoan();
		
		System.out.println(loanRegistry.isBookOnLoan(book1.getID()));
	}
	
}
