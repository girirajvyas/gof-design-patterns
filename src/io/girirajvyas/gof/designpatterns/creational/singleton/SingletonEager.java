package io.girirajvyas.gof.designpatterns.creational.singleton;

public class SingletonEager {

  private static final SingletonEager INSTANCE = new SingletonEager();

  private SingletonEager() {}

  public static SingletonEager getInstance() {
    return INSTANCE;
  }
}
