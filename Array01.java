public  class Array01{
	public static void main(String[] args) {
		int[] lens={7,8,4,9,10,2};
		int target=8;
		for(int i=0;i<lens.length;i++){
			if(lens[i]==target){
				System.out.println("target is present ");
				return ;
			}
				
		}
		System.out.println("target is  NOT  present ");

		
	}
}