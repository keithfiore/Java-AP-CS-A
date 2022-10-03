    /* 
     * How to perform math/arithmetic in Java
     * 
    */
    
    // 5 Operators +, -, *, /, % ... ^, ok there are more

public class Arithmetic {

    public static void main(String[] args){
        // Modulo
        double mod = 10 % 2; // remainder 0
        System.out.print(mod);

        // Add
        int num1 = 2; // operand
        int num2 = 4;
        System.out.println(num1 + num2); // output 6

        // Subtraction
        double num3 = 4.5;
        int num4 = 3;
        System.out.println(num3 - num4); // out put 1.5

        // Multiplication
        int num5 = 3;
        int num6 = 3;
        System.out.println(num5 * (num6 * num1)); //output 18

        // Division
        double num7 = 8;
        double num8 = 3;
        System.out.println(num7 / num8); // output 

        // Order of operations
        System.out.println(num1 / (num2 * num3) + num4 % num5); // output

    }
}
