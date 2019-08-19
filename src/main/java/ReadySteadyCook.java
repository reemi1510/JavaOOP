public class ReadySteadyCook {
    public static void main(String[] args) {

        SecretIngredient secretIngredient = new SecretIngredient();

        String[] doughnutIngredients = {"Milk", "Butter", "Sugar", "Egg", "Oil", "Cinnamon"};
        String[] bananaCakeIngredients = {"Bananas", "Flour", "Sugar", "Eggs"};
        String[] betterBananaCakeIngredients = {"Bananas", "Flour", "Sugar", "Eggs", secretIngredient.toString()};
        String[] fruitSaladIngredients = {"Apples", "Bananas", "Grapes"};

        DoughnutRecipe doughnut = new DoughnutRecipe(doughnutIngredients, 15,18);

        //This is an example of Polymorphism
        CakeRecipe bananaCake = new CakeRecipe(bananaCakeIngredients, 30, 8);
        bananaCake = new CakeRecipe(betterBananaCakeIngredients, 30,  1);
        Recipe fruitSalad = new FruitSaladRecipe(fruitSaladIngredients, 10, 4);

        doughnut.cook(2);
        bananaCake.cook(55);
        fruitSalad.enjoy("fruit salad");
    }
}
