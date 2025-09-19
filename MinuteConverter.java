import java.util.Scanner;
public class MinuteConverter{
public static void main(String args[]){
Scanner scan= new Scanner(System.in);

System.out.println("Nidhi Sharma");
System.out.println("24CSU140");

//CODE
System.out.println("MINUTES CONVERTER");
long minutes;
System.out.print("Enter Minutes: ");
minutes=scan.nextLong();

long totalDays = minutes/1440;                       // 1 day = 1440 minutes
long years = totalDays/365;                          //  1 year = 365 days
long remainingDaysAfterYears = totalDays % 365;
long months = remainingDaysAfterYears / 30;          // 1 month = 30 days
long days = remainingDaysAfterYears % 30; 

System.out.printf("%02d-%02d-%02d%n", years, months, days);
//System.out.println("Minutes = " +minutes);
//System.out.println("Years = " +years"-"+months"-"+days);
//System.out.println("Months = " +months);
//System.out.println("Days = " +days);

      }

}