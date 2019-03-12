# JavaProject
Java Playground

As we all kown, doing is the best way of thinking,
It is in this way, i will think it more clearly.
*****************************Packaging**************************************

1.Manage soures and class files
[Managing Source and Class Files)](https://docs.oracle.com/javase/tutorial/java/package/managingfiles.html)
1.1 by convention, a company uses its reverse internet domain name for its package name
Example:
internet domain: http//:google.com; then package name:com.google.Classes

1.2 Why configure frequently the CLASSPATH?
JVM or compiler need be able to find all the types which our program uses.
example:
Package Path:
com.google.Circle;
ClASSPATH = home/java/classes,
then when JVM or the compiler works, it will search in the directories, like
CLASSPATH+PackagePath;
home/java/classes/com/google/Circle;

Conclusion:we have to set your CLASSPATH so that the compiler and the JVM can find the .class files for your types.

************************String/StringBuilder/StringBuffer*******************
1.String
immutable,that's why they can be shared.
constant, can't be changed after they are created.
JVM devide the memory into two parts, Stack and Heap(la pile et le tas);
stack:execution purpose
heap:storage purpose
in the heap, JVM allocate a memory specially for string literal, called String Constant Pool;
switch(way of creating string){
    case using new: string is stored at heap;break;
    case using String s = "xx": string is stored at String constant pool;break;
    default:
}
note:JVM never create string with the same content, so when two string with the same content, then the two string point to the same address area
check the `StringTester.java` for detail.


2.StringBuffer vs StringBuilder
---------------thread safe/synchronization | speed
StringBuffer:           yes                    
StringBuilder:          no                   faster
