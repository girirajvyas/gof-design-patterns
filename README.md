# gof-design-patterns (23)

******
    This repository contains examples of all the design patterns listed in the GoF book
******


## Table of contents
- [Introduction](#introduction)
- [What is a design pattern](#what-is-a-design-pattern)
- [Why you should learn Design patterns](#why-you-should-learn-Design-patterns)
- [How to approach](#how-to-approach)
- Creational Design Patterns (5)
    1. [Singleton](#1-singleton-pattern-gem)
    2. [Builder](#2-builder-pattern-construction_worker)
    3. [Prototype](#3-prototype-pattern-clipboard)
    4. [Factory Method](#4-factory-method-pattern-factory)
    5. [Abstract Factory](#5-abstractfactory-pattern-factory--factory)
- Structural Design Patterns (7)
    1. [Adapter](#1-adapter-pattern--electric_plug) 
    2. [Bridge](#2-bridge-pattern--bridge_at_night)
    3. [Composite](#3-Composite-pattern--leaves)
    4. [Decorator](#4-decorator-pattern-heart_decoration)
    5. [Facade](#5-facade-pattern--notes)
    6. [Flyweight](#6-flyweight-pattern-butterfly)
    7. [Proxy](#7-proxy-pattern-trollface)
- Behavioral Design Patterns (11)


## What is a design pattern
From Wiki:-
- **A general reusable solution to a commonly occurring problem** within a given context in software design.  
- Not a finished design that can be transformed directly into source or machine code. 
- Rather, it is a **description or template for how to solve a problem** that can be used in many different situations. 
- Design patterns are **formalized best practices** that the programmer can use to solve common problems when designing an application or system.

## Why you should learn Design patterns
- Easy to communicate a proble among fellow developers
- It provides a common vocabulary to explain about problem
- It is an abstract topic
- Revisit materails about patterns will alway give you an new perspective everytime.

## How to approach
For each pattern you will see below points covered:
- Overview of the pattern
- Concepts involved
- Design Considerations
- Live Example from an API | Example/Demo
- Pitfalls (Drawbacks)
- Contrast to another patterns
- Summary

# Creational Design Patterns (5)

|Sr. no| Pattern Name                                   | Description                                           |
|-----:| -------------                                  |:-------------:                                    |
|  1   | [Singleton](#1-singleton-pattern-gem)              | **Ensure a class only has one instance, and provide a global point of access to it** |
|  2   | [Builder](#2-builder-pattern-construction_worker)                  | Saperate the construction of complex object from its representation so that the same construction process can create different representations                                  |
|  3   | [Prototype](#3-prototype-pattern-clipboard)              | **Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype**                                  |
|  4   | [Factory Method](#4-factory-method-pattern-factory)    | Define an interface for creating an object, but let sub-classess decide which class to instantiate. Factory method lets a class defer instantiation to subclasses                                  |
|  5   | [Abstract Factory](#5-abstractfactory-pattern-factory--factory) |                                   |



# Structural Design Patterns (7)

|Sr. no| Pattern Name                       | Description                                           |
|-----:| -------------                      |:-------------:                                    |
|  1   | [Adapter](#1-adapter-pattern--electric_plug)      | **Convert the interface of a class into another interface clients expect. Adapter lets classescwork together that couldn't otherwise because of incompatible interfaces.** |
|  2   | [Bridge](#2-bridge-pattern--bridge_at_night)        | Decouple an abstraction from its implementation so that the two can vary independently     |
|  3   | [Composite](#3-composite-pattern--leaves)  | **Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.**            |
|  4   | [Decorator](#4-decorator-pattern-heart_decoration)  | Attach additional responsibilities to an object dynamica lly.Decorators provide a flexible alternative to subclassing for extending functionality.   |
|  5   | [Facade](#5-facade-pattern--notes)        | **Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interfa ce that makes the subsystem easier to use.**                             |
|  6   | [Flyweight](#6-flyweight-pattern-butterfly)  | Use sharing to support large numbers of fine-grained objects efficiently.   |
|  7   | [Proxy](#7-proxy-pattern-trollface)          | Provide a surrogate or placeholder for another object to control access to it.                                  |

# Creational Design Patterns

# 1. Singleton pattern :gem:

## Concepts:
- Only one instance created
- Guarantees control of a resource
- Lazily loaded (usually)
- **Examples:**  
   - Runtime.java  
   - Logger (singleton or factory)
   - Spring beans (by default, scope is singleton in spring)
      

## Design considerations
- Class is responsible for creating itself and its lifecycle
- private instance
- private constructor
- static in nature, but not implemented via static class  as it does not guarantee it will be thread safe (contradicts bill pugh implementation, verify this)
- no parameters required for construction, in case parameter is required for construction than it violates singleton.

## Example/Demo
see code

## PitFalls 
- Often overused
- Difficult to unittest
- if not careful, not threadsafe
- sometimes confused for factory

:stop_sign: java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.

## Contrast to other patterns

| Singleton                        | Factory                                           |
| -------------                    |:-------------:                                    |
| Returns same instance            | Returns various instances                         |
| one constructor method - no args | multiple constructors                             |
| no interface                     | Interface Driven                                  |
| No Subclasses                    | Always SubClasses are involved in a way or other  |
| NA                               | Adaptable to environment more easily**            |

## Summary
- Guarantees one instance
- Easy to implement
- Solves a well defined problem
- Don't abuse it

## Next
Explore the Enum version of Singleton pattern

**[&#11014; back to top](#table-of-contents)**

# 2. Builder pattern :construction_worker:
This a pattern people often use but rarely create of there own.  
This pattern deals with construction of Objects with lot of parameters and want to make the object once we are done constructing it.

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

**Steps to create Builder:**
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

## Pitfalls
- Immutable objects are created
- Inner static class is generally used for implementation
- it is always Designed first 
- Adds complexity, as people are not comfortable with object returning itself with each subsequent call

## Contrast to other patterns

| Builder                               | Prototype                              |
| -------------                         |:-------------:                         |
| Handles complex constructors          | Implemented around a clone             |
| no interface required                 | Avoids calling complex constructors    |
| Can be a saperate class               | NA                                     |
| works with a legacy code              | Difficult to implement in legacy code  |


## Summary
- Creative way to deal with complexity
- Easy to implement
- few drawbacks
- can refactor in with a saperate class (typically implemented with a static inner class)

## Next
Explore the Generics version of builder pattern


**[&#11014; back to top](#table-of-contents)**

# 3. Prototype pattern :clipboard:
creates copy of objects that are very expensive to create

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
1. we have seen an example with clone() method, but this can also be achieved by creatin an interface and implementing the clone method.
2. you can replace string with enum in createItem method of registry.

## Pitfalls
- Sometimes not clear when to use
- Used with other patterns
   - Registry
- mostly shallow copy by clone, for Deep copy we have to implement ourselves and it requires a lot of code

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
   
## Pitfalls:
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

## Pitfalls
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

## Pitfalls
- Not a lot of pitfalls
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

## Pitfalls
- Increases complexity
- Conceptually difficult to plan
- More than just OO principles
- little confusing about what goes where in code

## Contrast to other patterns

| Adapter                              | Bridge                                              |
| -------------                        |:-------------:                                      |
| Works after code is designed         | Designed upfront                                    |
| works mostly with Legacy             | so that Abstraction and implementation can vary     |
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

## Pitfalls
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

## Pitfalls
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

## Pitfalls

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

## Pitfalls

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


# 7. Proxy pattern  :trollface:

## concepts

- Interface by wrapping
- Can add functionality
- Solves problems such as Security, Simplicity, Remote service call, expensive object to create
- Proxy call to access real object
- **Examples**
    - java.lang.reflect.Proxy
    - java.rmi.*
    - Spering and few parts of Hibernate

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

## Pitfalls

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
- 

**[&#11014; back to top](#table-of-contents)**


## References:  
https://java-design-patterns.com/patterns/  

Courses:  
https://app.pluralsight.com/library/courses/design-patterns-java-creational/table-of-contents
https://app.pluralsight.com/library/courses/design-patterns-java-structural/table-of-contents


Additional References:
1. Apache derby configuration: https://www.codejava.net/java-se/jdbc/connect-to-apache-derby-java-db-via-jdbc

**Did you know:**  
 > As announced in June 2015, JavaDB is no longer included in recent versions of the JDK. It was removed from JDK 7 and JDK 8 with the July 17, 2018 Critical Patch Update. JavaDB was a rebranding of Apache Derby. Developers who like to continue using JavaDB should download the latest version from The Apache DB Project.  Source: https://www.oracle.com/java/technologies/javadb.html


https://www.javabrahman.com/design-patterns/gof-gang-four-design-patterns/
https://github.com/TushaarGVS/Design-Patterns-Mentorship
