package templateMethod;

public class VeggieHoagie extends Hoagie {

    String[] veggieUsed = {"Lettuce","Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil","Vinegar"};

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }


    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.print("Adding the vegetable: ");
        for(String vegetable:veggieUsed){
            System.out.print(vegetable+" ");
        }
        System.out.println();
    }

    @Override
    void addCondiments() {
        System.out.print("Adding the condiments: ");
        for(String condiment:condimentsUsed){
            System.out.print(condiment+" ");
        }
        System.out.println();
    }
}
