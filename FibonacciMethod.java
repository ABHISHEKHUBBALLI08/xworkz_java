public class  FibonacciMethod{
	public static void main(String[] args) {
		 
		 fino();
	}
	
	public  static void fino(){
		int num=9;
		System.out.println(num);
		int sum=0;
		for(int i=1;i<num+1;i++){
			sum+=i;
			System.out.print(i+"+ ");
		}
		System.out.println(" = "+sum);

		
	}
}