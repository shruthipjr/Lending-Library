package models;

import java.util.ArrayList;

import utilities.LoanStatus;

public class LoanRegistry {

	private ArrayList<Loan> registry;
	

	public LoanRegistry(){
		registry = new ArrayList<Loan>();
		
	}

	public void addLoan(Loan loan) throws LoanAlreadyExistsException{

		if(registry.contains(loan)){
			throw new LoanAlreadyExistsException();
		}
		
		registry.add(loan);

	}

	public Loan findLoan(String bookID) throws LoanNotFoundException{
	for(Loan loan: registry){
		if(loan.getBook().getID().equals(bookID) && loan.getStatus() == LoanStatus.CURRENT){
			return loan;
		}
	}

		throw new LoanNotFoundException();

	}

	public boolean isBookOnLoan(String bookID){

		try {
			Loan b= findLoan(bookID);
			return true;

		} 
		catch (LoanNotFoundException e) {
			
			return false;
		}
		
	}
}
