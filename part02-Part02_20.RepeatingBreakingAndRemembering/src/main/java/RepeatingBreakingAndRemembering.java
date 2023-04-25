
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int number = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input >= 0){
                sum += input;
                number++;
            }
            if(input % 2 == 0){
                even++;
            }
            if(input % 2 != 0 && input >= 0){
                odd++;
            }
            if(input == -1){
                double dsum = sum;
                double dnumber = number;
                average = dsum/dnumber;
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + number);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
        }
    }
}
