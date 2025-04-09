class Demo{
    int num = 10;
    public int add(int n1,int n2){
        System.out.println(num);
        return n1+n2;
    }
}
public class StackAndHeap {
    public static void main(String[] args){
        /*
         -- Stack is where inside the JVM.
         -- Stack can store the data the data can stored like last-in-first out.
         -- If we have the value 5,4,7. the last value is at first. the second value stored at second.
            then the first value stored at last.
         -- Each and every data is stored in a stack.
         -- Even method can also stored in the stack.
         -- Varibles also stored.
         -- The local vaiable are only stored inside the stack not on the Heap memeory. 
         */

         /*
          -- Heap is also kind of memory that can store the data.
          -- What kind of data that can store?.
          -- If a variable is soored in a class(i.e. not inside any method is called as iinstance variable).
          -- Atlast the data stored inside the heap will have the address value.
          -- That address value is stored inside the stack.
          -- Yes there is link between the heap and the stack.
          */
        int data = 10;
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        int result = d1.add(10,10 );
        System.out.println(result);
        // Now i am changing the value of the "num" that is inside the class Demo.
        d1.num = 8;
        System.out.println(d1.num); // Output is 8.Because i changed the num value to 8 only for the object (d1).
        System.out.println(d2.num); // Output is 10.
    }
}
