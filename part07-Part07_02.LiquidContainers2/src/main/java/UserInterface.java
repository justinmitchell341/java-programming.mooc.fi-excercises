
import java.util.Scanner;

public class UserInterface {
    private Container container1;
    private Container container2;
    private Scanner scanner;
    public UserInterface(Container firstContainer, Container secondContainer, Scanner scanner){
        this.container1 = firstContainer;
        this.container2 = secondContainer;
        this.scanner = scanner;
    }
    public void start(){
        while(true){
            System.out.println("First: "+ container1.toString());
            System.out.println("Second: " + container2.toString());
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if(command.equals("add"))
                container1.add(amount);
        
            if(command.equals("remove"))
                container2.remove(amount);
            
            if(command.equals("move")){
                if(container1.contains() >= amount){
                    container1.remove(amount);
                    container2.add(amount);
                }
                else if(container1.contains() < amount)
                    container2.add(container1.contains());
                
            }
            
            }
        
        
        }
}
