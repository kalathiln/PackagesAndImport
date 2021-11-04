package academy.learnProgramming;
import static java.lang.Math.round;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {

        // Float to int manipulation
        float floatValue = 129837.5533f;
        int roundUp = floatRoundUp(floatValue);
        System.out.println("Float Value : "+floatValue);
        System.out.println("Rounded Up Value : "+roundUp);

        System.out.println("================================================================");

        // String to Int Manipulation
        int intValue =  18;
        String strValue = convertToString(intValue);
        System.out.println("Integer Value : "+intValue);
        System.out.println("Converted String Value : "+strValue);


    }

    /**
     *
     * @param intValue Integer value to be converted
     * @return String value for the Integer value added. = No difference
     */
    private static String convertToString(int intValue) {
        return Integer.toString(intValue);
    }

    /**
     *
     * @param f float value as input
     * @return return rounded up integer value from the float
     */
    private static int floatRoundUp(float f){
        return round(f);
    }
}
