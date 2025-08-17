package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreams {
	public static void main(String[] args) {
		
	}
	private  void readFromFile()  {
		File file = new File("E:/Kiran/Hi.txt");
		FileReader fir = null;
		FileWriter fiw = null; 
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			 fir = new FileReader(file);
			int temp;
			while((temp=fir.read())!=-1) {
				System.out.print((char)temp);
			}
			
		}
		catch (FileNotFoundException e) {
			System.err.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
		}
		
		finally {
			try {
				fir.close();
				sc.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
	}
	
	public void writeIntoFile() {
		File file = new File("E:/Kiran/Hi.txt");
		File file2 = new File("E:/Kiran/Output.txt");
		
		FileReader fir = null;
		FileWriter fiw = null; 
		Scanner sc = null;
		try {
			 sc = new Scanner(System.in);
			
			 fir = new FileReader(file);
			 fiw = new FileWriter(file2);
			  
			 //System.out.println("Enter the data: ");
			// String data = sc.nextLine();
			//write(data.getBytes());
			 
			int temp;
//			while((temp=fir.read())!=-1) {
//				fiw.write(temp);
//			}
		} catch (FileNotFoundException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		finally {
//			try {
//				//fis.close();
//				sc.close();
//			}
//			catch(IOException e) {
//				System.out.println(e);
//			}
			
		}
	}

}
