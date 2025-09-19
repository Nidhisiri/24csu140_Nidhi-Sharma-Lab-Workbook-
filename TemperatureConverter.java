import java.util.Scanner;
public class TemperatureConverter{                                                 //Created a class
public static void main(String args[]){                                            //Similar to "int main(){}"
Scanner scan = new Scanner(System.in);                                             //Creating an object scan of the class Scanner.     

//CODE

System.out.println("TEMPERATURE CONVERTER");
System.out.println("1. Celsius to Fahrenheit ");
System.out.println("2. Fahrenheit to Celsius ");

System.out.println("Enter your Choice: ");
int choice;                                                                         //Taking input
choice=scan.nextInt();
double temp,result;

switch(choice){
case 1: 
System.out.println("Enter temperature in Celsius: ");
  temp=scan.nextDouble();                                                             //Taking input
  result = (temp * 9/5) + 32;                                                        //Calculation
System.out.println("Temperature in Fahrenheit: " +result);                          //Print result in FAHRENHEIT
break;

case 2:
System.out.println("Enter temperature in Fahrenheit: ");
  temp=scan.nextDouble();                                                             //Taking input
  result = (temp-32) *5/9;                                                           //Calculation
System.out.println("Temperature in Celsius: " +result);                             //Print result in CELSIUS
break;

default:
System.out.println("Invalid Choice.");
        }
    }       
}