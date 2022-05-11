package study.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextTo {

	public static void main(String[] args) throws FileNotFoundException {
		boolean append = true;
		FileOutputStream fout = new FileOutputStream("D:\\IET Data\\OOPS\\poem.txt",append);
		PrintWriter pw= new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the String to copy in file \n");
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("quit")) break;
		pw.println(input);
		pw.flush();
		pw.close();
	}

}
}
