# gof-design-patterns (23)
This repository contains examples of all the design patterns listed in the GoF book

# Creational Design Patterns (5)
1. Singleton
2. Builder
3. Prototype
4. Factory Method
5. Abstract Factory

# 1. Singleton design pattern

## Concepts:
- Only one instance created
- Guarantees control of a resource
- Lazily loaded (usually)

Examples:  
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

**Note:** java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.

## Contrast to other patterns
Singleton  
- Returns same instance 
  - one constructor method - no args
no interface

Factory 
- Returns various instances
  - multiple constructors
- Interface Driven
- Adaptable to environment more easily *****

## Summary
- Guarantees one instance
- Easy to implement
- Solves a well defined problem
- Don't abuse it

## Next
Explore the Enum version of Singleton pattern



# 2. Builder design pattern
This a pattern people often use but rarely create of there own.  
This pattern deals with construction of Objects with lot of parameters and want to make the object once we are done constructing it.

## Concepts
- Handles complex constructors
- Large number of parameters
- Immutability
- Examples:
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
   ```
	public Builder bread(String bread) {
				this.bread = bread;
				return this;
			}
   ```
- Create a private constructor in Outer class that takes this Builder class and sets all the fields from the builder instance.
  ```
	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
  ```
- Create a build method that will return the instance of Outer class. This is achieved by passing this builder instance to the outer class constructor
  ```
	public LunchOrder build() {
			return new LunchOrder(this);
		}
  ```
- You can test the above builder as:
  ```
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
Builder  
- Handles complex constructors
- no interface required
- Can be a saperate class
- works with a legacy code

Prototype  
- Implemented around a clone
- Avoids calling complex constructors
- Difficult to implement in legacy code

## Summary
- Creative way to deal with complexity
- Easy to implement
- few drawbacks
- can refactor in with a saperate class (typically implemented with a static inner class)

## Next
Explore the Generics version of builder pattern




















## References:  
https://java-design-patterns.com/patterns/  

Courses:  



