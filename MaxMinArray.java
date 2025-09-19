import java.util.Scanner;

public class MaxMinArray{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of an array: ");
int size=scan.nextInt();

int[] arr = new int[size];

for(int i=0;i<size;i++){
    arr[i]=scan.nextInt();
   }

int max= arr[0];
int min= arr[0];

for(int i=1;i<size;i++){
    if(max<arr[i]){
       max=arr[i]; 
      }
   if(min>arr[i]){
     min=arr[i];
     }
   }   
System.out.println("Maximum of an array = "+max);
System.out.println("Minimum of an array = "+min);


}
}