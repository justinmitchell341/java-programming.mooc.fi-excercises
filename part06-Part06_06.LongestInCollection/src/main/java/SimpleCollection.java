
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    public String longest(){
        String longest = "";
        if(elements.isEmpty()){
            return null;
        }
        for(String element: elements){
            int eLength = element.length();
            int longLength = longest.length();
            if(eLength > longLength){
                longest = element;
            }
        }
        return longest;
    }
}
