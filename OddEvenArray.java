import java.util.Scanner;

public class OddEvenArray{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

System.out.print("Enter the size of an array: ");
int size=scan.nextInt();

int[] arr = new int[size];

for(int i=0;i<size;i++){
    arr[i]=scan.nextInt();
   }
int evenCount = 0, oddCount = 0;
for(int i=0;i<size;i++){
    if(arr[i] % 2 == 0){
       evenCount++;
       }else{
        oddCount++;
       }
}
int[] evenArr = new int[evenCount];
int[] oddArr = new int[oddCount];

int eIndex = 0, oIndex = 0;
for(int i=0;i<size;i++){
   if(arr[i] % 2 == 0){
      evenArr[eIndex] = arr[i];
      eIndex++;
      }else{
           oddArr[oIndex] = arr[i];
           oIndex++;
           }
      }

System.out.print("Even elements: ");
for(int i=0;i<evenCount;i++){
    System.out.print(evenArr[i] + " ");
    }

System.out.print("\nOdd elements: ");
for (int i = 0; i < oddCount; i++) {
    System.out.print(oddArr[i] + " ");
    }
  }
}

