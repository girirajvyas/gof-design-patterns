![GoF Design Patterns](https://github.com/girirajvyas/gof-design-patterns/raw/master/resources/images/GoF_Header.PNG)

*****
<p align="center">
 Gang-of-Four(GoF) Design patterns
</p>

<p align="center">
    This repository contains examples of all the design patterns listed in the 
    "Design patterns - Elements of Reusable Object-oriented Software" book 
    by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides 
    popularly known as Gang of Four (GoF). 
</p>

*****


## Table of contents
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
    6. [Memento]
    7. [Observer]
    8. [State]
    9. [Strategy]
    10. [Template method]
    11. [Visitor]

## What is a design pattern?
From Wiki:-
- **A general reusable solution to a commonly occurring problem** within a given context in software design.  
- Not a finished design that can be transformed directly into source or machine code. 
- Rather, it is a **description or template for how to solve a problem** that can be used in many different situations. 
- Design patterns are **formalized best practices** that the programmer can use to solve common problems when designing an application or system.

Classification:-
- Creational: Deals with the creation of an object
- Sructural: Deals with the class structure such as Inheritance and Composition.
- Behavioral: Provides solution for the better interaction between objects, also how to provide lose coupling, and flexibility to extend easily in future.

## Why you should learn design patterns?
- Easy to communicate a proble among fellow developers
- It provides a common vocabulary to explain about problem
- It is an abstract topic
- Revisit materails about patterns will alway give you an new perspective everytime.

## How to approach?
For each pattern you will see below points covered:
- Overview of the pattern
- Why would you choose?
- Design considerations
- Demo / Live example from an API / Steps to create
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
|  6   | [Memento]                                                    | **Without violating encapsulation, capture and externali ze an object's internal state so that the object can be restored to this st ate later.**                                                                             |
|  7   | [Observer]                                                   | Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.                                                                    |
|  8   | [State]                                                      | **Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.**                                                                                                        |
|  9   | [Strategy]                                                   | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.                                                         |
|  10  | [Template method]                                            | **Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.**              |
|  11  | [Visitor]                                                    | Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.                            |

# Creational design patterns

# 1. Singleton pattern :gem:

## 1. What is Singleton?

- `GoF`: Ensure a class only has `one instance`, and provide a global point of contact to access it. 
- `Wiki`: Restricts the instantiation of a class to one "single" instance.

## 2. Why would you choose?

- Only one instance created. It is achieved by providing only one entry point to create the new instance of the class
- Useful where we have to control the resources, such as database connections or sockets 
- Lazily loaded (usually)
- **Examples:**  
   - Runtime.java  
   - Logger (singleton or factory)
   - Spring beans (by default, scope is singleton in spring)

**Example from Java**  

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

## 3. Do it Yourself

### 3.1 Design considerations
 - Class is responsible for creating itself and its lifecycle
 - Private instance
 - Private constructor
 - Static in nature, but not implemented via static class  as it does not guarantee it will be thread safe (contradicts bill pugh implementation, verify this)
 - No parameters required for construction, in case parameter is required for construction than it violates singleton.

### 3.2 UML Diagram


### 3.3 Different Variations of creating a Singleton 
 1. Eager initialization
 2. Lazy initialization with synchronized method
 3. Lazy initialization with double check locking method
 4. Lazy initialized with static inner class
 5. Lazy initialized with `Enum` which leads to less code. (Recommended by Joshua bloch in Effective Java)

#### 3.3.0 Common step:  
 - Create a class with `private constructor` to prevent initialization.  
 - Making constructor private prevents the initialization via `new` keyword
 - We expose a public static method (commonly named `getInstance()`) to provide the single entry point that returns its instance 

```java
public class Singleton {
  private Singleton() {
 }
 
 public static Singleton getInstance(){
 }
}
```

#### 3.3.1 Eager Initialization  
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

#### 3.3.2 Lazy initialization with synchronized method  
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

#### 3.3.3 Lazy initialization with double check locking method
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

#### 3.3.4 Lazy initialization with static inner class
- TODO, code available


#### 3.3.5 Enum Singleton
- Implementation added with DbSingletonEnum

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
- `Wiki`: The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation 
- `Other`: This a pattern people often use but rarely create of there own. This pattern deals with construction of Objects with lot of parameters and want to make the object once we are done constructing it.

## 2. Why would you choose?
- Handles complex constructors
- Large number of parameters
- Immutability
- **Examples:**
  - StringBuilder
  - DocumentBuilder
  - Locale.Builder
  
## Design considerations
- Flexibility over telescoping constructors
- Generally implemented with static inner class
- Calls appropriate constructor
- Negates the need for exposed setters
- Java 1.5+ can take advantage of generics ***

## Example/Demo
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

## Drawbacks
- Immutable objects are created
- Inner static class is generally used for implementation
- It is always Designed first 
- Adds complexity, as people are not comfortable with object returning itself with each subsequent call

## Contrast to other patterns

| Builder                               | Prototype                              |
| -------------                         |:-------------:                         |
| Handles complex constructors          | Implemented around a clone             |
| No interface required                 | Avoids calling complex constructors    |
| Can be a saperate class               | NA                                     |
| Works with a legacy code              | Difficult to implement in legacy code  |


## Summary
- Creative way to deal with complexity
- Easy to implement
- few drawbacks
- can refactor in with a saperate class (typically implemented with a static inner class)

## Next
Explore the Generics version of builder pattern


**[&#11014;  back to top](#table-of-contents)**

# 3. Prototype pattern :clipboard:

- `GoF`: Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype
- `Wiki`: 
- `Other`: creates copy of objects that are very expensive to create

## Why would you choose?
- Avoids costly creation
- Avoids Subclassing
- Typically doesn't use keyword "new"
- Often utilizes an Interface
- Usually implemented with a registry
- **Example:**
  - java.lang.Object#clone()
  
## Design considerations
- Typically implements clone/cloneable
- Avoids keyword "new"
- Although copy, each instance is unique
- Costly construction not handled by client (builder is opposite of prototype)
- Can still utilize parameters for construction
- Shallow vs deep copy design considerations can be made 
 
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

## Drawbacks
- Sometimes not clear when to use
- Used with other patterns
   - Registry
- Mostly shallow copy by clone, for deep copy we have to implement ourselves and it requires a lot of code

## Contrast to other patterns

| Prototype                             | Factory                                                            |
| -------------                         |:-------------:                                                     |
| Light weight construction             | Flexible Objects based on request                                  |
|  - Copy constructor or clone method   |  - multiple constructors can be use instead of just clone method   |
| Choose shallow vs deep copy           | Create fresh and cconcrete instance of object                      |
| Main purpose to create copy of itself | NA                                                                 |

## Summary
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
- Defer to subclasses
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
   
## Drawbacks:
- Complexity 
- Creation in subclass **
- Refactoring: This is not something that is refactored later, rather a design decision to make early in development

## Contrast to other patterns

| Singleton                        | Factory                                           |
| -------------                    |:-------------:                                    |
| Returns same instance            | Returns various instances                         |
| one constructor method - no args | multiple constructors                             |
| no interface                     | Interface Driven                                  |
| No Subclasses                    | Always SubClasses are involved in a way or other  |
| NA                         | Adaptable to environment more easily**            |

## Summary
- Parameter Driven (chooses type based on this)
- Solves Complex creation (Choose type at runtime)
- A little complex
- Opposite of a Singleton

**[&#11014;  back to top](#table-of-contents)**

# 5. AbstractFactory pattern :factory:  :factory:

## Why would you choose?

- Factory of Factories
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

## 1. Chain of responsibility :chains:

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

## 2. Command pattern :genie:

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

## 3. Interpreter pattern :speaking_head:

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

## 4. Iterator pattern :loop:

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

## 5. Mediator pattern :phone:

## Why would you choose?
- Need to acheive loose coupling within objects
- Well-defined set of objects taht communicate in complex ways
- In case it is tough tp create reusable components you should refer this pattern--bridge_at_night
- It simplty acts as a hub/router in your application
- **Examples:** 
    - java.util.Timer
    - java.lang.reflect.Method#invoke()

## Design considerations

- Interface based with a concrete class
- Minimizes Inheritance
- Mediator knows colleagues
- Pieces of mediator pattern are: Mediator, ConcreteMediator


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

## 3. Do it Yourself

### 3.1 Participants

 - **State:** Designed with an Abstract class or interface to define operations that each state must handle
 - **Concrete State:** Each state is Class based and is represented by concrete class for each state specific behavior
 - **Context:** - Delegates the state specific behaviour to respective state behaviours
 - **UML:** Context, State, ConcreteState (no multiple if..else blocks)

### 3.2 UML Diagram

  ![Alt Text](https://github.com/girirajvyas/gof-design-patterns/raw/master/resources/images/uml/State_Design_Pattern_UML_Class_Diagram.svg "State")


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

**Example from Java:**  
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



## 3. Do it yourself

## 3.1 Participants
 - Can be done with Interface but usually done with Abstract base class
 - All the concrete classes are implemented per strategy
 - Context, Strategy, ConcreteStrategy 

## 3.2 UML Diagram


## 3.3 Implementation
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
1. Apache derby configuration: https://www.codejava.net/java-se/jdbc/connect-to-apache-derby-java-db-via-jdbc

**Did you know:**  
 > As announced in June 2015, JavaDB is no longer included in recent versions of the JDK. It was removed from JDK 7 and JDK 8 with the July 17, 2018 Critical Patch Update. JavaDB was a rebranding of Apache Derby. Developers who like to continue using JavaDB should download the latest version from The Apache DB Project.  Source: https://www.oracle.com/java/technologies/javadb.html
