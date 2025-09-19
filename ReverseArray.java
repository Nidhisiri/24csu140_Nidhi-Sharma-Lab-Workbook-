import java.util.Scanner;

public class ReverseArray{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of an array: ");
int size=scan.nextInt();

int[] arr = new int[size];
int[] rev = new int[size];

for(int i=0;i<size;i++){
    arr[i]=scan.nextInt();
   }

for(int i=0;i<size;i++){
    rev[i] = arr[size - 1 - i];
   }

System.out.print("Original array = ");
for(int i=0;i<size;i++){
    System.out.print(arr[i] + " ");
   }
System.out.print("\nReversed array= ");
for(int i=0;i<size;i++){
    System.out.print(rev[i] + " ");
   }
  }
}
