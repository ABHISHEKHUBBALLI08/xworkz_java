public  class Sorting{
	public static void main(String[] args) {
		int[] lens={7,8,4,9,10,2};
		//2,4,7,8,9,16
		for(int i=0;i<lens.length-1;i++){
			for(int j=0;j<lens.length-1-i;j++){
				if(lens[j]>lens[j+1]){
				int t=lens[j];
				lens[j]=lens[j+1];
				lens[j+1]=t;
				}
			}
		}
		System.out.println("SORTED ARRAY IS ");
		for(int i=0;i<lens.length;i++){
			System.out.println(lens[i]);
		}
	}
}