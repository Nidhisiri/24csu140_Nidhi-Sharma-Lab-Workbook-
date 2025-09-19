public class BoxWeightDemo{
public static void main(String[] args){

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");  

Box box1 = new Box(2, 4, 6);
Box box2 = new Box(box1);    
Box box3 = new Box(); 

System.out.println("Volume of box1: " + box1.volume());
System.out.println("Volume of box2 (clone of box1): " + box2.volume());
System.out.println("Volume of box3: " + box3.volume());

BoxWeight bw1 = new BoxWeight(3, 4, 5, 10);
BoxWeight bw2 = new BoxWeight(bw1); 
BoxWeight bw3 = new BoxWeight(); 

System.out.println("\nBoxWeight bw1 volume: " + bw1.volume());
bw1.displayWeight();

System.out.println("BoxWeight bw2 volume (clone): " + bw2.volume());
bw2.displayWeight();

System.out.println("BoxWeight bw3 volume: " + bw3.volume());
bw3.displayWeight();
  }
}


