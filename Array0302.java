public class Array0302{
    public static void main(String[] args) {
        int[] lens = {1, 8, 2,10};
        int maxElement=lens[0];
        int minElement=lens[0];
        for(int i = 0; i < lens.length-1; i++){
            System.out.println("elements are :"+lens[i]);
            if(lens[i]>maxElement){
                maxElement=lens[i];
            }else if(lens[i]<minElement){
                minElement=lens[i];
            }
        }
        System.out.println("maximum element in the given array is "+maxElement);
        System.out.println("minimum element in the given array is "+minElement);
    }
}
