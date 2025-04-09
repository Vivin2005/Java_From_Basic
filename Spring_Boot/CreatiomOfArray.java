public class CreatiomOfArray {
    public static void main(String[] args){
        int num[] = {3,7,4,2};
        // We can access the element through the index number.
        // Index numbers are start from 0,1,2,3,....
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);

        // We can change the values of the array.
        num[1] = 6;
        System.out.println(num[1]);

        // If we want to have fixed size of array. then is syntax for it was diffrent.
        int num1[] = new int[5];
        // At first all the values inside the num1 is zero.
        // Default valus of the array is zero.
        // Check that.
        System.out.println(num1[4]);

        // Now changing the values for the array.
        num1[0] = 8;
        num1[1] = 10;
        num1[2] = 11;
        num1[3] = 15;
        num1[4] = 20;
        System.out.println(num1[3]);
        
        // If we want to print all the in an array using the print statement many times is not a efficient way.
        // So we can iterate the array using for loop.
        System.out.println("Using the for loop to iterate an array.");
        for(int i=0;i<5;i++){
            System.out.println(num1[i]);
        }
    }
}
