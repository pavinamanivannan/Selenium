package file.program;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Lenovo\\Desktop\\New\\demo.pdf";
		File file = new File(path);
		System.out.println(file.createNewFile());
		FileWriter writer = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("Hii");
		bw.newLine();
		bw.write("www.fb.com");
		bw.flush();
	}
}
