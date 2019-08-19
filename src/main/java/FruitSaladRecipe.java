public class FruitSaladRecipe extends Recipe {
    //This inherits from Recipe but doesn't implement Cookable

    public FruitSaladRecipe(String[] ingredients, int prepTime, int numServings) {
        super(ingredients, prepTime, numServings);
    }
}
