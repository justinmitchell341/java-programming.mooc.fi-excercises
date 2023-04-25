

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number){    
        int i = number;
        int stop = 0;
        while(i <= number && stop != number){
            System.out.println(i);
            i--;
            stop++;
        }
    }
}