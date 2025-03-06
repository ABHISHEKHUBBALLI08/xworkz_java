public class Array0308{
    public static void main(String[] args) {
        int[] lens = {1, 8, 2,10};
        int num=lens[2];
        int count=0;
        for (int i = 0; i < lens.length; i++) {
            if(lens[i]>num){
                count++;
            }
        }
        System.out.println("elements greater then the given array element "+num+" is "+count);
    }
}
