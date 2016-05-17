package ComcaveProgramme;

import java.io.File;

public class Readfile {

	
	public static void main(String[] args) {

		File file = new File("C:/Users/stoellner/test.txt");
		
		if(file.exists()){
			
			System.out.println("File " + file.getName() + " gibt es ");
		}else{
			
			System.out.println("File " + file.getName() + " gibt es nicht ");
		}

	}

}
