package exception_review;

import java.io.File;
import java.io.IOException;
/*
 * For full comments and details:
 * link: https://github.com/anmarjarjees/java-extra/blob/main/src/p01_exceptions/C3ExceptionWithFile.java
 */
public class C3ExceptionWithFile {
    public static void main(String[] args) {
        File myFile = new File("data/any.txt");

        try {
            myFile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    } // main()
    /*
     * IMPORTANT NOTE (TYPES OF EXCEPTIONS):
     * *************************************
     * - Checked Exceptions => are verified by the compiler before the code is
     * executed
     * - Unchecked Exceptions => are NOT verified by the compiler.
     * Run-time exception and all its classes are considered to be
     * "Unchecked Exception"
     */
} // class file
