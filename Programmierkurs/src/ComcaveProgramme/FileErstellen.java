package ComcaveProgramme;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileErstellen {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/stoellner/test1.txt");
		
		
		if(!file.exists()){
			  //Datei existiert nicht, also erstellen
			
			try {
			Formatter formatter = new Formatter("C:/Users/stoellner/test1.txt");
			
			System.out.println("Die Datei " + file.getName() + " wurde erstellt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
		}
		else{
			
			System.out.println("Datei " + file.getName() + " existiert schon");
		}
	}

}
