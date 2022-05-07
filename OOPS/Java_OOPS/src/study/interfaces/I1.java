package study.interfaces;

public interface I1 {
	void f1();
}

interface I2
{
	void f1();
	void f2();
	
}
interface I3 extends I2
{
	void f3();
	void f4();
	
}


class Dummy3 implements I3
{

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}