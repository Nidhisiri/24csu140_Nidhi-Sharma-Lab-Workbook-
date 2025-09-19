import java.util.Scanner;

class Point {
private double x;
private double y;

public Point(){
this.x = 0.0;
this.y = 0.0;
}

public Point(double x, double y){
this.x = x;
this.y = y;
}

public double getX(){
   return x;
}
public double getY(){
   return y;
}

public void setX(double x){
this.x = x;
}
public void setY(double y){
this.y = y;
}

public static double distance(Point p1, Point p2) {
return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
}

public void display(){
System.out.printf("%7.2f %7.2f%n", x, y);
}
}

// File must be saved as MainApp.java
public class MainApp2 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter x1 and y1: ");
double x1 = scan.nextDouble();
double y1 = scan.nextDouble();

System.out.print("Enter x2 and y2: ");
double x2 = scan.nextDouble();
double y2 = scan.nextDouble();

Point p1 = new Point(x1, y1);
Point p2 = new Point(x2, y2);

System.out.println("Point 1:");
p1.display();
System.out.println("Point 2:");
p2.display();

double dist = Point.distance(p1, p2);
System.out.printf("Distance between points: %.2f%n", dist);
}
}




