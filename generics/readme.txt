1.we can define generic interface like:
public interface NumTest<T> and then implement it like:
public class NumTestImpl implements NumTest<Integer>{}

2.when override the super class, the access can't be more tight than their super method access.
