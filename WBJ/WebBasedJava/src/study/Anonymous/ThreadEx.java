package study.Anonymous;

public class ThreadEx {

	public static void main(String[] args) {
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<3;i++)
					System.out.println("Hello");	
			}
		};
		//first thread
		new Thread(task).start();
		
		//second thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<5;i++)
					System.out.println("hi");
			}
		}).start();
	}//end of main

}//end of ThreadEx class
