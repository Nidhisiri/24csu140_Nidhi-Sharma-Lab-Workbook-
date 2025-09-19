import java.util.Scanner;

public class SearchNumArray{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of an array: ");
int size=scan.nextInt();

int[] arr = new int[size];

for(int i=0;i<size;i++){
    arr[i]=scan.nextInt();
   }

boolean found = false;
System.out.print("Enter the number to search: ");
int searchNum=scan.nextInt();

for(int i=0;i<size;i++){
    if(arr[i] == searchNum){
       System.out.print("Searched number is " + searchNum + " is at the " + i + " index. ");
       found = true;
       break;
      }
   }
if(!found){
   System.out.print("The search number NOT FOUND ");
  }





}
}
