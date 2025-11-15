import java.io.*;
public class FileHandlingThird{
    	public static void main(String[] args){
	        System.out.println("Nidhi Sharma");
                System.out.println("24CSU140");
        	String filename = "C:\\Users\\Ram Bali\\OneDrive\\Desktop\\Lab Manuals";
        	try (FileWriter writer = new FileWriter(filename)){
            		writer.write("This message is written using the write() method.");
            		System.out.println("Data is added to file");
        	} 
		catch (IOException e) {
            		System.out.println("Error" + e.getMessage());
        	}
        
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            		String line;
            		System.out.println("Reading from file");
            		while ((line = reader.readLine()) != null){
                		System.out.println(line);
            		}
        	} 
		catch (IOException e){
            		System.out.println("Error" + e.getMessage());
        	}
    	}
}