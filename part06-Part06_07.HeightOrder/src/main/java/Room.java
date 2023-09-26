
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(persons.isEmpty())
            return true;
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        Person temp = this.persons.get(0);
        for(Person person: this.persons){
            if(person.getHeight() < temp.getHeight()){
                temp = person;
            }
        }
        return temp;
    }
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
     Person temp = shortest();
     this.persons.remove(shortest());
     return temp;   
    }
}
