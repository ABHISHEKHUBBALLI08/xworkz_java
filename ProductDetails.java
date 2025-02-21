public class ProductDetails{
	public static void main(String args[]){

		System.out.println("product amount are follows :");
		String pName= "LAPTOP";
		int price= 50000;
		int discount=50;
		String brandName="Lenovo";
		int gst=20;
		int donation=10000;
		int delivery_fee=1000;
		int platfrom_fee=1000;
		int t_payable_Amount=price+donation+delivery_fee+platfrom_fee;
		int payable_Amount=t_payable_Amount+(t_payable_Amount*18)/100;
		int actual_amount=(payable_Amount*discount)/100;
		// System.out.println("Total payable  amount with gst:"+payable_Amount);
		// System.out.println("Total payable amount without gst:"+t_payable_Amount);
		// System.out.println("Total actual payable amount after discount:"+actual_amount);
		System.out.println("Total payable amount with gst:"+(price+donation+delivery_fee+platfrom_fee));
		System.out.println("Total payable amount without gst:"+(t_payable_Amount+(t_payable_Amount*18)/100));
		System.out.println("Total actual payable amount after discount:"+((payable_Amount*discount)/100));

	}
}