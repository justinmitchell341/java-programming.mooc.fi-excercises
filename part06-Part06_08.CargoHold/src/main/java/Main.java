
public class Main {

       public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 8);

        Suitcase adasCase = new Suitcase(20);
        adasCase.addItem(brick);
        adasCase.addItem(brick);
        adasCase.addItem(brick);
        Hold all = new Hold(100);
        all.printItems();
    }
    }

