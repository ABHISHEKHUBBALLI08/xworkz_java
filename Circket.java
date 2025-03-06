public class Circket{
	static String[] gameName={null,null,null,null};
	static int  index=0;
	public static void displayNames(){
		for(int i=0;i<gameName.length;i++){
				System.out.println(gameName[i]);
			}
	}
	public static void listOfCircketName(String circketName){
		if(gameName!=null){
			if(index<gameName.length){
				gameName[index]=circketName;
				index++;
				System.out.println(" Circket name added successfully");

			}else{
				System.out.println("circket  list is already full , we can not add");
			}
			
		}else{
			System.out.println("circket list is null");
		}


	}
}