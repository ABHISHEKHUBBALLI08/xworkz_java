public class ProductName{
	static String[] pName={null,null,null,null};
	static int  index=0;
	public static void displayNames(){
		for(int i=0;i<pName.length;i++){
				System.out.println(pName[i]);
			}
	}
	public static void searchNames(){
		String target="T-shirt";
		for(int i=0;i<pName.length;i++){
				if(pName[i]==target){
					System.out.println("product name is :"+pName[i]);
				}
			}
		
	}
	public static void listOfProductName(String productName){
		if(pName!=null){
			if(index<pName.length){
				pName[index]=productName;
				index++;
				System.out.println(" Product name added successfully");

			}else{
				System.out.println(" list is already full , we can not add");
			}
			
		}else{
			System.out.println("product list is null");
		}


	}
}