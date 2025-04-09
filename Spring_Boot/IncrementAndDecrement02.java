public class IncrementAndDecrement02 {
    public static void main(String[] args) {
        int a = 0 , b = 0;
        int c = --a * --b * --a * b--;
        System.out.println(c);

        int x = 1;
        int y = x++ + ++x * --x - x--;
        System.out.println(y);

        /* 
        -- This part will have a error. 
        -- Because we can't give the increment to constant values.
        int i = 11++;
        System.out.println(i);
        */

        // Bitwise AND(&)
        int i = 5;
        System.out.println(i & 1);

        // Bitwise X-OR(^)
        int k = 5;
        int f = (k ^ 3) ^ k;
        System.out.println(f);
    }
}
