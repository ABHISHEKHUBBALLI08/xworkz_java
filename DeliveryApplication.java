public class DeliveryApplication{
	static String[] deliveryAppName=new String[4];
	static int  index=0;
	public static void displayNames(){
		for(int i=0;i<deliveryAppName.length;i++){
				System.out.println(deliveryAppName[i]);
			}
	}

	public static boolean searchName(){
		String target="Zomato";
		for(int i=0;i<deliveryAppName.length;i++){
				if(deliveryAppName[i]==target){
					System.out.println("product name is :"+deliveryAppName[i]);
				}
			}
		
		return true;
	}
	public static void listOfApplicationName(String appName){
		if(deliveryAppName!=null){
			if(index<deliveryAppName.length){
				for(int i=0;i<deliveryAppName.length;i++){
						if(index==0){
							deliveryAppName[i]=appName;
							index++;
								System.out.println("1st name added successfully");
								return;
						}else{
							
							if(deliveryAppName[i]!=appName){
								deliveryAppName[index]=appName;
								index++;
								
								System.out.println("next name added successfully");
								return;
							}
							else{
								System.out.println("element is already present");
								return;
							}
						}
				}
			}else{
				System.out.println(" list is already full , we can not add");
			}
		}else{
			System.out.println("product list is null");
		}
	}
}