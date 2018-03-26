package models;

public abstract class Material {

	 private String id;
	 private String title;
	 private String branch;
	 private Customer borrower;
	 
	public Material(String id, String title, String branch) {
		
		this.id = id;
		this.title = title;
		this.branch = branch;
	}
	
	//be very careful while creating getter and setter methods as it tempting to do so
	// because it can give access to others to change your fields

	public String getTitle() {
		return title;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Material other = (Material) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getID(){
		return id;
	}
	 
	public void relocate(String newBranch){
		this.branch = newBranch;
	}
	
	public boolean lend(Customer customer){
		if(borrower == null){
			borrower = customer;
			return true;
		}
		else{
			return false;
		}
	}
	
	//must be overidden -- we are forcing programmers to use our design for the classes they create
    // abstract methods are written in abstract class
	public abstract int getLoanPeriod();
	
	@Override
	public String toString(){
		return id + " :" + title;
	}
	
	
}
