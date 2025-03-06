public class Software {
    static String softwareName;
    static String founderName;
    static String ceoName;
    static int foundationYear;
    static String[] headQuarters = new String[2]; // Properly initialized array

    public static void softwareDetails() {
        softwareName = "Microsoft Corporation";
        founderName = "Bill Gates";
        ceoName = "Satya Nadella";
        foundationYear = 1975;
        headQuarters[0] = "Redmond";
        headQuarters[1] = "Washington";

        System.out.println("Software Name: " + softwareName);
        System.out.println("Founder Name: " + founderName);
        System.out.println("CEO Name: " + ceoName);
        System.out.println("Foundation Year: " + foundationYear);
        System.out.print("Headquarters: ");
        
        for (String name : headQuarters) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
