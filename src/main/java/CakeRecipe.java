public class CakeRecipe extends Recipe implements Cookable{
    //This is an example of inheritance

    public CakeRecipe(String[] ingredients, int prepTime, int numServings) {
        super(ingredients, prepTime, numServings);
    }

    public void cook(int cookTime) {
        System.out.println("Bake cake for " + cookTime + " minutes.");
    }
}
