public class  ArrayMethod{
	public static void main(String[] args) {
		arr();
	}
	
	public  static void arr(){
		int[][] num={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println();	
		}
			
	}
}