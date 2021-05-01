package encapsulatýon;

public class Main {
	
	public static void main(String[] args) {
	// kapsüllemek konu pekiþtirme project
	Product product =new Product();
	product.setName("laptop");
    product.setDetails("del 5401");
    product.setPrice(15000);
    product.setId(1);
    
    
    System.out.println("bilgiler "+product.getName()+product.getDetails()+product.getPrice()+product.getId());
	}
}
