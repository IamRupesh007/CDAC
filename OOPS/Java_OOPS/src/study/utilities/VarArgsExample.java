package study.utilities;

public class VarArgsExample {
public static void main(String[] args) {
	//add();
	//add(12);
	//add(12,13);
	//add(10,11,12,50);
	//add(new int [] {10,20,30});
	int[] arr = new int [2];
	arr[0]=90;
	arr[1]=100;
	add(arr);
	
	
}//end of main

//example of VarArgs
public static void add(int...a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
		sum=sum+ a[i];
	
	System.out.println(sum);			
}
}///end of class
