
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int first = Integer.valueOf(scanner.nextLine());
        int sum = 1; // initalize variable of sum
        int counter = 1;
        while(true){ // start of loop
            sum = sum * counter; // when loop commences add i count to sum
            counter++; // count
            if(counter == first + 1){ //check if i counter has reached the user inputed number
                System.out.println("Factorial: " + sum);
                break;
            }
        }
    }
}