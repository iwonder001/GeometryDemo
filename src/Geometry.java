import java.util.Scanner;

public class Geometry {
  /** 
    The methods should display an error message if negative values are used for the circle�s radius, the rectangle�s length or width, 
    or the triangle�s base or height. 
   */
	//declare variable
	private static double areaC;
	private static double areaR;
	private static double areaT;
//	private double radius;
//	private double length;
//	private double width;
//	private double base;
//	private double height;
	
	static Scanner input = new Scanner(System.in);
	
	public static double circleArea(){
		System.out.println("What is the radius of your circle? ");
		double r = input.nextDouble();
		if(r < 0) {
			System.out.println("Error!!!  You must enter a positive value");
		}else {	
		areaC = Math.PI * r;
		System.out.printf("Your area of your circle is " + "%.2f", areaC);
		}
		return areaC;
		
	}
	public static double rectangleArea(){
		System.out.println("What is the length of the rectangle? ");
		double len = input.nextDouble();
		System.out.println("What is the width of the rectangle? ");
		double wid = input.nextDouble();
		if(len < 0){
			System.out.println("Error!!!  You must enter a positive value");
		}else if (wid < 0){
			System.out.println("Error!!!  You must enter a positive value");
		}else{
		areaR = len * wid;
		System.out.printf("Your area of your circle is " +"%.2f", areaR);
		}
		return areaR;
	}
	public static double triangleArea() {
		System.out.println("What is the base of the triangle? ");
		double base = input.nextDouble();
		System.out.println("What is the height of the triangle? ");
		double height = input.nextDouble();
		if(base <0){
			System.out.println("Error!!!  You must enter a positive value");
		}else if (height <0){
			System.out.println("Error!!!  You must enter a positive value");
		}else{
		areaT = base * height *0.5;
		System.out.printf("Your area of your circle is " +"%.2f", areaT);
		}
		return areaT;
	}
}
