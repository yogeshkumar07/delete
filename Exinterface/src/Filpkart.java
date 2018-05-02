import java.util.Random;
import java.util.Scanner;

public class Filpkart {
	void sell(){
		Random r = new Random();
		int option=r.nextInt(3)+1;
		Scanner s= new Scanner(System.in);
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println("enter your phone number ");
		long phone =s.nextLong();
		s.nextLine();
		System.out.println("enter your address");
		String address= s.nextLine();
		if (option==1) {
			FedEx f = new FedEx();
			f.deliverproduct(name,phone,address);
		}else if (option==2) {
			IndianPost i = new IndianPost();
			i.deliverproduct(name,phone,address);
		}else if (option==3) {
			DHL d = new DHL();
			d.deliverproduct(name,phone,address);
		}
	}
}