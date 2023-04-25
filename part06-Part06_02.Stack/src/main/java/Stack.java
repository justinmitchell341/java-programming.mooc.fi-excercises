
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    public Stack(){
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty(){
        if(this.stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void add(String value){
        stack.add(value);
    }
    public ArrayList<String> values(){
     
        return this.stack;
    }
    public String take(){
        if(this.stack.isEmpty()){
            return null;
        }
        String temp = (stack.get(stack.size() - 1));
        this.stack.remove(stack.get(stack.size() - 1));
        return temp;
    }
    
}
