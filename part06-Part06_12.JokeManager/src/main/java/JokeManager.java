import java.util.ArrayList;
public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        int random = (int) (Math.random()*jokes.size());
        return jokes.get(random);
    }
    public void printJokes(){
        for(String joke: jokes){
            System.out.println(joke);
        }
    }
}
