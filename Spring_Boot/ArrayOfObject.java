class Student{
    int roll_no;
    String name;
    int mark;
}

public class ArrayOfObject {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.roll_no = 125;
        s1.name = "Vivin";
        s1.mark = 90;

        Student s2 = new Student();
        s2.roll_no = 001;
        s2.name = "Vijayan";
        s2.mark = 88;

        Student s3 = new Student();
        s3.roll_no = 002;
        s3.name = "Santhoush";
        s3.mark = 85;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0;i<student.length;i++){
            // This below statement is will print the memory refrence.output will not proper.
            System.out.println(student[i]);
            // If we want to print the output then we write line like the below.
            System.out.println(student[i].name + " roll number " + student[i].roll_no + " scored " + student[i].mark + " marks.");
        }

        // Enchanced for loop for the student object.

        for(Student stud : student){
            System.out.println(stud.name + " roll number " + stud.roll_no + " scored " + stud.mark + " marks.");
        }

        int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 8;
        nums[4] = 9;

        // Normal for loop.
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

        // Enhanced for loop(for each loop or enhanced for loop).

        for(int n : nums){
            System.out.println(n);
        }
    }
}
