
public class Customer {
	private int id;
	private String name;
	Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
//	@Override
//	public int compareTo(Customer customer) {
//		if(id>customer.id){  
//	        return 1;  
//	    }else if(id<customer.id){  
//	        return -1;  
//	    }else{  
//	    	return 0;  
//	    }
//	}
	
}