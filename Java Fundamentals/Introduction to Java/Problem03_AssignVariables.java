
public class Problem03_AssignVariables {
    public static void main(String[] args) {
        boolean bool = false;
        String str = "Palo Alto, CA";
        short shrt = 32767;
        int intgr = 2000000000;
        double doubleThing = 0.1234567891011;
        float floatThing = 0.5f;
        long longThing = 919827112351L;
        byte byteThing = 127;
        char character = 'c';
        //short tryShort = 32768; - INCOMPATIBLE TYPES

        System.out.println("Boolean = " + bool +
                            "\nString = " + str +
                            "\nShort = " + shrt +
                            "\nInterger = " + intgr +
                            "\nDouble = " + doubleThing +
                            "\nFloat = " + floatThing +
                            "\nLong = " + longThing +
                            "\nByte = " + byteThing +
                            "\nChar = " + character);
    }
}
