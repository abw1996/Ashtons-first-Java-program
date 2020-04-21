import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello, and welcome to Ashton's Triangle solver.");
		System.out.println("It is currently lacking in some features.");
		System.out.println("Ashton doesn't actually care about triangles tho sooooo..");
		System.out.println("probably not gonna get the rest unless") ;
		System.out.println("he figures out how to make money with it");
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Will you be entering SIN, COS, TAN, CSC, SEC, or COT?");
			
			String entering = input.nextLine();
			entering = entering.toLowerCase();
			switch (entering) {
				case "sin":
					askingSin();
					break;
				case "cos":
					askingCos();
					break;
				case "tan":
					askingTan();
					break;
				case "csc":
					askingCsc();
					break;
				case "sec":
					askingSec();
					break;
				case "cot":
					askingCot();
					break;
				default:
					System.out.println("Invalid. Please enter again.");
					
			}
		}
	}
		
	public static Triangle askingSin() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your sine value in fraction form (x/n)");
		Scanner sinEntered = new Scanner(System.in);
		String Strang = sinEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setSin(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();
		
		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
		
	public static Triangle askingCos() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your cosine value in fraction form (x/n)");
		Scanner cosEntered = new Scanner(System.in);
		String Strang = cosEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setCos(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();

		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
		
	public static Triangle askingTan() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your tangent value in fraction form (x/n)");
		Scanner tanEntered = new Scanner(System.in);
		String Strang = tanEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setTan(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();

		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
		
	public static Triangle askingCsc() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your cosecant value in fraction form (x/n)");
		Scanner cscEntered = new Scanner(System.in);
		String Strang = cscEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setCsc(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();

		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
		
	public static Triangle askingSec() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your secant value in fraction form (x/n)");
		Scanner secEntered = new Scanner(System.in);
		String Strang = secEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setSec(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();

		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
		
	public static Triangle askingCot() {
		Triangle tri = new Triangle();
		String topS = "";
		String bottomS = "";
		double top = 0;
		double bottom = 0;
		boolean topNumber = true;
		int count = 0;
		System.out.println("Please input your cotangent value in fraction form (x/n)");
		Scanner cotEntered = new Scanner(System.in);
		String Strang = cotEntered.nextLine();
		while (count < Strang.length()) {
			if (topNumber) {
				Character ch = Strang.charAt(count);
				if (ch.equals('/')) {
					topNumber = false;
					count++;
				} else {
					topS = topS + ch;
					System.out.println(topS);
					count++;
				}
			}
			if (!topNumber) {
				Character ch = Strang.charAt(count);
				bottomS = bottomS + ch;
				System.out.println(bottomS);
				count++;
			}
		}
		top = Double.parseDouble(topS);
		bottom = Double.parseDouble(bottomS);
		System.out.println(top + " " + bottom);
		tri.setCot(top, bottom);
		tri.setTheSides();
		tri.setTheMissingSide();
		tri.setRemainingForms();

		System.out.println("Sin is equal to " + tri.getSin());
		System.out.println("Cos is equal to " + tri.getCos());
		System.out.println("Tan is equal to " + tri.getTan());
		System.out.println("Csc is equal to " + tri.getCsc());
		System.out.println("Sec is equal to " + tri.getSec());
		System.out.println("Cot is equal to " + tri.getCot());
		return tri; 
	}
	
}
