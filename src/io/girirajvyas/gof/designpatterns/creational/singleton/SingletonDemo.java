package io.girirajvyas.gof.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;

public class SingletonDemo {

  public static void main(String[] args) {
    //eagerSingletonDemo();
    //eagerSingletonReflectionTest();
    //lazySingletonMultiThreadsIssueDemo();
    //lazyInitWithDoubleCheckSingletonDemo();
    serializationTest();
    //enumSingletonDemo();

  }

  private static void eagerSingletonDemo() {
    SingletonEager instance1 = SingletonEager.getInstance();
    SingletonEager instance2 = SingletonEager.getInstance();

    System.out.println("SingletonEager -> Hash of instance1: " + instance1.hashCode());
    System.out.println("SingletonEager -> Hash of instance2: " + instance2.hashCode());
  }

  private static void eagerSingletonReflectionTest() {
    SingletonEager instance1 = SingletonEager.getInstance();
    SingletonEager instance2 = null;
    Class<SingletonEager> clazz = SingletonEager.class;
    try {
      Constructor<SingletonEager> declaredConstructor = clazz.getDeclaredConstructor();
      declaredConstructor.setAccessible(true);
      instance2 = declaredConstructor.newInstance();
    } catch (NoSuchMethodException | SecurityException | InstantiationException
        | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
      e.printStackTrace();
    }

    System.out.println("SingletonEager -> Hash of instance1: " + instance1.hashCode());
    System.out.println("SingletonEager -> Hash of instance2: " + instance2.hashCode());
  }

  private static void lazySingletonMultiThreadsIssueDemo() {
    Thread t1 = new Thread(() ->  {
      SingletonLazy instance1 = SingletonLazy.getInstance();
      System.out.println("Hashcode of instance1: "+ instance1.hashCode());
    });
    
    Thread t2 = new Thread(() ->  {
      SingletonLazy instance2 = SingletonLazy.getInstance();
      System.out.println("Hashcode of instance2: "+ instance2.hashCode());
    });
    
    t1.start();
    t2.start();
  }

  private static void enumSingletonDemo() {
    DbSingletonEnum obj1 = DbSingletonEnum.INSTANCE;
    Connection connection = obj1.getConnection();
  }

  private static void lazyInitWithDoubleCheckSingletonDemo() {
    Singleton instance = Singleton.getInstanceLazily2();
    Singleton anotherInstance = Singleton.getInstanceLazily2();

    System.out.println(instance);
    System.out.println(anotherInstance);
  }

  private static void serializationTest() {
    SingletonLazyWithDoubleCheckLocking instance1 = SingletonLazyWithDoubleCheckLocking.getInstance();
    
    try {
      // Serialize
      ObjectOutput output = new ObjectOutputStream(new FileOutputStream("file.txt"));
      output.writeObject(instance1);
      output.close();
      
      // deserialize
      ObjectInput input = new ObjectInputStream(new FileInputStream("file.txt"));
      SingletonLazyWithDoubleCheckLocking instance2 = (SingletonLazyWithDoubleCheckLocking)input.readObject();
      input.close();
      
      System.out.println("instance1 hashcode: " + instance1.hashCode());
      System.out.println("instance2 hashcode: " + instance2.hashCode());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

}
