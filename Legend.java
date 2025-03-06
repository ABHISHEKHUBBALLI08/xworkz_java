public class Legend{
	static String legendName;
	static String teamName;
	static int trophiesWonInIcc;
	static String[] nickNames={null,null};

	public static void legendDetails(){
		Legend.legendName="M S Dhoni";
		Legend.teamName="CSK";
		Legend.trophiesWonInIcc=4;
		Legend.nickNames[0]="Thala";
		Legend.nickNames[1]="GOAT";
		System.out.println("legend name is :"+Legend.legendName);
		System.out.println("legend's team  name is :"+Legend.teamName);
		System.out.println("trophies won are :"+trophiesWonInIcc);
		for(String name:Legend.nickNames){
			System.out.println(name);
		}
	}
}