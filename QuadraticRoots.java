import java.util.Scanner;

public class QuadraticRoots{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter first coefficient = ");
double a=scan.nextDouble();
System.out.print("Enter second coefficient = ");
double b=scan.nextDouble();
System.out.print("Enter third coefficient = ");
double c=scan.nextDouble();

 //Discriminant
 double D = b * b - 4 * a * c;
System.out.println("Discriminant = " + D);

if (D>0) {
            // Two real and distinct roots
            double root1 = (-b+Math.sqrt(D))/(2*a);
            double root2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }

            else if (D == 0) {
            // One real root
            double root = -b/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Root = " + root);
        } 

            else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex");
            System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
        }

    }
}





