/* *
 * this program work like cat command
 * and program can save file if not exists exacly like cat comman
 * press enter two time to exit in
 * */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class cat{
	public static void main(String[] args) throws Exception {
		String fileName = args[0]; // getting value from command line
		File f = new File(fileName); // create file object
		if(f.exists()){ // if file exist then show content
			int ch;
			if(isBinaryFile(f)){ // for binury stream
				
				FileInputStream fileInput = new FileInputStream(f); // craete object
				while((ch = fileInput.read()) != -1){ // print character by character until EOF
					System.out.print((char) ch); 
				}
				fileInput.close();
			}
			else{ // for character stream
				FileReader fileReader = new FileReader(f);
				while((ch = fileReader.read()) != -1){ // print character by character until EOF
					System.out.print((char) ch); 
				}
				fileReader.close();
			}
		}
		else{ // if file is not exist then get input untill press ctr+c and saved
	        Scanner stdin = new Scanner(System.in);
	        String lines = "";
	        String temp = "";
	        do { 
	            temp = stdin.nextLine(); // read line
	            lines += temp + "\n";
	        }while(temp != null && temp.length()!= 0); // read line until line is not empty

	        FileWriter writer = new FileWriter(f.getAbsolutePath());
	        writer.write(lines); // save file
	        writer.close();
	        System.out.println("file saved at: "+ f.getAbsolutePath()); // for user feedback
    	}
	}
	static boolean isBinaryFile(File f) throws Exception { // check whether file is binury or text
        String type = java.nio.file.Files.probeContentType(f.toPath());
        if (type == null) //type couldn't be determined, assume binary
            return true;
        if (type.startsWith("text"))
            return false; // its text file
        return true;
    }
}