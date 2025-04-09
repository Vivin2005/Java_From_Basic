public class JaggedArray {
    public static void main(String[] args){
        // "Jagged Array" means an array that have not sure about the size. 
        int nums[][] = new int[3][]; // I have not specified any kind of size in the column is called jagged array.
        // If our array size is not sure about the column size.
        // We can mention the column size for the row individually.

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[5];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                 nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
