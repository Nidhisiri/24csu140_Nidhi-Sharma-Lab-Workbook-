interface X{
    void methodX();
}

interface Y{
    void methodY();
}

interface Z extends X,Y{
    void methodZ();
}

public class Test implements Z{
    public void methodX(){
        System.out.println("Method from X");
    }
    public void methodY(){
        System.out.println("Method from Y");
    }
    public void methodZ(){
        System.out.println("Method from Z");
    }

    public static void main(String[] args){

        System.out.println("Nidhi Sharma");
        System.out.println("24CSU140");
  
        Test t = new Test();
        t.methodX();
        t.methodY();
        t.methodZ();
    }
}


