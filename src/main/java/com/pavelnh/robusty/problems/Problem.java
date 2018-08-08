package com.pavelnh.robusty.problems;

import com.pavelnh.robusty.Configurable;

public interface Problem extends Configurable{

  public double eval(double x[]);

}
