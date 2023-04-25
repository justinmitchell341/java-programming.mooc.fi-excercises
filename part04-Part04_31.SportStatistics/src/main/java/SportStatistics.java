
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int num = 0;
        int wins = 0;
        int loses = 0;
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String hteam = parts[0];
                String vteam = parts[1];
                int htp = Integer.valueOf(parts[2]);
                int vtp = Integer.valueOf(parts[3]);
                if(hteam.equals(team) || vteam.equals(team)){
                    num++;
                    if(hteam.equals(team) && htp > vtp){
                        wins++;
                         }
                    if(vteam.equals(team) && vtp > htp){
                        wins++;
                        }
                    if(hteam.equals(team) && htp < vtp){
                        loses++;
                         }
                    if(vteam.equals(team) && vtp < htp){
                        loses++;
                        }
                    }
                }
            System.out.println("Games: " + num);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loses);
            }
        catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }

}
