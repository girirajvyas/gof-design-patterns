package io.girirajvyas.gof.designpatterns.creational.singleton;

public class SingletonEagerReflectionSafe {

  private static final SingletonEagerReflectionSafe INSTANCE = new SingletonEagerReflectionSafe();

  private SingletonEagerReflectionSafe() {
    if (INSTANCE != null) {
      throw new RuntimeException("Please instantiate via getInstance() method");
    }
  }

  public static SingletonEagerReflectionSafe getInstance() {
    return INSTANCE;
  }
}
