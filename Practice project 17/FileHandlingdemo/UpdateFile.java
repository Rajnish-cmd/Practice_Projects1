package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {
	
	public static void modifyFile(String file, String olddata,String newdata) {
		
		
		File fileToBeModified= new  File(file);
		String fileData="";
		BufferedReader reader=  null;
		FileWriter writer=null;
		
		try {
			reader= new BufferedReader(new FileReader(fileToBeModified));
			String line= reader.readLine();
			
			while(line!=null) {
				fileData= fileData+line+System.lineSeparator();
				line=reader.readLine();
			}
		
			
			String newFiledata= fileData.replaceAll(olddata, newdata);
			

			writer = new FileWriter(fileToBeModified);
			writer.write(newFiledata);
			System.out.println("Data Updated Successfully");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		finally {
			
			try {
				reader.close();
				writer.close();
				
				System.out.println("Reader and Writter Closed");
				
			} catch (IOException e2) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			modifyFile("D:\\Crud_Operation\\CreateTest.txt", "Bye", "WELCOME");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
	}

}
