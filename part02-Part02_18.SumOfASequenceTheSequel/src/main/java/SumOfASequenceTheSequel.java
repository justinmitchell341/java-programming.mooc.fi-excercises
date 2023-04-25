
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?"); // ask user for input aka the  number the program will stop counting at
        int last = Integer.valueOf(scanner.nextLine()); // get user input
        int sum = 0; // initalize variable of sum
        int counter = first;
        while(true){ // start of loop
            sum += counter; // when loop commences add i count to sum
            counter++; // count
            if(counter == last + 1){ //check if i counter has reached the user inputed number
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}