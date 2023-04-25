import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int time = 0;
        while(true){
        System.out.println("Name: ");
        name = scanner.nextLine();
                    if(name.isEmpty()){
                break;
            }
        System.out.println("Duration: ");
        time = Integer.valueOf(scanner.nextLine());
        programs.add(new TelevisionProgram(name, time));
        }
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram program: programs){
           if(max >=  program.getDuration())
              System.out.println(program); 
        }

        
    }
}