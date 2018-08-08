package com.pavelnh.robusty.algorithms;

import com.pavelnh.robusty.Configurable;

public interface Algorithm extends Configurable{

  public void init();

  public void iterate();

}
