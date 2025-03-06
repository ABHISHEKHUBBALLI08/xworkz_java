public class ContactNumber{
	public static void main(String[] args) {
		long n=7208193465l;
		while(n!=0){
			long digit= n%10;
			n=n/10;
			if(digit==5){
				System.out.print(" Hi");
			}
			// break;
			else if(digit==6){
				System.out.print(" I'm");
			}  else if(digit==4){
				System.out.print(" Abhishek");
			}else if(digit==3){
				System.out.print(" persuing");
			}else if(digit==9){
				System.out.print(" cse");
			}else if(digit==1){
				System.out.print(" from");
			}else if(digit==8){
				System.out.print(" agmr");
			}else if(digit==0){
				System.out.print(" college");
			}else if(digit==2){
				System.out.print(" good at front end develooping &");
			}
			else if(digit==7) {
				System.out.print(" data analyst");
			}
			
		}
		

	}
}