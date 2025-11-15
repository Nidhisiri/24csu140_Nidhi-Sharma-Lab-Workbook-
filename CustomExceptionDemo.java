class MyException extends Exception{
    String message; 
    public MyException(String msg){
    message = msg; 
    }

    public void displayMessage(){
    System.out.println("Exception Message: " + message);
    }
}

public class CustomExceptionDemo{
    public static void main(String[] args){

      System.out.println("Nidhi Sharma");
      System.out.println("24CSU140");

        try{
           throw new MyException("This is my custom exception message!");
        } 
        catch(MyException e){
              e.displayMessage();
        }
    }
}


