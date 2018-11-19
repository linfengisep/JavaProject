Good news for Java dev like me, java 8 add new features which facilitate the programming.
Here i will test it separately in order to get familliar with those features.
i will focus on the four point this weekend.
1.lambda expressions
2.method preferences
3.functional interfaces
4.javascript engine

1.lambda expressions:make functional programming possible with java
syntax: parameter -> expressions body
characteristics:
optional type declaration:
optional parenthesis around parameter
optional curly braces
optional return keywords

note:
->be used primarily to define inline implementation of a functional interface,
i.e an interface with a single method only.
->Lambda expression eliminates the need of anonymous class

2.method references
static <T> void sort(T[] a, Comparator<? super T> c)
the interface Comparator is a functional interface.
Therefore, we could use a lambda expression instead of defining and then creating a new instance
of a class that implements Comparator:
2.1invoke this method instead in the body of the lambda expression:
Arrays.sort(students,
    (a, b) -> Student.compareByAge(a, b)
);
2.2this lambda expression invokes an existing method,
we can use a method reference instead of a lambda expression:
Arrays.sort(students,Student::compareByAge);


3.functional interfaces
BiFunction<T,U,R>
Function<T,R>
