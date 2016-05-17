package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteInFile {

	public static void main(String[] args) {
		
		String textToWrite= "Dies soll in die Datei geschrieben werden";
		
		File file = new File("C:/Users/stoellner/test1.txt");
				
		if(file.exists()){
			
			try {
			Formatter form = new Formatter(file);
			form.format("");
			form.format("%s", textToWrite);
			System.out.println("es wurde was reingeschrieben. ");
			form.close();
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			}
		}else{
			System.out.println("Datei existiert nicht");
		}

	}

}
