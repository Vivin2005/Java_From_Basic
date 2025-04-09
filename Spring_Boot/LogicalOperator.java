public class LogicalOperator {
    public static void main(String[] args) {
        /*
         -- Logical operator is used to two or more condition.
         -- it is totally three types they are.
         -- AND(&&) ,It will give the output if the all conditions are true.
         -- OR(||)  ,It will give the output if the any one of the condition need to be true.
         -- NOT(!)  ,It act like a complement, if we want our true value to false it will do that,
                      if we want our false value to true it will do that.
         */
        int x = 10;
        int y = 20;

        int a = 12;
        int b = 15;

        // We can use more than two or more condition 
        boolean result = x < y && a <= b;
        System.out.println(result);

        result = x > y || a < b;
        System.out.println(result);

        result = b > a;
        System.out.println(!result);
    }
}
