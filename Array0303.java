public class Array0303 {
    public static void main(String[] args) {
        int[] lens = {1, 8, 2, 10};
        int minElement = lens[0];
        secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < lens.length; i++) {
            System.out.println("Element in array are : " + lens[i]);
            if (lens[i] < minElement) {
                secondMin = minElement;
                minElement = lens[i];
            } else if (lens[i] < secondMin && lens[i] != minElement) {
                secondMin = lens[i];
            }
        }

        System.out.println("Second minimum element in the given array is " + secondMin);
    }
}
