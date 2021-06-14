package com.capgemini.javacore8labbook;

import java.io.File;
import java.util.Scanner;

public class ReadableFile {
	
	public static void main(String args[ ]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the File Name: ");
		String str=sc.next();
		File f1 = new File(str);
		System.out.println("File Name: " + f1.getName());
		System.out.println(f1.exists() ? "exists" : "does not exist");
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable");
		System.out.println("File size: " + f1.length() + " Bytes");
	} 

}
