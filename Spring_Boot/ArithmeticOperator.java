public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Increment... (Post-increment and per-increment)
        // num1 = num1 + 1;
        // num1 += 1;
        // num1++


        // Decrement...(post-decrement and per-decrement)
        // num1 = num1 - 1;
        // num1 -= 1;
        // num1--;
        int result0 = num1 + num2;  // Addition
        System.out.println(result0);

        int result1 = num1 - num2; // Subraction
        System.out.println(result1);

        int result2 = num1 * num2;  // Multiplication
        System.out.println(result2);

        int result3 = num1 / num2;  // Division
        System.out.println(result3);

        int result4 = num1 % num2;  // Modulos
        System.out.println(result4);

        int no1 = 10;
        int res1 = no1++;
        System.out.println(res1);  // Output : 10

        int no2 = 10;
        int res2 = ++no2;
        System.out.println(res2); // Output : 11 
    }
}
