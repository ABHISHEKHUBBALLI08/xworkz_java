public class MultiDArrayMaxCol{
	public static void main(String[] args) {
		int [][]num={{1,2,3},{4,5,6},{7,8,9}};
		int max=num[0][0];
		int digit=0;
		for(int index=0;index<num.length;index++){
			max=num[index][0];
			for(int i=0;i<num[index].length;i++){
				digit=num[i][index];
				if(max<digit){
					max=num[i][index];

				}
				
			}
			System.out.print(max+" ");
			System.out.println("  ");
		}
		
		
	}
	
}
// 1 2 3
// 4 5 6
// 7 8 9