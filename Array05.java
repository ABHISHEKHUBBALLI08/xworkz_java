public class Array05 {
    public static void main(String[] args) {
        int[] lens = {7, 8, 4, 9, 10, 20};
        int oddCount=0;
        int evenCount=0;
        for (int i = 0; i < lens.length; i++) {
            int num = lens[i];
            
            if(num%2==0){
                System.out.println("even number are  "+num);
                evenCount++;
            }else{
                 System.out.println("odd number are "+num);
                 oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.print(evenCount);
    }
}

