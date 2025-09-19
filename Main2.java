class Triangle {
int a, b, c;  
        
Triangle() {
  a = 3;
  b = 4;
  c = 5;
}

// Perimeter Method
int getPerimeter(){
return a + b + c;
}

// Area Method
double getArea(){
double s = getPerimeter() / 2.0;  
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class  Main2{
public static void main(String[] args){
Triangle t = new Triangle();

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.println("Perimeter of Triangle: " + t.getPerimeter());
System.out.println("Area of Triangle: " + t.getArea());
    }
}
