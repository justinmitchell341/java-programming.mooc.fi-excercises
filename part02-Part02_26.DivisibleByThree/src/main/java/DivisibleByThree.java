
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 13);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        int counter = beginning;
        double dbeg = beginning;
        double dend = end;
        while(counter <= end){
            if(counter % 3 == 0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
