package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFIle {
public static void createFile() throws IOException {
 File file=new File("D:\\Crud_Operation\\CreateTest.txt");
 if(file.createNewFile()) {
	 System.out.println("File has been Created");
 }
	 else
	 System.out.println("File not created");
 
 FileWriter writer=new FileWriter(file,false);
 writer.write("Welcome to my PC");
	 writer.close();
 }
 
Files.write(path,array,StandardOpenOption.CREATE,StandardOpenOption.APPEND);


	public static void main(String[] args) {
		try {
			createFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
************************************************************************
1.)The execution starts from main function.
2.) Using try and catch block to handle the exception.
3.)In try block,calling the createFile function.
4.)Basically, this function creates the file.In this function, I had provided the path using which The File class is used to create the file at the path provided.
5.)Writer.write function is used to write the statement in the file.
************************************************************************