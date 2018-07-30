package builder;

public class BuilderPatternDemo {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total Cost: " +vegMeal.getCost());


        Meal chickenMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        chickenMeal.showItem();
        chickenMeal.getCost();
        System.out.println("Total Cost: "+chickenMeal.getCost());

    }
}
