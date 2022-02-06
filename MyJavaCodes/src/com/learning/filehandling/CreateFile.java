package com.learning.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
	public static void createFileUsingFileClass() throws IOException {
		File fileFC = new File("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile1.txt");
		
		if(fileFC.createNewFile()) {
			System.out.println("File is created.");
		}else {
			System.out.println("File is not created.");
		}
		//here by using true we can be able to append
		FileWriter fw = new FileWriter(fileFC, true);
		fw.write(" to learn java full stack development.");
		fw.close();
	}
	
	public static void createFileUsingFileOutputStream() throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile2.txt");
		String myStr = "This is the text that i am going wqrite on this text file";
		byte arr[] = myStr.getBytes();
		fos.write(arr);
		System.out.println("Writing in the file --> myfile2.txt");
		fos.close();
	}
	
	public static void createfileusingNIO() throws IOException {
		Path pt = Paths.get("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile3.txt");
		
		String inp = "Writing data to the file using NIO";
		byte array[] = inp.getBytes();
		Files.write(pt, array, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("Data Written...");
		
		
		Path pt1 = Paths.get("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile4.txt");
		List<String> li = Arrays.asList("This is the first line", "This is the srcond line");
		Files.write(pt1, li, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("Data Written on file 4");
	}

	public static void main(String[] args) {
		try {
			//createFileUsingFileClass();
			//createFileUsingFileOutputStream();
			createfileusingNIO();
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		

	}

}
