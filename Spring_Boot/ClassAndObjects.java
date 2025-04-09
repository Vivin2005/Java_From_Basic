class Calculator{
    int a;
    public int addition(int n1,int n2){
        // System.out.println("In add.");
        int r = n1+n2;
        return r;
    }
}
public class ClassAndObjects {
    public static void main(String[] args){
        /*
        *************** Object Oriented Programming(OOPS) ******************
          -- Object can be anything.In real world object can be anything any stuff's.
          -- Every Object can do something and does something. 
          -- For example (pen is a object and it as a physical properties that can be used to write.).
          -- In the same way we can create a object to perform something.
          -- Object -- Have properties(means what it has) and behaviour(means what it can do).
          -- Class is needed to use the object.
          -- Classes are the blueprint to the object. we have to write the programm insde the class.
            then we can access by the object's.
         */
        int num1=4;
        int num2=5;
        Calculator clac = new Calculator();
        int result = clac.addition(num1,num2);
        System.out.println(result);
    }
}
