public class Clothes{
	static String[] cName={null,null,null,null};
	static int  index=0;
	public static void displayNames(){
		for(int i=0;i<cName.length;i++){
				System.out.println(cName[i]);
			}
	}
	public static void searchNames(){
		String target="IPL";
		for(int i=0;i<cName.length;i++){
				if(cName[i]==target){
					System.out.println("Clothes brand  name is :"+cName[i]);
				}
			}
		
	}
	public static void listOfClothNames(String clothName){
		if(cName!=null){
			if(index<cName.length){
				cName[index]=clothName;
				index++;
				System.out.println(" Clothes name added successfully");

			}else{
				System.out.println("Cloth list is already full , we can not add");
			}
			
		}else{
			System.out.println("Clothes list is null");
		}


	}
}