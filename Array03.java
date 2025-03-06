public class Array03 {
    public static void main(String[] args) {
        int[] lens = {7, 8, 4, 9, 10, 20};
        int target=5;
        int count=0;
        System.out.println("Numbers that are multiples of 5:");
        for (int i = 0; i < lens.length; i++) {
            if (lens[i] % target == 0) { 
                System.out.println(lens[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
