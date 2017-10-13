1.Synchronization is built around an internal entity known as the intrinsic lock or monitor lock

2.two role of intrinsic lock
->enforcing exclusive access to an object's state
->establishing happens-before relationships that are essential to visibility

3.Every object has an intrinsic lock associated with it. By convention,
a thread that needs exclusive and consistent access to an object's fields has to acquire the object's intrinsic lock before accessing them,
and then release the intrinsic lock when it's done with them.
