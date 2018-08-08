package com.pavelnh.robusty.algorithms;
import java.util.Arrays;

public final class AlgorithmBuilder{


  public Algorithm algSelector(String args[]){
    Algorithm alg = null;
    if(args[0].trim().toLowerCase().compareTo("psoreinit")==0){
      alg = new PSOReinit();
      alg.setOptions(Arrays.copyOfRange(args, 1, args.length));
    }

    return alg;
  }

}
