
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int check = 1;
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                check = 1;
                String line = fileReader.nextLine();
                if(line.contains(searchedFor)){
                    System.out.println("Found!");
                    break;
                }
                else{
                    check = 0;
                }
            }
            if(check == 0){
                System.out.println("Not found");
            }
        }
        catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
