public class Recipe {
    String[] ingredients;
    int prepTime;
    int numServings;

    public Recipe(String[] ingredients, int prepTime, int numServings) {
        this.ingredients = ingredients;
        this.prepTime = prepTime;
        this.numServings = numServings;
    }

    public void enjoy(String recipe) {
        System.out.println("Enjoy the " + recipe + "!");
    }
}
