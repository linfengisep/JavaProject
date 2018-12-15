source:https://docs.oracle.com/javase/tutorial/reflect/class/classNew.html
import java.lang.Class;
import java.lang.reflect;



1. Retrieving the class objects
1.1 by instance of object.getClass();
1.2 for primitive type, using type.class;
1.3 for primitive type, using their wrapper class;
1.4 not for primitive type, using static method Class.forName();
need add try{}catch{} block;

2.class modifiers and type

3.Member
Member is an interface that reflects identifying information about a single member
(a field or a method) or a constructor.
