public class Array0305{
    public static void main(String[] args) {
        int[] lens = {1, 8, 2,10};
        double sum=0;
        double n=lens.length;
        for (int i = 0; i < lens.length; i++) {
            sum+=lens[i];
        }
        System.out.println("sum is "+sum);
        double avg=(sum/n);
         System.out.println("avg is"+avg);
    }
}
