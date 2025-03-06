public class MultiDArraySumDiagonal{
	public static void main(String[] args) {
		int [][]num={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int index=0;index<num.length;index++){
			for(int i=0;i<num[index].length;i++){
				if(index==i){
					sum=sum+num[index][i];	
				}
					
			}
			
		}
		System.out.println(sum);
	}
	
}