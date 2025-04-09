/*
  -- Method Overloading have same method name but with diffrent parameters type.
  -- If the parameter name are same then it would not work.
 */

class Arithmetic{
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }
}
public class MethodOverLoading {
    public static void main(String[] args){
        Arithmetic obj1=new Arithmetic();
        int rest=obj1.add(40,50,10);
        System.out.println(rest);
    }
}
