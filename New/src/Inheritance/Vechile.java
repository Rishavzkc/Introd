package Inheritance;

public class Vechile {

	
	 int id =100;
	 String company ="Tata";
     String colour ="Red";
     String Size ="Big";
 
     
    public  Vechile() { 
 
	}

	public Vechile(int id, String company, String colour, String size) {
		super();
		this.id = id;
		this.company = company;
		this.colour = colour;
		Size = size;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}
    
	public void run() {
		System.out.println("vechile is running");
	}
	
	public void stand() {
		System.out.println("vechile is standing");
	};
	

}
