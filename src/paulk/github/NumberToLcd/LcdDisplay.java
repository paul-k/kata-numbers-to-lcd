package paulk.github.NumberToLcd;

public class LcdDisplay {

    public String FromValue(String number) {

        StringBuilder topLine = new StringBuilder();
        StringBuilder middleLine = new StringBuilder();
        StringBuilder bottomLine = new StringBuilder();

        for (String val:number.split("")) {
            String[] asLcd = ToLcdCharacter(val);

            topLine.append(asLcd[0]);
            middleLine.append(asLcd[1]);
            bottomLine.append(asLcd[2]);
        }

        return topLine + "\r\n" + middleLine + "\r\n" + bottomLine + "\r\n";
    }

    public static String[] NumberOne = new String[] { "   ", "  |", "  |" };
    public static String[] NumberTwo = new String[] { " _ ", " _|", "|_ " };
    public static String[] NumberThree = new String[] { " _ ", " _|", " _|" };
    public static String[] NumberFour = new String[] { "   ", "|_|", "  |" };
    public static String[] NumberFive = new String[] { " _ ", "|_ ", " _|" };
    public static String[] NumberSix = new String[] { " _ ", "|_ ", "|_|" };
    public static String[] NumberSeven = new String[] { " _ ", "  |", "  |" };
    public static String[] NumberEight = new String[] { " _ ", "|_|", "|_|" };
    public static String[] NumberNine = new String[] { " _ ", "|_|", " _|" };
    public static String[] NumberZero = new String[] { " _ ", "| |", "|_|" };

    private String[] ToLcdCharacter(String number) {

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
