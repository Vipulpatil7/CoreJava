package fileex;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("f:/Vipul/ListOfCourses4.txt");
		int i = fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fis.read();
		}
		fis.close();
			

	}

}
