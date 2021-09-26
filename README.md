![GoF Design Patterns](https://github.com/girirajvyas/gof-design-patterns/raw/master/resources/images/GoF_Header.PNG)

*****
<p align="center">
    This repository contains examples of all the design patterns listed in the 
    "Design patterns - Elements of Reusable Object-oriented Software" book 
    by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides 
    popularly known as Gang of Four (GoF). 
    
</p>

*****

## Table of contents
- Introduction
  - [What is a design pattern](#what-is-a-design-pattern)
  - [Why you should learn design patterns](#why-you-should-learn-design-patterns)
  - [How to approach](#how-to-approach)
- Creational design patterns (5)
  1. [Singleton](#1-singleton-pattern-gem)
  2. [Builder](#2-builder-pattern-construction_worker)
  3. [Prototype](#3-prototype-pattern-clipboard)
  4. [Factory Method](#4-factory-method-pattern-factory)
  5. [Abstract Factory](#5-abstractfactory-pattern-factory--factory)
- Structural design patterns (7)
  1. [Adapter](#1-adapter-pattern--electric_plug) 
  2. [Bridge](#2-bridge-pattern--bridge_at_night)
  3. [Composite](#3-Composite-pattern--leaves)
  4. [Decorator](#4-decorator-pattern-heart_decoration)
  5. [Facade](#5-facade-pattern--notes)
  6. [Flyweight](#6-flyweight-pattern-butterfly)
  7. [Proxy](#7-proxy-pattern-trollface)
- Behavioral design patterns (11)
  1. [Chain of Responsibility](#1-chain-of-responsibility-chains)
  2. [Command](#2-command-pattern-genie)
  3. [Interpreter](#3-Interpreter-pattern-speaking_head)
  4. [Iterator](#4-Iterator-pattern-loop)
  5. [Mediator](#5-mediator-pattern-phone)
  6. [Memento](#6-memento-arrow_right_hook)
  7. [Observer](#7-observer-eyes)
  8. [State](#8-state-design-pattern-arrows_counterclockwise)
  9. [Strategy](#9-strategy-design-pattern-shipit)
  10. [Template method](#10-template-method-design-pattern-part_alternation_mark)
  11. [Visitor](#11-visitor-design-pattern-santa)

# Introduction

## 1. What is a design pattern?
From Wiki:-
- **A general reusable solution to a commonly occurring problem** within a given context in software design.  
- Not a finished design that can be transformed directly into source or machine code. 
- Rather, it is a **description or template for how to solve a problem** that can be used in many different situations. 
- Design patterns are **formalized best practices** that the programmer can use to solve common problems when designing an application or system.

Classification:-
- **Creational:** Deals with the creation of an object
- **Sructural:** Deals with the class structure such as Inheritance and Composition.
- **Behavioral:** Provides solution for the better interaction between objects, also how to provide lose coupling, and flexibility to extend easily in future.

## 2. Why you should learn design patterns?
- Easy to communicate a proble among fellow developers
- It provides a common vocabulary to explain about problem
- It is an abstract topic
- Revisit materails about patterns will alway give you an new perspective everytime.

## 3. How to approach?
In case you are planning to learn them, you will typically find the structure as below for most of the patterns described here.

- What is it?
- Why would you choose?
- How to implement?
  - Design considerations
  - UML Diagram
  - Example from Java
  - Implementation
- Drawbacks (Pitfalls)
- Contrast to another patterns
- Summary

# Creational design patterns (5)

|Sr. no| Pattern name                                                    | GoF book description                                                                                                                                                       |
|-----:| -------------                                                   |:-------------:                                                                                                                                                    |
|  1   | [Singleton](#1-singleton-pattern-gem)                           | Ensure a class only has one instance, and provide a global point of access to it                                                                              |
|  2   | [Builder](#2-builder-pattern-construction_worker)               | **Saperate the construction of complex object from its representation so that the same construction process can create different representations**                    |
|  3   | [Prototype](#3-prototype-pattern-clipboard)                     | Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype                                          |
|  4   | [Factory Method](#4-factory-method-pattern-factory)             | **Define an interface for creating an object, but let sub-classess decide which class to instantiate. Factory method lets a class defer instantiation to subclasses** |
|  5   | [Abstract Factory](#5-abstractfactory-pattern-factory--factory) | Provide an interface for creating families of related or dependent objects without specifying their concrete classes.                                         |

# Structural design patterns (7)

|Sr. no| Pattern name                                      | GoF book description                                                                                                                                                                |
|-----:| -------------                                     |:-------------:                                                                                                                                                             |
|  1   | [Adapter](#1-adapter-pattern--electric_plug)      | Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. |
|  2   | [Bridge](#2-bridge-pattern--bridge_at_night)      | **Decouple an abstraction from its implementation so that the two can vary independently**                                                                                     |
|  3   | [Composite](#3-composite-pattern--leaves)         | Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.       |
|  4   | [Decorator](#4-decorator-pattern-heart_decoration)| **Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.**                         |
|  5   | [Facade](#5-facade-pattern--notes)                | Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.                     |
|  6   | [Flyweight](#6-flyweight-pattern-butterfly)       | **Use sharing to support large numbers of fine-grained objects efficiently.**                                                                                                  |
|  7   | [Proxy](#7-proxy-pattern-trollface)               | Provide a surrogate or placeholder for another object to control access to it.                                                                                         |

# Behavioral design patterns (11)

|Sr. no| Pattern name                                                 | GoF book description                                                                                                                                                                                                      |
|-----:| -------------                                                |:-------------:                                                                                                                                                                                                            |
|  1   | [Chain of Responsibility](#1-chain-of-responsibility-chains) | Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.   |
|  2   | [Command](#2-command-pattern-genie)                          | **Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.**                                                             |
|  3   | [Interpreter](#3-Interpreter-pattern-speaking_head)          | Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.                                                               |
|  4   | [Iterator](#4-Iterator-pattern-loop)                         | **Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.**                                                                                                  |
|  5   | [Mediator](#5-mediator-pattern-phone)                        | Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. |
|  6   | [Memento](#6-memento-arrow_right_hook)                       | **Without violating encapsulation, capture and externali ze an object's internal state so that the object can be restored to this state later.**                                                                             |
|  7   | [Observer](#7-observer-eyes)                                 | Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.                                                                    |
|  8   | [State](#8-state-design-pattern-arrows_counterclockwise)     | **Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.**                                                                                                        |
|  9   | [Strategy](#9-strategy-design-pattern-shipit)                | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.                                                         |
|  10  | [Template method](#10-template-method-design-pattern-part_alternation_mark)| **Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.**              |
|  11  | [Visitor](#11-visitor-design-pattern-santa)                  | Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.                            |

# Creational design patterns

# 1. Singleton pattern :gem:

## 1. What is Singleton?

- `GoF`: Ensure a class only has `one instance`, and provide a global point of contact to access it. 
- [Wiki](https://en.wikipedia.org/wiki/Singleton_pattern): singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system. The term comes from the mathematical concept of a singleton.  
Critics consider the singleton to be an anti-pattern in that it is frequently used in scenarios where it is not beneficial, introduces unnecessary restrictions in situations where a sole instance of a class is not actually required, and introduces global state into an application

## 2. Why would you choose?

- Only one instance created. It is achieved by providing only one entry point to create the new instance of the class
- Useful where we have to control the resources, such as database connections or sockets 
- Lazily loaded (usually)
- **Examples:**  
   - Runtime.java  
   - Logger (singleton or factory)
   - Spring beans (by default, scope is singleton in spring)

## 3. How to implement

### 3.1 Design considerations
 - Class is responsible for creating itself and its lifecycle
 - Private instance
 - Private constructor
 - No parameters required for construction, in case parameter is required for construction than it violates singleton.

### 3.2 UML Diagram

![Singleton UML](https://github.com/girirajvyas/gof-design-patterns/raw/master/resources/images/singleton/singleton_uml.PNG)

### 3.3 Example from Java

```java
    public static void main(String args[]) {
    Runtime singletonRuntime = Runtime.getRuntime();
    singletonRuntime.gc();
    System.out.println(singletonRuntime);

    Runtime anotherInstance = Runtime.getRuntime();
    System.out.println(anotherInstance);

    if (singletonRuntime == anotherInstance) {
      System.out.println("They are the same instance");
    }
```

Output:  
```cmd
java.lang.Runtime@15db9742
java.lang.Runtime@15db9742
They are the same instance
```

### 3.4 Different Variations of creating a Singleton 
 1. Eager initialization
 2. Lazy initialization with synchronized method
 3. Lazy initialization with double check locking method
 4. Lazy initialized with static inner class (Bill pugh implementation)
 5. Lazy initialized with `Enum` which leads to less code. (Recommended by Joshua bloch in Effective Java)

#### 3.4.0 Common step:  
 - Create a class with `private constructor` to prevent initialization.  
 - Making constructor private prevents the initialization via `new` keyword
 - We expose a public static method (commonly named `getInstance()`) to provide the single entry point that returns its instance 

```java
public class Singleton {
  private Singleton() { }
  public static Singleton getInstance(){ }
}
```

#### 3.4.1 Eager Initialization  
 - Instance is created at the time of class loading, this is the easiest method to create a singleton class.
 - Create a static final class variable INSTANCE and initialize this with new instance of class
 - Create static method that returns this instance.

```java
public class SingletonEager {

  private static final SingletonEager INSTANCE = new SingletonEager();

  private SingletonEager() {}

  public static SingletonEager getInstance() {
    return INSTANCE;
  }
}
```

**Disadvantages**
  - Instance is created even if the client application may not be using it.
  - It will create an issue if your singleton class in creating a database connection or creating a socket which may lead to memory leak problem.

> As a general rule, we name the method as getInstance(), this is just convention and not mandatorily to be followed

**Prevent initialization via Reflection**  
- To prevent from initialization via reflection, you can throw exception from constructor
```java
  private Singleton() {
    // In case Reflection is used for initialization
    if (INSTANCE != null) {
      throw new RuntimeException("Please instantiate via getInstance() method");
    }
  }
```

#### 3.4.2 Lazy initialization with synchronized method  
 - Create a static class variable INSTANCE.
 - Create a synchronized method to return instance. If it is not initialized, initialize it and return.
 - In case you do not make method synchronized, multiple instances might be created in multithreaded environment

```java
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
```
**Disadvantages**
 - Slow performance because of locking overheand in every call
 - Unnecessary synchronization that is not required once the instance variable is initialized.
 - Demo of multiple instances in case method is not synchronized
   ```java
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
     
     Output:
     Hashcode of instance1: 60675678
     Hashcode of instance2: 1100599114
     Note: you might have to run this quite a few times to see this different output.
     As, you cannot predict the thread behaviour
     }
   ```

#### 3.4.3 Lazy initialization with double check locking method
- To overcome above slow performance issue we will use this way for initialization.
- Create a static class variable INSTANCE. 
- We are marking this variable `volatile`, so that any changes to this instance are visible to other threads instantly
- You can return instance if it is already initialized. Now, we add conditions when the instance is null. We create a synchroniized block and create an instance inside this block. We add an additional null check to avoid duplicate initialization because of two threads.
- Synchronized block will be executed only when the INSTANCE is null and prevent unnecessary synchronization once the instance variable is initialized
```java
public class SingletonLazyWithDoubleCheckLocking {

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
```

> Without volatile modifier, it’s possible for another thread in Java to see half initialized state of INSTANCE variable, but with volatile variable guaranteeing happens-before relationship, all the write will happen on volatile INSTANCE before any read of INSTANCE variable.

**Prevent duplicate object creation via serialization**  
- In case of serializing the Singleton class, you might not get the same instance. to solve this issue you have to implement readresolve method
```java
    protected Singleton readResolve() {
        return INSTANCE;
    }
``` 

#### 3.4.4 Lazy initialization with static inner class (Bill pugh)
- TODO, code available


#### 3.4.5 Enum Singleton
- Implementation added with DbSingletonEnum

```java
public enum DbSingletonEnum {

  INSTANCE;

  private Connection conn;

  private DbSingletonEnum() {
    try {
      String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
      conn = DriverManager.getConnection(dbUrl);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Connection getConnection() {
    return conn;
  }
}
```
> The best way to implement a `Serializable Singleton` is to use an Enum

> From Joshua Bloch's Effective Java: This approach is functionally equivalent to the public field approach, except that it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. While this approach has yet to be widely adopted, a single-element enum type is the best way to implement a singleton.

## 4. Drawbacks 
- Often overused
- Difficult to unit test
- If not careful, not threadsafe
- Sometimes confused for factory

> :stop_sign:   java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.

## 5. Contrast to other patterns

| Singleton                        | Factory                                           |
| -------------                    |:-------------:                                    |
| Returns same instance            | Returns various instances                         |
| One constructor method - no args | Multiple constructors                             |
| No interface                     | Interface Driven                                  |
| No Subclasses                    | Always SubClasses are involved in a way or other  |
| NA                               | Adaptable to environment more easily**            |


## Summary
- Guarantees one instance
- Easy to implement
- Solves a well defined problem
- You can still violate the Singleton principle by creating more than one instance of the Singleton class by using cloning or using multiple class loaders
- Don't abuse it

## Next
Explore the Enum version of Singleton pattern

**[&#11014;  back to top](#table-of-contents)**

# 2. Builder pattern :construction_worker:

## 1. What is Builder?
- `GoF`: Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- `Other`: This a pattern people often use but rarely create of there own. This pattern deals with construction of Objects with lot of parameters and want to make the object once we are done constructing it.
- [Wiki](https://en.wikipedia.org/wiki/Builder_pattern): The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation 


## 2. Why would you choose?
- Handles complex constructors
- Large number of parameters
- Immutability
- **Examples:**
  - StringBuilder
  - DocumentBuilder
  - Locale.Builder

## 3. How to implement

### 3.1 Design considerations
- Flexibility over telescoping constructors
- Generally implemented with static inner class
- Calls appropriate constructor
- Negates the need for exposed setters
- Java 1.5+ can take advantage of generics ***

### 3.2 UML Diagram

### 3.3 Example from Java

```java
public class BuilderJavaApiExample {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is an example ");
		builder.append("of the builder pattern. ");
		builder.append("It has methods to append ");
		builder.append("almost anything we want to a String. ");
		builder.append(42);
		System.out.println(builder.toString());
	}
	
}
```

Output:  
```cmd
This is an example of the builder pattern. It has methods to append almost anything we want to a String. 42
```

### 3.4 Implementation

- Demonstrate exposed setters (LunchOrderBean.java / LunchOrderBeanDemo.java)
- Demonstrate Telescoping constructors (LunchOrderTelescopic.java / LunchOrderTelescopicDemo.java)
- Create Builder (LunchOrder.java / LunchOrderDemo.java)
- Build out example

**Steps to create:**
- Create a class which is supposed to have many fields and required immutable instance
- Decalre all fields as final, so that they can only be initialized in constructor
- Create a public static builder inner class
- Copy all the field declarations in the inner class without making them final (In case you make field inside inner class as final you have to initialize that in constructor else you will ahve compilation error)
- Create a public default constructor in Builder class (you can put any parameters here to make them mandatory)
- Now, create methods taking field type as input and returning complete instance after setting that. for example
   ```java
    public Builder bread(String bread) {
       this.bread = bread;
       return this;
    }
   ```
- Create a private constructor in Outer class that takes this Builder class and sets all the fields from the builder instance.
  ```java
    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }
  ```
- Create a build method that will return the instance of Outer class. This is achieved by passing this builder instance to the outer class constructor
  ```java
    public LunchOrder build() {
       return new LunchOrder(this);
    }
  ```
- You can test the above builder as:
  ```java
    LunchOrder.Builder builder = new LunchOrder.Builder(); 
    builder.bread("bread").condiments("condiments").dressing("dressing").meat("meat");
    LunchOrder lunchOrder = builder.build();
  ```
- Done  

## 4. Drawbacks
- Immutable objects are created
- Inner static class is generally used for implementation
- It is always Designed first 
- Adds complexity, as people are not comfortable with object returning itself with each subsequent call

## 5. Contrast to other patterns

| Builder                               | Prototype                              |
| -------------                         |:-------------:                         |
| Handles complex constructors          | Implemented around a clone             |
| No interface required                 | Avoids calling complex constructors    |
| Can be a saperate class               | NA                                     |
| Works with a legacy code              | Difficult to implement in legacy code  |


## 6. Summary
- Creative way to deal with complexity
- Easy to implement
- few drawbacks
- can refactor in with a saperate class (typically implemented with a static inner class)

## Next
Explore the Generics version of builder pattern


**[&#11014;  back to top](#table-of-contents)**

# 3. Prototype pattern :clipboard:

## 1. What is Prototype Pattern?

- `GoF`: Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype
- `Other`: creates copy of objects that are very expensive to create
- [Wiki](https://en.wikipedia.org/wiki/Prototype_pattern):  It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This pattern is used to:
  - avoid subclasses of an object creator in the client application, like the factory method pattern does.
  - avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.  
To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation.  
The client, instead of writing code that invokes the "new" operator on a hard-coded class name, calls the clone() method on the prototype, calls a factory method with a parameter designating the particular concrete derived class desired, or invokes the clone() method through some mechanism provided by another design pattern.  
The mitotic division of a cell — resulting in two identical cells — is an example of a prototype that plays an active role in copying itself and thus, demonstrates the Prototype pattern. When a cell splits, two cells of identical genotype result. In other words, the cell clones itself   

## 2. Why would you choose?
- Avoids costly creation
- Avoids Subclassing
- Typically doesn't use keyword "new"
- Often utilizes an Interface
- Usually implemented with a registry
- **Example:**
  - java.lang.Object#clone()

## 3. How to implement?

### 3.1 Design considerations
- Typically implements clone/cloneable
- Avoids keyword "new"
- Although copy, each instance is unique
- Costly construction not handled by client (builder is opposite of prototype)
- Can still utilize parameters for construction
- Shallow vs deep copy design considerations can be made 

### 3.2 UML Diagram

### 3.3 Example from Java
```java

```

## Example/Demo
- Create Prototype
- Demonstrate shallow copy
- Create with a registry

This design pattern can be achieved in 2 ways  
1. implementing Cloneable interface
2. create copy(method with any logical name) and return the copy of current object
First way of implementation is discouraged as specified in Effective Java:

Note: 
1. We have seen an example with `clone()` method, but this can also be achieved by creatin an interface and implementing the clone method.
2. You can replace string with enum in createItem method of registry.

## 4. Drawbacks
- Sometimes not clear when to use
- Used with other patterns
   - Registry
- Mostly shallow copy by clone, for deep copy we have to implement ourselves and it requires a lot of code

## 5. Contrast to other patterns

| Prototype                             | Factory                                                            |
| -------------                         |:-------------:                                                     |
| Light weight construction             | Flexible Objects based on request                                  |
|  - Copy constructor or clone method   |  - multiple constructors can be use instead of just clone method   |
| Choose shallow vs deep copy           | Create fresh and cconcrete instance of object                      |
| Main purpose to create copy of itself | NA                                                                 |

## 6. Summary
- Guarantee unique instance
- Often refactored in 
- Can help with performance issues
- Dont always jump to a factory

> Prototype patterns are usually implemented with a Registry

> A Prototype is used when you want to guarantee a unique instance that is lightweight to create

## Next:
you can try prototype pattern with Generics and without clone method 
References: https://refactoring.guru/design-patterns/prototype

**[&#11014;  back to top](#table-of-contents)**

# 4. Factory method pattern :factory: 

## Different naming for factory pattern

1. Creation method(Creation/Factory Method): "Refactoring" by Martin F. , "Refactoring to patterns" by Joshua K.
2. Static factory method: "Effective Java" by Joshua B. 
3. Simple (parameterized) factory: Head first Design patterns
4. Factory Method and Abstract Factory: Design Patterns: Elements of Reusable Object oriented Software


## Why would you choose?
- Doesn't expose instantiation logic
- Defer to subclasses i.e A super class has multiple sub-classes and based on input, need to return one of the sub-class
- Common interfaces
- Specified by architecture, implemented by user
- **Examples:**
   - Calendar (many consider this as Singleton example due to no arg getInstance() method)
   - ResourceBundle
   - NumberFormat
   
## Design Considerations
- Factory is responsible for lifecycle
- It has common interface
- For this common interface, there are Concrete classes
- Parameterized create method

## Example/Demo
- Create Pages
- Create Website
- Create concrete classes
- Create factory
- Create Enum

Flow:
```java
                             Website (abstract class)
                          abstract void createWebsite()
                          public List<Page> getPages()
             __________________________|___________________________
            |                                                      |
    Blog extends Website                                        Shop extends Website
    - PostPage                                                   - CartPage
    - AboutPage                                                  - ItemPage
    - CommentPage                                                - SearchPage
    - ContactPage

   WebsiteFactory
    factoryMethod(Type type) {   
       Switch (type):  
         BLOG:
           return new Blog();
         Shop
         return new Shop();
    }
```
   
## 4. Drawbacks:
- Complexity 
- Creation in subclass **
- Refactoring: This is not something that is refactored later, rather a design decision to make early in development

## 5. Contrast to other patterns

| Singleton                        | Factory                                           |
| -------------                    |:-------------:                                    |
| Returns same instance            | Returns various instances                         |
| one constructor method - no args | multiple constructors                             |
| no interface                     | Interface Driven                                  |
| No Subclasses                    | Always SubClasses are involved in a way or other  |
| NA                         | Adaptable to environment more easily**            |

## 6. Summary
- Parameter Driven (chooses type based on this)
- Solves Complex creation (Choose type at runtime)
- A little complex
- Opposite of a Singleton

**[&#11014;  back to top](#table-of-contents)**

# 5. AbstractFactory pattern :factory:  :factory:

## Why would you choose?

- Factory of Factories i.e there is a family of factories and you need a super factory for related factories
- Factory of related Objects
- Common Interface
- Defer to subclasses for instantiation
- **Examples**
   - DocumentBuilderFactory
   - Mostly in frameworks

## Design Considerations
- Groups Factories Together
- Factory is responsible for lifecycle of itself
- Common Interface
- Concrete classes are returned from the underlying factory
- Parameterized create method like factory pattern
- Built using composition, not the case with Factory.

## Example/Demo
- Create classes that will be used
- Build AbstractFactory
- Then build Factory as it will be used by abstractfactory
- Factory returns concrete implementation

Flow
```java
                                    CreditCardFactory (Abstract Factory)
                    - static CreditCardFactory getCreditCardFactory(int creditScore)
                    - abstract CreditCard getCreditCard(CardType cardType);
                    - abstract Validator getValidator(CardType cardType);
               ___________________________________|_________________________________
              |                                                                     |
        AmexFactory  (extends CreditCardFactory)                VisaFactory  (extends CreditCardFactory)
     public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
          case GOLD:
             return new AmexGoldCreditCard();
          case PLATINUM:
             return new AmexPlatinumCreditCard();
        }
     }
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
          case GOLD:
            return new AmexGoldValidator();
          case PLATINUM:
            return new AmexPlatinumValidator();
        }
    }
```

if you are not using the ORM and you have to use the db queries depending on the db you are using, this pattern will find implementation their.

## Drawbacks
- Complexity - most complex of creational design patterns
- Runtime Switch - cleenct can change the flow by passing some parameters
- Pattern within a pattern
- Problem specific (limited scope)
- Starts as a factory and the refactored to abstractFactory

## Contrast to other patterns

| Factory                              | AbstractFactory                                     |
| -------------                        |:-------------:                                      |
| Returns various instances            | Implemented with a factory                          |
|   - multiple constructors            | Hides the underlying concrete factory                |
| Interface Driven                     | 1 more layer of Abstraction added to  environment   |
| Adaptable to environment more easily | Built through composition                           |

## Summary
- Group of similar factories
- Complex
- Heavy abstraction
- Written at framework level

**[&#11014;  back to top](#table-of-contents)**

# Structural Design Patterns

# 1. Adapter pattern  :electric_plug:
Pattern for connecting new code to the legacy code without having to change thenworking contract that was produced from legacy code originally

## Why would you choose?
- Similar to physical plug Adapter (doesnt cover all scenarios tough, but can be a good example for starter)
- Convert Interface into another Interface
- Connects Legacy code to current code
- Translates requiest from the client code to the code that we are adapting to
- Client <- Adapter -> Adaptee
- **Examples**
  - Arrays -> Lists
  - Streams 
  
## Design Considerations
- Client Centric
- Integrate new with old code
- Often implemented with Interface, but not required 
- Adaptee can be the implementation

## Example/Demo
- Create Adapter
- Make sure it is not Decorator
- Another Adapter example

Create an Adapter class  
Take the input that is not in sync with the requirement as cinstructor parameter  
This adapter class implements the same interface that we had for our required entity  

## Drawbacks
- Not a lot of Drawbacks
- Dont Complicate
- Ususally multiple adapters can be created to make code works
- Don't add functionality, Consider Decorator or any other pattern in case you need to add functionality

## Contrast to other patterns

| Adapter                              | Bridge                                     |
| -------------                        |:-------------:                                      |
| Works after code is designed         | Designed upfront                                    |
| Works mostly with Legacy             | So that Abstraction and implementation can vary     |
| Retrofitted                          | Built in advance                                    |
| Provides different interface         | Both adapt multiple systems                         |

## Summary

- Simple solution
- Easy to implement
- Integrate with legacy code
- Can provide multiple adapters

**[&#11014;  back to top](#table-of-contents)**

# 2. Bridge pattern  :bridge_at_night:
Similar to adapter with 1 major difference that Adapter works with legacy code and bridge works with new code

## Why would you choose?

- Decouple Abstraction and Implementation
- Utilizes Encapsulation, Composition and Inheritance
- Changes in Abstraction won't affect client, client is unaware of abstraction on backend
- Details wont be right to begin with
- **Examples**
  - Driver
  - JDBC Driver

## Design Considerations
- It uses a lot of Interfaces and Abstract classes
- Composition over Inheritance
- More than just composition
- Expect the changes from both sides
- Abstraction, Implementor, Refined Abstraction, Concrete Implementor

## Example/Demo

- Color and shape without bridge
    ```java
                                            Shape(Abstract class)
                                      (public abstract void applyColor())
                           __________________________|_________________________
                          |                                                    |
                Square (Abstract class)                              Circle (Abstract class)
         _______________|________________                       _______________|________________ 
        |                                |                     |                                |
    RedSquare                 GreenSquare                  RedCircle                      GreenCircle
 
     Note:Adding any new type and its colour will be a lot of work in this implementation using INHERITANCE
    ```
- Color and shape with bridge
    ```java
                                      Colour (Interface)
                                       void applyColor()
                           ___________________|___________________
                          |                                       |
            RedColour (concrete class)               RedColour (concrete class)


                                    Shape(Abstract class)
                                  public Shape(Colour colour) {
                                      this.colour = colour;
                                  }
                                  public abstract void applyColor()
                    ___________________________|_________________________
                   |                                                     |
            Square (Concrete class)                         Circle (Concrete class)

      Note:  Adding a new colour or Shape is easy as we are using COMPOSITION over INHERITANCE
    ```
- Create Bridge with Printer and Formatter
    ```java
                                   Formatter (Interface)
                     String format(String header, List<Detail> details)
            ___________________________|_____________________________
           |                                                         |
    PrintFormatter(Concrete class)                 HTMLFormatter (Concrete class)


                                   Printer(Abstract class)
                           public Printer(Formatter formatter) {
                                 this.formatter = formatter;
                           }
                           public abstract String getHeader()
                           public abstract List<Detail> getDetails()
            _______________________________|______________________________
           |                                                              |
    MoviePrinter (Concrete class)                          AnyOtherPrinter(Concrete class)
    Note:  Adding a new Formatter or Printer is easy as we are using COMPOSITION over INHERITANCE
    ```

## Drawbacks
- Increases complexity
- Conceptually difficult to plan
- More than just OO principles
- Little confusing about what goes where in code

## Contrast to other patterns

| Adapter                              | Bridge                                              |
| -------------                        |:-------------:                                      |
| Works after code is designed         | Designed upfront                                    |
| Works mostly with Legacy             | So that Abstraction and implementation can vary     |
| Retrofitted                          | Built in advance                                    |
| Provides different interface         | Complex                                             |

## Summary

- Designed for uncertainty
- Can be complex
- Provides flexibility
- More than composition

**[&#11014;  back to top](#table-of-contents)**

# 3. Composite pattern  :leaves:
Hierarchical pattern that deals with the tree structures of information

## Why would you choose?
- Component represents part or whole structures
- Composite objects into tree structures
- Individual Objects treated as a composite
- Same operations applied on individual and composites
- **Examples**
    - java.awt.Component
    - JSF widgets
    - Restful sservice GETs

## Design Considerations
- Tree Structured
- Root starts with Component
- Leaf or Composite, same operations
- Leaf has all the oprations, Composite along with all the operations knows about its child
- Component, Leaf, Composite

## Example/Demo
- Menu, MenuItem, MenuComponent
- Create Composite
- Features not supported demo

```java
                                            MenuComponent(Abstract class)
                                                 String name
                                                 String url
                                            List<MenuComponent> menuCOmponent;
                           __________________________|_________________________
                          |                                                    |
                Menu (Concrete class)                              MenuItem (Concrete class)
             add(MenuComponent menuCOmponent)
             remove(MenuComponent menuCOmponent)
```

## Drawbacks
- Can overly simplify system
- Difficult to restrict what to add
- Implementation can be costly

## Contrast to other patterns

| Composite                              | Decorator                              |
| -------------                          |:-------------:                         |
| Tree Structure                         | Contains another entity  (Composition) |
| Leaf and composite have same interface | Modifies behaviour(adds)               |
| Unity between Objects                  | Doesn't change underlying object       |

## Summary

- Generalizes a hierarchical structure
- Can simplify things too much
- Easier for clients 
- Composite != Composition

**[&#11014;  back to top](#table-of-contents)**

# 4. Decorator pattern :heart_decoration:

## Why would you choose?
- Wrapper to add functionality
- Add behaviour without affecting others
- It is more than just inheritance
- Follows **Single Responsibility Principle**
- Compose behaviour dynamically
- **Examples**:
    - java.io.InputStream
    - java.util.Collections#checkedList() - not clear
    - All ui components in swing and awt
    
## Design considerations

- Inheritance based
- Utilizes Composition and Inheritance (is-a, has-a)
- Alternative to subclassing as it adheres to SRP
- Constructor requires instance from hierarchy
 
## Example/Demo
- Create Component(Sandwich), ConcreteComponent(SimpleSandwich), Decorator(SandwichDecorator), ConcreteDecorator(MeatDecorator, DressingDecorator)
- Create decorator pattern eventually
- Implement another decorator
- Not a Creational pattern

```java
                               Sandwich (Interface)
                                public String make()
               __________________________|_________________________
              |                                                    |
    SimpleSandwich (Concrete class)            SandwichDecorator(Abstract class)
                                __________________________|_________________________
                               |                                                    |
           MeatDecorator (Concrete class)                        DressingDecorator (Concrete class)

    Note: We added functionality to SimpleSandwich that did not existed before. 
          Hence, it is structural and not creational pattern
```

## Drawbacks
- New class for every feature added
- Multiple little objects
- Often confused with simple inheritance

## Contrast to other patterns

| Composite                              | Decorator                              |
| -------------                          |:-------------:                         |
| Tree Structure                         | Contains another entity  (Composition) |
| Leaf and composite have same interface | Modifies behaviour(adds)               |
| Unity between Objects                  | Doesn't change underlying object       |

## Summary

- Original Object can stay the same
- Unique way to add functionality
- Confused with inheritance
- Can be more COmplex for clients

**[&#11014;  back to top](#table-of-contents)**

# 5. Facade pattern  :notes:

Provides simple interface to COmplex or difficult to use system that is odten result of a poorly designed API

## Why would you choose?

- Make an API easier to use
- Reduce dependencies on outside code
- Simplify the interface or client usage
- Usually a refactoring pattern
- **Examples**
    - java.net.URL
    - javax.faces.context.FacesContext
    - SLF4j is also based on principle of facade

## Design

- Class that utilizes composition
- Shouldn't have a need for inheritance
- Typically encompasses full lifecycle (Not mandatorily)

## Example/Demo

- Complex Client
- Client, Facade, JDBC
- Simplified Client Code

## Drawbacks

- Typically used to cleanup code
- Should think about API design
- Flat problem/structure
- The "singleton" of structural pattern (often misused due to simplicity)

## Contrast to other patterns

| Adapter                       | Facade                 |
| -------------                 |:-------------:         |
| Also a refactoring pattern    | Simplifies interface   |
| Retrofitted                   | Works with composites  |
| Provides different interface  | Cleaner API            |

## Summary

- Simplifies the client interface
- Easy pattern to implement
- Refactoring pattern

**[&#11014;  back to top](#table-of-contents)**

# 6. Flyweight pattern :butterfly:

## Why would you choose?

- More efficient use of memory
- Large number of similar objects
- Immutable
- Most of the object states can be extrinsic
- **Examples**
    - java.lang.String
    - java.lang.Integer#valueOf
    - Boolean, Byte, Character, Short, Long

## Design Considerations

- It is pattern of patterns
- Utilizes a Factory
- Encompasses Creation and Structure
- Client, Factory, Flyweight, ConcreteFlyWeight

## Example/Demo

- Inventory management system
- Client, Catalog, Order(ConcreteFlyWeight) and Item

## Drawbacks

- Complex pattern
- Premature optimization of code 
- Must understand factory
- Not a graphical pattern 

## Contrast to other patterns

| Flyweight             | Facade                         |
| -------------         |:-------------:                 |
| Memory optimization   | Refactoring pattern            |
| Optimization pattern  | Simplified client              |
| Immutable objects     | Provides a different interface |

## Summary

- Great for memory management
- A little bit complex
- Used a lot by core API

**[&#11014;  back to top](#table-of-contents)**


# 7. Proxy pattern :trollface:

## Why would you choose?

- Interface by wrapping
- Can add functionality
- Solves problems such as Security, Simplicity, Remote service call, expensive object to create
- Proxy call to access real object
- **Examples**
    - java.lang.reflect.Proxy
    - java.rmi.*
    - Spring and few parts of Hibernate

## Design Considerations

- Interface based 
- Interface and Implementation class
- java.lang.reflect.InvocationHandler
- java.lang.reflect.Proxy
- Client, Interface, InvocationHandler, Proxy, Implementation

## Example/Demo

- Twitter API Download
- Twitter Service Impl
- Restrict POST call

Side notes:
1. Create Twitter account (mobile number is mandatory)
2. http://twitter4j.org/en/index.html -> Download -> Latest stable version -> twitter4j-4.0.7.zip / JavaDoc
3. app.twitter.com -> create new app -> get those tokens, generate new access tokens if not already created. use these details in TwitterServiceImpl

## Drawbacks

- Only one proxy
- Another abstraction layer
- Similar to another patterns 

## Contrast to other patterns

| Proxy                                           | Decorator                              |
| -------------                                   |:-------------:                         |
| Can add functionality, but not its main purpose | Dynamically add functionality          |
| Can only have one proxy                         | Chained                                |
| Compile time                                    | Runtime                                |
|                                                 | Decorator points to its own type       |

## Summary

- Great utilities built into java API
- Only one instance
- Used by Dependency Injection/IOC frameworks
- Great way to implement lazy loading

**[&#11014;  back to top](#table-of-contents)**


# Behavioral Design Patterns

# 1. Chain of responsibility :chains:

## Why would you choose?

- Decoupling sender and reciever
- Receiver contains reference to next receiver
- Promotes loose coupling
- No handler is also OK
- **Examples**
    - java.util.Logging.Logger#log()
    - javax.servlet.Filter#doFilter()
    - Security chain filter in Spring security

## Design Considerations

- Chain of receiver Objects
- Handler is interface based
- ConcreteHandler for each implementation
- Each Handler has a reference to the next
- Handler, ConcreteHandler 

## Example/Demo

- Components involved are Handler, Successor, Request
- Create Handler
- Chain

Type of handlers: Director, VP, CEO

```java
                                   Handler(Abstract class)
                           public Handler(Handler successor) {
                                 this.successor = successor;
                           }
                           public abstract void handleRequest(Request request)
            _______________________________|______________________________
           |                               |                              |
    Director (Concrete class)        VP  (Concrete class)         CEO (Concrete class)
```

## Drawbacks

- Handling/Handler is not guaranted
- Runtime configuration check
- Chain length/performance issues

## Contrast to other patterns

| Chain of responsibility         | Command                           |
| -------------                   |:-------------:                    |
| Handler is unique               | Command also unique               |
| knows about successor           | Encapsulates function             |
| can utilize the command pattern | Reversible or trackable in nature |

# Summary

- Decouples the sender and receiver
- Can be configured at runtime
- Hierarchical in nature
- Careful with large chains

**[&#11014;  back to top](#table-of-contents)**

# 2. Command pattern :genie:

## What is Command Pattern?

## Why would you choose?

- Encapsulate request as and object
- Object oriented callback
- Decouple sender from processor
- Often used for "undo" functionality
- Examples:
    - java.lang.Runnable
    - javax.swing.action

## Design Considerations

- Object per command
- Command interface is base of all commands
- Execute method
- "unexecute" method for undo operations
- Advanced implementations use Reflection to decouple the client from receiver or processor using a callback
- Command, Invoker, ConcreteCommand

## Example/Demo

- Command, Invoker, ConcreteCommand, Receiver
- extend example to Manage states
- Macro Command


- Switch: invoker
- State: stored in Receiver(Light.java) via isOn variable and managed it via toggle() method
- Macro: fire multiple commands

## Drawbacks

- Dependent on other patterns
- Multiple commands (duplicating logic in multiple commands), better to use composite or commands comboned with Chain of responsibility
- Make use of memento to handle state
- If tracking of objects need to store a history, you may also need to look at prototype for creating copies of commands to store on a list

## Contrast to other patterns

| Command                                   | Strategy                    |
| -------------                             |:-------------:              |
| Object per command                        | Object per strategy         |
| Class contains 'what' we are trying to do | Strategy contains the 'How' |
| Encapsulates action/request               | Encapsulates algorithm      |

## Summary

- Encapsulate each request as an object
- Decouple sender from processor
- Very few drawbacks
- Often used for undo functionality

**[&#11014;  back to top](#table-of-contents)**

# 3. Interpreter pattern :speaking_head:

## Why would you choose?

- Represents grammer
- Interprete a sentence
- Map a domain
- Abstract Syntax Tree (AST)
- Examples:
    - Java.util.Pattern
    - java.text.Format

## Design Considerations

- AbstractExpression declares an interface for executing an operations
- Operation is Interpret method
- Expressions are broken into TerminalExpression i.e leaf of tree and contains no other expression
- In case it has other expressions it is NonTerminalExpression
- Pieces of UML diagram: Context, AbstractExpression, TerminalExpression, NonTerminalExpression, Client

## Example/Demo

- Expression, Terminalexpression, AndExpression, OrExpression
- Parse example

## Drawbacks

- If grammer becomes complex, hard to mantain
- Class per rules makes hard to maintain
- Use of other patterns is required to implement complex grammer
- use in solving very specific case

## Contrast to other patterns

| Interpreter                                    | Visitor                                             |
| -------------                                  |:-------------:                                      |
| Access to properties                           | Needs oberver functionality                         |
| Function as methods                            | Functionality found in one place                    |
| Adding new functionality changes every variant | Adding a new variant rquires changing every visitor |

## Summary

- Use when defining a grammer, Rules or validation
- use generics to make it more powerful
- limited to very specific use case
- Consider the visitor pattern depending on the changes you are expecting.

**[&#11014;  back to top](#table-of-contents)**

# 4. Iterator pattern :loop:

## Why would you choose?

- Traverse a container
- Doesn't expose underlying structure
- Iterator decouples the algorithms from the data
- Sequential in nature (not all objects have sequential set of data)
- Examples:
    - java.util.Iterator
    - java.util.Enumeration

## Design Considerations

- It is interface based
- Follws factory method pattern in way you get the instance of iterator
- Independent, but fail fast 
- Enumerators are fail safe
- pieces from UML: Iterator, ConcreteIterator

## Example/Demo
- Create BikeRepository
- It implements Iterable -> implement method Iterable
- Create Iterator impl with 3 methods: hasNext(), next(), remove() 
- this can be used with foreach by default as foreach supports iterable

## Drawbacks
- No Access to index
- Base iterator is unideirectional (exception is listiterator)
- for lesser data speed/efficiency is slight less than direclt looping on index, for large data sets it is still best option

## Contrast to other pattern

| Iterator                              | for loop                            |
| -------------                         |:-------------:                      |
| Interface based                       | Traversal in client                 |
| Hence, Traversal algorithm is removed | For each syntax is not allowed here |
| No access to index                    | Exposes an index                    |
| Helps in concurrent modification      | Doesn't change under;yiong object   |
|                                       | Typically slower                    |

## Summary

- Efficient way to traverse
- Hides algorithm
- Simplify client
- can use forEach

 **[&#11014;  back to top](#table-of-contents)**

# 5. Mediator pattern :phone:

## 1. What is Mediator pattern?

`GoF`: Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.  
**[Wiki](https://en.wikipedia.org/wiki/Mediator_pattern)**: "In object-oriented programming, programs often consist of many classes. Business logic and computation are distributed among these classes. However, as more classes are added to a program, especially during maintenance and/or refactoring, the problem of communication between these classes may become more complex. This makes the program harder to read and maintain. Furthermore, it can become difficult to change the program, since any change may affect code in several other classes.  
 With the mediator pattern, communication between objects is encapsulated within a mediator object. Objects no longer communicate directly with each other, but instead communicate through the mediator. This reduces the dependencies between communicating objects, thereby reducing coupling."

## 2. Why would you choose?
- Used when you Need to acheive loose coupling within objects
- Well-defined set of objects taht communicate in complex ways
- In case it is tough to create reusable components you should refer this pattern--bridge_at_night
- It simplty acts as a hub/router in your application
- **Examples:** 
    - java.util.Timer
    - java.lang.reflect.Method#invoke()

## 3. How to Implement?

### 3.1 Design considerations

- Interface based with a concrete class
- Minimizes Inheritance
- Mediator knows colleagues
- Pieces of mediator pattern are: Mediator, ConcreteMediator

### 3.2 UML diagram

### 3.3 Example from Java (Timer)

```java
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayExample {
  private Toolkit toolkit;
  private Timer timer;

  public MediatorEverydayExample(int seconds) {
    timer = new Timer();
    timer.schedule(new RemindTask(), seconds * 1000);
    timer.schedule(new RemindTaskWithBeep(), seconds * 2 * 1000);
    toolkit = Toolkit.getDefaultToolkit();
  }

  class RemindTask extends TimerTask {

    @Override
    public void run() {
      System.out.println("Time' up!");
    }
  }

  class RemindTaskWithBeep extends TimerTask {

    @Override
    public void run() {
      System.out.println("Time' up Beeeep");
      toolkit.beep();
      timer.cancel();
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Scheduling task");
    new MediatorEverydayExample(3);
    System.out.println("Task Scheduled");
  }
}
```

output:
```cmd
Scheduling task
Task Scheduled
Time' up!
Time' up Beeeep
```

### 3.4 Implementation

 - We will implement using a Mediator and a Colleague object
 - Fix problem of duplicating logic with command pattern
 - Reconfigure the light and light switch object used in the command pattern



```java
// Colleague
public interface Command {
  public void execute();
}
```

```java
// receiver
public class Light {

  private boolean isOn = false;
  private String location = "";

  public Light() {

  }

  public Light(String location) {
    this.location = location;
  }

  public boolean isOn() {
    return isOn;
  }

  public void toggle() {
    if (isOn) {
      off();
      isOn = false;
    } else {
      on();
      isOn = true;
    }
  }

  public void on() {
    System.out.println(location + "Light Switched ONN");
  }

  public void off() {
    System.out.println(location + "Light Switched OFF");
  }
}
```

```java
public class Mediator {

  private List<Light> lights = new ArrayList<>();
  
  public void registerLight(Light light) {
    lights.add(light);
  }
  
  public void turnOnAllLights() {
    for(Light light: lights) {
      if(!light.isOn()) {
        light.toggle();
      }
    }
  }
}
```

```java
public class MediatorDemo {

  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    
    
    Light bedroomLight = new Light("Bedroom");
    Light kitchenLight = new Light("Kitchen");
    
    mediator.registerLight(bedroomLight);
    mediator.registerLight(kitchenLight);
    
    Command turnOnallLightsCommand = new TurnOnAllLightsCommand(mediator);
    turnOnallLightsCommand.execute();
  }
}
```

Output:
```cmd
BedroomLight Switched ONN
KitchenLight Switched ONN
```

Now, adding a new command to switch off all lights becomes a bit easy as all the logic is handled by Mediator now instead of the concrete commands  
Create new TurnOffAllLightsCommand.java class  

```java
public class TurnOffAllLightsCommand implements Command {

  private Mediator mediator;
  
  public TurnOffAllLightsCommand(Mediator mediator) {
    this.mediator = mediator;
  }
  
  @Override
  public void execute() {
    mediator.turnOffAllLights();
  }
}
```

Add turnOffAllLights method to switch off all the lights  
```java
public class Mediator {

  private List<Light> lights = new ArrayList<>();
  
  public void registerLight(Light light) {
    lights.add(light);
  }
  
  public void turnOnAllLights() {
    for(Light light: lights) {
      if(!light.isOn()) {
        light.toggle();
      }
    }
  }

  public void turnOffAllLights() {
    for(Light light: lights) {
      if(light.isOn()) {
        light.toggle();
      }
    }
  }
}
```


Demo: Add new call for turning lights off

```java
public class MediatorDemo {

  public static void main(String[] args) {
    Mediator mediator = new Mediator();
    
    
    Light bedroomLight = new Light("Bedroom");
    Light kitchenLight = new Light("Kitchen");
    
    mediator.registerLight(bedroomLight);
    mediator.registerLight(kitchenLight);
    
    Command turnOnallLightsCommand = new TurnOnAllLightsCommand(mediator);
    turnOnallLightsCommand.execute();
    
    Command turnOffallLightsCommand = new TurnOffAllLightsCommand(mediator);
    turnOffallLightsCommand.execute();
  }
}
```

Output:

```cmd
BedroomLight Switched ONN
KitchenLight Switched ONN
BedroomLight Switched OFF
KitchenLight Switched OFF
```

## 4. Drawbacks

 - Try to avoid creating a Diety Object
 - It might limit subclassing
 - Confusion on using Mediator over command pattern, whereas best works when used together

## 5. Contrast to other patterns

| Mediator                                      | Observer                           |
| -------------                                 |:-------------:                      |
| Defines how object interact with each other   | It is one to many broadcast|
| Achieves this via Object decoupling           | Object decoupling via broadcasting|
| More specific as mediator has to be modified itself | More generic as becoming a listener required just adding that listener|

## 6. Summary

 - Helps achieving loose coupling
 - Achieved via simplified communication between complex objects
 - Keep a check on Mediator complexity as it is easy to get it full with different methods
 - Should be used with Command patterns instead of using as a replacement of it

**[&#11014;  back to top](#table-of-contents)**

# 6. Memento :arrow_right_hook:

## 1. What is Memento pattern?

`GoF`: Without violating encapsulation, capture and externali ze an object's internal state so that the object can be restored to this state later.  
**[Wiki](https://en.wikipedia.org/wiki/Memento_pattern)**: "The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback).  
The memento pattern is implemented with three objects: the originator, a caretaker and a memento. The originator is some object that has an internal state. The caretaker is going to do something to the originator, but wants to be able to undo the change. The caretaker first asks the originator for a memento object. Then it does whatever operation (or sequence of operations) it was going to do. To roll back to the state before the operations, it returns the memento object to the originator. The memento object itself is an opaque object (one which the caretaker cannot, or should not, change). When using this pattern, care should be taken if the originator may change other objects or resources—the memento pattern operates on a single object."  

Literal meaning of memento is "an object kept as a reminder of a person or event." or a souvenir. This will help in understanding what this pattern does  

## 2. Why would you choose?
- When you want to restore object to a previous state
- This is achieved via externalizing the internal state which can be retrieved later
- Mostly used to implement undo/Rollback functionality 
- It SHields complex internals from the other objects
- **Examples:** 
    - java.util.Date
    - java.io.Serializable

## 3. How to Implement?

### 3.1 Design considerations
 - Design is class based having three main roles
 - Originator: Object which we want to create a copy or save point, it creates original memento
 - CareTaker: Manages the copies or mementos that are created
 - Memento: Copy of the Originator that we want to store, 
   - Magic cookie: Memento consists of a magic cookie, it is a combination of fields that it takes to recreate or copy the state of object and it is stored inside memento
   
### 3.2 UML Diagrams

### 3.3 Example from Java (Serialable)

```java
public class MementoEverydayExample {

  private static void serailize(Employee emp) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(emp);
      objectOutputStream.close();
      fileOutputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {

    Employee employee = new Employee();
    employee.setName("Giri");
    employee.setName("abc, park street,");
    employee.setPhone("9999999999");

    serailize(employee);

    Employee newEmployee = deserialize();

    System.out.println(newEmployee.getName());
  }

  private static Employee deserialize() {
    Employee emp = null;
    try {
      FileInputStream fileInputStream = new FileInputStream("/tmp/employee.ser");
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

      emp = (Employee) objectInputStream.readObject();
      objectInputStream.close();
      fileInputStream.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    return emp;
  }
}
```

Output:  
```cmd
Giri
```

### 3.4 Implementation

We will reuse the above Employee class just without the Serializable. Here, we will provide a save and revert method to save the state of an object 

```java
//Originator: Object whose copy we want 
public class Employee {

  private String name;
  private String address;
  private String phone;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public EmployeeMemento save() {
    return new EmployeeMemento(name, phone);
  }

  public void revert(EmployeeMemento employee) {
    this.name = employee.getName();
    this.phone = employee.getPhone();
  }

  @Override
  public String toString() {
    return name + ":" + phone;
  }
}
```

To save the state we will require another Object that we name as memento where it will have copies of that object with the fields that we are interested in.
```java
//Memento: can ignore fields whose state we don't want to recreate
public class EmployeeMemento {

  private String name;
  private String phone;
  
  public EmployeeMemento(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }
  
}
```

The final piece will be a Caretaker that will maintain this history. We have used the stack implementation that will help in maintaining the complete history.

```java
// Caretaker
public class Caretaker {

  private Stack<EmployeeMemento> employeeHistory = new Stack<>();
  
  public void save(Employee emp) {
    employeeHistory.push(emp.save());
  }
  
  public void revert(Employee emp) {
    emp.revert(employeeHistory.pop());
  }
}
```

Demo:  
```java
public class MementoDemo {

  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    
    Employee emp = new Employee();
    emp.setName("Giri");
    emp.setAddress("abc park street");
    emp.setPhone("999999999");
    System.out.println("Employee before save:                 " + emp);
    caretaker.save(emp); // 1st instance saved
    
    emp.setName("Giriraj");
    caretaker.save(emp); // 2nd instance saved
    System.out.println("Employee after changed name and save: " + emp);
    
    emp.setName("Vyas"); // wont be saved as save not called  
    
    caretaker.revert(emp);
    System.out.println("Revrted to last saved point:          " + emp);
    
    caretaker.revert(emp);
    System.out.println("Revrted to original:                  " + emp);
  }
}
```

```cmd
Employee before save:                  Giri:999999999
Employee after changed name and save:  Giriraj:999999999
Reverted to last saved point:          Giriraj:999999999
Reverted to original:                  Giri:999999999
```
## 4. Drawbacks
 - Can be expensive if the Originator has a large set of data
 - Caretaker should consider deleting the history when specific limit is reached
 - Take care that the originator's information is not exposed

## 5. Contrast to other patterns

| Memento                                      | Command                           |
| -------------                                 |:-------------:                      |
| It is used to capture the state   | Focuses on the request being captured |
| Each state captured is an independent state so that can be roll backed or recreated in future  | Focuses on the independent request |
| Focuses on building history with the help of caretaker object   | History is a side benefit |

## 6. Summary

 - It is used to capture state
 - Can get heavy with the history and hence should be taken care by deleting it in regular intervals
 - Recreate state of an object
 - Similar to Command with different emphasis on history and state rather than requests

**[&#11014;  back to top](#table-of-contents)**

# 7. Observer :eyes:

## 1. What is Observer pattern?

`GoF`: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.  
**[Wiki](https://en.wikipedia.org/wiki/Observer_pattern)**: "The observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.  
It is mainly used for implementing distributed event handling systems, in "event driven" software. In those systems, the subject is usually named a "stream of events" or "stream source of events", while the observers are called "sinks of events". The stream nomenclature alludes to a physical setup where the observers are physically separated and have no control over the emitted events from the subject/stream-source. This pattern then perfectly suits any process where data arrives from some input, rather isn't available to the CPU at startup, yet can arrive "at random" (HTTP requests, GPIO data, user input from keyboard/mouse/..., distributed databases and blockchains, ...). Most modern programming-languages comprise built-in "event" constructs implementing the observer-pattern components. While not mandatory, most 'observers' implementations would use background threads listening for subject-events and other support mechanisms provided by the kernel (Linux epoll, ...)."  

other: decoupling pattern when a subject needs to be observed by 1 or more observers
## 2. Why would you choose?
- When a subject has one to many observers
- When goal is to decouple objects
- Used when we need event handling capabilities
- Pub/Sub or Publisher/Subscriber is another name for the Observer pattern with a caveat that observer is synchronous where pub/sub is not 
- Mostly used in MVC pattern where view is event driven
- **Examples:** 
    - java.util.Observer
    - java.util.EventListener
    - javax.jms.Topic

## 3. How to Implement?

### 3.1 Design considerations
 - Subject: It is a subject that needs to be observed. It is typically an interface or abstract class which has concrete implementations.
 - Observer: Observers register thmselves to the Subject. It is implemented via Interface with various concrete implementations.
 - Views are Observers in an event driven application
 - UML: Subject, ConcreteSubject, Observer, ConcreteObserver 
 
### 3.2 UML Diagrams

### 3.3 Example from Java (Observer/Observable)

```java
public class ObserverEverydayExample {

  public static void main(String[] args) {
    TwitterStream stream = new TwitterStream();
    
    Client client1 = new Client("Giri");
    Client client2 = new Client("Raj");
    
    stream.addObserver(client1);
    stream.addObserver(client2);
    
    stream.someoneTweeted();
  }
}

// Concrete Subject
class TwitterStream extends Observable {
  
  public void someoneTweeted() {
    setChanged();
    notifyObservers();
  }
  
}

// Concrete Observer
class Client implements Observer {

  private String name;
  
  public Client(String name) {
    this.name = name;
  }
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Updating " + name + "'s feed. someone tweeted");
  }
  
}
```

### 3.4 Implementation

Lets start by creating an abstract Subject and Observer  

```java
public abstract class Subject {

  private List<Observer> observers = new ArrayList<>();
  
  abstract void setState(String state);
  abstract String getState();
  
  
  public void attach(Observer observer) {
    observers.add(observer);
  }
  
  public void detach(Observer observer) {
    observers.remove(observer);
  }
  
  public void notifyObservers() {
    for(Observer observer : observers) {
      observer.update();
    }
  }
}
```

```java
public abstract class Observer {

  protected Subject subject;

  abstract void update();
}
```

Now, we will have concrete implementations of the same

```java
public class MessageStream extends Subject {
  
  private Deque<String> messageHistory = new ArrayDeque<>();

  @Override
  void setState(String message) {
    messageHistory.add(message);
    this.notifyObservers();
  }

  @Override
  String getState() {
    return messageHistory.getLast();
  }
}
```

```java
public class PhoneClient extends Observer {

  public PhoneClient(Subject subject) {
    this.subject = subject;
    subject.attach(this);
  }

  public void addMessage(String message) {
    subject.setState(message + " - sent from phone");
  }

  @Override
  void update() {
    System.out.println("Phone Stream: " + subject.getState());
  }
}
```

Demo:

```java
public class ObserverDemo {
  
  public static void main(String[] args) {
    Subject subject = new MessageStream();
    
    PhoneClient phoneClient = new PhoneClient(subject);
    phoneClient.addMessage("Here's a new message");
    
  }
}
```

Output:

```cmd
Phone Stream: Here's a new message - sent from phone
```

Lets try to add a new client/Observer and see the efforts required to do the same. 

```java
public class TabletClient extends Observer {

  public TabletClient(Subject subject) {
    this.subject = subject;
    subject.attach(this);
  }

  public void addMessage(String message) {
    subject.setState(message + " - sent from Tablet");
  }

  @Override
  void update() {
    System.out.println("Phone Strem: " + subject.getState());
  }
}
```

Demo:

```java
public class ObserverDemo {
  
  public static void main(String[] args) {
    Subject subject = new MessageStream();
    
    PhoneClient phoneClient = new PhoneClient(subject);
    TabletClient tabletClient = new TabletClient(subject);
    
    phoneClient.addMessage("Here's a new message");
    tabletClient.addMessage("Here is another message");
  }
}
```

Output:

```cmd
Phone Stream: Here's a new message - sent from phone
Tablet Stream: Here's a new message - sent from phone
Phone Stream: Here is another message - sent from Tablet
Tablet Stream: Here is another message - sent from Tablet
```

## 4. Drawbacks
 - there can be unexpected changes notified
 - As the system is disconnected it will hard to find WHAT Changed in subject 
 - Debugging is difficult
 
## 5. Contrast to other patterns

| Observer                                      | Mediator                           |
| -------------                                 |:-------------:                      |
| It is one to many broadcast   | one-to-one-to-many where object talks to mediator and then mediator talks to another objects |
| primarily decouples the object an the observers who want to watch it | used for decoupling |
| Uses broadcast communication | Handling complex communication in  more direct model  |

## 6. Summary
 - Observer can be used along with Mediator in notification system where mediator is used in Subject
 - Often used for decoupled communication
 - Build in functionality in Java API as well

**[&#11014;  back to top](#table-of-contents)**

# 8. State design Pattern :arrows_counterclockwise:

## 1. What is State pattern?
`GoF`: Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
`Wiki`: This pattern is close to the concept of finite-state machines. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.

**Real life scenario:**  
The best example of this is a vending machine, where the state changes and you can only go from one state to another.
For Instance, You insert the coin then you have to make selection and this is the state you can go in apart from cancelling the transaction. Hence in this scenario state pattern is a perfect fit.

## 2. Why would you choose?

 - Want to localize state specific behaviour
 - Current application state is stored in a object, rather then in a mix of variables across application
 - Saperates 'state you are in' with 'state you came from or where we were at' 
 - Follows OCP (Open/Closed Principle)
 - Reduce cyclomatic complexity
 - Adding new state is Easier
 - Examples:
   - None in Java
   - JSF(its lifecycles and phases)

## 3. How to Implement?

### 3.1 Participants

 - **State:** Designed with an Abstract class or interface to define operations that each state must handle
 - **Concrete State:** Each state is Class based and is represented by concrete class for each state specific behavior
 - **Context:** - Delegates the state specific behaviour to respective state behaviours
 - **UML:** Context, State, ConcreteState (no multiple if..else blocks)

### 3.2 UML Diagram

  ![Alt Text](https://github.com/girirajvyas/gof-design-patterns/raw/master/resources/images/state/State_Design_Pattern_UML_Class_Diagram.svg "State")


### 3.3 Without State pattern Scenario
Lets start by considering a normal scenario of "if, else" conditions for managing the state of an application.  
Here, we will have an example of state of fan where it is OFF or LOW and is managed via conditions.  

For starter we only have 2 states as in OFF and LOW. code is as below:

```java
public class FanWithIfElseLogic {
  final static int OFF = 0;
  final static int LOW = 1;
  int state = OFF;
  
  public void pullchain() {
    if(state == OFF ) {
      System.out.println("Turning Fan to LOW");
      state = LOW;
    } else if (state == LOW) {
      System.out.println("Turning Fan OFF");
      state = OFF;
    }
  }

  @Override
  public String toString() {
    if(state == OFF ) {
      return "Fan is OFF";
    } else if (state == LOW) {
      return "Fan is on LOW Speed";
    }
    return "Invalid State";
  }
}
```

Calling code:

```java
    FanWithIfElseLogic fan = new FanWithIfElseLogic();
  
    System.out.println(fan);
    fan.pullchain();
    
    System.out.println(fan);
    fan.pullchain();
```

Output:

```java
Fan is OFF
Turning Fan to LOW
Fan is on LOW Speed
Turning Fan OFF

```
Now, lets try to add one more state here as MED. To add this state we will have to blatantly copy the condition and modify according to this new state.  

```java
    FanWithIfElseLogic fan = new FanWithIfElseLogic();
  
    // Off State
    System.out.println(fan);
    fan.pullchain();
    
    // Low State
    System.out.println(fan);
    fan.pullchain();
  
    // Med state
    System.out.println(fan);
    fan.pullchain();
```

Output:

```java
Fan is OFF
Turning Fan to LOW
Fan is on LOW Speed
Turning Fan to MED
Fan is on MED Speed
Turning Fan OFF
```

Even though it was easy to add a single state here, once the code grows it will be very hard to maintain this and here state pattern comes to our rescue


### 3.4 With State Pattern

 - Lets start by having a Abstract State class instead of int for defining the state. 
 - In Fan, We instantiate the specific states in the constructor only and assign the default state at start
 - We have a state instance to hold the current state of fan

```java
public abstract class State {

  public void handleRequest() {
    System.out.println("This should not have been called, Exception can also be thrown");
  }
    
}
```

```java
public class FanOffState extends State {

  private Fan fan;

  public FanOffState(Fan fan) {
    this.fan = fan;
  }

  public void handleRequest() {
    System.out.println("Turn the fan low as it is next state");
    fan.setState(fan.getFanLowState());
    // In above scenario we can have new instance created as well, for that purpose
    // we will use the Singleton pattern to get the instance
  }
  
  /**
   * To get the current state of Fan
   */
  public String toString() {
    return "fan is OFF";
  }
}
```

```java
public class FanLowState extends State {

  private Fan fan;

  public FanLowState(Fan fan) {
    this.fan = fan;
  }

  public void handleRequest() {
    System.out.println("Turn the fan Med as it is next state");
    fan.setState(fan.getFanMedState());
    // In above scenario we can have new instance created as well, for that purpose
    // we will use the Singleton pattern to get the instance
  }
  
  /**
   * To get the current state of Fan
   */
  public String toString() {
    return "fan is Low";
  }
}
```

```java
public class FanMedState extends State {

  private Fan fan;

  public FanMedState(Fan fan) {
    this.fan = fan;
  }

  public void handleRequest() {
    System.out.println("Turn the fan Off as it is next state");
    fan.setState(fan.getFanOffState());
    // In above scenario we can have new instance created as well, for that purpose
    // we will use the Singleton pattern to get the instance
  }
  
  /**
   * To get the current state of Fan
   */
  public String toString() {
    return "fan is Med";
  }
}
```

```java
public class Fan {
  State fanOffState;
  State fanLowState;
  State fanMedState;

  State state;

  public Fan() {
    fanOffState = new FanOffState(this);
    fanLowState = new FanLowState(this);
    fanMedState = new FanMedState(this);

    // Default scenario
    state = fanOffState;
  }

  public void pullchain() {
    state.handleRequest();
  }

  @Override
  public String toString() {
    return state.toString();
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getFanOffState() {
    return fanOffState;
  }

  public State getFanLowState() {
    return fanLowState;
  }

  public State getFanMedState() {
    return fanMedState;
  }
}
```

Calling:
```java
Fan fan = new Fan();
    
    // Off State
    System.out.println(fan);
    fan.pullchain();
    
    // Low State
    System.out.println(fan);
    fan.pullchain();
  
    // Med state
    System.out.println(fan);
    fan.pullchain();
```

Output:
```java
fan is OFF
Turn the fan low as it is next state
fan is Low
Turn the fan Med as it is next state
fan is Med
Turn the fan Off as it is next state
```

## 4. Drawbacks

 - You should know all your states to implement it correctly
 - There are lot more classes needed to implement in comparison to traditional if\else implementation
 - Keep logic out of the context and avoid getting conditional logic into it
 - what triggers hange the state should be clear

## 5. Contrast to other patterns

| State                                               | Strategy                           |
| -------------                                       |:-------------:                      |
| Focused on state                                    | focused on algorithms and strategy|
| Interface based, with collection of concrete states | Interface based|
| State only knows about next state it transitions to | Algorithms are independent |
| Each state is contained in its own class            | Class per Algorithm |

**[&#11014;  back to top](#table-of-contents)**

# 9. Strategy design Pattern :shipit:

## 1. What is strategy pattern?
`GoF`: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.  
`Wiki`: The strategy pattern (also known as the policy pattern) enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

**Real life scenario:**  


## 2. Why would you choose?

 - To eliminate the conditional(if/else) statements
 - Behaviour(Algorithms) is encapsulated in classes
 - Good when you have to externalize alorithms out of your application
 - If it is tough to add new Strategies or cases in your application
 - Client is aware of strategies and in turn chooses the strategy, but strategies may not be aware about each other
 - Examples:
    - java.util.Comparator
    - 

## 3. Do it yourself

### 3.1 Participants
 - Can be done with Interface but usually done with Abstract base class
 - All the concrete classes are implemented per strategy
 - Context, Strategy, ConcreteStrategy 

### 3.2 UML Diagram


### 3.3 Example from Java (Collections#sort with comparator)
```java
public static void main(String[] args) {

    Person p1 = new Person("Giri", 20);
    Person p2 = new Person("Raj", 24);
    Person p3 = new Person("Vyas", 19);
    
    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(p2);
    people.add(p3);
    System.out.println("Before: "+ people.toString());
    
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge()) {
          return 1;
        }

        if (o1.getAge() < o2.getAge()) {
          return -1;
        }

        return 0;
      }
    });
    System.out.println("Sort by age: " + people.toString());
    
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    System.out.println("Sort by Name: " + people.toString());
  }

```

Output:

```java
Before: [Person [name=Giri, age=20], Person [name=Raj, age=24], Person [name=Vyas, age=19]]
Sort by age: [Person [name=Vyas, age=19], Person [name=Giri, age=20], Person [name=Raj, age=24]]
Sort by Name: [Person [name=Giri, age=20], Person [name=Raj, age=24], Person [name=Vyas, age=19]]
```
Note: Above example can be done in java 8 as well but sake of readability and consistency kept it as it is.

### 3.4 Implementation
 - We are trying to create a validation logic based on the card used. This can be achieved by normal if\else as well
 - But as the cards will be added, its complexity will increase and will be harder to maintain.
 - Hence, creating a strategy that will be used according to the type of card 
 - Lets start by Creating Abstract base strategy class ValidationStrategy

```java
public abstract class ValidationStrategy {

  public abstract boolean isValid(CreditCard creditCard);

  /**
   * https://en.wikipedia.org/wiki/Luhn_algorithm
   * @param creditCardNumber
   * @return
   */
  protected boolean isPassingLuhnAlgo(String creditCardNumber) {
    int sum = 0;
    boolean alternate = false;

    for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
      int n = Integer.parseInt(creditCardNumber.substring(i, i + 1));

      if (alternate) {
        n = n * 2;
        if (n > 9) {
          n = (n % 10) + 1;
        }
      }
      sum = sum + n;
      alternate = !alternate;
    }

    return (sum % 10 == 0);
  }
}
```

Now we will create CreditCard.java, Important point to notice here is, we take Validation strategy as constructor argument.  
Hence, startegy can be governed by the client.

```java
public class CreditCard {
  
  private String number;
  private String expiry;
  private String cvv;
  private ValidationStrategy strategy;
  
  public CreditCard(ValidationStrategy strategy) {
    this.strategy = strategy;
  }
  
  public boolean isValid() {
    return strategy.isValid(this);
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
  
  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
  
}
```

Now create concrete strategies for the Amex and Visa validators by extending the ValidationStrategy
```java
public class AmexStrategy extends ValidationStrategy {

  @Override
  public boolean isValid(CreditCard creditCard) {
    boolean isValid = true;
    
    isValid = creditCard.getNumber().startsWith("37")
        || creditCard.getNumber().startsWith("34");
    
    if(isValid) {
      isValid = creditCard.getNumber().length() == 15;
    }
    
    if(isValid) {
      isValid = isPassingLuhnAlgo(creditCard.getNumber());
    }
    
    return isValid;
  }

}
```

```java
public class VisaStrategy extends ValidationStrategy {

  @Override
  public boolean isValid(CreditCard creditCard) {
    boolean isValid = true;
    
    isValid = creditCard.getNumber().startsWith("4");
    
    if(isValid) {
      isValid = creditCard.getNumber().length() == 16;
    }
    
    if(isValid) {
      isValid = isPassingLuhnAlgo(creditCard.getNumber());
    }
    
    return isValid;
  }
}

```

Calling class

```java
public class StrategyDemo {

  public static void main(String[] args) {
    // Valid scenario
    CreditCard amexCard = new CreditCard(new AmexStrategy());
    amexCard.setNumber("379185883464283");
    amexCard.setExpiry("12/2020");
    amexCard.setCvv("123");
    System.out.println("is Amex valid: " + amexCard.isValid());
    
    // Editing 1 number from credit card to make it invalid
    CreditCard amexCard2 = new CreditCard(new AmexStrategy());
    amexCard2.setNumber("379185883464284");
    amexCard2.setExpiry("12/2020");
    amexCard2.setCvv("123");
    System.out.println("is Amex valid: " + amexCard2.isValid());
    
    CreditCard visaCard = new CreditCard(new VisaStrategy());
    visaCard.setNumber("4539589763663402");
    visaCard.setExpiry("12/2020");
    visaCard.setCvv("123");
    System.out.println("is Visa valid: " + visaCard.isValid());
  }
}
```

## 4. Drawbacks

 - Client must be aware about the strategies avaialble
 - Increased number of classes within appication

## 5. Contrast to other patterns

| Strategy                                                         | State                                           |
| -------------                                                    |:-------------:                                  |
| Interface based                                                  | Interface based                                 |
| Algorithms are independent i.e they do not know about next state | Knows only about state that it can transition to|
| Class per Algorithm is their for Strategy                        | Class Per state                                 |

**[&#11014;  back to top](#table-of-contents)**

# 10. Template method design Pattern :part_alternation_mark:

## 1. What is Template method pattern?

`GoF`: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.  
`Wiki`: The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods in the same class as the template method.  
The helper methods may be either abstract methods, in which case subclasses are required to provide concrete implementations, or hook methods, which have empty bodies in the superclass. Subclasses can (but are not required to) customize the operation by overriding the hook methods. The intent of the template method is to define the overall structure of the operation, while allowing subclasses to refine, or redefine, certain steps.

## 2. Why would you choose?

 - fantastic technique for code reuse
 - Used extensively in designining libraries and frameworks
 - IoC containers use this pattern to allow pluggable components
 - Main focus is on what we are trying to solve by enabling to force an algorithm and allowing pieces to be configured by user
 - Examples:
   - java.util.Collections#sort()
   - java.util.AbstractList#indexOf()
   - JDBC, Spring JDBC

## 3. How to implement?

### 3.1 Design considerations

 - It is based around abstract base class
 - Base class is responsible for calling the childs (not vice-versa)
 - Hooks are created, in case they have to overriden (Optional)
 - Operations must be overridden
 - UML Elements: AbstractBase class, ConcreteClass

### 3.2 UML Diagrams


### 3.3 Example from Java (java.util.Collections#sort)

Person Pojo class without implementing Comparable 
```java
public class Person {

  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    super();
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }
}
```

Lets try to compare the list of Person objects via Collections#sort(). Here, we will get compile time error as person does not implement Comparable
```java
public class TemplateMethodEveryDayExample {

  public static void main(String[] args) {

    Person p1 = new Person("Giri", 20);
    Person p2 = new Person("Raj", 24);
    Person p3 = new Person("Vyas", 19);
    
    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(p2);
    people.add(p3);
    System.out.println("Before: "+ people.toString());
    
    Collections.sort(people); // Compilation error here as Person does not implement Comparable as of now
    System.out.println("Sort by age: " + people.toString());
  }
}
```

Now, we will implement Comparable to our Person Pojo.
```java
public class Person implements Comparable<Person> {

  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    super();
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }

  @Override
  public int compareTo(Person person) {
    if (this.age > person.getAge()) {
      return 1;
    }

    if (this.age < person.getAge()) {
      return -1;
    }

    return 0;
  }
}
```

Now, Compilation error is gone
```java
public class TemplateMethodEveryDayExample {

  public static void main(String[] args) {

    Person p1 = new Person("Giri", 20);
    Person p2 = new Person("Raj", 24);
    Person p3 = new Person("Vyas", 19);
    
    List<Person> people = new ArrayList<>();
    people.add(p1);
    people.add(p2);
    people.add(p3);
    System.out.println("Before: "+ people.toString());
    
    Collections.sort(people); // No Compilation error as Person implements Comparable now
    System.out.println("Sort by age: " + people.toString());
  }
}
```

Output:
```java
Before: [Person [name=Giri, age=20], Person [name=Raj, age=24], Person [name=Vyas, age=19]]
Sort by age: [Person [name=Vyas, age=19], Person [name=Giri, age=20], Person [name=Raj, age=24]]
```

### 3.4 Implementation

 - OrderTemplate, WebOrder, StoreOrder
 - Create Template method

We will first create OrderTemplate

```java
public abstract class OrderTemplate {

  public boolean isGift; // hook

  public abstract void doCheckout(); // Operation
  public abstract void doPayment(); // Operation
  public abstract void doReceipt(); // Operation
  public abstract void doDelivery(); // Operation
  
  public final void wrapGift() {
    System.out.println("Gift wrapped");
  }
  
  // final so as to restrict overriding
  public final void processOrder() {
    
    doCheckout();
    doPayment();
    if(isGift) {
      wrapGift();
    } else {
      doReceipt();
    }
    doDelivery();
  }
}
```

Lets create a Web and Store specific implementation

```java
public class WebOrder extends OrderTemplate {

  @Override
  public void doCheckout() {
    System.out.println("Get items from cart");
    System.out.println("set gift preferences");
    System.out.println("set Delivery address");
    System.out.println("set billing address");
  }

  @Override
  public void doPayment() {
    System.out.println("Process payment without card present");
  }

  @Override
  public void doReceipt() {
    System.out.println("Ship the item to address");
  }

  @Override
  public void doDelivery() {
    System.out.println("Email receipt");
  }
}
```

```java
public class StoreOrder extends OrderTemplate {

  @Override
  public void doCheckout() {
    System.out.println("Manually collect items in cart");
  }

  @Override
  public void doPayment() {
    System.out.println("Process payment with card present");
  }

  @Override
  public void doReceipt() {
    System.out.println("Print receipt");
  }

  @Override
  public void doDelivery() {
    System.out.println("Bag items at counter");
  }
}
```

Demo class

```java
public class TemplateDemo {
  
  public static void main(String[] args) {
    System.out.println("Web order:");
    OrderTemplate webOrder = new WebOrder();
    webOrder.processOrder();
    
    System.out.println();
    System.out.println("Store order:");
    OrderTemplate storeOrder = new StoreOrder();
    storeOrder.processOrder();
  }
}
```

Output:

```console
Web order:
Get items from cart
set gift preferences
set Delivery address
set billing address
Process payment without card present
Ship the item to address
Email receipt

Store order:
Manually collect items in cart
Process payment with card present
Bag items at counter
Bag items at counter
```

## 4. Drawbacks

 - Make sure to restrict access to certain methods correctly
 - Important to implement hooks and operations as well
 - Confusing hierarchy as algorithm is divided across multiple classes
 - Difficult programme flow depening on the number of templates you make

## 5. Contrast to other patterns

| Template Method                                     | Strategy                           |
| -------------                                       |:-------------:                      |
| Same algorithm and different implementations        | Algorithm per strategy, |
| Always class based                                  | Interface based|
| Template method is chosen at compile time           | Algorithms are chosen at runtime |

## Summary

 - Guarantees algorithm adherence
 - Mostly used in IOC containers
 - Often reffered as Hollywood principle (Dont call us, we'll call you)
 - Easier Implementation

**[&#11014;  back to top](#table-of-contents)**

# 11. Visitor design Pattern :santa:

## 1. What is Visitor method pattern?

`GoF`: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.  
**[Wiki](https://en.wikipedia.org/wiki/Visitor_pattern):** visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying the structures. It is one way to follow the open/closed principle.  
In essence, the visitor allows adding new virtual functions to a family of classes, without modifying the classes. Instead, a visitor class is created that implements all of the appropriate specializations of the virtual function. The visitor takes the instance reference as input, and implements the goal through double dispatch.  

## 2. Why would you choose?

 - Saperate algorithm from object structure
 - Expecting lot of change and adding new features cant modify the existing Object structure alreadt created
 - Helps in maintaining Open/Closed principle in Design
 - Visitor class contains the changes and specializations rather than original object
 - Examples:
   - javax.lang.model.element.Element
   - javax.lang.model.element.ElementVisitor

## 3. How to implement?

### 3.1 Design considerations

 - Interface Based
 - We must design around the visitor from the beginning and it is hard to fit it later
 - Implement Visitor in each Element
 - Elements have Visit method
 - Visitor knows every element
 - UML: Visitor, ConcreteVisitor, Element, ConcreteElement
 

### 3.2 UML Diagrams

### 3.3 Without Visitor

We will try to see and example of ATV(All Terrain Vehicle) parts where we are trying to create order for the parts.

Lets start with creating a interface so that all the parts of this type.

```java
public interface AtvPart {

}
```

Now we will have 3 different types of ATV parts for starter
```java
public class Wheel implements AtvPart {

}
```

```java
public class Oil implements AtvPart {

}
```

```java
public class Fender implements AtvPart {

}
```

Also, we will create a PartsOrder class to add and get the parts.

```java
public class PartsOrder implements AtvPart {

  private List<AtvPart> parts = new ArrayList<>();

  public void addParts(AtvPart part) {
    parts.add(part);
  }

  public List<AtvPart> getParts() {
    return Collections.unmodifiableList(parts);
  }
}
```

Demo class:
```java
public class VisitorDemo {

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    
    order.addParts(new Wheel());
    order.addParts(new Oil());
    order.addParts(new Fender());
    
    order.calculateShipping();// Compilation error as not yet created
  }
}
```

The challenge starts when We plan to calculate shipping for these orders. Hence, we have to create this method into the interface and force individual classess to provide the implementation of it.  
Here, we have only 3 products to start with, but it would be challenging if we had 1000s of product or we wanted to add some other operation.  
Lets start by defining this method in interface and provide the implementation in 3 parts that we have defined along with the partsOrder where we will sum all of those.  

```java
public interface AtvPart {
  double calculateShipping();
}
```
```java
public class Wheel implements AtvPart {

  @Override
  public double calculateShipping() {
    return 10;
  }
}
```
```java
public class Fender implements AtvPart {

  @Override
  public double calculateShipping() {
    return 1;
  }
}
```
```java
public class Oil implements AtvPart {

  @Override
  public double calculateShipping() {
    return 5;
  }
}
```

```java
public class PartsOrder implements AtvPart {

  private List<AtvPart> parts = new ArrayList<>();

  public void addParts(AtvPart part) {
    parts.add(part);
  }

  public List<AtvPart> getParts() {
    return Collections.unmodifiableList(parts);
  }

  @Override
  public double calculateShipping() {
    double shippingCost = 0;
    for (AtvPart atvPart : parts) {
      shippingCost += atvPart.calculateShipping();
    }
    return shippingCost;
  }
}
```

Demo class:

```java
public class VisitorDemo {

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    
    order.addParts(new Wheel());
    order.addParts(new Oil());
    order.addParts(new Fender());
    
    double shippingCost = order.calculateShipping();
    System.out.println(shippingCost);
  }
}
```

```console
16.0
```

### 3.4 With Visitor

Lets start from the place where we have not added the calculateShipping() method in ATV interface.  
We have 2 parts to our solution, one is acceptor whereas another is the visitor.  
We will create `accept` method in our `AtvPart.java` interface and it will take parameter `AtvPartVisitor.java` interface having `visit` methods

```java
public interface AtvPart {
  public void accept(AtvPartVisitor visitor);
}
```

```java
public interface AtvPartVisitor {

  void visit(Fender fender);
  void visit(Oil oil);
  void visit(Wheel wheel);
  void visit(PartsOrder partsOrder);
}
```

```java
public class AtvPartsShippingVisitor implements AtvPartVisitor {

  double shippingAmount = 0;
  
  @Override
  public void visit(Fender fender) {
    System.out.println("Adding cost of Fender");
    shippingAmount += 1;
  }

  @Override
  public void visit(Oil oil) {
    System.out.println("Adding cost of oil");
    shippingAmount += 5;
  }

  @Override
  public void visit(Wheel wheel) {
    System.out.println("Adding cost of wheel");
    shippingAmount += 10;
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    if(partsOrder.getParts().size() > 2) {
      System.out.println("As more than 2 items bought, discount applied");
      System.out.println("Original amount: " + shippingAmount);
      shippingAmount -= 5;
    }
    System.out.println("Final Shipping Amount is: " + shippingAmount);
  }
}
```

```java
public class Fender implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
```

```java
public class Oil implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
```

```java
public class Wheel implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);    
  }
}
```

```java
public class VisitorDemo {

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    
    order.addParts(new Wheel());
    order.addParts(new Oil());
    order.addParts(new Fender());
    
    order.accept(new AtvPartsShippingVisitor());
  }
}
```

Output:

```java
Adding cost of wheel
Adding cost of oil
Adding cost of Fender
As more than 2 items bought, discount applied
Original amount: 16.0
Final Shipping Amount is: 11.0
```

Now to show how easy it is to add new functionality of Display. Lets create a display visitor

```java
public class AtvPartsDisplayVisitor implements AtvPartVisitor {

  @Override
  public void visit(Fender fender) {
    System.out.println("We have fender");
  }

  @Override
  public void visit(Oil oil) {
    System.out.println("We have oil");
  }

  @Override
  public void visit(Wheel wheel) {
    System.out.println("We have wheel");
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    System.out.println("We have an order");
  }
}
```

```java
public class VisitorDemo {

  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    
    order.addParts(new Wheel());
    order.addParts(new Oil());
    order.addParts(new Fender());
    
    order.accept(new AtvPartsShippingVisitor());
    System.out.println();
    order.accept(new AtvPartsDisplayVisitor());
  }
}
```

Output:

```cmd
Adding cost of wheel
Adding cost of oil
Adding cost of Fender
As more than 2 items bought, discount applied
Original amount: 16.0
Final Shipping Amount is: 11.0

We have wheel
We have oil
We have fender
We have an order

```

## 4. Drawbacks

 - As you have to plan this ahead you have to make sure that it is adapted and not just have increased the complexity of system 
 - As you can have visitors added on the fly this may lead to confusion
 - Each visitor may not implement all of its method and hecnce may have to use Adapter pattern in parallel
 

## 5. Contrast to other patterns

| Visitor                                         | Iterator                           |
| -------------                                   |:-------------:                      |
| Interface based                                 | Interface based but mostly implemented with anonymous inner class |
| Focus on adaptability by externalizing changes  | Iterator encapsulates navigation but not necessarily externalize it |
| Adding visitor is easy and encouraged           | Genrally single iterator is implemented |

## 5. Summary

 - We expect changes in application and not sure about them upfront
 - Adds minor complexity to application
 - Used when we want to externalize changes

**[&#11014;  back to top](#table-of-contents)**

# Refactoring to patterns

## Wrappers:
### High level	
 - Adapter: Wraps and changes
 - Decorator: wraps and adds
 - Facade: wraps, unites and simplifies
	
### With details
 - Adapter: wraps and existing class and acts as connector between two incompatible interfaces
 - Decorator: Attaches additional responsibilities to an object. In other words, it provides an enhanced interface to the original object. decorator replaced with functional programming composition -> eg: function andThen

## Strategy
 - Long and Complex -> Strategy with class
 - short and simple -> lambda

## References:
**Courses:**  
- https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents
- https://app.pluralsight.com/library/courses/design-patterns-java-structural/table-of-contents
- https://app.pluralsight.com/library/courses/design-patterns-java-behavioral/table-of-contents

**All types of design patterns in Java (includes GoF, Microservices, Cloud, etc patterns):**  
- https://java-design-patterns.com/patterns/  

**All relevant Github repositories on this topic**
- https://github.com/TushaarGVS/Design-Patterns-Mentorship
- https://github.com/kamranahmedse/design-patterns-for-humans
- https://github.com/icoderman/gof-design-patterns
- https://github.com/iluwatar/java-design-patterns/blob/master/README.md
- https://github.com/adesozasilva/creational-design-pattern
- https://github.com/bzdgn/gang-of-four-design-patterns-in-java
- https://github.com/AshV/GoF-Design-Patterns-by-Example

**Good reads**
- https://www.javabrahman.com/design-patterns/gof-gang-four-design-patterns/

**Singleton:**  
- Good read: https://medium.com/@kevalpatel2106/digesting-singleton-design-pattern-in-java-5d434f4f322
- https://stackoverflow.com/questions/16771373/singleton-via-enum-way-is-lazy-initialized
- https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java
- https://howtodoinjava.com/java/enum/is-enum-really-best-for-singletons/
- https://dzone.com/articles/java-singletons-using-enum
- https://www.journaldev.com/31902/gangs-of-four-gof-design-patterns

**Comparisons:**  
 - Factory vs Strategy pattern: https://dzone.com/articles/design-patterns-the-strategy-and-factory-patterns  
 - https://sourcemaking.com/design_patterns/template_method
 - https://medium.com/educative/the-7-most-important-software-design-patterns-d60e546afb0e
 
**Additional References:**  
 - Apache derby configuration: https://www.codejava.net/java-se/jdbc/connect-to-apache-derby-java-db-via-jdbc

**Anti-Patterns**  
 - https://en.wikipedia.org/wiki/Anti-pattern

**Design patterns in light of lambda expressions**
 - https://www.youtube.com/watch?v=WN9kgdSVhDo

**Did you know:**  
 > As announced in June 2015, JavaDB is no longer included in recent versions of the JDK. It was removed from JDK 7 and JDK 8 with the July 17, 2018 Critical Patch Update. JavaDB was a rebranding of Apache Derby. Developers who like to continue using JavaDB should download the latest version from The Apache DB Project.  Source: https://www.oracle.com/java/technologies/javadb.html
