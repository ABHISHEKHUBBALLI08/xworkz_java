public class Product001Runner{
	public static void main(String[] args) {
		Product001.productDeatils("laptop",25500.00);
		System.out.println("==========================");
		Product001.productDeatils("Frill and Thrill","laptop",25500.00);
		System.out.println("==========================");
		Product001.productDeatils(25500.00,"phone");
		System.out.println("==========================");
		Product001.productDeatils(25500.00);
		System.out.println("==========================");
		Product001.productDeatils(25600.00);
		System.out.println("==========================");
		Product001.productDeatils("2024Ut0!",25500.00,"laptop");
		System.out.println("==========================");
		Product001.productDeatils("202345hgd",25500.00,"T-shirt");
		System.out.println("==========================");
		Product001.productDeatils("202345d",25500.00,"shirt");
		System.out.println("==========================");
		Product001.productDeatils(1,1,0);
		Product001.productDeatils(0,1,0);
		Product001.productDeatils(0,0,1);
		

	}
}