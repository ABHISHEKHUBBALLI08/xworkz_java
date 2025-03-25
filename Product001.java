public class Product001{
	static double[] priceValue={0,0,0};
	static int[] a1={0,0,0,0};
	static int[] a2={0,0,0,0};
	static int[] a3={0,0,0,0};
	static String[] item={null,null,null};
	static int index=0;
	public static void productDeatils(String pName,double price){
		String s1=pName;
		double d1=price;
		System.out.println("product name is :"+s1);
		System.out.println("gst price is :"+Gst.gstRate(d1));
		double totalPayableAmount=Gst.gstRate(d1)+d1;
		System.out.println("total payable amount is :"+totalPayableAmount);

	}
	public static void productDeatils(String brandName,String pName,double price){
		String b1=brandName;
		String s1=pName;
		double d1=price;
		System.out.println("product name is :"+s1+"\n brand name is :"+b1);
		String target="Frill and Thrill";
		System.out.println("gst price is :"+Gst.gstRate(d1));
		double totalPayableAmount=Gst.gstRate(d1)+d1;
		if(brandName==target){
			double totalAmount=totalPayableAmount*0.5;
			System.out.println("total payable amount after discount for the brandname Frill and Thrill is :"+totalAmount);
		}
		else{
			System.out.println("total payable amount is :"+totalPayableAmount);
		}
	}
	public static void productDeatils(double price){
		if(priceValue!=null){
			if(index<priceValue.length){
				for(int i=0;i<priceValue.length;i++){
					priceValue[i]=price;
					index++;
					System.out.println("price is :"+(priceValue[i]+Gst.gstRate(priceValue[i]))+" with gst is: "+Gst.gstRate(priceValue[i]));
					return ;
				}

			}else{
				System.out.println("array is full ");
			}
		}
		else{
				System.out.println("array is null");
			}
	}
	public static void productDeatils(double price,String itemName){
		int index2=0;
		if(priceValue!=null && item!=null){
			if(index2<priceValue.length && index2<item.length){
				for(int i=0;i<priceValue.length;i++){
					priceValue[i]=price;
					item[i]=itemName;
					index2++;
					System.out.println(item[i]+":"+(priceValue[i]+Gst.gstRate(priceValue[i])));
					return ;
				}

			}else{
				System.out.println("array is full ");
			}
		}
		else{
				System.out.println("array is null");
			}
	}
	public static void productDeatils(String couponCode, double price,String itemName){
		String cc1="2024Ut0!";
		int index3=0;
		if(priceValue!=null && item!=null){
			if(index3<priceValue.length ){
				for(int i=0;i<priceValue.length;i++){
					String s2=couponCode;
					priceValue[i]=price;
					item[i]=itemName;
					index3++;
					if(s2==cc1){
						System.out.println(item[i]+":"+((priceValue[i]+Gst.gstRate(priceValue[i]))*0.75));return;
					}
					else if(couponCode=="202345hgd" && item[i]=="T-shirt"){
						System.out.println(item[i]+":"+((priceValue[i]+Gst.gstRate(priceValue[i]))*0.7));return;
					}
					else{
						System.out.println(item[i]+":"+((priceValue[i]+Gst.gstRate(priceValue[i]))*0.90));return;
					}
				}

			}else{
				System.out.println("array is full ");
			}
		}
		else{
				System.out.println("array is null");
			}
	}
	public static void productDeatils(int n1,int n2,int n3){
		int index4=0;
		if(a1!=null && a2!=null && a3!=null){
			if(index4<a1.length ){
				for(int i=0;i<a1.length;i++){
					a1[i]=n1;
					a2[i]=n2;
					a3[i]=n3;
					index4++;
					if(a1[i]==a2[i] && a2[i]==a3[i]){
						System.out.println(a1[i]);
					}
					// else{
					// 	System.out.println("hi");
					// }
				}
				for(int i=0;i<a1.length;i++){
					if(a1[i]==a2[i] && a2[i]==a3[i]){
						System.out.println(a1[i]);
					}
				}
			}else{
				System.out.println("array is full:");
			}
		}
		else{
				System.out.println("array is null");
			}
	}
}