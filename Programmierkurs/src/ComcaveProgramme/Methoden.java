package ComcaveProgramme;

public class Methoden {
    
	
	public static void main(String[] args) {
	
		//Methoden // Funktionen ...
		
	SayHello();
	String str1 = "Com";
	String str2 = "Cave";
	String str = MakeString(str1, str2);
	System.out.println(str);
	
	int a = 40;
	int b = 20;
//Summ(a, b);
	System.out.println(Summ(a, b));
	}

	
	public static void SayHello(){
		
		System.out.println("ich bin eine Methode");
	}
	
	
	public static String MakeString(String str , String str1){
		
		return str+str1;
		
	}
	
	public static int Summ(int a, int b){
		
		return a+b;
		
	}
}
