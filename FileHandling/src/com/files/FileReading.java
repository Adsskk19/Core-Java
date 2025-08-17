package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		
		File file = new File("C:\\\\Users\\\\saiki\\\\eclipse-workspace\\\\FileHandling\\\\src\\\\com\\\\files\\\\Byee.txt");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			int temp;
			while((temp=fis.read())!=-1) {
			
				System.out.print((char)temp);
				
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
	}
}
