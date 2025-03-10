public class EmailDisplayRunner {
    public static void main(String[] args) {
        EmailDisplay.listOfEmail("abc@gmail.com");
        EmailDisplay.listOfEmail("def@gmail.com");
        EmailDisplay.listOfEmail("abd@gmail.com");
        EmailDisplay.listOfEmail("abe@gmail.com");
        boolean found = EmailDisplay.searchName("abc@gmail.com");
        System.out.println("Search result: " +found);

        FoodDisplay.listOfFood("north indian food ");
        FoodDisplay.listOfFood("dose");
        FoodDisplay.listOfFood("idli");
        FoodDisplay.listOfFood("south-indian food");
        boolean found = FoodDisplay.searchName("idli");
        System.out.println("Search result: " +found);
    }
}