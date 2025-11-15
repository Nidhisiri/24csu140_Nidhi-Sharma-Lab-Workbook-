interface A{
    void displayA();
}

interface B extends A{
    void displayB();
}

public class Demo implements B{
    public void displayA(){
        System.out.println("Display from interface A");
    }
    public void displayB(){
        System.out.println("Display from interface B");
    }

public static void main(String[] args){

        System.out.println("Nidhi Sharma");
        System.out.println("24CSU140");  

        Demo d = new Demo();
        d.displayA();
        d.displayB();
    }
}

