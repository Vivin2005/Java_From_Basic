public class Loops02 {
    public static void main(String[] args){
        // while-loop
        int i = 1;
        int n = 5;
        while(i<=n){
            System.out.println("Hii "+i);
            int j = 1;
            while(j<=5){
                System.out.println("Hello "+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye "+i);
    }
}
