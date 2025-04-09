public class MultiDimentionalArray {
    public static void main(String[] args){
        // MultiDimentional Array.

        int nums[][] = new int[3][4];  // 3 rows and each rows have 4 elements (3x4).
        //Giving a random value to the array using the "random" method. I'ts a in-build function.
        // That random function is inside the "Math" class.

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int) (Math.random() * 10); /* The deault random values for the random is like (0.67,0.45) like that random value. that's why we are mulityple the random function with 100. basically the random value hold double values.that's why we are type casting. */
                // System.out.println(nums[i][j]); // Printing the Values 
            }
        }

        // Now we are iterating the multi dimentional array.

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                // System.out.println(nums[i][j]); // The println should print it in an continuous manner.
                // If i wan this array in box like structure. Simply use the "print" not "println".
                // After the column is iterated.we have to break it and move to next line.
                // Now the array is in a box like structure.
                System.out.print(nums[i][j] + " ");
            }
            // This ine is used to break and move to next line.
            System.out.println();
        }

        // Now we are using the enhanced for loop.
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
