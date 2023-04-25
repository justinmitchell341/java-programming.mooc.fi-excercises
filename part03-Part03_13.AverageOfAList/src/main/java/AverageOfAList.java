
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input);
        }
        double sum = 0;
        double divise = 0;
        double index = list.size() - 1;
        for(int i = 0; i <= index; i++){
            double add = list.get(i);
            sum = sum + add;
            divise = i;
        }
        divise = divise + 1;
        double avg = sum/divise;
        System.out.println("Average: " + avg);
   
    
}
}
