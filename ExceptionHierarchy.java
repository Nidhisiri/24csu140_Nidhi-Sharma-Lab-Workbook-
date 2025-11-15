// Step 1: Create a three-level hierarchy of exceptions
class BaseException extends Exception{ }       // Level 1
class MidException extends BaseException{ }    // Level 2
class TopException extends MidException{ }     // Level 3

// Step 2: Create base class A
class A{
    // Method that throws BaseException
    void show() throws BaseException{
        throw new BaseException();
    }
}

// Step 3: Class B inherits A and overrides show()
class B extends A{
    // Now it throws MidException (level 2)
    void show() throws MidException{
        throw new MidException();
    }
}

// Step 4: Class C inherits B and overrides show()
class C extends B{
    // Now it throws TopException (level 3)
    void show() throws TopException{
        throw new TopException();
    }
}

// Step 5: Main class with main() method
public class ExceptionHierarchy{
    public static void main(String[] args){

      System.out.println("Nidhi Sharma");
      System.out.println("24CSU140");

        // Upcasting: C object referred by A reference
        A obj = new C();

        try{
            // Calling the show() method
            obj.show();
        } 
        catch(TopException e){
            System.out.println("Caught TopException (Level 3).");
        } 
        catch(MidException e){
            System.out.println("Caught MidException (Level 2).");
        } 
        catch(BaseException e){
            System.out.println("Caught BaseException (Level 1).");
        }
    }
}
