package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)
public class MyMathTest {
  @Mock ICalculator calc;
  @Test
  public void testAdd(){
    MyMath math = new MyMath(calc);
    when(calc.add(3,4)).thenReturn(7.0);
    double result = math.add(3, 4);
    assertEquals(7.0, result, 0.001);
    verify(calc, times(1)).add(3, 4);
  }
  @Test
  public void testDivideException(){
    MyMath math = new MyMath(calc);
    when(calc.add(3,4)).thenReturn(7.0);
    doThrow(new RuntimeException()).when(calc).divide(0, 0);
    double res = math.divide(0, 0);
    assertEquals(0, res, 0.1);
  }
}
