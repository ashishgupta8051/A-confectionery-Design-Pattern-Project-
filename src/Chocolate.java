class Chocolate extends Decorator{
    Chocolate(Offering offering){
        this.offering=offering;
    }

    String getName(){
        return offering.getName()+" with Chocolate";
    }

    int getPrice(){
        return offering.getPrice()+24;
    }
}