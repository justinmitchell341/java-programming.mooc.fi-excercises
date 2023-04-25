
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    public Suitcase(int max){
        this.maxWeight = max;
        this.totalWeight = 0;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){  
        if(this.totalWeight + item.getWeight() <= this.maxWeight){
            this.totalWeight = this.totalWeight + item.getWeight();
            this.items.add(item);
        }
    }
    public String toString(){
        if(items.size() == 0){
            return "no items " + "(" + totalWeight + " kg)";
        }
        if(items.size() == 1){
            return items.size() + " item " + "(" + totalWeight + " kg)" ;
        }
        return items.size() + " items " + "(" + totalWeight + " kg)" ;
    
        }
    
    public int totalWeight(){
        return this.totalWeight;
    } 
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }
    public Item heaviestItem(){
        if(items.size() == 0){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item item: items){
            if(item.getWeight() > heaviest.getWeight())
                heaviest = item;
        }
        return heaviest;
    }

}
