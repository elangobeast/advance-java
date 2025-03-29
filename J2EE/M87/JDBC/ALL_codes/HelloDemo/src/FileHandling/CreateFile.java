package FileHandling;
//1.creating a file
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File f1=new File("C:\\Users\\Elango\\Desktop\\Student\\StudentElango.txt"); 
		
		if(f1.createNewFile()) //false
		{
			System.out.println("file is created successfully");
			
		}
		
		else
		{
			System.out.println("file is alreadY CREated");
			
		}

	}

}
