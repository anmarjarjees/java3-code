public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Spaceship ship1 = new Spaceship();

        ship1.callSign="fine";

        System.out.println(Spaceship.toughness);
        
        /*
         *  Parameters and Arguments
         */

        // the value 1.5 is the argument
        Spaceship.increaseDifficulty(1.5f);

        // Spaceship ship2 = new Spaceship("Tiger");
        // The constructor Spaceship(String) is undefined
    }
}

