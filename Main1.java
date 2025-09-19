class Shape{
public void display(){
     System.out.println("This is shape");
  }
}

class Rectangle extends Shape{
public void displayRectangle(){
     System.out.println("This is rectangular shape");
  }  
}

class Circle extends Shape{
public void displayCircle(){
     System.out.println("This is circular shape");
  }
}

class Square extends Rectangle{
public void displaySquare(){
     System.out.println("Square is a rectangle");
  }
}

public class Main1{
public static void main(String[] args){
  
System.out.println("Nidhi Sharma");
System.out.println("24CSU140");  

  Square s = new Square();
  s.displayRectangle();
  s.display();
  s.displaySquare();
  }
}