import java.util.Scanner;

public class Automoblies{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");  

System.out.print("Enter number of tyres: ");
int N = scan.nextInt();

Vehicle v;  
switch (N){
      case 2:
             v = new Bike();
             break;
      case 4:
             v = new Car();
             break;
      default:
             v = new Vehicle();
             break;
}
v.display();  
  }
}



 class Vehicle{
public void display(){
       System.out.println("This is a Vehicle");
  }
}

 class Car extends Vehicle{
public void display(){
       System.out.println("This is a Car");
  }
}


 class Bike extends Vehicle{
public void display(){
       System.out.println("This is a Bike");
  }
}
