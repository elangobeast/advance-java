package FileHandling;
import java.io.File;
public class GetFileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1=new File("C://Users//Elango//Desktop//Student//StudentElango.txt");
		File f2=new File("C://Users//Elango//Desktop//Student//Studen.txt");
		
		if(f1.exists())
		{
			System.out.println("file name"+f1.getName());
			
			System.out.println("absolute path" + f1.getAbsolutePath());
			
			System.out.println("file is readable?" + f1.canRead());
			
			System.out.println("file is writable?"+ f1.canWrite());
			
			System.out.println("file length" +f1.length());
			
		}
		
		else
		{
			System.out.println("file is not available");
		}
		if(f2.exists())
		
		{
			System.out.println("file is available");
			
		}
		else
		{
			System.out.println("File is not available");
		}
		
		

	}

}
