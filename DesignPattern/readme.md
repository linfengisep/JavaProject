Design pattern:
1 Factory:
interface is the contract,
all the real shape implements it,
and another class decide which instance to provide.

2.Singleton
private constructor,prevent it from being instanciated;
static instance variable make it simgle, just as its name indicates.


3.Observer
when one object's state change, all observer are notified.
Subject keep a list of observer,
observer share the same subject instance during their construction.

4.Builder
the problem to solve:
two many constructor arguments, easy incorrect instance initilization.

using inner class, to build a outsider class by way of init the outside field one by one.

note:fluent interface
