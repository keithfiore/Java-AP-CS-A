//convert unix timestamp

import java.util.Scanner;

public class NewMeagerLeapYear{

 public static String ordinal(int input){
   //return ordinal form of integer as a string
   if(String.valueOf(input).charAt(String.valueOf(input).length()-1)=='1'){ //if final character is 1
     return input+"st";
   }
   else if(String.valueOf(input).charAt(String.valueOf(input).length()-1)=='2'){ //if final character is 2
     return input+"nd";
   }
   else if(String.valueOf(input).charAt(String.valueOf(input).length()-1)=='3'){ //if final character is 3
     return input+"rd";
   }
   else return input+"th";
 }
 public static void main(String[] args) {
   //vars
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Unix timestamp");
   long unix=sc.nextLong();
   long calc=unix;
   boolean leapyear=false;

   //calculations are here
   //years
   int years=(int)(4*(calc/126230400)); //this division is ok because ints will round it down
   calc%=126230400; //seconds in 4 years
   for(int i=0;i<=3;i++){
     //check for leap years
     if(i==2){ //if leap year
       if(Math.abs(calc-31622400)==calc-31622400){
         years++;
         calc-=31622400; //seconds in leap year
       }
       else{
         leapyear=true;
         break;
       }
     }
     else if(Math.abs(calc-31536000)==calc-31536000){
       years++;
       calc-=31536000; //seconds in year
     }
     else break;
   }
   //months
   //declare month days here because now we know if it's a leap year
   int[] monthdb=new int[12];
     monthdb[ 0]=31; //jan
     monthdb[ 1]=leapyear?29:28; //feb
     monthdb[ 2]=31; //mar
     monthdb[ 3]=30; //apr
     monthdb[ 4]=31; //may
     monthdb[ 5]=30; //jun
     monthdb[ 6]=31; //jul
     monthdb[ 7]=31; //aug
     monthdb[ 8]=30; //sep
     monthdb[ 9]=31; //oct
     monthdb[10]=30; //nov
     monthdb[11]=31; //dec
   int months=0;
   for(int i=0;i<=11;i++){
     //86400 is seconds in a day
     if(Math.abs(calc-86400*monthdb[i])==(calc-86400*monthdb[i])){
       months++;
       calc-=86400*monthdb[i];
     }
     else break;
   }
   //days, hours, minutes
   int days=   (int)calc/86400;
   calc%=86400;
   int hours=  (int)calc/3600;
   calc%=3600;
   int minutes=(int)calc/60;
   calc%=60;

   //output
   String[] monthNames=new String[12];
     monthNames[ 0]="January";
     monthNames[ 1]="February";
     monthNames[ 2]="March";
     monthNames[ 3]="April";
     monthNames[ 4]="May";
     monthNames[ 5]="June";
     monthNames[ 6]="July";
     monthNames[ 7]="August";
     monthNames[ 8]="September";
     monthNames[ 9]="October";
     monthNames[10]="November";
     monthNames[11]="December";
   System.out.println("Unix timestamp "+unix+" is:");
   System.out.println(ordinal(days+1)+" of "+monthNames[months]+", "+(1970+years)+" at "+hours+":"+minutes+":"+calc);

   sc.close();
 }
}
