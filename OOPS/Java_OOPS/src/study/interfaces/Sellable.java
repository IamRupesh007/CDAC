package study.interfaces;

public interface Sellable {
	//by default each method is public abstract
	String getProductInfo();
	
	public abstract double getProductSellingPrice();
	
}

//TOY is a Sellable
class Toy implements Sellable
{
	

	private String name;//name of toy
	private double cost,discount;
	
	
	
	public Toy(String name, double cost, double discount) {
		super();
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	}

	@Override
	public String getProductInfo() {
		return name+" "+cost;
		
	}

	@Override
	public double getProductSellingPrice() {
		double sp=cost- (discount * cost/100) ;
		return sp;
	}
	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}//end of toy class


//Laptop is a Sellable
class Laptop implements Sellable
{
	String brand,cpu,ramsize,hdsize;
	double cost,gst;

	public Laptop(String brand, String cpu, String ramsize, String hdsize, double cost, double gst) {
		super();
		this.brand = brand;
		this.cpu = cpu;
		this.ramsize = ramsize;
		this.hdsize = hdsize;
		this.cost = cost;
		this.gst=gst;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRamsize() {
		return ramsize;
	}

	public void setRamsize(String ramsize) {
		this.ramsize = ramsize;
	}

	public String getHdsize() {
		return hdsize;
	}

	public void setHdsize(String hdsize) {
		this.hdsize = hdsize;
	}

	@Override
	public String toString() {
		return brand + " "+cpu;
	}

	@Override
	public String getProductInfo() {
		// TODO Auto-generated method stub
		return brand+ " " +cost;
	}

	@Override
	public double getProductSellingPrice() {
		double sp=cost+ (gst *100) ;
		return sp;
	}
	
}