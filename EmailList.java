public class EmailList{
	static String[] email={null,null,null,null};
	static int  index=0;
	public static void listOfUserEmail(String userEmail){
		if(email!=null){
			if(index<email.length){
				email[index]=userEmail;
				index++;
				System.out.println("added successfully");

			}else{
				System.out.println(" already full can not add");
			}
			
		}else{
			System.out.println("email is null");
		}


	}
}