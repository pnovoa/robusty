package com.pavelnh.robusty;

import java.util.Arrays;
import org.apache.commons.cli.*;

public class OptionsReader{

  private CommandLine cmdLine;



  public OptionsReader(String args[]){
    Option optAlgorithm = Option.builder("a").required().desc("Algorithm options").hasArgs().longOpt("algorithm").valueSeparator(',').build();
    Options options = new Options();
    options.addOption(optAlgorithm); 

    CommandLineParser parser = new DefaultParser();
    CommandLine cmdLine;
    try{
       this.cmdLine = parser.parse(options, args, true);

    }
    catch(ParseException parseException){
      System.out.println("ERROR: Unable to parse command-line arguments "
      + Arrays.toString(args) + " due to: "
      + parseException);
    }
  }



	/**
	* Returns value of cmdLine
	* @return
	*/
	public CommandLine getCmdLine() {
		return cmdLine;
	}

}
