package study.interfaces;
//changes by arpujsoc
public interface Shop {

	public static void main(String[] args) {

//		Sellable obj =  new Sellable()://uninstantiated
		Sellable [] arr = new Sellable[5];
		arr[0] = new Toy("car",300,10);
		arr[1] = new Laptop("Dell", "Intel", "8GB", "1TB", 35000, 12);
		arr[2] = new Toy("barbie", 200, 20);
		arr[3] = new IceCream("Amul", "vanila", 30);
		arr[4] = new Clothes("signature", 40, 2000);
		
		showBill(arr);
		
	}
	
	public static void showBill(Sellable [] purchases)
	{
		double total = 0;
		for(Sellable s : purchases)
		{
			double sp = s.getProductSellingPrice();
			System.out.println(s.getProductInfo()+"   "+sp);
			total+=sp;
		}
		System.out.println("Total Bill : "+total);
	}

}
