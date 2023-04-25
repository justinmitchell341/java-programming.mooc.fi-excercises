
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         while (true) {
        String text = scanner.nextLine();
        String[] av = text.split(" ");
             for(int i = 0; i < av.length; i++){
                 if(av[i].contains("av")){
                System.out.println(av[i]);
                 }
             }
              if(text.equals("")){
               break;
            }
        }
    }
}

