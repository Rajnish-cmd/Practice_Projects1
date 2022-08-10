package FileHandling;



	import java.io.FileInputStream;
	import java.io.FileReader;
	import java.io.IOException;
	import java.nio.charset.StandardCharsets;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;

	public class ReadFile {
		
		
		
		public static  void readFileFileInputStream() throws IOException
		{
			
			FileInputStream stream= new FileInputStream("D:\\Crud_Operation\\CreateTest1.txt");
			int data;
			
			while((data=stream.read())!=-1){
				
				System.out.print((char)data);
			}
			
		}
	
		
		public static void main(String[] args) {
			
			
			try {
				
				readFileFileInputStream();
				
			} catch (IOException e) {
				
				System.out.println("File not available");
			}
		}

	}
