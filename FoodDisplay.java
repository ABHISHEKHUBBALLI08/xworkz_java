public class FoodDisplay{

    static String[] foodName = {null, null, null, null};
    static int index = 0;
    public static boolean searchName(String food) {
        for (int i = 0; i < index; i++) {
            if (foodName[i] != null && foodName[i].equalsIgnoreCase(food)) {
                System.out.println(food);
                return true;
            }
        }
        return false;
    }
    public static int searchName1(String food) {
        for (int i = 0; i < index; i++) {
            if (foodName[i] != null && foodName[i].equalsIgnoreCase(food)) {
                System.out.println(food);
                return i;
            }
        }
        return 0;
    }
        public static void listOfFood(String food) {
        if (foodName != null) {
            if (searchName(food)) {
                System.out.println("food name already exists: " + food);
            } else if (index < foodName.length) {
                foodName[index] = food;
                index++;
                System.out.println("food added successfully: " + food);
            } else {
                System.out.println("food list is full, cannot add: " + food);
            }
        } else {
            System.out.println("food list is null.");
        }
    }
    public static void delete(String food){
        if(foodName!=null){
            int a=searchName1(food);
                foodName[a]=null;
                System.out.println("deleteed successfully");
            
            
        }else {
            System.out.println("food list is null.");
        }
        
    }
    public static void update(String food){
        if(foodName!=null){
            int a=searchName1(food);
                foodName[a]="puri";
                System.out.println("updated successfully");
            
            
        }else {
            System.out.println("food list is null.");
        }
        
    }
}
