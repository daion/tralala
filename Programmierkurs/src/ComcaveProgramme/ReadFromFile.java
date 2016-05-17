package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/stoellner/test1.txt");
		
		
		try {
		FileReader fileReader = new FileReader(file);
		//Array Char
		char[] myText = new char[100];
		try {
			fileReader.read(myText);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(char x : myText){
			System.out.print(x);
		}
		
// 		fileReader.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		

	}

}
