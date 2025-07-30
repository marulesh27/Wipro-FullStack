package Day5;
import java.io.File;
import java.util.Date;
public class File1 {
	public static void main(String [] args) {
		File file=new File("C:\\table");
		String[]fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
				
	}

}
