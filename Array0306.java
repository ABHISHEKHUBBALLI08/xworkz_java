public class Array0306 {
    public static void main(String[] args) {
        int[] lens = {1, 2,3, 4, 5};
        int n=lens.length+1;
        int s=n*(n+1)/2;
        int sum=0;
        for(int i = 0; i < lens.length; i++){
            sum+=lens[i];
            
        }
        int div=s-sum;
        System.out.println(div);

    }
}
