public class CollegeName{
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
					System.out.println("College name is :"+cName[i]);
				}
			}
		
	}
	public static void listOfCollegeNames(String collegeName){
		if(cName!=null){
			if(index<cName.length){
				cName[index]=collegeName;
				index++;
				System.out.println(" College name added successfully");

			}else{
				System.out.println("College list is already full , we can not add");
			}
			
		}else{
			System.out.println("College list is null");
		}


	}
}