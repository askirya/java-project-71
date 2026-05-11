package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(
    name = "gendiff",
    mixinStandardHelpOptions = true,
    version = "gendiff 1.0",
    description = "Compares two configuration files and shows a difference.",
    customSynopsis = "gendiff [-hV] [-f=format] filepath1 filepath2"
)
public class App implements Runnable {

    @Parameters(
        index = "0",
        paramLabel = "filepath1",
        description = "path to first file"
    )
    private String filepath1;

    @Parameters(
        index = "1",
        paramLabel = "filepath2",
        description = "path to second file"
    )
    private String filepath2;

    @Option(
        names = {"-f", "--format"},
        paramLabel = "format",
        description = "output format [default: ${DEFAULT-VALUE}]",
        defaultValue = "stylish"
    )
    private String format;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        // diff logic and formatters will be implemented in later steps
    }
}
