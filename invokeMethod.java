public class InvokeMethod {
    static int count = 0;
    public static void main(String[] args) {
        fino();
        fino();
        System.out.println("Final Count: " + count); 
    }

    public static boolean fino() {
        count++; 
        System.out.println("Hi Abhishek");
        System.out.println("Current Count: " + count);
        return true;
    }
}
