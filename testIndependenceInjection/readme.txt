
step1:
Javaer.java
Task.java
//drawback
after we convert this code to jar, and send to others.
if others want to assign the task to other programmer, no way.

step2:
change Task.java add setProgrammer() to change the programmer dynamically.
//drawback
if others want to assign the task to phython programmer, no way.

step3
two options,extends same class or define an interface.


as we can see here,Task depends on the Coder;
in step1: Task depends on one object of Javaer;
in step2: Task depends on class Javaer;
in step3: Task depends on Interface Coder;

by the way ,from MyFramework control positively the programmer.
in step2 and step3, MyFramework is given programmer, MyFramework is kinds of container.
That is Inversion of control.
