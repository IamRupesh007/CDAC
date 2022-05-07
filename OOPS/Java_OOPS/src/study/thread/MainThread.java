package study.thread;

public class MainThread {

	public static void main(String[] args) {
		TableGenerationTable task1= new TableGenerationTable();
		
		Thread thread1= new Thread(task1);
		thread1.start();

	}

}
