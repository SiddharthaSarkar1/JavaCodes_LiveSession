package com.learning.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ReadFile {
	//Reading using FileReader------------->
	public static void readfileUsingFileReader() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile1.txt");
		int readData;
		
		while((readData = fr.read()) != -1) {
			System.out.print((char)readData);
		}
		
	}
	
	public static void readfileUsingFileInputStream() throws IOException {
		FileInputStream stream = new FileInputStream("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile2.txt");
		int readData;
		
		while((readData = stream.read()) != -1) {
			System.out.print((char)readData);
		}
		
	}
	//NIO is non blocking I/O
	public static void readfileUsingNIO() throws IOException {
		List<String> list = Collections.emptyList();
		Path pt = Paths.get("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile3.txt");
		
		list = Files.readAllLines(pt, StandardCharsets.UTF_8);
		
		java.util.Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//readfileUsingFileReader();
//			readfileUsingFileInputStream();
			readfileUsingNIO();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
