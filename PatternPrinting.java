import java.util.Scanner;

public class PatternPrinting {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.println("1. Pyramid");
System.out.println("2. Left Triangle");
System.out.println("3. Right Triangle");
System.out.println("4. Diamond");
System.out.print("Choose Pattern: ");
int choice = scan.nextInt();

System.out.print("Enter number of rows: ");
int n = scan.nextInt();

switch (choice){
case 1: pyramid(n);
        break;
case 2: leftTriangle(n);
        break;
case 3: rightTriangle(n);
        break;
case 4: rhombus(n);
        break;
default:
        System.out.println("Invalid choice! ");
    }
}

// Pyramid Method
static void pyramid(int n){
for(int i = 1; i <= n; i++){
     for(int j = i; j < n; j++){
         System.out.print(" ");
     }
     for(int j = 1; j <= (2 * i - 1); j++){
         System.out.print("*");
     }
    System.out.println();
   }
}

// Left Triangle Method
static void leftTriangle(int n){
for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
  }
}

// Right Triangle Method
static void rightTriangle(int n){
for(int i = 1; i <= n; i++){
    for(int j = i; j < n; j++){
        System.out.print(" ");
    }
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
    }
}

// Rhombus Method
static void rhombus(int n){
// Upper part (pyramid)
 for(int i = 1; i <= n; i++){
     for(int j = i; j < n; j++){
         System.out.print(" ");
     }
     for(int j = 1; j <= (2 * i - 1); j++){
         System.out.print("*");
     }
     System.out.println();
}        
// Lower part (inverted pyramid)
for(int i = n - 1; i >= 1; i--){
    for(int j = i; j < n; j++){
        System.out.print(" ");
    }
    for(int j = 1; j <= (2 * i - 1); j++){
        System.out.print("*");
        }
    System.out.println();
        }
    }
}


















