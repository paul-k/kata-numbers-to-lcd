package paulk.github.NumberToLcd;

public class LcdNumbers {

    private static String[] NumberOne = new String[] { "   ", "  |", "  |", "  |", "  |" };
    private static String[] NumberTwo = new String[] { " _ ", "  |", " _|", "|  ", "|_ " };
    private static String[] NumberThree = new String[] { " _ ", "  |", " _|", "  |", " _|" };
    private static String[] NumberFour = new String[] { "   ", "| |", "|_|", "  |", "  |" };
    private static String[] NumberFive = new String[] { " _ ", "|  ", "|_ ", "  |", " _|" };
    private static String[] NumberSix = new String[] { " _ ", "|  ", "|_ ", "| |", "|_|" };
    private static String[] NumberSeven = new String[] { " _ ", "  |", "  |", "  |", "  |" };
    private static String[] NumberEight = new String[] { " _ ", "| |", "|_|", "| |", "|_|" };
    private static String[] NumberNine = new String[] { " _ ", "| |", "|_|", "  |", " _|" };
    private static String[] NumberZero = new String[] { " _ ", "| |", "| |", "| |", "|_|" };

    public static String[] getLcdCharacter(String number) {

        switch (number) {
            case "1":
                return NumberOne;
            case "2":
                return NumberTwo;
            case "3":
                return NumberThree;
            case "4":
                return NumberFour;
            case "5":
                return NumberFive;
            case "6":
                return NumberSix;
            case "7":
                return NumberSeven;
            case "8":
                return NumberEight;
            case "9":
                return NumberNine;
            default:
                return NumberZero;
        }
    }
}
