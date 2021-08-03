import java.util.Scanner;

// MAIN CLASS
public class CalculatorApp {

	public static void main(String[] args) {
	char answer = 'y';
		
	while (answer == 'y') {
		UI. renderMeniu();
		int a = UI.scanInt();
		int b = UI.scanInt();
		char op = UI.scanOp();
		int r = 0;
		
		
		
		switch (op) {
		 
		case ('+'):
		r = Arithmetics.add(a, b);	
		break;
		         
		case ('-') :
		r = Arithmetics.sub(a, b);
		break;			
		
		case ('*') :
	    r = Arithmetics.mul(a, b);
		break;				
			
		case ('/') :
	    r = Arithmetics.div(a, b);
		break;
		}
						
		UI.renderResult(a, b, op, r);
		
		System.out.println("another one (y or n)?");
		
		Scanner sc = new Scanner(System.in);
	    answer = sc.next().charAt(0);
	}}

}

// SECONDARY CLASSES

	class Arithmetics {
		
	static int add (int a, int b) {
		return a + b;
		}
	static int sub (int a, int b) {
		return a - b;
	}
	 static int mul (int a, int b) {
		 return a * b;
	 }
	 
	 static int div  (int a, int b) {
		 return a/b;
	 }
}
	// UI - user interface
	class UI {
	static void renderMeniu (){
		System.out.println("------------------------------------");
		System.out.println("|           CALCULATOR             |");
		System.out.println("------------------------------------");
		System.out.println("|           INSERT NUMBERS         |");
		System.out.println("|           AND CHOOSE OPS:        |");
		System.out.println("|           +,-,*,/                |");
		System.out.println("------------------------------------");
		
	}
	static int scanInt() {
		Scanner in = new Scanner (System.in);
		System.out.print("enter value: ");
		int value = in.nextInt();
		return value;
	}
	
	static char scanOp() {
		Scanner in = new Scanner (System.in);
		System.out.print("choose operation (+, -, *, /: ");
		char op = in.next().charAt(0);
		return op;}
	
	static void renderResult(int a, int b, char op, int r) {
	System.out.println(a + " " + op + " " + b + " = " + r);
	}
	}