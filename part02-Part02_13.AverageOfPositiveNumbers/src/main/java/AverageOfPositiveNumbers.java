
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        while(true){
            System.out.println("Give a number:");
            Double num = Double.valueOf(scanner.nextLine());
            if(num > 0){
                sum = sum + num;
                number = number + 1;
            }
            if(num == 0 && sum <= 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if(num == 0){
                double average = sum / number;
                System.out.println("Average of the numbers: " + average);
                break;
            }
        }
    }
}