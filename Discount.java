public class Discount{
	public static void main(String abhi[]){
		int totalBill=110;
		if(totalBill>100){
			totalBill=totalBill-(totalBill*10)/100;
			System.out.println("totalbill is with discount :"+totalBill);
		}else{
			System.out.println("totalbill is :"+totalBill);
		}

	}
}