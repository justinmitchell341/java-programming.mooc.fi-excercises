
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases;
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight + suitcase.totalWeight() <= maxWeight){
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }
    public String toString(){
        return suitcases.size()+ "suitcases " + "(" + this.totalWeight + " kg)";
    }
    public void printItems() {
        int index = 0;
        while (index < this.suitcases.size()) {
            this.suitcases.get(index).printItems();
            index++;
        }
    }
}
