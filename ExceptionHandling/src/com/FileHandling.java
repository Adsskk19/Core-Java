package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {
	public static void main(String[] args)  {
		
		FileHandling obj = new FileHandling();
		try {
			obj.openFile();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			//e.printStackTrace();
		}

		

	}
	
	// checked Exception if you hover you will know
	public void openFile() throws FileNotFoundException{
		File file = new File("E:\\Kiran/Hiii.txt");
		FileInputStream fileInputStream = new FileInputStream(file);		
	}

}
