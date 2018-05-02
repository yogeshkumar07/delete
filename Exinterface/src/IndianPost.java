
public class IndianPost implements IDeliver{
	
	public void deliverproduct(String name,long phone,String address) {
		System.out.println("Indian post Delivered the product to "+ name+" "+phone+" at "+address);
	}
}
