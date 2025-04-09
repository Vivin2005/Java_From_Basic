public class String01 {
    public static void main(String[] args){
        // This is how to crete a simple string with value.
        String name = "Vivin";
        System.out.println(name);
        // This is how we create a simple string object.
        // We didn't use the below object for string. we can do the string initialization normally.
        String name_one = new String("Vivin");
        System.out.println(name_one);
        System.out.println(name_one.hashCode()); // We used the String class methods.
        System.out.println("Hello "+name_one);
        System.out.println(name_one.charAt(0)); // String class method's is used here.
        System.out.println(name_one.subSequence(0,5)); // Here also String class methid is used.
        System.out.println(name_one.concat(" S.R")); // Here also used the string class methods.
    }
}
