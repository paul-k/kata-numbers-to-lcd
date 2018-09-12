package paulk.github.NumberToLcd;

public class CommandLineArguments {

    public Options parse(String[] args) {

        Options result = new Options();

        if (args.length == 0 || args.length % 2 > 0) {
            result.showHelp = true;
        }

        for (Integer i = 0; i < args.length; i += 2) {

            String type = args[i];
            String value = args[i+1];

            switch (type) {
                case "-d":
                    result.digits = value;
                    continue;
                case "-h":
                    result.height = Integer.parseInt(value);
                    continue;
                case "-w":
                    result.width = Integer.parseInt(value);
                    continue;
                default:
                    result.showHelp = true;
            }
        }

        return result;
    }



    public String getHelpText() {
        StringBuilder output = new StringBuilder();

        output.append("NumberToLcd requires arguments to run:\r\n");
        output.append("\r\n");
        output.append("  -d {numbers}       Digits to display\r\n");
        output.append("  -h {number | 1}    Optional height\r\n");
        output.append("  -w {number | 1}    Optional width\r\n");

        return output.toString();
    }

    public class Options {
        public String digits = "";
        public Integer height = 1;
        public Integer width = 1;

        public boolean showHelp = false;
    }
}
