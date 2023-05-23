/**
 *  program like work ls/dir
**/

import java.io.File;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ls{
	public static void main(String[] args) {
		String s = args[0]; // get dir name from command line arguments
		System.out.println();
		File f = null; // create File reference
		try{
			f = new File(s); // create File object
			if (!f.exists() || f.isFile()) // if is not dir then throw exception and exit
				throw new FolderNotFoundException("Directory not found");
		}catch(Exception e){
			e.printStackTrace();
			System.exit(0); // exit if arise exception
		}
		SimpleDateFormat DateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss a"); // format date
		for (int i=0;i<f.list().length-1;i++) {
			File temp = new File(s,f.list()[i]);

			/** file or dir permition **/
			System.out.printf("%c", temp.isFile()?'_':'d'); // dir or folder
			System.out.printf("%c", temp.canRead()?'r':'_'); // readable or not
			System.out.printf("%c", temp.canWrite()?'w':'_'); // writable or not
			System.out.printf("%c  ", temp.canExecute()?'x':'_'); // exicuable or not

			System.out.print(DateFormat.format(new Date(temp.lastModified()))+"  "); // last modify
			System.out.printf("%-7s", temp.length()); // file or dir size
			System.out.println(f.list()[i]); // print name
		}
	}
}
class FolderNotFoundException extends Exception{ // custom Exception 
	FolderNotFoundException(String s){
		super(s);
	}
}