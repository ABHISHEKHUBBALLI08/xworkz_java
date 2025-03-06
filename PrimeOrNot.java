public class PrimeOrNot{
    public static void main(String[] args) {
        int num = 30;
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }
        for (int i=2;i<=num/2;i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println(" is not a prime number.");
        }
    }
}
