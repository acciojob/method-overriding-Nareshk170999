package com.driver;

class A {
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

public class Main {
  public static void main(String[] args) {
    A objA = new B();
//    System.out.println(objA.meth());
    System.out.println(objA.meth());
  }
}
