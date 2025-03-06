public class EmailListRunner{
	public static void main(String[] args) {
		EmailList.listOfUserEmail("user01@gmail.com");
		EmailList.listOfUserEmail("user02@gmail.com");
		EmailList.listOfUserEmail("user03@gmail.com");
		EmailList.listOfUserEmail("user04@gmail.com");


		
		for(int i=0;i<EmailList.email.length;i++){
				System.out.println(EmailList.email[i]);
			}
	}
}