
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        while(true){
            System.out.println("Enter point totals, -1 stops: ");
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            if(input <=100 && input >= 0)
            grades.add(input); 
        }
        System.out.println("Point average (all): " + grades.averages());
        System.out.println("Point average(passing): " + grades.averagePassing());
        System.out.println("Pass percentage: " + grades.passPercent());
        grades.distribution();
        grades.print();
    }
}
