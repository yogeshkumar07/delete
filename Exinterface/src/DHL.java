
public class DHL implements IDeliver{
	
	public void deliverproduct(String name,long phone,String address) {
		System.out.println(" DHL Delivered the product to "+ name+" "+phone+" at "+address);
	}
}
