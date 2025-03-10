Apublic class EmailDisplay{

    static String[] emailName = {null, null, null, null};
    static int index = 0;
    public static boolean searchName(String email) {
        for (int i = 0; i < index; i++) {
            if (emailName[i] != null && emailName[i].equalsIgnoreCase(email)) {
                System.out.println(email);
                return true;
            }
        }
        return false;
    }
        public static void listOfEmail(String email) {
        if (emailName != null) {
            if (searchName(email)) {
                System.out.println("email name already exists: " + email);
            } else if (index < emailName.length) {
                emailName[index] = email;
                index++;
                System.out.println("email added successfully: " + email);
            } else {
                System.out.println(" email list is full, cannot add: " + email);
            }
        } else {
            System.out.println("email list is null.");
        }
    }
}
