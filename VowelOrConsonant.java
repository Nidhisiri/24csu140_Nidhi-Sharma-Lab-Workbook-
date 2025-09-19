import java.util.Scanner;

public class VowelOrConsonant {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        
System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter a single character: ");
String input = scan.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}






