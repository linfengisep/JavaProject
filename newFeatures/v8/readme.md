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
1 creation
of()

[Ref streams examples](https://www.baeldung.com/java-8-streams-introduction)
[Ref streams javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
[Ref streams package summary](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#NonInterference)
