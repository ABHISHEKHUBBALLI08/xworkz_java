public class MultiDArray90Degree{
	public static void main(String[] args) {
		int [][]num={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("original  multi dimensional array:");
		for(int index=0;index<num.length;index++){
			for(int i=0;i<num[index].length;i++){
				System.out.print(num[index][i]+" ");
			}
			System.out.println();
		}
		System.out.println("\nrotation by 90 Degree of  multi dimensional array:");
        for (int index = num.length-1; index>=0 ; index--) {
            for (int i = 0; i < num.length; i++) { 
                System.out.print(num[i][index] + " ");
            }
            System.out.println();
        }
	}
	
}
// 123
// 456
// 789

// 369
// 258
// 147