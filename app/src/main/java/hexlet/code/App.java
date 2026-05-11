package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "gendiff",
    mixinStandardHelpOptions = true,
    version = "gendiff 1.0",
    description = "Compares two configuration files and shows a difference."
)
public class App implements Runnable {
    public static void main(String[] args) {
        var commandLine = new CommandLine(new App());
        commandLine.execute(args);
    }

    @Override
    public void run() {
        // The command currently only supports service options.
    }
}
