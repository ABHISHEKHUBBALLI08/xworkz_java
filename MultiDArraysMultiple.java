public class MultiDArraysMultiple{
	public static void main(String[] args) {
		int [][]num1={{1,2,3},{4,5,6},{7,8,9}};
		int [][]num2={{1,2,3},{4,5,6},{7,8,9}};
		int [][]temp=new int[3][3];
		for(int index=0;index<num1.length;index++){
			for(int i=0;i<num1[index].length;i++){
				for(int k=0;k<=2;k++){
					temp[index][i]+=(num1[index][i]*num2[k][i]) ;
				}
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
// 1 2 3  1 2 3  
// 4 5 6  4 5 6   1*1+1*4+1*7=num1[0][0]*num2[0][0]+num1[0][0]*num2[1][0]+num1[0][0]*num2[2][0] 2*2+2*5+2*8=num1[0][1]*num2[0][1] 3*3+3*6+3*9
// 7 8 9  7 8 9   4*1+1*4+1*7=  5*2+2*5+2*8 6*3+3*6+3*9
//                7*1+1*4+1*7  8*2+2*5+2*8 9*3+9*6+9*9