package part_C;

import java.util.Scanner;


/**
 * @author Hubert & Lisa
 * Definition of class, CalcAreaCircumference
 */

public class CalcAreaCircumference{
  
  /*
   * Method calculating and displaying the area and circumference of a circle.
   */
  public static void calculateAreaCir(){
    // Initiating the scanner object.
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the radius in you two decimal places: ");
    // Accepting input from the Scanner
    double radius = input.nextDouble();
    // Ending the Scanner object.
    input.close();
    // Calculating the Area of the circle
    double area = Math.PI * radius * radius ;
    // Calculating the circumference of the circle
    double circumference = 2 * Math.PI *radius;
    
    // Displaying the area and the circumference of the circle.
    System.out.println("The Area of the circle of radius " + radius +  " is: "+ Math.round(area * 100.0) / 100.0 );
    System.out.println("The circumference of the circle  of radius " + radius  + " is: " + Math.round(circumference * 100.0) / 100.0 );
  }
  
  /**
   *
   * @param args
   *  Main method for execution of program
   */
  
  public static void main(String[] args) {
    // Executing the CalculateAreaCir Method.
    calculateAreaCir();
  }
}