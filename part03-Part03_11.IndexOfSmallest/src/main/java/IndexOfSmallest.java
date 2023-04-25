
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
        
        list.add(input);
        }
        int compare = list.get(0);
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(compare > list.get(i)){
                compare = list.get(i);
                System.out.println(compare);
                index = i;
            }
        }
        System.out.println("Smallest number: " + compare);
        System.out.println("Found at index: " + index);
    }
}
