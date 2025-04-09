public class Literals {
    public static void main(String[] args) {
        // Literals 
        int num1 = 0b101; // Binary Format
        System.out.println(num1);
        int num2 = 0x7E; // Hexadiecimal Format
        System.out.println(num2);

        int num3 = 10_00_00_00; // We can use the (_) to separate the long nummbers.
        
        float floNum1 = 56; // Automatically converted into a decimal value
        System.out.println(floNum1);

        double doubNum1 = 12e10;
        System.out.println(doubNum1);

        char ch1 = 'a';
        char ch2 = 67;
        ch1++;
        System.out.println(ch1);
        System.out.println(ch2);

        boolean bool1 = true;
        System.out.println(bool1);
    }
}
