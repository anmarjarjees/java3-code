public class Spaceship {
    /*
     * Instance Variables:
     * Variables belong to the object (the instance of a class)
     */
    public String callSign;
    private int shieldStrength;

    private String name;
    
    /*
     * NOTE:
     * Adding the constructor with no parameter is needed
     * after adding the other one with the parameter so we can use both
     */
    public Spaceship() {

    }

    // Define a custom class that accept one parameter of type string
    public Spaceship(String n) {
        /*
         * Notice below => no need to add the keyword "this" it's optional
         * this.name = n;
         */
        name = n;
        /*
         * In case if we the both sides with the same variable name
         * we must use the keyword "this" with the class field:
         * this.name = name;
         */
    }

    /*
     * Class Variables:
     * - Variables belong to the Class (not the instance/object)
     * - Must include the keyword "static"​
     */
    public static float toughness;

    // public static methods just by adding the keyword "static":​
    // the variable "tough" is the parameter
    public static void increaseDifficulty(float tough) {
        toughness += tough;
    }

    /*
     * a public method to change the colors
     * void => has no return
     */
    public void changeTheme() {
        System.out.println("Change Game Colour Theme!");
    }
}
