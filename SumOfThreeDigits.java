import java.util.Scanner;

public class SumOfThreeDigits{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter a 3-digit number: ");
int num = scan.nextInt();

int hundreds = num/100;
int tens = (num/10) % 10;
int units = num % 10;
System.out.println("Sum of digits = "+(hundreds+tens+units));
    }
}
