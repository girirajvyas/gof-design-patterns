package io.girirajvyas.gof.designpatterns.creational.singleton;

import java.io.Serializable;

public class SingletonLazyWithDoubleCheckLocking implements Serializable {

  private static final long serialVersionUID = 1L;
  private static volatile SingletonLazyWithDoubleCheckLocking INSTANCE;

  private SingletonLazyWithDoubleCheckLocking() {
    if (INSTANCE != null) {
      throw new RuntimeException("Please instantiate via getInstance() method");
    }
  }

  public static SingletonLazyWithDoubleCheckLocking getInstance() {
    // Check synchronization only if the instance is null. There will be a
    // little impact in performance only for the first time.
    if (INSTANCE == null) {
      synchronized (Singleton.class) {
        // double check if instance is still null, It can be the case that till the time
        // thread2 reaches here, thread1 has already initialized the instance
        if (INSTANCE == null) {
          INSTANCE = new SingletonLazyWithDoubleCheckLocking();
        }
      }
    }
    return INSTANCE;
  }
}
