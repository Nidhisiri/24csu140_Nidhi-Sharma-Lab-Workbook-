import java.util.Scanner;

public class SumArrayFunctions{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

int size = 5; 
int[] arr = new int[size];

System.out.println("Enter " + size + " elements of the array:");
for(int i = 0; i < size; i++){
    arr[i] = scan.nextInt();
    }

System.out.println("\nMenu:");
System.out.println("1. Sum of all elements");
System.out.println("2. Sum of alternate elements");
System.out.print("Enter your choice: ");
int choice = scan.nextInt();

switch(choice){
case 1: System.out.println("Sum of all elements = " + sumAll(arr));
        break;
case 2: System.out.println("Sum of alternate elements = " + sumAlternate(arr));
        break;
default:System.out.println("Invalid choice!");
    }
}

//Method to calculate sum of all elements
static int sumAll(int[] arr){
int sum = 0;
for(int num : arr){
    sum += num;
    }
return sum;
}

// Method to calculate sum of alternate elements (0,2,4,...)
static int sumAlternate(int[] arr){
int sum = 0;
for(int i = 0; i < arr.length; i += 2){
    sum += arr[i];
    }
return sum;
    }
}





