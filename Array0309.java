public class Array0309{
    public static void main(String[] args) {
        int[] lens = {1,4,5, 3,5, 2,10};
        int sum=0;
        int target=10;
         for (int i = 0; i < lens.length-2; i++) {
            sum=lens[i]+lens[i+1]+lens[i+2];
            if(sum==target){
                System.out.println("elements are:"+lens[i]+","+lens[i+1]+","+lens[i+2]);
            }  
        }
    }
}
