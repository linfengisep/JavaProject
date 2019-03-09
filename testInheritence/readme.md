1.parents' constructor called before children's constructor

when create new object, its super class' constuctor will be called first,
then this constuctor;
Check Super.java and Sub.java for result;

In Java, if a class does not define a constructor, compiler will insert a default no-argument constructor for the class by default. If a constructor is defined in Super class, in this case Super(String s), compiler will not insert the default no-argument constructor.

2.pass the rightful argument to call explicitly the parents' constructor
if you did't define a super(given arg) to call the super class constructor, since java won't create the default-no argument constructor


3.passing by reference or value?
always passing by value when passing them to as argument to the methods.
when passing object, it will pass a copy of the reference to the object.
if you return this reference, then they point to the same object.
