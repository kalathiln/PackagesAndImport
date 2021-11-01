package academy.learnProgramming;

public class WholeNumericPrimitive {


    public static void main(String[] args){
        long max = 12334343545L;
        long n = 1_300;
//        octal base - octal number are from 0 to 7
        int oct = 07;
        int firstOctal = 010;
        int secondOct = 022;
        int sumOct = firstOctal + secondOct;
        System.out.println("Print Octal sum First Oct: "+Integer.toOctalString(firstOctal)+ ", Second Oct: "+secondOct);
        System.out.println("Sum Octal : "+Integer.toOctalString(sumOct));

//        Hexadecimal NUmbers from 0-9 and A-F
        int firstHex = 0xF; //15 decimal
        int secondHex= 0x1E; // 30 decimal
        int sumHex = firstHex+secondHex; // 45 decimal and 2d Hex
        System.out.println("First Hex : "+firstHex+ " Second Hex: "+secondHex);
        System.out.println("Sum Hex : "+Integer.toHexString(sumHex));

//        Binary Number manipulation
        int firstBin = 0b1001; // 9 in decimal
        int secondBin = 0b0111; // 7 in decimal
        int sumBin = firstBin+secondBin; // 16 in decimal
        System.out.println("First Bin : "+firstBin+ " Second Bin : "+secondBin);
        System.out.println("SumBin : "+Integer.toBinaryString(sumBin)+ ", IN DECIMAL : "+sumBin);

//        Decimal Numeric

        float firstFloat = 1213.232F; // If F is not added it would be considered as a double

        double myDouble = 2.54F; // The float here is converted into double by the compiler
        double mySecondDouble = 2.54D; // This is not required as the default is as double.

        double scientific1 = 5.1000123E3;

        System.out.println("Scientific 1 : "+scientific1);








    }

}
