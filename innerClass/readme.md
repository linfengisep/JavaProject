## **************************Nested class**********************************
static class inside outer class;
## **************************Inner class***********************************
non static class,outside method body, as memember of the class;
## **************************Local class***********************************
class inside the method body
## **************************Anonymous class*******************************
new Interface(){
    implementation of the method defined in the Interface;
}
in this way,don't need implement interface and instantiate the implemented class.
## **************************Lambda expression*****************************
'Purpose:'
1.To treat functionality as method argument, or code as data.
2.we can consider lambda expression as anonymous methods-- methods without name.

'Syntax'
a. A comma-separated list of formal parameter enclosed in parentheses.
    Note:we can omit the parentheses when there is only one parameter.
b. arrow token:->

c. A body, single expression, or a statement block
    Note:must enclose a statement in brace, but can omit it when it's a void method.

Reminder for exression vs statement
>Expressions:
An expression is a construct made up of variables, operators, and method invocations
Example: result = 1 +2; name=‘linfeng’;

>Statements:
Statements are roughly equivalent to sentences in natural languages. A statement forms a complete unit of execution. 
Assignment expressions
Any use of ++ or --
Method invocations
Object creation expressions
// assignment statement
aValue = 8933.234;
// increment statement
aValue++;
// method invocation statement
System.out.println("Hello World!");
// object creation statement
Bicycle myBike = new Bicycle();


## **************************Method reference*****************************
        Kind	                   Example
Reference to static method	ClassName::staticMethodName
Reference to a constructor	ClassName::new
Reference to an instance of a particular type	classInstance::methodName
Reference to an arbitrary object of a particular type	ClassType::methodName(suitable for  java.util*)
