import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        // Switch statement is the another form of if-else.
        // Basically we can check if we enter something then print it or otherwise print this.
        // If none of them is matching the set it to default value.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number (1-7) to check the week days : ");
        int n = scan.nextInt();

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the valid number.");
        }
    }
}
