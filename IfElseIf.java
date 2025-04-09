public class IfElseIf {
    public static void main(String[] args){
        int x = 8;
        int y = 9;
        int z = 6;
        if(x>y && x>z){
            System.out.println("The X is the greater number : "+x);
        }
        else if(y>z){
            System.out.println("The Y is the greater number : "+y);        
        }
        else{
            System.out.println("The Z is the greater number :"+z);
        }
    }
}
