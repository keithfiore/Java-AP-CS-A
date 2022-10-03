/*
 * String is a sequence of characters. 
 * In Java, objects of String are immutable which means 
 * they are constant and cannot be changed once created.
 */

public class ComparisonsStr2Prim {

    public static void main(String[ ] args) {

        int num1 = 5; // primitive
        int num2 = 5;

        System.out.println(num1 == num2); // test is true

        String abc1 = "abc";
        String abc2 = "abc";
        // You should not use == (equality operator) to compare Strings
        System.out.println(abc1 == abc2);
        System.out.println("String " + abc1 + " is the same as " +abc2 );

        // How you should compare Strings ...

   
    }
    
}
