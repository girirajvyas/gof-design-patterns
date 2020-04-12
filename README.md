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
Only one instance created
Guarantees control of a resource
Lazily loaded (usually)

Examples: 
   Runtime.java
   Logger (singleton or factory)
   Spring beans (by default, scope is singleton in spring)
      

## Design considerations
- Class is responsible for creating itself and its lifecycle
- private instance
- private constructor
- static in nature, but not implemented via static class  as it does not guarantee it will be thread safe (contradicts bill pugh implementation, verify this)
- no parameters required for construction, in case parameter is required for construction than it violates singleton.

## Example/Demo
see code

## PitFalls
Often overused
Difficult to unittest
if not careful, not threadsafe
sometimes confused for factory

*Note: * java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.

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









References:
https://java-design-patterns.com/patterns/

Courses:
