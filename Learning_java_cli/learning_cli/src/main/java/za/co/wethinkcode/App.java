package za.co.wethinkcode;

import org.apache.commons.cli.CommandLine;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        CommandLineStuff cli = new CommandLineStuff(args);

        CommandLine cmd = cli.stuff();


        System.out.println("name: " + cmd.getOptionValue("name"));
        System.out.println("age: " + cmd.getOptionValue("age"));
        
    }
}
