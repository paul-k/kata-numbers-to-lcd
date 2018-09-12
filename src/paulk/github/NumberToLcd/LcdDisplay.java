package paulk.github.NumberToLcd;

import java.util.ArrayList;
import java.util.List;

public class LcdDisplay {

    private Integer _width;
    private Integer _height;

    public LcdDisplay () {
        _width = 1;
        _height = 1;
    }

    public LcdDisplay (Integer width, Integer height) {
        this();
        _width = width;
        _height = height;
    }

    public String FromValue(String number) {

        StringBuilder topLine = new StringBuilder();
        StringBuilder secondLine = new StringBuilder();
        StringBuilder middleLine = new StringBuilder();
        StringBuilder fourthLine = new StringBuilder();
        StringBuilder bottomLine = new StringBuilder();

        for (String val:number.split("")) {
            String[] asLcd = ToLcdCharacterWithWidth(val);

            topLine.append(asLcd[0]);

            if (_height == 1)
                middleLine.append(asLcd[1]);
            else {
                secondLine.append(asLcd[1]);
                middleLine.append(asLcd[2]);
                fourthLine.append(asLcd[3]);
            }

            bottomLine.append(asLcd[_height == 1 ? 2 : 4]);
        }

        String result = topLine + "\r\n";

        if (_height > 1)
            for (Integer i = 0; i < (_height - 1); i++)
                result += secondLine + "\r\n";

        result += middleLine + "\r\n";

        if (_height > 1)
            for (Integer i = 0; i < (_height - 1); i++)
                result += fourthLine + "\r\n";

        result += bottomLine + "\r\n";

        return result;
    }

    public static String[] SmallNumberOne = new String[] { "   ", "  |", "  |" };
    public static String[] SmallNumberTwo = new String[] { " _ ", " _|", "|_ " };
    public static String[] SmallNumberThree = new String[] { " _ ", " _|", " _|" };
    public static String[] SmallNumberFour = new String[] { "   ", "|_|", "  |" };
    public static String[] SmallNumberFive = new String[] { " _ ", "|_ ", " _|" };
    public static String[] SmallNumberSix = new String[] { " _ ", "|_ ", "|_|" };
    public static String[] SmallNumberSeven = new String[] { " _ ", "  |", "  |" };
    public static String[] SmallNumberEight = new String[] { " _ ", "|_|", "|_|" };
    public static String[] SmallNumberNine = new String[] { " _ ", "|_|", " _|" };
    public static String[] SmallNumberZero = new String[] { " _ ", "| |", "|_|" };

    public static String[] NumberOne = new String[] { "   ", "  |", "  |", "  |", "  |" };
    public static String[] NumberTwo = new String[] { " _ ", "  |", " _|", "|  ", "|_ " };
    public static String[] NumberThree = new String[] { " _ ", "  |", " _|", "  |", " _|" };
    public static String[] NumberFour = new String[] { "   ", "| |", "|_|", "  |", "  |" };
    public static String[] NumberFive = new String[] { " _ ", "|  ", "|_ ", "  |", " _|" };
    public static String[] NumberSix = new String[] { " _ ", "|  ", "|_ ", "| |", "|_|" };
    public static String[] NumberSeven = new String[] { " _ ", "  |", "  |", "  |", "  |" };
    public static String[] NumberEight = new String[] { " _ ", "| |", "|_|", "| |", "|_|" };
    public static String[] NumberNine = new String[] { " _ ", "| |", "|_|", "  |", " _|" };
    public static String[] NumberZero = new String[] { " _ ", "| |", "| |", "| |", "|_|" };

    private String[] ToLcdCharacterWithWidth(String number) {
        List<String> result = new ArrayList<String>();
        String[] originalResult = ToLcdCharacter(number);

        if (_width > 1) {

            for (String row:originalResult) {

                String[] columns = row.split("");

                String newRow = columns[0];

                for (Integer c = 0; c < _width; c++)
                    newRow += columns[1];

                newRow += columns[2];
                newRow += " ";

                result.add(newRow);
            }

        }

        return _width > 1 ? result.toArray(new String[ result.size() ]) : originalResult;
    }

    private String[] ToLcdCharacter(String number) {

        switch (number) {
            case "1":
                return _height == 1 ? SmallNumberOne : NumberOne;
            case "2":
                return _height == 1 ? SmallNumberTwo : NumberTwo;
            case "3":
                return _height == 1 ? SmallNumberThree : NumberThree;
            case "4":
                return _height == 1 ? SmallNumberFour: NumberFour;
            case "5":
                return _height == 1 ? SmallNumberFive: NumberFive;
            case "6":
                return _height == 1 ? SmallNumberSix : NumberSix;
            case "7":
                return _height == 1 ? SmallNumberSeven : NumberSeven;
            case "8":
                return _height == 1 ? SmallNumberEight : NumberEight;
            case "9":
                return _height == 1 ? SmallNumberNine : NumberNine;
            default:
                return _height == 1 ? SmallNumberZero : NumberZero;
        }
    }
}
