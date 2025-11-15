import exercises.java.PackageDemo; 
public class OutsidePackageDemo{
    public static void main(String[] args){

        System.out.println("Nidhi Sharma");
        System.out.println("24CSU140");

        System.out.println("Program outside the package");

        PackageDemo demo = new PackageDemo();
        demo.display();
    }
}
