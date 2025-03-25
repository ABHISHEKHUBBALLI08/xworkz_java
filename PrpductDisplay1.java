public class PrpductDisplay1{

    static int[][] productDetails = {{0,0,0},{0,0,0}};
    static int index = 0;
    public static boolean searchName(int productNo,int price) {
        for (int i = 0; i < index; i++) {
            for(int j=0;j < index;j++){
                if ( productDetails[i][j] != 0 &&  productDetails[i][j]==productNo) {
                System.out.println(productNo+", "+price);
                return true;
                }
            }
            
        }
        return false;
    }
    // public static int searchName1(int productNo,int price) {
    //     for (int i = 0; i < index; i++) {
    //         for(int j=0;j < index;j++){
    //             if ( productDetails[i][j] != 0 &&  productDetails[i][j]==productNo){
    //                 System.out.println(productNo+", "+price);
    //                 return i;
                    
    //             }
    //         }
    //     }
    //     return 0;
    // }
        public static void listOfFood(int productNo,int price) {
        if ( productDetails!= null) {
            if (searchName(productNo,price)) {
                System.out.println("product no  already exists: " +productNo+", "+price );
            } else if (index < productDetails.length ) {
                for(int i=0;i<index;i++){
                    if(index==0){
                        productDetails[index][i] =productNo; 
                    }
                    else{
                        productDetails[index][i] =price; 
                    }
                }
                index++;
                System.out.println(productNo+": "+price);
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println("food list is null.");
        }
    }
    public static void delete(int productNo,int price){
        if(productNo!=0 && price!=0){
            for (int i = 0; i < index; i++) {
                for(int j=0;j < index;j++){
                    if ( productDetails[i][j] != 0 &&  productDetails[i][j]==productNo){
                        productDetails[i][j]=0; 
                        System.out.println("deleted successfully") ;      
                }
                else{
                    System.out.println("not present");
                }
            }
        }
        }else {
            System.out.println("food list is null.");
        }
        
    }
    public static void update(int productNo,int price){
        if(productNo!=0 && price!=0){
            for (int i = 0; i < index; i++) {
                for(int j=0;j < index;j++){
                    if ( productDetails[i][j] != 0 &&  productDetails[i][j]==productNo){
                        productDetails[i][j]=123; 
                        System.out.println("update successfully") ;      
                }
            }
        }
        }else {
            System.out.println("food list is null.");
        }
        
    }
}
