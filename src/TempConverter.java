/*
*Author: Richard Sharp
*Date: 09/01/2023
*Class: Java
*/


import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     //asks the user to input a temperature in degrees F
     System.out.println("Please enter a temperature in degrees F");
     int number = sc.nextInt();

        //tells the user the number they entered
         System.out.println("The temperature you entered was " +number);

         //takes the number they entered and subtracts 32 then multiplies the number by 5/9 making it degrees Celsius
         double degca = (number -32);
         double degc = (degca * 5/9);

         //prints what the user entered as the converted degrees Celsius
         System.out.print("The temperature is " +degc);
         System.out.println(" in degrees Celsius.");

         //Takes the users converted temperature as degrees Celsius and converts to degrees Kelvin
         double kela = (degc +273.15);

         //This line is the displayed output for the conversion to degrees Kelvin
        System.out.print("The temperature you entered in degrees Kelvin is " +kela);






        }
    }