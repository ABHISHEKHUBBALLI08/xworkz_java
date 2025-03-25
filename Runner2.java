public class Runner2{
	public static void main(String[] args) {
		// Class Jamoon
        Jamoon jamoon = new Jamoon();
        System.out.println("Jamoon count: " + jamoon.jamoonSize);
        System.out.println("Jamoon color: " + jamoon.jamoonColor);
        System.out.println("Jamoon sugary? " + jamoon.jamoonSugary);
        System.out.println("Jamoon type: " + jamoon.jamoonType);
        jamoon.jamoonSize = 5;
		jamoon.jamoonColor = "Brown-reddish";
		jamoon.jamoonSugary = true;
		jamoon.jamoonType = "Gulab";
        System.out.println("Jamoon count: " + jamoon.jamoonSize);
        System.out.println("Jamoon color: " + jamoon.jamoonColor);
        System.out.println("Jamoon sugary? " + jamoon.jamoonSugary);
        System.out.println("Jamoon type: " + jamoon.jamoonType);
        System.out.println("================================================");
        
        // Class Hair
        Hair hair = new Hair();
        System.out.println("Hair color: " + hair.hairColor);
        System.out.println("Hair length: " + hair.hairLength);
        System.out.println("Hair curly? " + hair.hairCurly);
        System.out.println("Hair type: " + hair.hairType);
        hair.hairColor = "Black";
		hair.hairLength = 25;
		hair.hairCurly = false;
		hair.hairType = "Straight";
        System.out.println("Hair color: " + hair.hairColor);
        System.out.println("Hair length: " + hair.hairLength);
        System.out.println("Hair curly? " + hair.hairCurly);
        System.out.println("Hair type: " + hair.hairType);
        System.out.println("================================================");   
        
        // Class Siren
        Siren siren = new Siren();
        System.out.println("Siren sound type: " + siren.sirenSoundType);
        System.out.println("Siren volume: " + siren.sirenVolume);
        System.out.println("Siren battery backup? " + siren.sirenBatteryBackup);
        System.out.println("Siren usage: " + siren.sirenUsage);
        siren.sirenSoundType = "Loud";
		siren.sirenVolume = 90;
		siren.sirenBatteryBackup = true;
		siren.sirenUsage = "Emergency";
        System.out.println("Siren sound type: " + siren.sirenSoundType);
        System.out.println("Siren volume: " + siren.sirenVolume);
        System.out.println("Siren battery backup? " + siren.sirenBatteryBackup);
        System.out.println("Siren usage: " + siren.sirenUsage);
        System.out.println("================================================");
        
        // Class Patient
        Patient patient = new Patient();
        System.out.println("Patient name: " + patient.patientName);
        System.out.println("Patient age: " + patient.patientAge);
        System.out.println("Patient disease: " + patient.patientDisease);
        System.out.println("Patient admitted? " + patient.patientAdmitted);
        patient.patientName = "ravi";
		patient.patientAge = 45;
		patient.patientDisease = "Cold-Flu";
		patient.patientAdmitted = false;
        System.out.println("Patient name: " + patient.patientName);
        System.out.println("Patient age: " + patient.patientAge);
        System.out.println("Patient disease: " + patient.patientDisease);
        System.out.println("Patient admitted? " + patient.patientAdmitted);
        System.out.println("================================================");
        
        // Class Crane
        Crane crane = new Crane();
        System.out.println("Crane type: " + crane.craneType);
        System.out.println("Crane capacity: " + crane.craneCapacity);
        System.out.println("Crane mobile? " + crane.craneMobile);
        System.out.println("Crane operator: " + crane.craneOperator);
        crane.craneType = "Tower";
		crane.craneCapacity = 500;
		crane.craneMobile = false;
		crane.craneOperator = "Operator A";
        System.out.println("Crane type: " + crane.craneType);
        System.out.println("Crane capacity: " + crane.craneCapacity);
        System.out.println("Crane mobile? " + crane.craneMobile);
        System.out.println("Crane operator: " + crane.craneOperator);
	}
}