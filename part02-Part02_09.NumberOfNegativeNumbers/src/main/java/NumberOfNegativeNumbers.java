
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0){
                numbers = numbers + 1;
            }
            if(num == 0){
                System.out.println("Number of negative numbers: " + numbers);
                break;
            }
        }
    }
}
