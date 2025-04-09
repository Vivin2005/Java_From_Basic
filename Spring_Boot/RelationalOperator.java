public class RelationalOperator {
    public static void main(String[] args) {
        /*
          -- Relational operator is used to check something is true or false.
          -- Some operator used by the relational are.
          -- (> - greater than)
          -- (< - less than)
          -- (== - used to tell something both are equal or not)
          -- (>= - greater than or equal to)
          -- (<= - less than or equal to)
          -- (!= - not equal to)
         */
        int x = 6, y = 7;
        int a = 8 , b = 6;
        boolean result = x <= y && a < b;
        System.out.println(result);
    }
}
