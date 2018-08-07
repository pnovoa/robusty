
import org.apache.commons.math3.stat.regression.*;

import org.apache.commons.cli.*;

public class App {

    public static Options CLIDefinition(){


    }

    public static void CLIParsing(){

    }

    public static void CLIInterpretation(){

    }

    public static void main(String[] args) throws ParseException{

      final Option optA = Option.builder("a").required().hasArg().desc("My first arg").build();
      final Options options = new Options();
      options.addOption(optA);

      SimpleRegression simpleRegression = new SimpleRegression(true);
      simpleRegression.addData(new double[][] {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        });

        System.out.println("slope = " + simpleRegression.getSlope());
        System.out.println("intercept = " + simpleRegression.getIntercept());
        System.out.println("prediction for 1.5 = " + simpleRegression.predict(1.5));

    }
}
