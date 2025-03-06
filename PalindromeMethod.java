public class  PalindromeMethod{
	public static void main(String[] args) {
		 if(palin()){
		 	System.out.println(" is a plaindrome");
		 }else{
		 	System.out.println(" is not a plaindrome");
		 }
		 
	}
	
	public  static boolean palin(){
		int num=122;
		int ori=num;
		int rev=0;
		while(num>0){
			int digit=num%10;
			num=num/10;
			rev =rev*10+digit;
			

		}
		return rev==ori;
		
	}
}