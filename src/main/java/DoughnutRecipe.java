public class DoughnutRecipe extends Recipe implements Cookable{
    //This is also an example of inheritance

    public DoughnutRecipe(String[] ingredients, int prepTime, int numServings) {
        super(ingredients, prepTime, numServings);
    }

    public void cook(int cookTime) {
        System.out.println("Fry doughnut for " + cookTime + " minutes.");
    }

}
