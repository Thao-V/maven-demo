package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
  public List<String> createListOfColors(String [] args){
    List<String> arr = new ArrayList<>();
    for(String value: args){
      arr.add(value);
    }
    return arr;
  }
}
