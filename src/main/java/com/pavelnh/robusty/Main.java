package com.pavelnh.robusty;

import org.apache.commons.math3.stat.regression.*;

import org.apache.commons.cli.ParseException;
import com.pavelnh.robusty.algorithms.AlgorithmBuilder;
import com.pavelnh.robusty.algorithms.Algorithm;

public class Main {

    public static void main(String[] args) throws ParseException{

      OptionsReader reader = new OptionsReader(args);
      Algorithm alg = new AlgorithmBuilder().algSelector(reader.getCmdLine().getOptionValues("a"));
    }
}
