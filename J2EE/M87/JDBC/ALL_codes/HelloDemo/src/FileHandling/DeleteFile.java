package FileHandling;

import java.io.File;
//5,Deleting a File
public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C://Users//Elango//Desktop//Student//Stude.txt");
		
		if(f1.exists())
		{
			System.out.println("file is deleted"+ f1.delete());
			
		}
		else
		{
			System.out.println("file is not available");
			
		}
		
		
	}

}
