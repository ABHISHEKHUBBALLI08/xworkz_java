public class Array04 {
    public static void main(String[] args) {
        int[] lens = {30, 7, 11, 25, 17, 19, 20};
        System.out.println("prime elements are:");
        for (int i = 0; i < lens.length; i++) {
            int num = lens[i];
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");

            } else {
                System.out.println(num + " is not a prime number.");
                
            }
        }
    }
}
