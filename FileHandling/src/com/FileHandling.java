package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		
	}
	
	public void openFile() throws IOException {
		
		File file = new File("C:\\Users\\saiki\\eclipse-workspace\\FileHandling\\src\\com\\files\\Byee.txt");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			fileInputStream.close();
		}
		
	}
public void openFile2()  {
		
		File file = new File("C:\\Users\\saiki\\eclipse-workspace\\FileHandling\\src\\com\\files\\Hii.txt");
		
		try(FileInputStream fileInputStream = new FileInputStream(file);
				Scanner sc = new Scanner(System.in);) {
	
		}
		catch(Exception e){
			System.out.println(e);
		}


		
	}

}
