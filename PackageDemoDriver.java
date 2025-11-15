package exercises.java;  
class PackageDemo{
    public void display(){
      System.out.println("PackageDemo executed");
    }
}

public class PackageDemoDriver{
    public static void main(String[] args){

        System.out.println("Nidhi Sharma");
        System.out.println("24CSU140");

        PackageDemo obj = new PackageDemo();  
        obj.display();                        
    }
}
