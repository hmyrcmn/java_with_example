package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//loglama!!
		CustomerManager bilgi=new CustomerManager();
		bilgi.add(new FileLogger());
		bilgi.add(new DatabaseLogger());
		bilgi.add(new EmailLogger());
		

	}

}
