
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0 || num > 0){
                sum = sum + num;
                number = number + 1;
            }
            if(num == 0){
                System.out.println("Number of numbers: " + number);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }
    }
}