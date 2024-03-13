package com.example.demo;

public class MyMath {
  ICalculator calc;
  public MyMath(ICalculator calc){
    this.calc = calc;
  }
  public double add(double x, double y){
    return calc.add(x, y);
  }
  public double divide(double x, double y){
    return calc.divide(x, y);
  }
}
