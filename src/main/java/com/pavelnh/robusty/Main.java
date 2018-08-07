package com.pavelnh.robusty;

import org.apache.commons.math3.stat.regression.*;

import org.apache.commons.cli.ParseException;


public class Main {

    public static void main(String[] args) throws ParseException{

      String parms[] = new OptionsReader(args).getCmdLine().getOptionValues("a");
      for (int i=0; i<parms.length; i++) {
        System.out.println(parms[i]+ "***");
      }


    }
}
