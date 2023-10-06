package ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {
	
	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("c:/data/test3.txt");
			
			//1 문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			char c = 'C';
			writer.write(c);
			
			//배열출력
			char[] arr = {'D', 'E', 'F', 'G'};
			writer.write(arr);
			
			//문자열 저장
			String str = "Hello";
			writer.write(str);
			
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
