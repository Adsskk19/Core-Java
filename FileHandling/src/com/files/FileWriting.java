package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			
		fos = new FileOutputStream("C:\\Users\\saiki\\eclipse-workspace\\FileHandling\\src\\com\\files\\Byee.txt");
			
			String s1 = "I went to a movie";
			fos.write(s1.getBytes());
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	
	}

}
