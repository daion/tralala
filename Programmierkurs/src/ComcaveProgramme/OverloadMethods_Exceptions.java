package ComcaveProgramme;

import java.util.Random;

public class OverloadMethods {
	
	public static void main(String[] args) {

		// rechne(3,7,"plusd");
		//System.out.println(rechne(3,7,"durch"));
		//Random random = new Random();
		
		//
		//int zufallerg = random.nextInt(6)+1;
		//System.out.printIn(zufallerg);
		

		System.out.println(rechne(4, 0));
	}

	
	
	public static int rechne(){
		
		return 0;
		
	}
	
public static int rechne(int a){
		
		return a;
		
	}
public static double rechne(double a, double b){
	
	double z =0.0;

	try{
	z = a/b;
	}catch(Exception e){
		System.out.println("Nicht durch 0 teilen " + e.getMessage());
	}
	
	return z;
	
}
public static int rechne(int a, int b, String s){
	
	int z =0;
	// ich muss wissen, was s ist
	if (s.equals("plus")){
		z = a+b;
		return z;
	}
	else if (s.equals("minus")){
		z = a-b;
		return z;	
	}
	else if (s.equals("mal")){
		z = a*b;
		return z;	
	}
	else if (s.equals("durch")){
		z = a/b;
		return z;	
	}
	return z;
}
}

	

