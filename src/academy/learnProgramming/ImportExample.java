package academy.learnProgramming;

import java.util.Random;

import static academy.learnProgramming.Config.NAME;
import static academy.learnProgramming.Config.printConfig;
import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;

/**
 * Include Static Import and normal import examples
 */
public class ImportExample {
    public static void main(String[] args) {

        // Static imports are used for importing static members.
        // Regular imports are used to import classes.
        // Static Members could be Variables or Methods.
        // For both the imports we cannot import two variables or classes with the same name.

        Random random = new Random();
        out.print(random.nextInt());
        out.println(PI);
        out.println("The min value between 14 and 14.5 is :"+min(14,14.5));
        out.println("The Name from config is :"+NAME);
        printConfig();
    }
}
