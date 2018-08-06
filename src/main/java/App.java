
import org.apache.commons.math3.stat.regression.*;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class App {
    public String getGreeting() {
        return "Hello world!";
    }

    public static void main(String[] args) throws ParseException{

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
