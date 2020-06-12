package io.girirajvyas.gof.designpatterns.creational.singleton;

public class SingletonLazyWithSynchronizedMethod {

  private static SingletonLazyWithSynchronizedMethod INSTANCE;

  private SingletonLazyWithSynchronizedMethod() {
    if (INSTANCE != null) {
      throw new RuntimeException("Please instantiate via getInstance() method");
    }
  }

  public static synchronized SingletonLazyWithSynchronizedMethod getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SingletonLazyWithSynchronizedMethod();
    }
    return INSTANCE;
  }
}
