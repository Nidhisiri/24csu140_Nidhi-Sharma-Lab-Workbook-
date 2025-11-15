import java.io.*;
public class FileHandlingFourth{
    	public static void main(String[] args) {
	        System.out.println("Nidhi Sharma");
                System.out.println("24CSU140");
        	String fileName = "students.txt";
        	try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            		bw.write("1, Priya, 9.2, A");
            		bw.newLine();
            		bw.write("2, Disha, 9.8, B");
            		bw.newLine();
            		bw.write("3, Rahul, 9.2, A");
            		System.out.println("Data written successfully.");
        		} 
		catch (IOException e){
            		e.printStackTrace();
        	}
        	try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            		String line;
            		System.out.println("\nContents of file:");
            		while ((line = br.readLine()) != null){
                		System.out.println(line);
            		}
        	} 
		catch (IOException e){
            		e.printStackTrace();
        	}
    	}
}