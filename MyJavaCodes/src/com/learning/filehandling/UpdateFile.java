package com.learning.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void modifyFile(String file, String oldData, String newData) {
		File fileToBeModified = new File(file);
		
		String fileData = "";
		BufferedReader reader = null;
		FileWriter write = null;
		
		try {
		//Reading the file
		reader = new BufferedReader(new FileReader(fileToBeModified));
		String line = reader.readLine();
		while(line != null) {
			fileData = fileData+line+System.lineSeparator();
			line = reader.readLine();
		}
		
		//update the data 
		String newFileData=fileData.replaceAll(oldData, newData);
		//write modified data to that file
		write=new FileWriter(fileToBeModified);
		write.write(newFileData);
		System.out.println("Data Updated Successfully");
		
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				reader.close();
				write.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		modifyFile("C:\\Users\\SID\\git\\FilesSidFHJava\\myfile3.txt", "here", "<<--ModifiedData-->>");
	}
}
