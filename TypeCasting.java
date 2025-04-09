public class TypeCasting {
    public static void main(String[] args) {
        /*
         Typecasting in Java is the process of converting one data type to another data type using the casting operator.
        When you assign a value from one primitive data type to another type, this is known as type casting.
         */

         /*
          1. Widening Type Conversion (Implicit Conversion)
                Also called automatic type conversion.
                Happens automatically when converting a smaller data type to a larger data type.
                No data is lost.
          */
          /*
           2. Narrowing Type Conversion (Explicit Conversion)
                Also called type casting.
                Happens manually when converting a larger data type to a smaller data type.
                Data may be lost if the larger value cannot fit into the smaller type.
           */
        
           int num1 = 100;
           double doub1 = num1; // Implicit
           System.out.println(doub1); // Assign a small type to an larger type

           int num2 = 150;
           byte b1 = (byte)num2; // Explicit
           System.out.println(b1); // Assign a larger type a small type

           int num3 = 700;
           byte b2 = (byte) num3;
           System.out.println(b2);

           byte a = 10;
           byte b = 30;
           int result = a*b;
           System.out.println(result);
    }
}