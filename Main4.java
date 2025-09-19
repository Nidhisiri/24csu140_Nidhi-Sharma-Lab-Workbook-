import java.util.Scanner;

class Complex{
int real, imag;

Complex(int real, int imag) {
this.real = real;
this.imag = imag;
}

// Method1 - Add two complex numbers
Complex add(Complex c){
return new Complex(this.real + c.real, this.imag + c.imag);
}

// Method2 - Subtract two complex numbers
Complex subtract(Complex c){
return new Complex(this.real - c.real, this.imag - c.imag);
}

// Method3 - Multiply two complex numbers
Complex multiply(Complex c){
int r = this.real * c.real - this.imag * c.imag;
int i = this.real * c.imag + this.imag * c.real;
return new Complex(r, i);
}

// Method4 - Display complex number
void display(){
if (imag >= 0)
    System.out.println(real + " + " + imag + "i");
else
    System.out.println(real + " - " + (-imag) + "i");
    }
}

public class Main4{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

// First complex number 
System.out.print("Enter real part of first complex number: ");
int r1 = scan.nextInt();
System.out.print("Enter imaginary part of first complex number: ");
int i1 = scan.nextInt();

// Second complex number input
System.out.print("Enter real part of second complex number: ");
int r2 = scan.nextInt();
System.out.print("Enter imaginary part of second complex number: ");
int i2 = scan.nextInt();

Complex c1 = new Complex(r1, i1);
Complex c2 = new Complex(r2, i2);

                
Complex sum = c1.add(c2);
Complex diff = c1.subtract(c2);
Complex prod = c1.multiply(c2);

System.out.print("Sum: ");
sum.display();

System.out.print("Difference: ");
diff.display();

System.out.print("Product: ");
prod.display();

    }
}
