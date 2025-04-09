public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 15;
        a = ++a + ++a;
        System.out.println(a);

        int b = 15;
        b = ++b + b++;
        System.out.println(b);

        int c = 15;
        c = c++ + ++c;
        System.out.println(c);

        int x = 10 , y = 20;
        int z = x++ + y++ + ++y + ++x;
        System.out.println(z);
    }
}
