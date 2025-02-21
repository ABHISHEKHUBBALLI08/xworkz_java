public class Swapping{
	public static void main(String abhi[]){
		int a1=10;
		int a2=2;
		System.out.println("value of a1 before swapping:"+a1);
		System.out.println("value of a2 before swapping:"+a2);
		
		a1=a1+a2;
		a2=a1-a2;
		a1=a1-a2;
		System.out.println("value of a1 after swapping:"+a1);
		System.out.println("value of a2  after swapping:"+a2);
		

	}
}