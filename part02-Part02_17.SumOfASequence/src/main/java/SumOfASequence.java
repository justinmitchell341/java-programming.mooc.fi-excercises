
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0; // define i starting point
        System.out.println("Last number?"); // ask user for input aka the  number the program will stop counting at
        int last = Integer.valueOf(scanner.nextLine()); // get user input
        int sum = 0; // initalize variable of sum
        while(true){ // start of loop
            sum += i; // when loop commences add i count to sum
            i++; // count
            if(i == last + 1){ //check if i counter has reached the user inputed number
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}
