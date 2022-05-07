package study.interfaces;

public class Shop {

	public static void main(String[] args) {
		//Sellable obj = new Sellable();
		
		Sellable[] arr=new Sellable[3];
		
		arr[0]= new Toy("Car",300,10);
		arr[1]= new Laptop("Lenovo","Intel","8GB","1TB", 35000,12);
		arr[2]=new Toy("Barbie",200,20);
		
		showBill(arr);
	}//close for main method
	
	public static void showBill(Sellable[] purchases)
	{
		double total=0;
		for(Sellable s: purchases)
		{
			double sp= s.getProductSellingPrice();
			System.out.println(s.getProductInfo()+" "+sp);
			total+=sp;
		}
		
		System.out.println("Total Bill= "+total);
	}
	

}
