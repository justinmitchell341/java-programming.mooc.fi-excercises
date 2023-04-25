public class Bird {
    private String name;
    private String latinName;
    private int observations;
    public Bird(final String name, final String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public void observe(){
        this.observations++;
    }
}
