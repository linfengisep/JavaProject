## java 8 new features
### 1 Streams
#### what's stream
A sequence of elements supporting sequential and parallel aggregate operations.

#### charactors
To perform a computation, stream operations are composed into a stream pipeline.
1 A stream pipeline consists of **a source** (which might be an array, a collection, a generator function, an I/O channel, etc),
2 zero or more **intermediate operations** (which transform a stream into another stream, such as filter(Predicate)),
3 and **a terminal operation** (which produces a result or side-effect, such as count() or forEach(Consumer)).

Streams are **lazy**; computation on the source data is only performed when the terminal operation is initiated, and source elements are consumed only as needed.

**Most stream operations accept parameters.**
**A stream should be operated on only once.**
**Except IO channel, all stream doesn't need to be closed afterwards.**
Streams pipeline **may execute either sequentially or in parallel**, this execution mode is defined at its creation, could be by BaseStream.sequential()/BaseStream.parallel(), also could be queried by BaseStream.isParallel()

>PS: like rxjs

#### stream vs collection
some superficial similarities, have different goals. **Collections are primarily concerned with the efficient management of, and access to, their elements**. By contrast,
**streams do not provide a means to directly access or manipulate their elements, and are instead concerned with declaratively describing their source and the computational operations which will be performed in aggregate on that source**. However, if the provided stream operations do not offer the desired functionality, the BaseStream.iterator() and BaseStream.spliterator() operations can be used to perform a controlled traversal

> PS: Collection: access to element. While, Stream focus on pipeline operations.

#### how to use stream
creation,
intermediate operation,
terminal operation;

check the example Java8.java for detail: first: javac SOperations.java SCreations.java Java8.java
second: java Java8

notes: stream should be operated once, if not, an exception will be throwed, using Supplier.get() to create the same stream repeatedly;

### 2 Optional
get(), a method with little value. when it is an empty optional, it needs to call isPresent() first, if true, call the get(), totally betray the goal of creation of Optional class.
so use orElse() instead.

### 3 Method reference
only exist inside lambda expression? yep;
#### 3.1 Class static reference
#### 3.2 Instance method
#### 3.3 Object method
#### 3.4 to constructor

### 4 Expression lambda
but: **passer en paramètre un ensemble de traitements**.

function anonyme,closure.

syntaxe: (arguments) -> corps

### 5 Functional interface
définition et l'association avec l'expression lambda:
>Une expression lambda permet d'encapsuler un traitement pour être passé à d'autres traitements. C'est un raccourci syntaxique aux classes anonymes internes pour une interface qui ne possède qu'une seule méthode abstraite. Ce type d'interface est nommé interface fonctionnelle.



[Ref java 8 new features](https://www.baeldung.com/java-8-new-features)

[Ref streams examples](https://www.baeldung.com/java-8-streams-introduction)

[Ref streams javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

[Ref streams package summary](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#NonInterference)

[Ref functional interface](https://www.jmdoudoux.fr/java/dej/chap-lambdas.htm)
