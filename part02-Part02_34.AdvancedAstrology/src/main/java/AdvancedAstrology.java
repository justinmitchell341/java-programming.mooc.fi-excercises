
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;    
        while(i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;    
        while(i < number) {
            System.out.print(" ");
            i++;
        }
    }
    public static void printTriangle(int size) {
        int p = 1;
        int m = size - 1;
        while(p <= size){
            printSpaces(m);
            printStars(p);
            p++;
            m--;
        }
    }

    public static void christmasTree(int height) {
        int m = height - 1;
        int s = height - 2;
        height = height*2;
        int p = 1;
        while(p <= height){
            printSpaces(m);
            printStars(p);
            p++;
            p++;
            m--;
        }
        printSpaces(s);
        printStars(3);
        printSpaces(s);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        christmasTree(4);
    }
}
