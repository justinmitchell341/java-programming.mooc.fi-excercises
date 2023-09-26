public class Item {
    private String name;
    private int weight;
    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    Item(Item heaviest, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        
        return getName() + "(" + getWeight() + " kg)";
    }

    boolean listItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
