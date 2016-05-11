package ComcaveProgramme;

public class HelloWorld { // Anfang

// hier kommt der Code

  // hier brauchen wir die main Methode
	
	public static void main(String[] args) { //main Anfang
		
		String hello = "Hallo Welt usw";
		
        System.out.println(hello);
		System.out.println("Tralalalala");
		//Datentypen
		int a =3;
		int b =6;
		int erg = a+b;
		byte by = 7; //8 bit
		short c = 78; //short 16 bit 215 .. 215 -1 entspricht -32768 ... 32767
		long lo = 23456; //64 bit  -263 .. 263 -1 entspricht -922337203685
		
		
		System.out.println("die Addition von " + a + " und von " + b + " = " + erg + " gut gerechnet");
		
		//
		float f1 = 4.98f;
		float f2 = 1.02f;
		
		System.out.println(f1);
		double d1 = 2.54;
		double d2 = 0.65;
		
		System.out.println(d2);
		boolean bol1 = true;
		boolean bol2 = false;
		System.out.println(bol1);
		
		long x = b + lo;
		
		float y = (float) (f1 + d1);
		
		System.out.println(x + " " + y );
		
		
	}//main Ende
	
	
} //Ende
