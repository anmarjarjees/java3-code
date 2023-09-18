package arrays;

/* 
 * PascalCase => MyArray
 * camelCase => myArray
 * snake_case => my_array
 * kebab-case => my-array
 */
public class MyArray {
    // adding the main() method
    public static void main(String[] args) {
        int myLuckyNumber = 7; // if I want to use one number

        // Question: What if we have 5 lucky numbers:
        int myLuckyNumber1 = 9;
        int myLuckyNumber2 = 3;
        int myLuckyNumber3 = 10;
        int myLuckyNumber4 = 25;
        int myLuckyNumber5 = 30;

        int[] myLuckyNumbers = new int[5];

        // Can be done in two lines also!
        // 1. Just declaring an array varaible
        int[] myFavChannelsNumbers;
        // 2. Then Initialize the array with 9 empty places
        myFavChannelsNumbers = new int[9]; //

        System.out.println(myLuckyNumbers); // empty array

        // adding items:
        // arrays are 0 based index
        myLuckyNumbers[0] = 9;
        myLuckyNumbers[1] = 3;
        myLuckyNumbers[2] = 10;
        myLuckyNumbers[3] = 25;
        myLuckyNumbers[4] = 30;

        /*
         * The error: Index 5 out of bounds for length 5
         */
        // myLuckyNumbers[5] = 32;
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:

        // PHP => $languages = ["HTML", "CSS","JavaScript"];
        // JS => let languages = ["HTML", "CSS","JavaScript"];

        // In Java:-)
        String[] languages = { "HTML", "CSS", "JavaScript", "PHP", "Python" };
        System.out.println("our third language in the list is " + languages[2]);
        System.out.println(languages[3] + " is very popular language for back-end web development");

        // replace the element "PHP" in index 3 with the new value of "Java"
        languages[3] = "Java";

        System.out.println("Our current semester language in the list is " + languages[3]);

        /*
         * object has two members:
         * - properties
         * - methods()
         * 
         * Array as an object, has the property "length"
         */

        System.out.println("We have to learn " + languages.length + " languages");
    } // main()
} // class file
