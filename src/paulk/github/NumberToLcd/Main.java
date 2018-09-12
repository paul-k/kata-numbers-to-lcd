package paulk.github.NumberToLcd;

public class Main {

    public static void main(String[] args) {

        CommandLineArguments cla = new CommandLineArguments();
        CommandLineArguments.Options options = cla.parse(args);

        if (options.showHelp) {
            System.out.println(cla.getHelpText());
            return;
        }

        LcdDisplay lcd = new LcdDisplay(options.width, options.height);
        String result = lcd.FromValue(options.digits);
        System.out.println(result);
    }
}