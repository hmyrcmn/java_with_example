package encapsulatýon;

public class Product {
	
	 private String name;
	 private String details;
	 private int Id;
	 private double price;
	 private String kod;
	 
	 public Product() {
		 System.out.println("yapýcý constracter blok çalýþtý");
	 }
	
	// private tanýmladýgý için set ve get ile kullanmaya açmam gerekir
	 public void getKod(String kod) {
		 this.kod = kod;
	 }
	 public String setkod(String kod) {
		 return getName().substring(0, 3)+getId();
	 }
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		Id = Id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
