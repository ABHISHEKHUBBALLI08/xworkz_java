public class Runner{
	public static void main(String[] args) {
		//class Floor
		Floor floor=new Floor();
		System.out.println("length of the floor is:"+floor.length);
		System.out.println("breadth of the floor is:"+floor.breadth);
		System.out.println("area of the floor is:"+(floor.length*floor.breadth));
		System.out.println("type of the floor is:"+floor.floorType);
		floor.length=10;
		floor.breadth=10;
		floor.floorType="Marble";
		System.out.println("length of the floor is:"+floor.length);
		System.out.println("breadth of the floor is:"+floor.breadth);
		System.out.println("area of the floor is:"+(floor.length*floor.breadth));
		System.out.println("type of the floor is:"+floor.floorType);
		System.out.println("================================================");

		//class Terrace
		Terrace terrace = new Terrace();
		System.out.println("area of the terrace is:"+terrace.area);
		System.out.println("color of the terrace is:"+terrace.color);
		System.out.println("design of the terrace is:"+terrace.design);
		System.out.println("do we have sunroof?"+terrace.sunroof);
		terrace.area=100;
		terrace.color="White";
		terrace.design="garden seat-out";
		terrace.sunroof=true;
		System.out.println("area of the terrace is:"+terrace.area);
		System.out.println("color of the terrace is:"+terrace.color);
		System.out.println("design of the terrace is:"+terrace.design);
		System.out.println("do we have sunroof?"+terrace.sunroof);
		System.out.println("================================================");

		// Class Bed
        Bed bed = new Bed();
        System.out.println("Bed size is: " + bed.bedSize);
        System.out.println("Bed material is: " + bed.bedMaterial);
        System.out.println("Bed foldable? " + bed.bedFoldable);
        System.out.println("Bed type: " + bed.bedType);
        bed.bedSize = 6;
		bed.bedMaterial = "Wood";
		bed.bedFoldable = false;
		bed.bedType = "King";
		System.out.println("Bed size is: " + bed.bedSize);
        System.out.println("Bed material is: " + bed.bedMaterial);
        System.out.println("Bed foldable? " + bed.bedFoldable);
        System.out.println("Bed type: " + bed.bedType);
        System.out.println("================================================");

        
        // Class Shirt
        Shirt shirt = new Shirt();
        System.out.println("Shirt color is: " + shirt.shirtColor);
        System.out.println("Shirt size is: " + shirt.shirtSize);
        System.out.println("Shirt fabric: " + shirt.shirtFabric);
        System.out.println("Shirt has pocket? " + shirt.shirtHasPocket);
        shirt.shirtColor = "Blue";
		shirt.shirtSize = "M";
		shirt.shirtFabric = "Cotton";
		shirt.shirtHasPocket = true;
		System.out.println("Shirt color is: " + shirt.shirtColor);
        System.out.println("Shirt size is: " + shirt.shirtSize);
        System.out.println("Shirt fabric: " + shirt.shirtFabric);
        System.out.println("Shirt has pocket? " + shirt.shirtHasPocket);
        System.out.println("================================================");
        
        // Class Hanger
        Hanger hanger = new Hanger();
        System.out.println("Hanger material is: " + hanger.hangerMaterial);
        System.out.println("Hanger capacity is: " + hanger.hangerCapacity);
        System.out.println("Hanger rotatable? " + hanger.hangerRotatable);
        System.out.println("Hanger type: " + hanger.hangerType);
        hanger.hangerMaterial = "Plastic";
		hanger.hangerCapacity = 10;
		hanger.hangerRotatable = true;
		hanger.hangerType = "Clothes";
		System.out.println("Hanger material is: " + hanger.hangerMaterial);
        System.out.println("Hanger capacity is: " + hanger.hangerCapacity);
        System.out.println("Hanger rotatable? " + hanger.hangerRotatable);
        System.out.println("Hanger type: " + hanger.hangerType);
        System.out.println("================================================");
        
        // Class Anchor
        Anchor anchor = new Anchor();
        System.out.println("Anchor material is : " + anchor.anchorMaterial);
        System.out.println("Anchor weight is: " + anchor.anchorWeight);
        System.out.println("Anchor rust proof? " + anchor.anchorRustProof);
        System.out.println("Anchor type: " + anchor.anchorType);
        anchor.anchorMaterial = "Steel";
		anchor.anchorWeight = 50;
		anchor.anchorRustProof = true;
		anchor.anchorType = "Boat";
        System.out.println("Anchor material is: " + anchor.anchorMaterial);
        System.out.println("Anchor weight is: " + anchor.anchorWeight);
        System.out.println("Anchor rust proof? " + anchor.anchorRustProof);
        System.out.println("Anchor type: " + anchor.anchorType);
        

	}
}