package study.VarArgs;

public class VarArgsExampla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(10);
		sum(10,20,30,87);
		sum(10,65,23);
		holidays("june",26,24,2);
	}//end of main
	
	static void sum(int... nums)
	{
		int total=0;
		for(int i=0; i<nums.length; i++)
		{
			total= total +nums[i];
		}
		System.out.println("total= "+total);
	}
	
	static void holidays( String month, int...days )
	{
		System.out.println("the holidays for "+month+" months are: -");
		for(int day : days)
			System.out.println(day+"");
	}//end of holidays
}//end of var ex
