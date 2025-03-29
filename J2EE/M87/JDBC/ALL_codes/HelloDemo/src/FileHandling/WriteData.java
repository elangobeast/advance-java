package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C://Users//Elango//Desktop//Student//Student.txt");
		
		FileWriter fwrite=new FileWriter(f1);
		
		fwrite.write("Ram is a java Developer and a front end developer ");
		
		fwrite.close();
		
		
		
		
		System.out.println("data is written successfully ");

	}

}
