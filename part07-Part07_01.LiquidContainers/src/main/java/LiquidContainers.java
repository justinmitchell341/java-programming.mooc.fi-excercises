
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: "+container1 +"/100");
            System.out.println("Second: " +container2+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add")){
                if(amount >= 100 || amount+container1 > 100){
                    container1 = 100;
                }
                else if(amount > 0){
                container1 = amount + container1;
                }
            } 
            if(command.equals("move")){
                if(amount >= 100){
                    container2 = 100;
                    container1 = 0;
                }
                if(amount > 0){
                    if(amount >= container1){
                     container2 = container2 + container1;
                     container1 = 0;
                    }
                    else if(container2 + amount > 100){
                        container2 = 100;
                    }
                    else{
                    container2 = amount + container2;
                    container1 = container1 - amount;
                                }
                    }
                }
            
            if(command.equals("remove")){
                if(amount > container2){
                    container2 = 0;
            }
                if(amount <= container2){
                    container2 = container2 - amount;
                }
                }
        }    
    }
}
 
