package study.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestNIO {
	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("D:\\IET Data\\OOPS\\poem.txt");
		
		String s1= "\n Woods are lovely dark and geeen";
		Files.write(p, s1.getBytes(), StandardOpenOption.APPEND);
		
		List<String> lines = Files.readAllLines(p);
		for(String s : lines)
			System.out.println(s);
		
		
	}
}
