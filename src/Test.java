import java.util.*;
class Test{
    public static void main(String args[]){
        Offering offering=new Pineapple();
        offering=new Chocolate(offering);
        offering=new Chocolate(offering);
        offering=new Chocolate(offering);
        System.out.print("\r\n" +offering.getName());
        System.out.print(" " +offering.getPrice());
        System.out.print("\r\n\r\nPlease select any one of the following options :\r\n\r\n1. Pineapple\r\n2. Chocolate\r\n3. Strawberry\r\n4. Apple\r\n5. Vanilla\r\n6. Custard\r\n7. Orange\r\n\r\n");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        switch(a){
            case 1:
                Pastry b = new Pineapple_1();
                b.templateMethod(7);
                break;
            case 2:
                b=new Chocolate_1();
                b.templateMethod(15);
                break;
            case 3:
                b=new Strawberry_1();
                b.templateMethod(27);
                break;
	        case 4:
                b=new Apple_1();
                b.templateMethod(13);
                break;
            case 5:
                b=new Vanilla_1();
                b.templateMethod(5);
                break;
            case 6:
                b=new Custard_1();
                b.templateMethod(12);
                break;
            case 7:
                b=new Orange_1();
                b.templateMethod(17);
                break;
        }
    }
}
