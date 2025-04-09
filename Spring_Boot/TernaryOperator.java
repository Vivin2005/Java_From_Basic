public class TernaryOperator {
    public static void main(String[] args){
        // The ternary operator is used to do the if-else condition in shortly.
        // We can write the condition in one line.

        // Here we doing the if-else normally.
        int n = 6;
        int result = 0;
        if(n%2==0){
            result = 10;
        }
        else{
            result = 20;
        }
        System.out.println(result);

        // Now we are going to write this in ternary operator.
        // it look like ?:
        int output = (n%2==0)?10:20;
        System.out.println(output);
    }
}
