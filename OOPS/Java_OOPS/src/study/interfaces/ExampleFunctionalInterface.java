package study.interfaces;

@FunctionalInterface//this anotations tells the compiler to check if interface
//has exactly ONE method

public interface ExampleFunctionalInterface {
	void test(); //one method
	//void test1(); //second method will give error
}
