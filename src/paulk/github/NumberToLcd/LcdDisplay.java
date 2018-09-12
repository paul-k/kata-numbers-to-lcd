package paulk.github.NumberToLcd;

import java.util.ArrayList;
import java.util.List;

public class LcdDisplay {

    private Integer _width = 1;
    private Integer _height = 1;

    public LcdDisplay () {
    }

    public LcdDisplay (Integer width, Integer height) {
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
            String[] asLcd = ToLcdCharacter(val);

            topLine.append(asLcd[0]);
            secondLine.append(asLcd[1]);
            middleLine.append(asLcd[2]);
            fourthLine.append(asLcd[3]);
            bottomLine.append(asLcd[4]);
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

    private String[] ToLcdCharacter(String number) {

        String[] originalResult = LcdNumbers.getLcdCharacter(number);

        if (_width == 1)
            return originalResult;


        List<String> result = new ArrayList<String>();

        for (String row : originalResult) {

            String[] columns = row.split("");

            String newRow = columns[0];

            for (Integer c = 0; c < _width; c++)
                newRow += columns[1];

            newRow += columns[2];
            newRow += " ";

            result.add(newRow);
        }

        return result.toArray(new String[result.size()]);
    }
}
