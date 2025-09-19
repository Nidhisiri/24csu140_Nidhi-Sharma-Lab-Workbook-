import java.util.Scanner;

class Area {
int length, breadth;

Area(int length, int breadth){
this.length = length;
this.breadth = breadth;
 }

// Area Method
int returnArea(){
    return length * breadth;
    }
}

public class Main3{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter length of rectangle: ");
int l = scan.nextInt();

System.out.print("Enter breadth of rectangle: ");
int b = scan.nextInt();

Area rect = new Area(l, b);

System.out.println("Area of Rectangle: " + rect.returnArea());

    }
}
