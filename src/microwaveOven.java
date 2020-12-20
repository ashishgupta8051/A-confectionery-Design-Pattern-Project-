public class microwaveOven{
    private static microwaveOven uniqueInstance=new microwaveOven();
    private microwaveOven(){}
    public static microwaveOven getInstance(){
	System.out.println("Baking in the oven");
	return uniqueInstance;
    }
}