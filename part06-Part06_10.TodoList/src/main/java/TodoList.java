
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;
    public TodoList(){
        this.tasks = new ArrayList <>();
    }
    public void add(String task){
        tasks.add(task);
    }
    public void print(){
        int index = 1;
        for(String task: tasks){
            System.out.println(index + ": " + task);
            index ++;
        }
    }
    public void remove(int number){
        tasks.remove(tasks.get(number - 1));
    }
}
