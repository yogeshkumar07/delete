
public class Person {
	void purchase() {
		System.out.println("opened the filpkart website");
		Filpkart f = new Filpkart();
        System.out.println("requesting filpkart to sell the product");
		f.sell();
	}
public static void main(String[] args) {
	System.out.println("person is present");
	Person p = new Person();
	System.out.println("he is purchasing The Product");
	p.purchase();
}
}
