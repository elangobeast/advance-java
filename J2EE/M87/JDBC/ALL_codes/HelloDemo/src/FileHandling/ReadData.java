package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C://Users//Elango//Desktop//Student//Student.txt");
		
		FileReader fread=new FileReader(f1);
		
		int data=fread.read();
		
		while(data!=-1)
		{
			System.out.println((char) data);
			data=fread.read();
		}

	}

}
