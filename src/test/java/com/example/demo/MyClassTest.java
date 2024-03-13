package com.example.demo;
import static org.junit.Assert.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.*; 
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
  MyClass obj = null;
  @Before
  public void createMyClass(){
    obj = new MyClass();
  }
  @After
  public void cleanup(){
    
  }
  @Test
  public void createListOfColors(){
    String [] arr = {"red", "blue"};
    List<String> res = obj.createListOfColors(arr);
    assertThat(res, hasItem("blue"));
  }
}
