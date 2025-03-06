public class Array02 {
    public static void main(String[] args) {
        int[] lens = {7, 8, 4, 9, 10, 2};
        int sum = 0;
        int target=4;
        
        for (int i = 0; i < lens.length; i++) {
            sum+= lens[i];
        }
        
        System.out.println("Sum is: " + sum);
        if(sum==target){
            System.out.println("sum equals target");
        }
        else{
            System.out.println("sum not equals target");
        }
    }
}
