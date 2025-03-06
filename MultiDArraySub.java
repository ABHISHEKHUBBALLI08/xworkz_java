public class MultiDArraySub{
	public static void main(String[] args) {
		int [][]num1={{1,2,3},{4,5,6},{7,8,9}};
		int [][]num2={{1,2,3},{4,5,6},{7,8,9}};
		int [][]temp=new int[3][3];
		for(int index=0;index<num1.length;index++){
			for(int i=0;i<num1[index].length;i++){
				temp[index][i]=num1[index][i]-num2[index][i] ;
				
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){

				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}