public class Main_Test{
    public static void main(String[] args){

        System.out.println("Nidhi Sharma");
        System.out.println("24CSU140");
  
        ResizableCircle r = new ResizableCircle(10);
        System.out.println("Area before resize: " + r.getArea());
        System.out.println("Perimeter before resize: " + r.getPerimeter());

        r.resize(50); 
        System.out.println("Area after resize: " + r.getArea());
        System.out.println("Perimeter after resize: " + r.getPerimeter());
    }
}
