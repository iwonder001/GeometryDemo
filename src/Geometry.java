import java.util.Scanner;

public class Geometry {
  /** 
    The methods should display an error message if negative values are used for the circle’s radius, the rectangle’s length or width, 
    or the triangle’s base or height. 
   */
	//declare variable
	private static double areaC;
	private static double areaR;
	private static double areaT;
	private double radius;
	private double length;
	private double width;
	private double base;
	private double height;
	
	static Scanner input = new Scanner(System.in);
	
	public static double circleArea(double r){
		System.out.println("What is the radius of your circle? ");
		r = input.nextDouble();
		if(r < 0) {
			System.out.println("Error!!!  You must enter a positive value");
		}else {	
		areaC = Math.PI * r;
		}
		return areaC;
		
	}
	public static double rectangleArea(double len, double wid){
		System.out.println("What is the length of the rectangle? ");
		len = input.nextDouble();
		System.out.println("What is the width of the rectangle? ");
		wid = input.nextDouble();
		if(len < 0){
			System.out.println("Error!!!  You must enter a positive value");
		}else if (wid < 0){
			System.out.println("Error!!!  You must enter a positive value");
		}else{
		areaR = len * wid;
		}
		return areaR;
	}
	public static double triangleArea(double base, double height) {
		areaT = base * height *0.5;
		return areaT;
	}
}
