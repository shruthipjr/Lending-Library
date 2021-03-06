package models;

public class DVD extends Material {
	
	private String director;
	private String catelogNo;
	private int runningTime;
	private boolean licenced;
	
	public DVD(String id, String title, String branch, String director, String catelogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catelogNo = catelogNo;
		this.runningTime = runningTime;
		licenced = false;
	}

    public void licence(){
    	licenced = true;
    }
    
    public boolean lend(Customer customer){
		
    	if(licenced)
    	{
    		return super.lend(customer);
    	}
    	else
    		return false;
	}
    
    

	@Override
	public int getLoanPeriod() {
		return 7;
	}
	
	@Override
	public String toString(){
		return "DVD:   " + getID() + " " + getTitle() + "/" + director;
	}


}
