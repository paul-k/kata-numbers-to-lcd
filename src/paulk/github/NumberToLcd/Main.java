package paulk.github.NumberToLcd;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number...");
            System.out.println("eg:");
            System.out.println("  java Main 1234567890");
            return;
        }

        String value = args[0];
        Integer height = args.length > 1 ? Integer.parseInt(args[1]) : 1;
        Integer width = args.length > 2 ? Integer.parseInt(args[2]) : 1;

        LcdDisplay lcd = new LcdDisplay(width, height);
        String result = lcd.FromValue(value);
        System.out.println(result);
    }
}