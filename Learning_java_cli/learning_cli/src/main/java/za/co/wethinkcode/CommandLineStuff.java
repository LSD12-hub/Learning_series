package za.co.wethinkcode;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandLineStuff {
    
    private String [] args;
    private CommandLineParser parser;
    private Options options;
    private HelpFormatter formatter;
 

    public CommandLineStuff(String [] args){
        this.args = args;

        options = new Options();
        

        Option name = new Option("n", "name", true, "Name of user");
        Option age = new Option("a", "age", true, "Age of user");

        age.setType(Integer.class);

        options.addOption(name);
        options.addOption(age);

        parser = new DefaultParser();
        formatter = new HelpFormatter();
    }


    public CommandLine stuff() {
        try {
            return parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("User Profile Info", options);
            System.exit(1);
        }
        return null;
    }
}
