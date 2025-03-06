public class Array0310{
    public static void main(String[] args) {
        int[] lens = {1,5,16};
        boolean a=false;
        for(int i=0;i<lens.length;i++){
            a=false;
            int n=i+1;
            if(n*n==lens[i]){
                a=true;

            }
        }
        if(a){
            System.out.println("given array is a perfect square array ");
        }else{
            System.out.println("given array is not a perfect square array ");
        }
    }
}
