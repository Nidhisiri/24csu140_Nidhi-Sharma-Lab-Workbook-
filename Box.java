public class Box{

private float width;
private float height;
private float depth;

// No Argument Constructor
public Box(){
   this.width = 0;
   this.height = 0;
   this.depth = 0;
  }

// Constructor with Parameter
public Box(float width,float height,float depth){
   this.width = width;
   this.height = height;
   this.depth = depth;
  }

// Clone Constructor
public Box(Box ob){
   this.width = ob.width;
   this.height = ob.height;
   this.depth = ob.depth;
  }

// Getter and Setter methods
public float getWidth(){
return width;
}

public void setWidth(float width){
this.width = width;
}

public float getHeight(){
return height;
}

public void setHeight(float height){
this.height = height;
}

public float getDepth(){
return depth;
}

public void setDepth(float depth){
this.depth = depth;
}

public float volume(){
   return width * height * depth;
  }
}