class CheckArgumentException extends Exception{
    public CheckArgumentException(String message){
        super(message);
    }
}

public class CommandLineSum{
    public static void main(String[] args){

      System.out.println("Nidhi Sharma");
      System.out.println("24CSU140");

        try {
            if(args.length < 5){
                throw new CheckArgumentException("Error: Please enter exactly 5 integer arguments.");
            }

            int sum = 0;

            for(int i = 0; i < 5; i++){
               int num = Integer.parseInt(args[i]);
               sum += num;
            }

            System.out.println("The sum of the 5 numbers is: " + sum);
        } 
        catch(CheckArgumentException e){
            System.out.println(e.getMessage());
        } 
        catch(NumberFormatException e){
            System.out.println("Error: Please enter only integer values.");
        }
    }
}
