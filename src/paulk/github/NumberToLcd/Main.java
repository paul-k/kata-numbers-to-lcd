package paulk.github.NumberToLcd;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number...");
            System.out.println("eg:");
            System.out.println("  java Main 1234567890");
            return;
        }

        LcdDisplay lcd = new LcdDisplay();
        String result = lcd.FromValue(args[0]);
        System.out.println(result);
    }
}