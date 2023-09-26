public class Container {
    private int container;
    public Container(){
        this.container = 0;
    }
    public int contains(){
        return container;
    }
    public void add(int amount){
        if(amount + this.container > 100)
            this.container = 100;
        else if(amount > 0)
            this.container = this.container + amount;
    }
    public void remove(int amount){
         if(this.container - amount < 0){
            this.container = 0;
        }
         else if(amount > 0)
            this.container = this.container - amount;
    }
    public String toString(){
        
        return + this.container + "/100";
    }
}
