class Custard extends Decorator{
    Custard(Offering offering){
        this.offering=offering;
    }

    String getName(){
        return offering.getName()+" with Custard";
    }

    int getPrice(){
        return offering.getPrice()+64;
    }
}