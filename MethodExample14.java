public class MethodExample14{
	
	public static void carName2(int slno ,String car1){
		System.out.println("name of the car is :"+slno+". "+car1); //1
	}
	public static void carName2(String car1,int price){
		System.out.println("name of the car is "+car1+",and price is : "+price+"$"); //2
	}
	public static void carName2(String owner){
		System.out.println("owner of the car is :"+owner);//3
		System.out.println("======================================================");
	}
	public static void carName2(int slno ,String car1,int rating){
		System.out.println("name of the car2 is :"+slno+". "+car1+"rating is "+rating);//4
	}
	public static void carName2(String car1,int price,int rating){
		System.out.println("name of the car2 is "+car1+",and price is : "+price+"$ "+" rating is "+rating);//5
	}
	public static void carName2(String owner,String ownerLastName){
		System.out.println("owner of the car2 is :"+owner+"last Name is :"+ownerLastName);//6
		System.out.println("======================================================");
	}
	public static void carName2(int rating,int slno ,String car1){
		System.out.println("name of the car3 is :"+slno+". "+car1+" rating is "+rating);//7
	}
	public static void carName2(String car1,int price,double mph){
		System.out.println("name of the car3 is "+car1+",and price is : "+price+"$ "+" with a speed of :"+mph);//8
	}
	public static void carName2(String owner,double mph){
		System.out.println("owner of the car3 is :"+owner+" with a speed of :"+mph);//9
		System.out.println("======================================================");
	}
	public static void carName2(int slno ,double mph,String car1){
		System.out.println("name of the car4 is :"+slno+". "+car1+" with a speed of :"+mph);//10
	}
	public static void carName2(double mph,String car1,int price){
		System.out.println("name of the car4 is "+car1+",and price is : "+price+"$"+" with a speed of :"+mph);//11
	}
	public static void carName2(String owner,char initial){//12
		System.out.println("owner of the car4 is :"+owner+" initial is :"+initial);
		System.out.println("======================================================");
	}
	public static void carName2(int slno ,String car1,long phNumber){
		System.out.println("name of the car5 is :"+slno+". "+car1+" phone number is:"+phNumber);//13
	}
	public static void carName2(String car1,long phNumber,int price){
		System.out.println("name of the car5 is "+car1+",and price is : "+price+"$"+" phone number is:"+phNumber);//14
	}
	public static void carName2(char initial,String owner){
		System.out.println("owner of the car5 is :"+owner+" initial is :"+initial);//15
		System.out.println("======================================================");
	}
	public static void carName2(long phNumber,int slno ,String car1){
		System.out.println("name of the car6 is :"+slno+". "+car1+" phone number is:"+phNumber);//16
	}
	public static void carName2(String car1,long phNumber,float value){
		System.out.println("name of the car6 is "+car1+",and phone number is : "+phNumber+"$"+value);//17
	}
	public static void carName2(long carNumber,String owner){
		System.out.println("owner of the car6 is :"+owner+"car number"+carNumber);//18
		System.out.println("======================================================");
	}
	public static void carName2(int slno ,float value,String car1){
		System.out.println("name of the car7 is :"+slno+". "+car1+value);//19
	}
	public static void carName2(float value,String car1,int price){
		System.out.println("name of the car7 is "+car1+",and price is : "+price+"$"+value);//20
	}
	public static void carName(String[] carDetails){
		for(int i=0;i<carDetails.length;i++){
			System.out.println(carDetails[i]);
		}
	}
}