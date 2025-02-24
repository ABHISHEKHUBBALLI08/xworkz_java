public class Palindrome{
    public static void main(String[] args) {
        int num = 150, rev = 0, oriNum = num;

        for (int i=num;i!= 0;i=i/ 10) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
        }

        if (oriNum == rev) {
            System.out.println(oriNum + " is a palindrome number.");
        } else {
            System.out.println(oriNum + " is not a palindrome number.");
        }
    }
}
