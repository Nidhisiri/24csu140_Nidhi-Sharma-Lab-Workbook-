import java.io.File;
public class FileHandlingFirst{
	public static void main(String[] args){
	        System.out.println("Nidhi Sharma");
                System.out.println("24CSU140");

		File file = new File("C:\\Users\\Ram Bali\\OneDrive\\Desktop\\Lab Manuals");
		if(file.exists()){
			if(file.isFile()){
				System.out.println("It is a file.");
			}
			else if(file.isDirectory()){
				System.out.println("It is a directory");
			}
			else{
				System.out.println("The file or directory does not exist.");
			}
		}
	}
}