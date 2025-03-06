public class Array06 {
    public static void main(String[] args) {
        int[] lens = {7, 3, 8, 4, 9, 1};
        int target = 10;
        for (int i = 0; i<lens.length-1; i++)
        { 
            int n=lens[i]+lens[i + 1] ;
            if (n == target)
            {
                System.out.println("elements are  "+ lens[i] + ", " + lens[i + 1] );
            }
        }
    }
}
