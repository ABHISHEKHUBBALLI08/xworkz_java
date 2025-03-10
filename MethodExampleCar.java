public class MethodExampleCar{
	
	public static void carName(int slno ,String car1){
		System.out.println("name of the car is :"+slno+". "+car1);
	}
	public static void carName(String car1,int price){
		System.out.println("name of the car is "+car1+",and price is : "+price+"$");
	}
	public static void carName(String owner){
		System.out.println("owner of the car is :"+owner);
	}
}