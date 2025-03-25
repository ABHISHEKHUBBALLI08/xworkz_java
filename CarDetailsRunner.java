public class MainRunner {
    public static void main(String[] args) {
  
        System.out.println("=== CarDetails01 ===");
        CarDetails01.display( 10);
        CarDetails01.display(100);
        CarDetails01.display(1000);
        CarDetails01.display(10000L);
        CarDetails01.display(10.5f);
        CarDetails01.display(20.99);
        CarDetails01.display('A');
        CarDetails01.display(true);
        CarDetails01.display("Hello, Java!");
        CarDetails01.display(5, 15);
        System.out.println("=== CarDetails02 ===");
        CarDetails02.method(10, 200);
        CarDetails02.method(300, 400.5);
        CarDetails02.method(1000L, 'Z');
        CarDetails02.method(9.8f, true);
        CarDetails02.method(500, 6000L);
        CarDetails02.method(99.99, 20);
        CarDetails02.method('X', 12.3f);
        CarDetails02.method(false,  250);
        CarDetails02.method(7000L, true);
        CarDetails02.method(8, 'Y', 123.456);

        System.out.println("\n=== CarDetails03 ===");
        CarDetails03.method( 50, 6000L, 2.5f);
        CarDetails03.method(100, 45.67, true);
        CarDetails03.method( 3, 'C', false);
        CarDetails03.method(5.6f, 8000L, 9.123);
        CarDetails03.method( 99, 400, 7);
        CarDetails03.method(true, 88.88, 'B');
        CarDetails03.method(123, false, 7.89f);
        CarDetails03.method(10000L,  4,  20);
        CarDetails03.method('P', 1.5f, true);
        CarDetails03.method(9.876, 321, 7654L);
    }
}
