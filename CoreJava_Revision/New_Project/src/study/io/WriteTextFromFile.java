package study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteTextFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fi = new FileInputStream("D:\\TestFile.txt");
		
		
		boolean append= true;
		FileOutputStream fout = new FileOutputStream("D:\\TestFile.txt",append);
		PrintWriter p = new PrintWriter(fout);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Ennter the string to copy in file..");
			String input = sc.nextLine();
		if(input.equalsIgnoreCase("Quit"))
			break;
			p.println(input);
			//p.flush();
		}
		p.close();
		}
	}

