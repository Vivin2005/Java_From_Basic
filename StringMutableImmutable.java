public class StringMutableImmutable {
    public static void main(String[] args){
        // Mutable String ---> It can be changed.
        // Immutable String ---> It can't be changed.

        String name = "Vivin";  // Here the string value cannot be changed again. that why the string are immutable.
        name = name + " S.R";  // We can do any other concadination with the string but we can't make any changes.
        System.out.println("Hello " +name);

        String s1 = "Vivin"; // Same value
        String s2 = "Vivin"; // Same value
        System.out.println(s1 == s2); // In memory the address value for the s1 and s2 are same because the values are same.
        System.out.println(s1.hashCode()); // The hash code value for the both are same.
        System.out.println(s2.hashCode()); // same hash code for both.

        // If want to make the string mutable then we use the two classes called "StringBuilder and StringBuffer".
    } 
}
