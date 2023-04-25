
import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;
    public UserInterface(TodoList tasks, Scanner scanner){
        this.tasks = tasks;
        this.scanner = scanner;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
           if(input.equals("add")){
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                tasks.add(toAdd);
            }
            else if(input.equals("list")){
                tasks.print();
            }
            else if(input.equals("remove")){
                System.out.println("Which one is removed? ");
                int remove = scanner.nextInt();
                tasks.remove(remove);
            }
        }
    }
    
}
