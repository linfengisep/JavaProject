[Lesson: Aggregate Operations](https://docs.oracle.com/javase/tutorial/collections/streams/index.html)

## 1.Reduction
Pipelines

A pipeline is a sequence of aggregate operations.
component:
->A source:a collection, an array, a generator function, or an I/O channel
->Zero or more intermediate operations:
->A terminal operation:produces a non-stream result,
primitive data, (sum(),min(),etc)
a collection(.collect()) or
no value at all(forEach())

#### stream.reduce()
The reduce operation in this example takes two arguments:
identity: The identity element is both the initial value of the reduction and the default result if there are no elements in the stream.
accumulator: The accumulator function takes two parameters: a partial result of the reduction (in this example, the sum of all processed integers so far) and the next element of the stream (in this example, an integer).

#### stream.collect()
Unlike the reduce method, which always creates a new value when it processes an element, the collect method modifies, or mutates, an existing value.

## 2.Parallelism
Parallel computing involves dividing a problem into subproblems, solving those problems simultaneously (in parallel, with each subproblem running in a separate thread), and then combining the results of the solutions to the subproblems
However, with this framework, you must specify how the problems are subdivided (partitioned)

Problem:collections are not thread-safe
