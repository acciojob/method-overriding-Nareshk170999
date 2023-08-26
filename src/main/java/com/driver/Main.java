package com.driver;

public class Main {
class A  { 
  String meth() {
    return "Invoking method from class A";
  }
}

class B extends A {
  @Override
  String meth() {
    return "Method is overridden in Extended class B";
  }
}

  public static void main(String[] args) {
    B obj = new B();
    obj.meth();
  }
}


