# gof-design-patterns (23)

******
    This repository contains examples of all the design patterns listed in the GoF book
******


## Table of contents
- [Introduction](#introduction)
- [What is a design pattern](#what-is-a-design-pattern?)
- [Why you should learn design patterns](#why-you-should-learn-design-patterns?)
- [How to approach](#how-to-approach?)
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
    6. Memento
    7. Observer
    8. State
    9. Strategy
    10. Template method
    11. Visitor

## What is a design pattern?
From Wiki:-
- **A general reusable solution to a commonly occurring problem** within a given context in software design.  
- Not a finished design that can be transformed directly into source or machine code. 
- Rather, it is a **description or template for how to solve a problem** that can be used in many different situations. 
- Design patterns are **formalized best practices** that the programmer can use to solve common problems when designing an application or system.

## Why you should learn design patterns?
- Easy to communicate a proble among fellow developers
- It provides a common vocabulary to explain about problem
- It is an abstract topic
- Revisit materails about patterns will alway give you an new perspective everytime.

## How to approach?
For each pattern you will see below points covered:
- Overview of the pattern
- Concepts involved
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

- `GoF`: Ensure a class only has `one instance`, and provide a global point of contact to access it. 
- `Wiki`: Restricts the instantiation of a class to one "single" instance.

## Concepts:
- Only one instance created. It is achieved by providing only one entry point to create the new instance of the class
- Useful where we have to control the resources, such as database connections or sockets 
- Lazily loaded (usually)
- **Examples:**  
   - Runtime.java  
   - Logger (singleton or factory)
   - Spring beans (by default, scope is singleton in spring)

## Design considerations
- Class is responsible for creating itself and its lifecycle
- Private instance
- Private constructor
- Static in nature, but not implemented via static class  as it does not guarantee it will be thread safe (contradicts bill pugh implementation, verify this)
- No parameters required for construction, in case parameter is required for construction than it violates singleton.

## Everyday Example in use

```java
    Runtime singletonRuntime = Runtime.getRuntime();
    singletonRuntime.gc();
    System.out.println(singletonRuntime);
    
    Runtime anotherInstance = Runtime.getRuntime();
    System.out.println(anotherInstance);
    
    if (singletonRuntime == anotherInstance) {
            System.out.println("They are the same instance");
    }
```

## Demo

**Steps to create:**  
- We have 5 major versions of Singleton
    - Eager initialization
    - Lazy initialization with synchronized method
    - Lazy initialization with double check locking method
    - Lazy initialized with static inner class
    - Lazy initialized with `Enum` which leads to less code. (Recommended by Joshua bloch in Effective Java)

**Common step:**  
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

**Eager Initialization**  
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
- **Disadvantages**
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

**Lazy initialization with synchronized method**  
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
- **Disadvantages**
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

**Lazy initialization with synchronized block**  
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

**Lazy initialization with static inner class**  
- TODO, code available


**Enum Singleton**  
- Implementation added with DbSingletonEnum

> The best way to implement a `Serializable Singleton` is to use an Enum

> From Joshua Bloch's Effective Java: This approach is functionally equivalent to the public field approach, except that it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. While this approach has yet to be widely adopted, a single-element enum type is the best way to implement a singleton.

## Drawbacks 
- Often overused
- Difficult to unit test
- If not careful, not threadsafe
- Sometimes confused for factory

> :stop_sign:   java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.

## Contrast to other patterns

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

**[&#11014; _  back to top](#table-of-contents)**

# 2. Builder pattern :construction_worker:

- `GoF`: Separate the construction of a complex object from its representation so that the same construction process can create different representations.
- `Wiki`: The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation 
- `Other`: This a pattern people often use but rarely create of there own. This pattern deals with construction of Objects with lot of parameters and want to make the object once we are done constructing it.

## Concepts
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


**[&#11014; back to top](#table-of-contents)**

# 3. Prototype pattern :clipboard:

- `GoF`: Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype
- `Wiki`: 
- `Other`: creates copy of objects that are very expensive to create

## Concepts
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
Create Prototype
Demonstrate shallow copy
Create with a registry

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

**[&#11014; back to top](#table-of-contents)**

# 4. Factory method pattern :factory: 

## Concepts
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
- creation in subclass **
- Refactoring: This is not something that is refactored later, rather a design decision to make early in development

## Contrast to other patterns

| Singleton                        | Factory                                           |
| -------------                    |:-------------:                                    |
| Returns same instance            | Returns various instances                         |
| one constructor method - no args | multiple constructors                             |
| no interface                     | Interface Driven                                  |
| No Subclasses                    | Always SubClasses are involved in a way or other  |
| NA			                   | Adaptable to environment more easily**            |

## Summary
- Parameter Driven (chooses type based on this)
- Solves Complex creation (Choose type at runtime)
- A little complex
- Opposite of a Singleton

**[&#11014; back to top](#table-of-contents)**

# 5. AbstractFactory pattern :factory:  :factory:

## Concepts

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
- problem specific (limited scope)
- Starts as a factory and the refactored to abstractFactory

## Contrast to other patterns

| Factory                              | AbstractFactory                                     |
| -------------                        |:-------------:                                      |
| Returns various instances            | Implemented with a factory                          |
|   - multiple constructors            | Hides the underlying concrete factory 	             |
| Interface Driven                     | 1 more layer of Abstraction added to  environment   |
| Adaptable to environment more easily | Built through composition                           |

## Summary
- Group of similar factories
- Complex
- Heavy abstraction
- written at framework level

**[&#11014; back to top](#table-of-contents)**

# Structural Design Patterns

# 1. Adapter pattern  :electric_plug:
Pattern for connecting new code to the legacy code without having to change thenworking contract that was produced from legacy code originally

## Concepts
- Similar to physical plug Adapter (doesnt cover all scenarios tough, but can be a good example for starter)
- Convert Interface into another Interface
- connects Legacy code to current code
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
- ususally multiple adapters can be created to make code works
- Don't add functionality, Consider Decorator or any other pattern in case you need to add functionality

## Contrast to other patterns

| Adapter                              | Bridge                                     |
| -------------                        |:-------------:                                      |
| Works after code is designed         | Designed upfront                                    |
| works mostly with Legacy             | so that Abstraction and implementation can vary     |
| Retrofitted                          | Built in advance                                    |
| Provides different interface         | Both adapt multiple systems                         |

## Summary

- Simple solution
- Easy to implement
- Integrate with legacy code
- Can provide multiple adapters

**[&#11014; back to top](#table-of-contents)**

# 2. Bridge pattern  :bridge_at_night:
Similar to adapter with 1 major difference that Adapter works with legacy code and bridge works with new code

## Concepts

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
- little confusing about what goes where in code

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
- provides flexibility
- more than composition

**[&#11014; back to top](#table-of-contents)**

# 3. Composite pattern  :leaves:
Hierarchical pattern that deals with the tree structures of information

## Concepts
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

**[&#11014; back to top](#table-of-contents)**

# 4. Decorator pattern :heart_decoration:

## Concepts
- Wrapper to add functionality
- Add behaviour without affecting others
- It is more than just inheritance
- follows **Single Responsibility Principle**
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

**[&#11014; back to top](#table-of-contents)**

# 5. Facade pattern  :notes:

Provides simple interface to COmplex or difficult to use system that is odten result of a poorly designed API

## Concepts

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

**[&#11014; back to top](#table-of-contents)**

# 6. Flyweight pattern :butterfly:

## Concepts

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
- premature optimization of code 
- must understand factory
- Not a graphical pattern 

## Contrast to other patterns

| Flyweight             | Facade                         |
| -------------         |:-------------:                 |
| Memory optimization   | Refactoring pattern            |
| Optimization pattern  | Simplified client              |
| Immutable objects     | provides a different interface |

## Summary

- Great for memory management
- A little bit complex
- Used a lot by core API

**[&#11014; back to top](#table-of-contents)**


# 7. Proxy pattern :trollface:

## concepts

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

**[&#11014; back to top](#table-of-contents)**


# Behavioral Design Patterns

## 1. Chain of responsibility :chains:

## Concepts

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

**[&#11014; back to top](#table-of-contents)**

## 2. Command pattern :genie:

## Concepts

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
- if tracking of objects need to store a history, you may also need to look at prototype for creating copies of commands to store on a list

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

**[&#11014; back to top](#table-of-contents)**

## 3. Interpreter pattern :speaking_head:

## Concepts

- represent grammer
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
- parse example

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

**[&#11014; back to top](#table-of-contents)**

## 4. Iterator pattern :loop:

## Concepts (why would you choose)

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

 **[&#11014; back to top](#table-of-contents)**

## 5. Mediator pattern :phone:

## Concepts
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


## References:
**Courses:**  
- https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents
- https://app.pluralsight.com/library/courses/design-patterns-java-structural/table-of-contents

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

Singleton:  
- Good read: https://medium.com/@kevalpatel2106/digesting-singleton-design-pattern-in-java-5d434f4f322
- https://stackoverflow.com/questions/16771373/singleton-via-enum-way-is-lazy-initialized
- https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java
- https://howtodoinjava.com/java/enum/is-enum-really-best-for-singletons/
- https://dzone.com/articles/java-singletons-using-enum

**Additional References:**
1. Apache derby configuration: https://www.codejava.net/java-se/jdbc/connect-to-apache-derby-java-db-via-jdbc

**Did you know:**  
 > As announced in June 2015, JavaDB is no longer included in recent versions of the JDK. It was removed from JDK 7 and JDK 8 with the July 17, 2018 Critical Patch Update. JavaDB was a rebranding of Apache Derby. Developers who like to continue using JavaDB should download the latest version from The Apache DB Project.  Source: https://www.oracle.com/java/technologies/javadb.html