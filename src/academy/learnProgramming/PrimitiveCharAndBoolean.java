package academy.learnProgramming;

public class PrimitiveCharAndBoolean {


    public static void main(String[] args) {
        char ch = '1';
        char chA = 'a';

        char uniChar = '\u03A9';
        char romanChar = '\u216c';
        System.out.println("Uni Char : "+uniChar);
        System.out.println("Roman Char : "+Integer.toString(romanChar));
        System.out.println("Normal Char : "+Integer.toHexString(chA));

    }
}
