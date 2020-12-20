abstract public class Pastry{
    public final void templateMethod(int quantity){
        pourSQEssenceOrPowder(quantity);
        addCondiments();
        mix();
	bake();
        serve();
    }
    public void pourSQEssenceOrPowder(int quantity){
        System.out.println("\r\nPour "+quantity+" ml of Essence / gm of Powder");
    }
    abstract public void addCondiments();
    public void mix(){}
    public void bake(){
	microwaveOven.getInstance();
    }
    public void serve(){
        System.out.println("Served by Waitor");
    }
}