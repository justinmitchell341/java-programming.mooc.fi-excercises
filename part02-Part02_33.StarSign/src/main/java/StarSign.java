
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(6);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 0;    
        while(i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 0; // initalize i
        while(i < size){ //while i is less than param do this loop
            for(int counter = 0; counter<size; counter++){ // make counter 0, while counter is less than size print star line
                System.out.print("*");
            }
            i++;
            System.out.println("");
        }
    }
    public static void printRectangle(int width, int height) {
        int i = 0; // initalize i
//        while(i <= width && i <= height){ //while i is less than width input do this loop
//            for(int counter = 0; counter<width; counter++){ // make counter 0, while counter is less than size print star line
//                System.out.print("*");
//            }
//            System.out.println("");
//            i++;
//        }
        while(i < width && i < height){
            printStars(width);
            i++;
        }
    }
    public static void printTriangle(int size) {
        int i = 0;
        while(i <= size){
            printStars(i);
            i++;
            
        }
    }
}
