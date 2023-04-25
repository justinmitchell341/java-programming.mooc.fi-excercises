import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        int compare = list.get(0);
        for(int i = 0; i<list.size(); i++){
         if(compare < list.get(i)){
             compare = list.get(i);
            }   
        }
        System.out.println(compare);
    }
}
//get the starting number
//compare starting number to next number in list
//if next number in list is larger than previous number make that the next comparison
//iterate through loop until i is equal to list size