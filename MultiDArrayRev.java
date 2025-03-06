public class MultiDArrayRev{
	public static void main(String[] args) {
		int [][]num={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("original  multi dimensional array:");
		for(int index=0;index<num.length;index++){
			for(int i=0;i<num[index].length;i++){
				System.out.print(num[index][i]+" ");
			}
			System.out.println();
		}
		System.out.println("\nTransposed multi dimensional array:");
        for (int i = 0; i < num[0].length; i++) {
            for (int j = 0; j < num.length; j++) { 
                System.out.print(num[j][i] + " ");
            }
            System.out.println();
        }
	}
	
}