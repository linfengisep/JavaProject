# Design pattern:
## Fundamental principles
1. SRP:Single Responsibility Principle
2. OCP:Open Close Principle
3. LSP:
4. ISP:Interface Segregation Principle
5. DIP:Dependency Inversion Principle

## About Pattern catalogue
Creational Pattern, Behavioral Pattern, Structural Pattern, Concurrency Pattern

## Creational Pattern
1 Factory:
interface is the contract,
all the real shape implements it,
and another class decide which instance to provide.

2.Singleton
private constructor,prevent it from being instanciated;
static instance variable make it simgle, just as its name indicates.

3.Builder
the problem to solve:
two many constructor arguments, easy incorrect instance initilization.

using inner class, to build a outsider class by way of init the outside field one by one.

note:fluent interface

## Behavioral Pattern
1.Observer
when one object's state change, all observer are notified.
Subject keep a list of observer,
observer share the same subject instance during their construction.

## Structural Pattern
1.Proxy Pattern
a class function as an interface to something else
problem to solve: when pageNotBlock, did't call the right method???

2.Decorator Pattern
attach additional responsibility to an object dynamically keeping the same Interface
`extending function`
