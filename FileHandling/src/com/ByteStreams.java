package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreams {

	public static void main(String[] args)  {

		
		ByteStreams byteStreams = new ByteStreams();		
		
		byteStreams.writeIntoFile();
		//byteStreams.readFromFile();
		
	}

	private  void readFromFile()  {
		File file = new File("E:/Kiran/Hi.txt");
		FileInputStream fis=null;
		try {
			 fis = new FileInputStream(file);
			int temp;
			while((temp=fis.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		finally {
			try {
				fis.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
	}
	
	public void writeIntoFile() {
		File file = new File("E:/Kiran/Hi.txt");
		File file2 = new File("E:/Kiran/Output.txt");
		FileOutputStream fos = null;
		FileInputStream fis=null;
		Scanner sc = null;
		try {
			 sc = new Scanner(System.in);
			
			 fis = new FileInputStream(file);
			 fos = new FileOutputStream(file2);
			 //System.out.println("Enter the data: ");
			 String data = sc.nextLine();
			 fos.write(data.getBytes());
			 
			int temp;
			while((temp=fis.read())!=-1) {
				fos.write(temp);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		finally {
			try {
				fis.close();
				sc.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
	}
	
	

}
