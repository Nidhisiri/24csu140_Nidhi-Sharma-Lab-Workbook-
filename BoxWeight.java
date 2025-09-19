public class BoxWeight extends Box{

private float weight;

// No Argument Constructor
public BoxWeight(){
   super();
   this.weight = 0;
  }

// Constructor with Parameter
public BoxWeight(float width,float height,float depth,float weight){
   super(width,height,depth);
   this.weight = weight;
  }

// Clone Constructor
public BoxWeight(BoxWeight ob){
   super(ob);
   this.weight = ob.weight;
  }

// Getter and Setter for weight
public float getWeight(){
return weight;
}

public void setWeight(float weight){
this.weight = weight;
}

public void displayWeight(){
System.out.println("Weight: " + weight);
  }
}